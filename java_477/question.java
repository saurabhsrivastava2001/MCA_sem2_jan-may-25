import java.util.Scanner;
public class question{
    public static void withdraw(int money,int balance){
        if (balance >5000){
            {
                if (money*2<=balance){
                    balance=balance-money;
                    System.out.println("withdraw successful"+"new balance="+balance);
                }
                else{
                    System.out.println("withdraw failed");
                }
            }   
        }
        if (balance>1000 && balance<5000){
            if (money<=2000){
                balance=balance-money;
                System.out.println("withdraw successful"+"new balance="+balance);
            }
            else{
                System.out.println("withdraw failed");
            }
        }
        if (balance<1000){
            if (money<=800){
                balance-=money;
                System.out.println("withdraw succeeded"+"balance="+balance);
            }
            
        }
    }
    public static void main(String[] args){
        question obj=new question();
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        int balance=sc.nextInt();
        withdraw(money, balance);
        

    }
}
