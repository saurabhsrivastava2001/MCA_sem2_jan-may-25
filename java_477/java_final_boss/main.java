// This program demonstrates the use of enum in Java


enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
public class main{
        public static void main(String[] args){
            Day day = Day.MONDAY;
            switch(day){
                case SUNDAY:
                    System.out.println("Sunday");
                    break;
                case MONDAY:
                    System.out.println("Monday");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday");
                    break;
                case FRIDAY:
                    System.out.println("Friday");
                    break;
                case SATURDAY:
                    System.out.println("Saturday");
                    break;
            }
        }
    }