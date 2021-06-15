import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public void retriveSongData(){  
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("The Beatles – Blackbird","Blackbird singing in the dead of night Take these broken wings and learn to fly All your life You were only waiting for this moment to arise");
        songMap.put("The Cure – Friday I’m In Love","Always take a big bite It’s such a gorgeous sight To see you eat in the middle of the night");
        songMap.put("Ed Sheeran – Thinking Out Loud","Take me into your loving arms Kiss me under the light of a thousand stars Place your head on my beating heart");
        songMap.put("The Smiths – How Soon Is Now?", "I am the son And the heir Of a shyness that is criminally vulgar");

        String single = songMap.get("The Cure – Friday I’m In Love");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }