//Write a java program to input a number and display sum of it
class cmd6
{
    public static void main(String args[])
    {
        int no=Integer.parseInt(args[0]);
        int sum=0;
        while (no>0)
        {
            int rem=no%10;
            no=no/10;
            sum=sum+rem;
        }
        System.out.println("Sum:="+sum);
    }
}
