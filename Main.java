import java.util.Scanner;

/**
 * Program that tell you your percentage range based on your grade level
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //Asks user to input their grade
    System.out.println("Please enter a letter grade:");
    String usersGrade = input.nextLine();

    //switch case system to determine percentage
    switch (usersGrade){
      case "A":
         System.out.println("This is between 80% and 100%");
         break;
      case "B":
         System.out.println("This is between 70% and 79%");
         break;
      case "C":
         System.out.println("This is between 60% and 69%");
         break;
      case "D":
         System.out.println("This is between 50% and 59%");
         break;
      case "F":
         System.out.println("This is between 0% and 49%");
         break;
    }
  }
}
