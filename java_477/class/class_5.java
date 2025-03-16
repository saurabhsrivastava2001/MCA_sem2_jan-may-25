import java.util.*;

class Employee{
    int id;
    String E_name;
    int salary;
    Employee(int id,String name, int salary){
        this.id=id ;
        this.E_name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("id is : "+this.id);
        System.out.println("name of the employee is: "+this.E_name);
        System.out.println("Salary is : "+this.salary);
    }
}

class full_time extends Employee{
    int bonus;
    full_time(String name , int id, int salary, int bouns){
        super(id, name, salary);
        this.bonus=bouns;
    }
    int total;

    @Override
    public String toString(){
        return this.id + " , name : "+ this.E_name;
    }

    void totol_sal(){
        this.total=this.salary+this.bonus;
        super.display();
        System.out.println("total salary is : "+this.total);
    }   
}

class part_time extends Employee{
       int working_hr;
       int hourly_rate;
       part_time(String name , int id , int salary, int working_hr, int hourly_rate){
        super(id, name, salary);
        this.working_hr=working_hr;
        this.hourly_rate=hourly_rate;
       }
       int total;
       void total_sal(){
        this.total=working_hr*hourly_rate;
        super.display();
        System.out.println("Total salary : "+total);
       }
}

class class_5 {
    public static void main(String[] args) {
        full_time ep1=new full_time("saurabh", 1, 100000,4000);
        part_time ep2=new part_time("himanshu", 2, 10000, 100, 8);
        System.out.println(ep1);
        ep1.totol_sal();
        ep2.total_sal();
    }
}