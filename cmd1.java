//java program to get command line inputs and display it
class cmd1
{
    public static void main(String args[])
    {
        int n= args.length;
        System.out.println("lenght is "+n);

        if(n==0)
        System.out.println("No Arguments Passed");
        else if(n==1)
        System.out.println("Argumenyts is "+args[0]);
        else
            {
            for(int i=0;i<n;i++)
                {
                    System.out.println(args[i]);
                }
            }
    }
}