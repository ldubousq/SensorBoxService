package jp.kobe_u.cs27.sensorbox.framework;

import java.io.IOException;
//import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/**
 * Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£Æ’Å“Ã£Æ’Æ’Ã£â€šÂ¯Ã£â€šÂ¹Ã£ï¿½Â®Ã£ï¿½Å¸Ã£â€šï¿½Ã£ï¿½Â®Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¯Ã£Æ’Ë†Ã£Æ’ÂªÃ¯Â¼Å½Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£ï¿½Â«Ã¥Å¸ÂºÃ£ï¿½Â¥Ã£ï¿½â€žÃ£ï¿½Â¦Ã¯Â¼Å’Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£â€šÂªÃ£Æ’â€“Ã£â€šÂ¸Ã£â€šÂ§Ã£â€šÂ¯Ã£Æ’Ë†Ã£â€šâ€™
 * Ã§â€�Å¸Ã¦Ë†ï¿½Ã£ï¿½â€”Ã¯Â¼Å’Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£Æ’Å“Ã£Æ’Æ’Ã£â€šÂ¯Ã£â€šÂ¹Ã£ï¿½Â«Ã§â„¢Â»Ã©Å’Â²Ã£ï¿½â„¢Ã£â€šâ€¹Ã¯Â¼Å½
 *
 * @author okushi, masa-n
 *
 */
public class SensorBoxFactory {
	//Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£Æ’Å“Ã£Æ’Æ’Ã£â€šÂ¯Ã£â€šÂ¹Ã£ï¿½Â®Ã¥Â®Å¡Ã§Â¾Â©
	private Document doc = null;

	/**
	 * Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã¥ï¿½ï¿½Ã£ï¿½Â®Ã£Æ’â€˜Ã£â€šÂ¹Ã£â€šâ€™Ã¤Â¸Å½Ã£ï¿½Ë†Ã£ï¿½Â¦Ã¯Â¼Å’Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¯Ã£Æ’Ë†Ã£Æ’ÂªÃ£â€šâ€™Ã¤Â½Å“Ã¦Ë†ï¿½Ã£ï¿½â„¢Ã£â€šâ€¹
	 * @param configFile Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã¥ï¿½ï¿½Ã£ï¿½Â®Ã£Æ’â€˜Ã£â€šÂ¹
	 */
	public SensorBoxFactory(String configFile) {
		doc = readConfigFile(configFile);
	}
	
	/**
	 * Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£ï¿½Â®URLÃ£â€šâ€™Ã¤Â¸Å½Ã£ï¿½Ë†Ã£ï¿½Â¦Ã¯Â¼Å’Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¯Ã£Æ’Ë†Ã£Æ’ÂªÃ£â€šâ€™Ã¤Â½Å“Ã¦Ë†ï¿½Ã£ï¿½â„¢Ã£â€šâ€¹
	 * @param url Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã¥ï¿½ï¿½Ã£ï¿½Â®URL
	 */
	public SensorBoxFactory(URL url) {
		doc = readConfigFile(url);
	}

	/**
	 * Ã¦Å’â€¡Ã¥Â®Å¡Ã£ï¿½â€¢Ã£â€šÅ’Ã£ï¿½Å¸Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã¥ï¿½ï¿½Ã£ï¿½Â§Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£â€šâ€™Ã©â€“â€¹Ã£ï¿½ï¿½
	 * @param configFile Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã¥ï¿½ï¿½Ã£ï¿½Â®Ã£Æ’â€˜Ã£â€šÂ¹
	 * @return Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£ï¿½Â®Ã£Æ’â€°Ã£â€šÂ­Ã£Æ’Â¥Ã£Æ’Â¡Ã£Æ’Â³Ã£Æ’Ë†Ã£â€šÂªÃ£Æ’â€“Ã£â€šÂ¸Ã£â€šÂ§Ã£â€šÂ¯Ã£Æ’Ë†
	 */
	public Document readConfigFile(String configFile){
		System.out.println("Creating a SensorBox from " + configFile);
		//Ã£â€šÂ¯Ã£Æ’Â©Ã£â€šÂ¹Ã£Æ’Â­Ã£Æ’Â¼Ã£Æ’â‚¬Ã£ï¿½Â§Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£â€šâ€™Ã§â€ºÂ¸Ã¥Â¯Â¾Ã¤Â½ï¿½Ã§Â½Â®Ã£ï¿½Â§Ã¦Å’â€¡Ã¥Â®Å¡Ã¯Â¼Ë†Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£ï¿½Â¯Ã£â€šÂ¯Ã£Æ’Â©Ã£â€šÂ¹Ã£Æ’â€˜Ã£â€šÂ¹Ã£ï¿½Â®Ã©â‚¬Å¡Ã£ï¿½Â£Ã£ï¿½Å¸Ã¥Â Â´Ã¦â€°â‚¬Ã£ï¿½Â«Ã§Â½Â®Ã£ï¿½ï¿½Ã£ï¿½â€œÃ£ï¿½Â¨Ã¯Â¼ï¿½Ã¯Â¼â€°
		
		URL url = this.getClass().getClassLoader().getResource(configFile);
		System.out.println("classloader resources : " + this.getClass().getClassLoader().getResource(configFile));
		if (url==null) {
			System.out.println(url);
            throw new IllegalArgumentException(
                    "url null : " + configFile);
		}
		
		return readConfigFile(url);
	}
	
	/**
	 * Ã¦Å’â€¡Ã¥Â®Å¡Ã£ï¿½â€¢Ã£â€šÅ’Ã£ï¿½Å¸URLÃ£ï¿½Â§Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£â€šâ€™Ã©â€“â€¹Ã£ï¿½ï¿½
	 * @param url Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã¥ï¿½ï¿½Ã£ï¿½Â®URL
	 * @return Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£ï¿½Â®Ã£Æ’â€°Ã£â€šÂ­Ã£Æ’Â¥Ã£Æ’Â¡Ã£Æ’Â³Ã£Æ’Ë†Ã£â€šÂªÃ£Æ’â€“Ã£â€šÂ¸Ã£â€šÂ§Ã£â€šÂ¯Ã£Æ’Ë†
	 */
	public Document readConfigFile(URL url){
		Document doc = null;
		try {
			//JsoupÃ£ï¿½Â§Ã¨Â¨Â­Ã¥Â®Å¡Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£â€šâ€™Ã©â€“â€¹Ã£ï¿½ï¿½
			doc = Jsoup.parse(url.openStream(),null,url.toString());
		} catch (IOException e) {
			System.err.println("IO Exception occurs in parsing " + url.toString());
			e.printStackTrace();
		}

		return doc;
		
	}
	/**
	 * Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£Æ’Å“Ã£Æ’Æ’Ã£â€šÂ¯Ã£â€šÂ¹Ã£â€šâ€™Ã¤Â½Å“Ã¦Ë†ï¿½Ã£ï¿½â€”Ã£ï¿½Â¦Ã¨Â¿â€�Ã£ï¿½â„¢
	 *
	 * @return Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£Æ’Å“Ã£Æ’Æ’Ã£â€šÂ¯Ã£â€šÂ¹Ã£â€šÂªÃ£Æ’â€“Ã£â€šÂ¸Ã£â€šÂ§Ã£â€šÂ¯Ã£Æ’Ë†
	 */
	public SensorBox create(){
		SensorBox box = new SensorBox();
		
//		try {
//			String boxid = doc.select("boxId").first().text();
//			String owner = doc.select("owner").first().text();
//			String location = doc.select("location").first().text();
//			String endpoint = doc.select("endpoint").first().text();
			String boxid = "sbox-phidget-39824";
			String owner = "Marecat Romain";
			String location = "Home";
			String endpoint = "/";
			box.setId(boxid);
			box.setOwner(owner);
			box.setLocation(location);
			box.setEndpoint(endpoint);
//		} catch (Exception e) {
//			System.out.println("Cant get config of new phidget");
//			System.out.println(e.getMessage());
//		}

		//Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ§â„¢Â»Ã©Å’Â²Ã§â€�Â¨Ã£ï¿½Â®Ã¥Â¤â€°Ã¦â€¢Â°Ã£ï¿½ÂªÃ£ï¿½Â©
		SensorFactory f = new SensorFactory();

		//Ã¥Â®Å¡Ã§Â¾Â©Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¤Ã£Æ’Â«Ã£ï¿½Â®Ã¥ï¿½â€žÃ£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ¦Â¯Å½Ã£ï¿½Â«Ã¯Â¼Å’
		for(Element sensor : doc.select("sensor")){

			//Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµIDÃ£ï¿½Â¨Ã£Æ’â€¡Ã£Æ’ï¿½Ã£â€šÂ¤Ã£â€šÂ¹Ã£â€šâ€™Ã¥ï¿½â€“Ã¥Â¾â€”
			String sensorid = sensor.select("sensorid").text().toString();
			String device = sensor.select("device").text().toString();

			//Ã£â€šÂ¢Ã£â€šÂ¯Ã£â€šÂ»Ã£â€šÂ¹Ã£Æ’Â¡Ã£â€šÂ½Ã£Æ’Æ’Ã£Æ’â€°Ã£â€šâ€™Ã¥ï¿½â€“Ã¥Â¾â€”
			Element accessMethod = sensor.select("accessMethod").first();
			//Ã£Æ’â€¡Ã£Æ’ï¿½Ã£â€šÂ¤Ã£â€šÂ¹Ã£â€šÂ¢Ã£â€šÂ¯Ã£â€šÂ»Ã£â€šÂ¹Ã£ï¿½Â®Ã£ï¿½Å¸Ã£â€šï¿½Ã£ï¿½Â®Ã£Æ’â€˜Ã£Æ’Â©Ã£Æ’Â¡Ã£Æ’Â¼Ã£â€šÂ¿Ã¯Â¼Ë†Ã£Æ’â€”Ã£Æ’Â­Ã£Æ’â€˜Ã£Æ’â€ Ã£â€šÂ£Ã¥ï¿½ï¿½Ã¯Â¼Å’Ã¥â‚¬Â¤Ã¯Â¼â€°Ã£ï¿½Â®Ã£Æ’Å¾Ã£Æ’Æ’Ã£Æ’â€”
			HashMap<String,String> access = new HashMap<String,String>();

			//Ã£ï¿½ï¿½Ã£â€šÅ’Ã£ï¿½Å¾Ã£â€šÅ’Ã£ï¿½Â®Ã£â€šÂ¿Ã£â€šÂ°Ã£ï¿½â€¹Ã£â€šâ€°Ã¯Â¼Å’Ã£â€šÂ¿Ã£â€šÂ°Ã¥ï¿½ï¿½Ã¢â€ â€™Ã£Æ’â€”Ã£Æ’Â­Ã£Æ’â€˜Ã£Æ’â€ Ã£â€šÂ£Ã¥ï¿½ï¿½Ã¯Â¼Ë†Ã£â€šÂ­Ã£Æ’Â¼Ã¯Â¼â€°Ã¯Â¼Å’Ã£Æ’â€¡Ã£Æ’Â¼Ã£â€šÂ¿Ã¢â€ â€™Ã£Æ’â€”Ã£Æ’Â­Ã£Æ’â€˜Ã£Æ’â€ Ã£â€šÂ£Ã¥â‚¬Â¤Ã¯Â¼Ë†Ã£Æ’ï¿½Ã£Æ’ÂªÃ£Æ’Â¥Ã£Æ’Â¼Ã¯Â¼â€°
			for (Element e: accessMethod.children()) {
				String key  = e.tagName();
				String value = e.text().toString();
				access.put(key, value); //Ã£Æ’Å¾Ã£Æ’Æ’Ã£Æ’â€”Ã£ï¿½Â«Ã§Âªï¿½Ã£ï¿½Â£Ã¨Â¾Â¼Ã£â€šâ‚¬
				System.out.println("element : " + e.tagName() + " " + e.text().toString());

			}
			

			//Ã£Æ’â€¢Ã£â€šÂ¡Ã£â€šÂ¯Ã£Æ’Ë†Ã£Æ’ÂªÃ£ï¿½Â§Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£â€šâ€™Ã§â€�Å¸Ã¦Ë†ï¿½Ã£ï¿½â€”Ã¯Â¼Å’Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ¤Â¸â‚¬Ã¨Â¦Â§Ã£ï¿½Â«Ã§â„¢Â»Ã©Å’Â²Ã£ï¿½â„¢Ã£â€šâ€¹
			box.addSensor(sensorid, f.create(sensorid , device, access));
		}
		
		
		//Ã§â„¢Â»Ã©Å’Â²Ã£ï¿½â€¢Ã£â€šÅ’Ã£ï¿½Å¸Ã¥â€¦Â¨Ã£â€šÂ»Ã£Æ’Â³Ã£â€šÂµÃ£ï¿½Â®Ã§Â·â€™Ã¥â€¦Æ’Ã£â€šâ€™Ã§â€�Â»Ã©ï¿½Â¢Ã£ï¿½Â«Ã¥â€¡ÂºÃ¥Å â€ºÃ£ï¿½â„¢Ã£â€šâ€¹Ã¯Â¼Ë†Ã§Â¢ÂºÃ¨Âªï¿½Ã§â€�Â¨Ã¯Â¼â€°Ã¯Â¼Å½
		String [] sensorIds = box.getSensorIds();
		System.out.println("------------------------------------------------");
		System.out.println("* SUCCESS: A sensor box is created as shown below.");
		System.out.println("  - boxID: " + box.getId());
		System.out.println("  - owner: " + box.getOwner());
		System.out.println("  - location: " + box.getLocation());
		System.out.println("  - endpoint: " + box.getEndpoint());
		System.out.println("* Installed sensors: ");
		
		System.out.println();
		
		for (String id: sensorIds) {
			Sensor s = box.getSensor(id);
			System.out.println("  # Sensor ID: " + s.getSensorId());
			System.out.println("    - Name: " + s.getSpecification().getSensorName());
			System.out.println("    - Driver: " + s.getClass().getName());
			System.out.println("    - Type: " + s.getSensorType().getProperty());
			System.out.println("    - Unit: " + s.getSensorType().getUnit());
			System.out.println("    - Description: "+ s.getSpecification().getDescription());
		}
		System.out.println("------------------------------------------------");


		return box;
	}


}
