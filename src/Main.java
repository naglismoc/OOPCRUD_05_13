import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Author> authors;
    public static Scanner sc;

    public static void main(String[] args) {
        authors = new ArrayList<>();
        sc = new Scanner(System.in);

        Author.seed();

        while (true){
            printInfo();
            int option = ValidateInput.intVal();
            switch (option){
                case 1:
                    Author.print();
                    break;
                case 2:
                  Author.create();
                    break;
                case 3:
                  Author.edit();
                    break;
                case 4:
                    Author.delete();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }
    public static void printInfo(){
        System.out.println("options");
        System.out.println("1. show");
        System.out.println("2. create");
        System.out.println("3. edit");
        System.out.println("4. delete");
        System.out.println("5. exit");
    }
}