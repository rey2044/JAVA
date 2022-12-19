//Java Program to take a number input and display multiplication table of it
class cmd8
{
    public static void main(String args[])
    {
        int no= Integer.parseInt(args[0]);
        for(int i=0;i<=10;i++)
        {
            System.out.println(no+"*"+i+"="+no*i);
        }
    }
}