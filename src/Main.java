import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        String userInput = choiceDetect();
        while(!(userInput.equals("0"))){

            if(userInput.equals("1")){
                System.out.println("What would you like to add to tasks?");
                tasks.add(input.nextLine());
                userInput = choiceDetect();
            }

            if(userInput.equals("2")){
                System.out.println("What task do you want to remove?");
                tasks.remove(input.nextLine());
                userInput = choiceDetect();
            }
            if(userInput.equals("3")){
                System.out.println("Which task number do you want to update?");
                int upIndex = input.nextInt();
                System.out.println("What will the update be?");
                input.nextLine();
                tasks.set(upIndex, input.nextLine());
                userInput = choiceDetect();
            }
            if(userInput.equals("4")){
                System.out.println(tasks);
                userInput = choiceDetect();
            }
            if(userInput.equals("5")){
                System.out.println("(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.");
                userInput = choiceDetect();
            }
            if(! ( ( userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4") || userInput.equals("5") || userInput.equals("0") ) )){
                System.out.println("That is not a function, try again or type 5 for help.");
                userInput = choiceDetect();
            }
        }
    }
    static String choiceDetect(){
        Scanner a = new Scanner(System.in);
        System.out.println("What do you want loser?");
        return a.nextLine();
    }
}