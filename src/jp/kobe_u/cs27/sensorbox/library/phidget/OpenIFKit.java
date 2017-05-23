package jp.kobe_u.cs27.sensorbox.library.phidget;

import com.phidgets.InterfaceKitPhidget;
import com.phidgets.PhidgetException;
import com.phidgets.event.AttachEvent;
import com.phidgets.event.AttachListener;
import com.phidgets.event.DetachEvent;
import com.phidgets.event.DetachListener;
import com.phidgets.event.ErrorEvent;
import com.phidgets.event.ErrorListener;
import com.phidgets.event.SensorChangeEvent;
import com.phidgets.event.SensorChangeListener;

/***
 * PhidgetÃ£Æ’â€¡Ã£Æ’ï¿½Ã£â€šÂ¤Ã£â€šÂ¹Ã£ï¿½Â¨Ã£ï¿½Â®Ã£â€šÂ³Ã£Æ’ï¿½Ã£â€šÂ¯Ã£â€šÂ·Ã£Æ’Â§Ã£Æ’Â³Ã¥â€¡Â¦Ã§ï¿½â€ Ã£â€šâ€™Ã¨Â¡Å’Ã£ï¿½â€ Ã£â€šÂ¯Ã£Æ’Â©Ã£â€šÂ¹
 *
 * @author shinsuke-m
 *
 */
public class OpenIFKit {

	private InterfaceKitPhidget ik;
	private int serial;

	public OpenIFKit(int serial) {
		this.serial = serial;

		//System.out.println(Phidget.getLibraryVersion());
		try {
			ik = new InterfaceKitPhidget();
		} catch (PhidgetException e) {
			e.printStackTrace();
		}
		ik.addAttachListener(new AttachListener() {
			public void attached(AttachEvent ae) {
				System.out.println("attachment of " + ae);
			}
		});
		ik.addDetachListener(new DetachListener() {
			public void detached(DetachEvent ae) {
				System.out.println("detachment of " + ae);
			}
		});
		ik.addErrorListener(new ErrorListener() {
			public void error(ErrorEvent ee) {
				System.out.println("error event for " + ee);
			}
		});

		ik.addSensorChangeListener(new SensorChangeListener() {
			public void sensorChanged(SensorChangeEvent se) {
//				System.out.println("SensorChangeListener:" + se);
			}
		});
		
		//ik.openAny();
		try {
			ik.open(this.serial);
			System.out.print("Waiting for InterfaceKit attachment...");
			ik.waitForAttachment();

			System.out.println(ik.getDeviceName());
			ik.setOutputState(7, true);
			
			ik.setSensorChangeTrigger(0, 20);
//			for (int i = 0; i < 8; i++) {
//				try {
//					System.out.println(ik.getInputState(i));
//					System.out.println(ik.getSensorValue(i));
//					System.out.println(ik.getSensorRawValue(i));
//					
//				} catch (PhidgetException e) {
//					System.out.println("Input index undefined");
//				}
//			}
			try {
				this.getDigitalInputValue(7);
			} catch (PhidgetException e) {
				System.out.println("getDegitalInputValue error");
			}

			
		} catch (PhidgetException e) {
			e.printStackTrace();
		}
	}

	public Object getValue(int i) throws PhidgetException {
		int v1 = ik.getSensorValue(i);
		Integer v2 = new Integer(v1);
		return v2;
	}

	/**
	 * Phidget get Digital input value Digital Input Primer
	 * @param portNum
	 * @return boolean
	 * @throws PhidgetException
	 */
	public Object getDigitalInputValue(int portNum) throws PhidgetException{
		boolean diValue = ik.getInputState(portNum);
		return new Boolean(diValue);
	}
	
	public InterfaceKitPhidget getInterfaceKit() {
		return ik;
	}	

}