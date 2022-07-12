import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> invention = new HashMap<String, String>();
//Add keys and values	
		invention.put("James Watt","Steam engine");
		invention.put("Guglielmo Marconi","Radio");
		invention.put("Antonio Meucci","Telephone");
		invention.put("John Shepherd-Barron","ATM");
		invention.put("Thomas Edison","Bulb");
		invention.put("Wilhem Conrad Roentgen","Xrays");
		invention.put("Zacharias Janssen","Microscope");
		invention.put("Alessandro Volta","Electric battery");
		invention.put("Candido Jacuzzi","Whirpool bath");
		invention.put("Brothers Orville and Wilbur Wright","Aeroplane");
		System.out.println(invention.size()+" famous inventions");
//Loop through with forEach
		invention.forEach((key,value) -> {
			System.out.println("\n"+key+" invented the "+value);
		});
		
//Loop through with keySet		
//		for (String i : invention.keySet()) {
//			System.out.println(i+ " invented the " +invention.get(i));
//		}	
	}
}
