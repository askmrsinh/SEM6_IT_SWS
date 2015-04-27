import java.util.Scanner;
import java.text.DecimalFormat;

public class SalamiSlicing {

  public static void main(String[] args) {
    Scanner input = new Scanner(System. in );

    double principal = 0;
    double rate = 0;
    double time = 0;

    double compoundInterest = 0;

    System.out.print("Enter the Principal amount : ");
    principal = input.nextDouble();

    System.out.print("Enter the Rate : ");
    rate = input.nextDouble();

    System.out.print("Enter the Time : ");
    time = input.nextDouble();

    compoundInterest = principal * Math.pow((1 + rate / 100), time);

    System.out.println("");
    System.out.println("The Calculated Compound Interest is : " + compoundInterest);

    DecimalFormat df2 = new DecimalFormat("###,###.00"); //Formats the actual interest
    double dd = compoundInterest;
    double dd2dec = new Double(df2.format(dd)).doubleValue();

    System.out.println("Compound Interest is : " + dd2dec);

    System.out.println("Profit earned by Salami Slicing: " + (dd2dec - compoundInterest));

  }

}