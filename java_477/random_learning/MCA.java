import java.util.Scanner;

class A {
    void show() {
        System.out.println("Class A method called");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B method called");
    }
}

class OverloadingExample {
    void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    void sum(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }
}

class Parent {
    void show() {
        System.out.println("Parent class show() method");
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class overridden show() method");
    }
}

class PolymorphismExample {
    void printMessage() {
        System.out.println("This is Polymorphism Example");
    }
}

class EncapsulationExample {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

abstract class AbstractExample {
    abstract void abstractMethod();
    void normalMethod() {
        System.out.println("This is a normal method in abstract class");
    }
}
class ConcreteExample extends AbstractExample {
    void abstractMethod() {
        System.out.println("Abstract method implemented in ConcreteExample");
    }
}

public class MCA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu - Select OOP Concept to Demonstrate:");
            System.out.println("1. Inheritance");
            System.out.println("2. Method Overloading");
            System.out.println("3. Method Overriding");
            System.out.println("4. Polymorphism");
            System.out.println("5. Encapsulation");
            System.out.println("6. Abstraction");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    B objB = new B();
                    objB.show();
                    objB.display();
                    break;
                case 2:
                    OverloadingExample objOL = new OverloadingExample();
                    objOL.sum(5, 10);
                    objOL.sum(5.5, 10.5);
                    break;
                case 3:
                    Parent objP = new Child();
                    objP.show();
                    break;
                case 4:
                    PolymorphismExample objPoly = new PolymorphismExample();
                    objPoly.printMessage();
                    break;
                case 5:
                    EncapsulationExample objEncap = new EncapsulationExample();
                    objEncap.setName("John Doe");
                    System.out.println("Encapsulated Name: " + objEncap.getName());
                    break;
                case 6:
                    ConcreteExample objAbs = new ConcreteExample();
                    objAbs.abstractMethod();
                    objAbs.normalMethod();
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
        
        scanner.close();
    }
}
