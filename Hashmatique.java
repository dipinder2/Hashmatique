import java.util.HashMap;
import java.util.Set;
public class Hashmatique{
	private HashMap<String,String> trackList = new HashMap<String,String>();

	public void Tracks(){
		trackList.put("Baby", "My first love broke my heart for the first time, and I was like");
		trackList.put("Friday", "blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah");
		trackList.put("Saturday", "blah blah blah blah blah blah blah blah blah blah blah blah blah blah");
		trackList.put("One Time", "blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah");
		System.out.println(trackList.get("Baby"));
		Set<String> keys = trackList.keySet();
		for(String key : keys){
			System.out.print(key);
			System.out.println(trackList.get(key));
			};

	}

}