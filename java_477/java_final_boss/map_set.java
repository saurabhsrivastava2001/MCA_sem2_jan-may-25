import java.util.TreeMap;

public class map_set {
    public static void main(String[] args) {

        String s="Java Saurabh Sriv";

        char []  chrarr=s.toCharArray();
        TreeMap<Character,Integer> mp= new TreeMap<>();
        for (int i=0;i<chrarr.length;i++){
            if (mp.containsKey(chrarr[i])){
                mp.put(chrarr[i],mp.get(chrarr[i])+1);
            }
            else {
                mp.put(chrarr[i],1);
            }
        }
        for (char key : mp.keySet()){
            System.out.println("'"+key+"': "+mp.get(key));
        }
        
    }
    
}
