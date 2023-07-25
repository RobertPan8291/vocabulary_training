import java.util.HashMap;
import java.util.Random;

public class dictionary {
    static HashMap<String, String> storage = new HashMap<>();
    static int tempnum = -9999;

    public static void addword(String word, String translation){
        storage.put(word, translation);
    }

    public static String getKey(String translation){
        String value = "";
        for(String key: storage.keySet()){
            if(translation.equals(storage.get(key))){
                value = key;
            }
        }
        return value;
    }

    public static String getTranslation(String word){
        String value = "";

        if(storage.containsKey(word)){
            value = storage.get(word);
        }

        return value;
    }

    public static String getRandomKey(){

            String[] temp = storage.keySet().toArray(new String[0]);
            Random rand = new Random();
            int num = rand.nextInt(temp.length);

            if(!(storage.size() == 1)) {
                while (num == tempnum) {
                num = rand.nextInt(temp.length);
            }

            tempnum = num;

            }

                return temp[num];
        }




    public static boolean isNotEmpty(){
        boolean state = true;

        if(storage.isEmpty()){
            state = false;
        }

        return state;
    }

}
