//Java Program to check odd even number through commandline
class cmd4
{
        public static void main(String args[])
        {
                int no = Integer.parseInt(args[0]);
                if(no%2==0)
                {
                        System.out.println("Number is Even");
                }
                else
                {
                        System.out.println("Number is Odd");
                }
        }
}