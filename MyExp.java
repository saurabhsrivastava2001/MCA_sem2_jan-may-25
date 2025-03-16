import java.util.Scanner;

class MyExp
{
public static void main(String abc[])
{
int d,t,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter distance in Km");
d=sc.nextInt();
System.out.println("Enter Time");
t=sc.nextInt();
s=d/t;
System.out.println("Speed="+s+"KM/Hrs");
}
}
