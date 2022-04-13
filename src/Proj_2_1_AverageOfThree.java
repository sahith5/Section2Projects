import java.util.Scanner;

public class Proj_2_1_AverageOfThree {
    public static void main(String[] args) {
        double a,b,c;
        Scanner keyBoardInput=new Scanner(System.in);
        a=keyBoardInput.nextDouble();
        b=keyBoardInput.nextDouble();
        c=keyBoardInput.nextDouble();
        keyBoardInput.nextLine();
        System.out.println((a+b+c)/3);
    }
}
