public class time{
    public static void main(String[] args){

        int x = 112572; //initial seconds

        int sec = 112572 % 60; //remaining seconds that are not FULL minutes
        x /= 60; //convert to minutes

        int min = x % 60; //remaining minutes that are not FULL hours
        x /= 60; //convert to hours

        int hr = x % 24; //remaining hours that are not FULL days
        x /= 24; //convert to days

        System.out.println(x + " days, " + hr + " hours, " + min + " minutes, and " + sec + " seconds");
    }
}
