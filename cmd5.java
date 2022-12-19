//java program to input number and display multiplication table of it
class cmd5
{
    public static void main(String args[])
    {
        int no=Integer.parseInt(args[0]);
        int org=no;
        int sum=0;
        while (no>0)
        {
            int rem=no%10;
            no=no/10;
            sum=sum+(rem*rem*rem);
        }
        if (org==sum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
