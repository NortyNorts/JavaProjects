import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args){
        HashMap<String, String> fruitsMap = new HashMap<>();
        fruitsMap.put("Eric", "Breadfruit");
        fruitsMap.put("Adam", "Bananas");
        fruitsMap.put("Eric", "Grapes");
        System.out.println(fruitsMap);//returns key value pairs

//        System.out.println(fruitsMap.keySet());//returns keys of dict
//        System.out.println(fruitsMap.containsKey("Eric"));//true of false if key is in dict
//        System.out.println(fruitsMap.get("Eric"));//returns the value of the key
//        System.out.println(fruitsMap.values());//returns all values
        for(String fruit:fruitsMap.values()){
            System.out.println(fruit);
        }
    }
}
