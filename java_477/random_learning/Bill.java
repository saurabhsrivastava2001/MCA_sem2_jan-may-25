import java.util.Scanner;
public class Bill{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the items you want to purchase");
        int count=sc.nextInt();
        int count_c=0;
        int price=0;
        int total=0;
        int[] price_arr= new int[count];
        int[] total_price= new int[count];
        int[] quantity_arr = new int[count];
        String[] name_arr = new String[count];
        int i=0;
        while(i<count){
        System.out.println("Enter the name of the item");
        name_arr[i] =sc.next();
        System.out.println("Enter the price of the item");
        price = sc.nextInt();
        price_arr[i] =price;
        System.out.println("Enter the quantity of the item");
        quantity_arr[i] = sc.nextInt();
        total_price[i] = price*quantity_arr[i];
        i++;
        }
        System.out.println("---bill summary---");
        System.out.print("Item name"+"  ");
        System.out.print("price"+"  ");
        System.out.print("quantity"+" ");
        System.out.print("Total");
        for(int j = 0; j<count;j++){

                System.out.println("");
                System.out.print(name_arr[j]+"       ");
                System.out.print(price_arr[j]+"       ");
                System.out.print(quantity_arr[j]+"      ");
                System.out.print(total_price[j]+"      ");
        }
}       int total_cost;
}