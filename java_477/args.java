import java.util.Scanner;

public class args {
    public static void main(String[] args) {
        int a=0;
        float price=0;
        int quantity=0;
        float cost;
        Scanner scanner = new Scanner(System.in);
        
       for(int i=0;i<6;i++){
            if (i%2==0){
            price += Float.parseFloat(args[i]);
            System.out.println(price);
            }
            else{
                quantity+=Integer.parseInt(args[i]);
                System.out.println(quantity);
        }
    }
}  
        
}

