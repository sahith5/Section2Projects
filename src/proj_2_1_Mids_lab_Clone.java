import java.util.Scanner;
//There once was a ADJECTIVE1 girl named GIRLS_NAME who was a ADJECTIVE2OCCUPATION1 in the kingdom of PLACE. She loved to wear CLOTHING and to HOBBY.
// She wanted to marry the ADJECTIVE3OCCUPATION2 named BOYS_NAME, but her father, king MANS_NAME, forbid her from seeing him.

public class proj_2_1_Mids_lab_Clone {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.println("enter Adhjective1");
        String Adj1=keyboardInput.nextLine();
        System.out.println("enter Girl Name");
        String girlName=keyboardInput.nextLine();
        System.out.println("enter Adhjective2");
        String Adj2=keyboardInput.nextLine();
        System.out.println("enter Occupation1");
        String occupation1=keyboardInput.nextLine();
        System.out.println("enter Clothing");
        String Clothing=keyboardInput.nextLine();
        System.out.println("enter Hobby");
        String hobby=keyboardInput.nextLine();
        System.out.println("enter Adjective3");
        String Adj3=keyboardInput.nextLine();
        System.out.println("occupation2");
        String occupation2=keyboardInput.nextLine();
        System.out.println("boysname");
        String boysname=keyboardInput.nextLine();
        System.out.println("Enter mansname");
        String Mans_name=keyboardInput.nextLine();


       System.out.println("There once was a "+Adj1+"girl named"+ girlName +"who was a"+Adj2+" "+occupation1+" in the kingdom of PLACE. She loved to wear"+ occupation2+ " and to"+hobby+". She wanted to marry the "+ Adj3+" "+occupation2 +"named" +boysname+ ",but her father, king "+Mans_name+", forbid her from seeing him");

    }
}
