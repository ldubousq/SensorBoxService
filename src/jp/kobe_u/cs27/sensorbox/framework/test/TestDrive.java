package jp.kobe_u.cs27.sensorbox.framework.test;
import java.net.URL;

import com.phidgets.PhidgetException;

import jp.kobe_u.cs27.sensorbox.framework.Sensor;
import jp.kobe_u.cs27.sensorbox.framework.SensorBox;
import jp.kobe_u.cs27.sensorbox.framework.SensorBoxFactory;
import jp.kobe_u.cs27.sensorbox.library.phidget.IFKitUtility;

public class TestDrive {

	public static void main(String args[]) throws Exception{

//		SensorBoxFactory boxFactory = new SensorBoxFactory("sbox-phidget-408127.xml");
		
		int serial = IFKitUtility.getSerialNumber(); 
		String deviceid = "sbox-phidget-"+serial;
		String urlStr = "http://localhost/" + deviceid + ".xml";
		URL url = new URL(urlStr);
		SensorBoxFactory boxFactory = new SensorBoxFactory(url);
		System.out.println(urlStr);
		SensorBox box = boxFactory.create();
		String [] sensorIds = box.getSensorIds();

		while(true){

			for (String id: sensorIds) {
				Sensor s = box.getSensor(id);
				if (s != null) {
					System.out.println(s.getSensorId() + ":" + s.getValue() + ",");
				} else {
					System.out.println("Invalid input sensor");
				}	
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------");
		}


	}

}
