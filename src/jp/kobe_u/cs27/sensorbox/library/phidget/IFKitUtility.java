package jp.kobe_u.cs27.sensorbox.library.phidget;

import com.phidgets.InterfaceKitPhidget;
import com.phidgets.PhidgetException;
import com.phidgets.event.AttachEvent;
import com.phidgets.event.AttachListener;
import com.phidgets.event.DetachEvent;
import com.phidgets.event.DetachListener;
import com.phidgets.event.ErrorEvent;
import com.phidgets.event.ErrorListener;

/**
 * Phidget Interface Kitã�®ãƒ¦ãƒ¼ãƒ†ã‚£ãƒªãƒ†ã‚£
 * @author masa-n
 *
 */
public class IFKitUtility {

	public static int getSerialNumber () {
		int serial = 0;
		InterfaceKitPhidget ik;

		try {

			ik = new InterfaceKitPhidget();

			//å�„ç¨®ãƒªã‚¹ãƒŠã�®ç™»éŒ²
			ik.addAttachListener(new AttachListener() {//æŽ¥ç¶š
				public void attached(AttachEvent ae) {
					System.out.println("attachment of " + ae);
				}
			});
			ik.addDetachListener(new DetachListener() {//åˆ‡æ–­
				public void detached(DetachEvent ae) {
					System.out.println("detachment of " + ae);
				}
			});
			ik.addErrorListener(new ErrorListener() {//ã‚¨ãƒ©ãƒ¼
				public void error(ErrorEvent ee) {
					System.out.println("error event for " + ee);
				}
			});

			ik.openAny();
			System.out.print("Waiting for InterfaceKit attachment...");
			ik.waitForAttachment();
			System.out.println(ik.getDeviceName() + ", serial = " + ik.getSerialNumber());
			ik.setSensorChangeTrigger(0,20);
			serial = ik.getSerialNumber();
			ik.close();
		} catch (PhidgetException e) {
			// TODO è‡ªå‹•ç”Ÿæˆ�ã�•ã‚Œã�Ÿ catch ãƒ–ãƒ­ãƒƒã‚¯
			e.printStackTrace();
		}
		return serial;
	}


}
