import java.util.*;
import java.lang.*;
class FinancialForeCast {
    public static double forecase(double current,double growthRate,int years)
    {
        if(years==0)
        {
            return current;
        }
        return forecase(current,growthRate,years-1)*(1+growthRate);
    }
    public static void main(String[] args) {
       System.out.println("Hi! LET'S PREDICT FURTURE FORECASE");
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the starting investment");
       double current=in.nextDouble();
       System.out.println("Enter the growth rate by converting the percentage to number if 8% enter as 0.08");
       double growthRate=in.nextDouble();
       System.out.println("Enter the number of years from now");
       int years=in.nextInt();
       double future=forecase(current,growthRate,years);
       System.out.printf("Predicted future value after %d years: %.2f\n",years,future);
    }
}