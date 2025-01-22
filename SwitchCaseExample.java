package array;

public class SwitchCaseExample{
        public static void main(String[] args) {
            // Defining a day of the week
            String day = "Tuesday";
    
            // Switch-case statement
            switch (day) {
                case "Monday":
                    System.out.println("It's the start of the week!");
                    break;
                case "Tuesday":
                    System.out.println("It's the second day of the week.");
                    break;
                case "Friday":
                    System.out.println("It's almost the weekend!");
                    break;
                default:
                    System.out.println("It's some other day.");
            }
        }
    
    }  
