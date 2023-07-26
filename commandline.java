class commandline
{
    public static void main(String arg[])
    {

        System.out.println("Demonstright of command line");

        int No1 = Integer.parseInt(arg[0]);
        int No2 = Integer.parseInt(arg[1]);

        int Ans = No1 + No2;


        System.out.println("Number of command line argument : "+arg.length);
        System.out.println("Addition is : "+Ans);


    }
}