package jp.kobe_u.cs27.sensorbox.sensors;

import jp.kobe_u.cs27.sensorbox.framework.Sensor;
import jp.kobe_u.cs27.sensorbox.framework.Specification;
import jp.kobe_u.cs27.sensorbox.library.phidget.OpenIFKit;
import jp.kobe_u.cs27.sensorbox.library.phidget.OpenIFKitManager;
import jp.kobe_u.cs27.sensorbox.type.GasPressure;

import com.phidgets.PhidgetException;

public class Phidgets1141_AbsolutePressure extends Sensor{
	private OpenIFKit oif ;
	private int PORT_NUM;
	
	public Phidgets1141_AbsolutePressure () {

		Specification ea = new Specification();
		ea.setSensorName("Phidgets 1141_0 - Absolute Air Pressure Sensor 15-115 kPa");
		ea.setPropertyType("double");
		ea.setDescription("  The 1141 Absolute Pressure Sensor is an air pressure "
				+ "sensor that measures the absolute pressure of its environment. "
				+ "It can measure pressures from 15 kPa to 115 kPa.");
		ea.setProperty("GasPressure");
		ea.setMax("115.0");
		ea.setMin("15.0");
		this.spec = ea;
		this.type = new GasPressure();
		setSpecification(spec);
	}
	
	@Override
	protected Object convertValue(Object value) {
		// Reference: http://www.phidgets.com/docs/1141_User_Guide
		double sensorValue = Integer.parseInt(value.toString());
		double gaspressure = (1.0 * sensorValue / 9.2) + 10.652;
		return gaspressure;
	}

	protected Object readValue() {
		try {
			return oif.getValue(PORT_NUM);
		} catch (PhidgetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}
	}
	public void connect(){
		//accessmethodの中でこの名前と併せる必要あり
		int serial = Integer.parseInt(access.get("serial"));
		this.oif =  OpenIFKitManager.getOpenIFKit(serial);
		this.PORT_NUM = Integer.parseInt(access.get("port"));

	}
	@Override
	public Object getValue() {
		// TODO 自動生成されたメソッド・スタブ
		return convertValue(readValue());
	}
	public Object getValueByProperty(String property) {
		return getValue();
	}
}
