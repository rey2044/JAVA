//Java program for finding Factorial of a given no
class fact
{
    public static void main(String args[])
    {
        int no= Integer.parseInt(args[0]);
        int fact=1;
        int i=1;
        while(i<=no)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial="+fact);
    }
}