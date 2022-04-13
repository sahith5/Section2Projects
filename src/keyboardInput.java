import java.util.Scanner;

public class keyboardInput {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
            String Name=keyboard.nextLine();
            int age=keyboard.nextInt();
            keyboard.nextLine();
            String City=keyboard.nextLine();
            System.out.println(Name+" "+age +" "+City);
            double d=keyboard.nextDouble();
            keyboard.nextLine();
            System.out.println(d*2);
            String addr=keyboard.nextLine();
            System.out.println(addr);


    }
}
