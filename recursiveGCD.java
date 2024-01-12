public class recursiveGCD
{
    public static int GCD (int firstNum, int secondNum)
    {
        if(firstNum == 0) return secondNum;
        return GCD(secondNum % firstNum, firstNum);
    }

    public static void main(String[] args)
    {
        int [] GCDs = new int[3];
        GCDs[0] = GCD(36, 60);
        GCDs[1] = GCD(1071, 462);
        GCDs[2] = GCD(6731, 2809);

        int [] firstNums = new int[3];
        firstNums[0] = 36;
        firstNums[1] = 1071;
        firstNums[2] = 6731;

        int [] secondNums = new int[3];
        secondNums[0] = 60;
        secondNums[1] = 462;
        secondNums[2] = 2809;

        System.out.println("Welcome to the GCD calculator (recursive version)!");

        for(int i = 0; i < GCDs.length; i++)
        {
            System.out.println("The GCD (greatest common divisor) of " + firstNums[i] + " and " + secondNums[i] + " is: " + GCDs[i] + ".");
        }
    }
}

