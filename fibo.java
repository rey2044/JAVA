//java program to print fibonacci series
class fibo
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);
        for(i=2;i<n;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}