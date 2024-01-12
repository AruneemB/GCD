import java.util.*;

public record loopGCD(int firstNum, int secondNum)
{
    public int getGCD()
    {
        int gcd = 1;
        for (int i = 1; i <= firstNum && i <= secondNum; i++)
        {
            if (firstNum % i == 0 && secondNum % i == 0)
            {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args)
    {
        loopGCD loopGCD1 = new loopGCD(36, 60);
        loopGCD loopGCD2 = new loopGCD(1071, 462);
        loopGCD loopGCD3 = new loopGCD(6731, 2809);

        ArrayList<loopGCD> loopGCDs = new ArrayList<>();
        loopGCDs.add(loopGCD1);
        loopGCDs.add(loopGCD2);
        loopGCDs.add(loopGCD3);

        System.out.println("Welcome to the GCD calculator (loop version)!");

        for(loopGCD GCD : loopGCDs)
        {
            System.out.println("The GCD (greatest common divisor) of " + GCD.firstNum() + " and " + GCD.secondNum() + " is: " + GCD.getGCD() + ".");
        }
    }
}

