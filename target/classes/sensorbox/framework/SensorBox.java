package jp.kobe_u.cs27.sensorbox.framework;

import java.util.Arrays;
import java.util.HashMap;

/**
 * è¤‡æ•°ã�®ã‚»ãƒ³ã‚µã‚’å�Žå®¹ã�™ã‚‹ã‚»ãƒ³ã‚µãƒœãƒƒã‚¯ã‚¹ã�®ã‚¯ãƒ©ã‚¹ï¼Ž
 * @author okushi, masa-n
 */
public class SensorBox {
	/** ã‚»ãƒ³ã‚µãƒœãƒƒã‚¯ã‚¹ã�®ID */
	private String id;
	/** ã‚»ãƒ³ã‚µã�®ä¸€è¦§ï¼ŽIDã‚’ã‚­ãƒ¼ï¼Œå®Ÿä½“ã‚’å€¤ã�¨ã�™ã‚‹ãƒžãƒƒãƒ—ã�§ä¿�æŒ�ã�™ã‚‹*/
	private HashMap<String, Sensor> sensorList = new HashMap<String,Sensor>();
	/** ã‚»ãƒ³ã‚µãƒœãƒƒã‚¯ã‚¹ã�®æ‰€æŒ�è€… */
	private String owner;
	/** ã‚»ãƒ³ã‚µãƒœãƒƒã‚¯ã‚¹ã�®è¨­ç½®å ´æ‰€ */
	private String location;
	private String endpoint;

	
	/**
	 * ãƒœãƒƒã‚¯ã‚¹ã�®IDã‚’å�–å¾—ã�™ã‚‹
	 * @return ãƒœãƒƒã‚¯ã‚¹ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * ãƒœãƒƒã‚¯ã‚¹ã�®IDã‚’è¨­å®šã�™ã‚‹
	 * @param id ãƒœãƒƒã‚¯ã‚¹ID
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * ã‚»ãƒ³ã‚µãƒ¼ãƒªã‚¹ãƒˆã�«ã‚»ãƒ³ã‚µã‚’è¿½åŠ ã�™ã‚‹
	 * @param id ã‚»ãƒ³ã‚µID
	 * @param sensor è¿½åŠ ã�™ã‚‹ã‚»ãƒ³ã‚µ
	 */
	public void addSensor(String id, Sensor sensor){
		sensorList.put(id,sensor);
	}

	/**
	 * å…¨ã‚»ãƒ³ã‚µã�®ãƒžãƒƒãƒ—ã‚’è¿”ã�™
	 * @return å…¨ã‚»ãƒ³ã‚µã�®ãƒžãƒƒãƒ—
	 */
	public HashMap<String, Sensor> getSensorList() {
		return sensorList;
	}
	
	/**
	 * ã‚»ãƒ³ã‚µã�®ãƒžãƒƒãƒ—ã‚’è¨­å®šã�™ã‚‹
	 * @param sensorList å…¨ã‚»ãƒ³ã‚µã�®ãƒžãƒƒãƒ—
	 */
	public void setSensorList(HashMap<String, Sensor> sensorList) {
		this.sensorList = sensorList;
	}
	
	/**
	 * æ‰€æŒ�è€…ã‚’å�–å¾—ã�™ã‚‹
	 * @return æ‰€æŒ�è€…
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * æ‰€æŒ�è€…ã‚’è¨­å®šã�™ã‚‹
	 * @param owner æ‰€æŒ�è€…
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	/**
	 * è¨­ç½®å ´æ‰€ã‚’å�–å¾—ã�™ã‚‹
	 * @return è¨­ç½®å ´æ‰€
	 */
	public String getLocation() {
		return location;
	}
	
	/** 
	 * è¨­ç½®å ´æ‰€ã‚’è¨­å®šã�™ã‚‹
	 * @param location è¨­ç½®å ´æ‰€
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * ã‚¨ãƒ³ãƒ‰ãƒ�ã‚¤ãƒ³ãƒˆã‚’å�–å¾—ã�™ã‚‹
	 * @return ã‚¨ãƒ³ãƒ‰ãƒ�ã‚¤ãƒ³ãƒˆ
	 */
	public String getEndpoint() {
		return endpoint;
	}
	
	/**
	 * ã‚¨ãƒ³ãƒ‰ãƒ�ã‚¤ãƒ³ãƒˆã‚’è¨­å®šã�™ã‚‹
	 * @param endpoint ã‚¨ãƒ³ãƒ‰ãƒ�ã‚¤ãƒ³ãƒˆ
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	
	/**
	 * IDã‚’æŒ‡å®šã�—ã�¦ï¼Œ1ã�¤ã�®ã‚»ãƒ³ã‚µã‚’å�–å¾—ã�™ã‚‹
	 * @param sensorId ã‚»ãƒ³ã‚µID
	 * @return ã��ã�®IDã‚’æŒ�ã�¤ã‚»ãƒ³ã‚µ
	 */
	
	public Sensor getSensor(String sensorId) {
		Sensor sensor = null;
		if (sensorList.containsKey(sensorId)) {
			sensor = sensorList.get(sensorId);
		} else {
			System.err.println("Sensor " + sensorId + " does not exist.");
		}
		
		return sensor;
	}
	
	/**
	 * ã‚»ãƒ³ã‚µIDã‚’æŒ‡å®šã�—ã�¦ï¼Œã��ã�®ã‚»ãƒ³ã‚µã�®å€¤ã‚’å�–å¾—ã�™ã‚‹
	 * @param sensorId ã‚»ãƒ³ã‚µID
	 * @return ã��ã�®IDã‚’æŒ�ã�¤ã‚»ãƒ³ã‚µã�®å€¤
	 */
	public Object getValue(String sensorId){
		Sensor sensor = getSensor(sensorId);
		return sensor.getValue();
	}

	/**
	 * ã‚»ãƒ³ã‚µIDã‚’æŒ‡å®šã�—ã�¦ï¼Œã��ã�®ã‚»ãƒ³ã‚µã�®ä»•æ§˜ã‚’å�–å¾—ã�™ã‚‹
	 * @param sensorId ã‚»ãƒ³ã‚µID
	 * @return ã��ã�®IDã‚’æŒ�ã�¤ã‚»ãƒ³ã‚µã�®ä»•æ§˜
	 */
	public Specification getSpec(String sensorId){
		Sensor sensor = getSensor(sensorId);
		return sensor.getSpecification();
	}
	
	/**
	 * ã�™ã�¹ã�¦ã�®ã‚»ãƒ³ã‚µã�®IDã�®ä¸€è¦§ã‚’é…�åˆ—ã�§è¿”ã�™
	 * @return å…¨ã‚»ãƒ³ã‚µã�®IDã�®é…�åˆ—
	 */
	public String [] getSensorIds() {
		String [] sensorIds = getSensorList().keySet().toArray(new String[0]);
		Arrays.sort(sensorIds);
		
		return sensorIds;
	}

}
