package casting;

public class Casting3{

    public static void main(String[] args) {

        long maxIntvalue = 2147483647;
        long maxIntOver = 2147483648L;
        int intvalue = 0;

        intvalue = (int) maxIntvalue;
        System.out.println("maxIntvalue casting = " + intvalue);

        intvalue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intvalue);
    }
}
