import java.util.Scanner;
public class Main {

   public static void main(String []args) {
   
      // Yesterday I walked to the movie theaters and watched the new Spider-man movie, which is 2 hours long. After I watched the awesome movie, I will head back to my comfy home and take a good nights rest.
      String adjective1 = "new";
      String superhero1 = "Spider man";
      String noun1 = "movie";
      String time1 = "2 hours";
      String place1 = "move theaters";
      String verb1 = "walked";
      String verb2 = "watched";
      String verb3 = "watched";
      String adjective2 = "awesome";
      String noun2 = "movie";
      String adjective3 = "comfy";
      String place2 = "home";
      String adjective4 = "good nights";
      String verb4 = "rest";

      String sentence1 = "Yesterday I " + verb1 + "to the " + place1 + " and " + verb2 + " the " + superhero1 + noun1 +", which is " + time1 + " long. ";
      String sentence2 = "After I " + verb3 + " the " + adjective2 + noun2 + ", I will head back to my " + adjective3 + place2 + " and take a " + adjective4 + verb4;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a verb:");
      String Verb1 = scan.nextLine();
      System.out.println("Yesterday I " + verb1);
      System.out.print("Enter a place");
      String Place1 = scan.nextLine();
      System.out.println("Yesterday I " + verb1 + "to the " + place1);
      System.out.print("Enter a verb");
      String Verb2 = scan.nextLine();
      System.out.println("Yesterday I " + verb1 + "to the " + place1 + " and " + verb2);
      System.out.print("Enter a superhero");
      String Superhero1 = scan.nextLine();
      System.out.println("Yesterday I " + verb1 + "to the " + place1 + " and " + verb2 + " the " + superhero1);
      System.out.print("Enter a noun");
      String Noun1 = scan.nextLine();
      System.out.println("Yesterday I " + verb1 + "to the " + place1 + " and " + verb2 + " the " + superhero1 + noun1);
      System.out.print("Enter a time");
      String Time1 = scan.nextLine();
      System.out.println("Yesterday I " + verb1 + " to the " + place1 + " and " + verb2 + " the " + superhero1 + noun1 +", which is " + time1 + " long. ");
      System.out.print("Enter a verb");
      String Verb3 = scan.nextLine();
      System.out.println("After I " + verb3);
      System.out.print("Enter an adjective");
      String Adjective2 = scan.nextLine();
      System.out.println("After I " + verb3 + " the " + adjective2);
      System.out.print("Enter a noun");
      String Noun2 = scan.nextLine();
      System.out.println("After I " + verb3 + " the " + adjective2 + noun2);
      System.out.print("Enter an adjective");
      String Adjective3 = scan.nextLine();
      System.out.println("After I " + verb3 + " the " + adjective2 + noun2 + ", I will head back to my " + adjective3 );
      System.out.print("Enter a place");
      String Place2 = scan.nextLine();
      System.out.println("After I " + verb3 + " the " + adjective2 + noun2 + ", I will head back to my " + adjective3 + place2);
      System.out.print("Enter an adjective");
      String Adjective4 = scan.nextLine();
      System.out.println("After I " + verb3 + " the " + adjective2 + noun2 + ", I will head back to my " + adjective3 + place2 + " and take a " + adjective4);
      System.out.print("Enter a verb");
      String Verb4 = scan.nextLine();
      System.out.println("After I " + verb3 + " the " + adjective2 + noun2 + ", I will head back to my " + adjective3 + place2 + " and take a " + adjective4 + verb4);
      scan.close();
   }
}
