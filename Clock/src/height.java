import java.util.Scanner;
public class height {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in inches: ");
        int height  = sc.nextInt();
        int height_f = 0;
        height_f = height/12;
        int height_i = height % 12;
        System.out.println("I can not believe that you are only " + height_f + "'" + height_i + "\"!");
    }
}
