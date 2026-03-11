import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String name;
    double amount;
    String category;

    Expense(String name, double amount, String category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }
}

public class SpendWise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while(true){

            System.out.println("\n--- SpendWise ---");
            System.out.println("1 Add Expense");
            System.out.println("2 View Expenses");
            System.out.println("3 Total Spending");
            System.out.println("4 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Category: ");
                String category = sc.nextLine();

                expenses.add(new Expense(name, amount, category));

            }

            else if(choice == 2){

                for(Expense e : expenses){
                    System.out.println(e.name + " - " + e.amount + " (" + e.category + ")");
                }

            }

            else if(choice == 3){

                double total = 0;

                for(Expense e : expenses){
                    total += e.amount;
                }

                System.out.println("Total Spending: " + total);
            }

            else if(choice == 4){
                break;
            }
        }
    }
}
