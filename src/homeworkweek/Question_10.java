package homeworkweek;

//10.Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name.

import java.util.HashMap;
import java.util.Map;

public class Question_10 {
    public static void main(String[] args) {

        Map<String , String > zone = new HashMap<>();

        zone.put("Aldgate","Metropolitan/Circle line/Hammersmith & City");
        zone.put("BakerStreet", "Metropolitan/Circle line/Central line/Hammersmith & City");
        zone.put("Euston square", "Metropolitan/Circle line/Hammersmith & City");
        zone.put("Great portland street","Metropolitan/Circle line/Hammersmith & City");
        zone.put("Barbican","Metropolitan/Circle line/Hammersmith & City");
        zone.put("Moorgate","Metropolitan/Circle line/Hammersmith & City");
        zone.put("Livepool Street","Metropolitan/Circle line/Hammersmith & City");
        String key = "Moorgate";
        System.out.println("At this station these train will stop");

        for (Map.Entry<String , String>station : zone.entrySet()) {
            if (station.getKey() ==key){
                System.out.println(station.getValue());
            }
        }
    }
}
