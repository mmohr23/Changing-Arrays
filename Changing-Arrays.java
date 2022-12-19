public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        //create array
        String[] splashScreen = {"Welcome","to","the snap shot","app!"};
        //print
        System.out.println(splashScreen[0]);
        System.out.println(splashScreen[1]);
        System.out.println(splashScreen[2]);
        System.out.println(splashScreen[3]);
        System.out.println();
        
        //change 0= upgrade, 3= premium app!
        splashScreen[0] = "Upgrade";
        splashScreen[3] = "premium app!";
        //print again
        System.out.println(splashScreen[0]);
        System.out.println(splashScreen[1]);
        System.out.println(splashScreen[2]);
        System.out.println(splashScreen[3]);
        
    }
}