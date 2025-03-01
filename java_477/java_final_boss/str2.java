import java.util.*;
public class str2 {
    public static void main(String[] args) {
        String s = "Madam";
        StringBuilder sb = new StringBuilder(s);
        String s2=(sb.reverse()).toString();

        if (s.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        
    }
}
