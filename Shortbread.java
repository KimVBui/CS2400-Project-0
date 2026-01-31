import java.util.Scanner;

public class Shortbread{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numOfBread;
        double flour; // 0.25
        double butter; // 0.166
        double sugar; // 0.083
        double flourG, sugarG, butterG;
        
        
        System.out.println("How much Shortbread do you want to make?");
        numOfBread = read.nextInt();

        flour = 0.25 * numOfBread; //ounces
        butter = 0.166 * numOfBread;
        sugar = 0.083 * numOfBread;

        flourG = numOfBread*7.5; //grams
        sugarG = numOfBread*2.29;
        butterG = numOfBread*5.208;
        
        System.out.println("You'll need:");
        System.out.println(flour + " oz/" + flourG + " grams of flour.");
        System.out.println(sugar + " oz/" + sugarG + " grams of sugar.");
        System.out.println(butter + " oz/" + butterG+ " grams of butter.");


    }

}