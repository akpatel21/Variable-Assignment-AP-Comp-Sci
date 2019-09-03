import java.util.Scanner;

public class VariableAssignment
{

        public static void main(String[] args)
        {
              Scanner scan = new Scanner(System.in);
              System.out.print("What is your name? ");
              String name = scan.nextLine();
              System.out.print("What is yout age?" );
              Int age = scan.nextInt();
              System.out.print("What is your favorite subject? ");
              String favSubject = scan.nextLine();
              
              System.out.print("My name is " + name + "\n\tage: " + age + "\n\n\tfavorite subject: " + favSubject);
        }
}
