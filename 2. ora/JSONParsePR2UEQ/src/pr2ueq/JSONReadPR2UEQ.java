package pr2ueq;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JSONReadPR2UEQ {
    public static class JSONRead{
        public static void main(String[] args) {
            try(FileReader reader = new FileReader("C://Users//Dominik//IdeaProjects//JSONParsePR2UEQ//src//pr2ueq//orarendPR2UEQ.json")){
                JSONParser jsonparser = new JSONParser();
                JSONObject jsonObject = (JSONObject) jsonparser.parse(reader);

                JSONObject root = (JSONObject) jsonObject.get("orarend");
                JSONArray orarend = (JSONArray) root.get("ora");

                System.out.println("PR2UEQ Órarend 2026 tavasz \n");

                for (int i = 0; i < orarend.size(); i++) {
                    System.out.println("----------------------------");
                    System.out.println("\n");
                    JSONObject ora = (JSONObject) orarend.get(i);
                    JSONObject time = (JSONObject) ora.get("idopont");
                    System.out.println("Tárgy: " + ora.get("targy"));
                    System.out.println("Időpont: "+ time.get("nap") + " " + time.get("tol") + " " + time.get("ig"));
                    System.out.println("Helyszín: " + ora.get("helyszin"));
                    System.out.println("Oktató: " + ora.get("oktato"));
                    System.out.println("Szak: "+ ora.get("szak"));
                    System.out.println("\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
