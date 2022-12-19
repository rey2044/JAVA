//Java Program to check wether the number is perfect or not
class cmd9
{
    public static void main(String args[])
    {
        int no=Integer.parseInt(args[0]);
        int mul=1;
        int sum=0;
        while (no>0)
        {
            int rem=no%10;
            no=no/10;
            sum=sum+rem;
            mul=mul*rem;
        }
        if (mul==sum)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}
