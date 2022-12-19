//Java Program to check wether the entered number is prime or not
class cmd10
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int v=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                v++;
            }
        }
        if(v>2)
        {
            System.out.println("Not a Prime Number");
        }
        else
        {
            System.out.println("Prime Number");
        }
    }
}