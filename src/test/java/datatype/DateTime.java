package datatype;

import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws InterruptedException {
        Date d = new Date(); // now
        System.out.println(d);
        Thread.sleep(1000); // sleep for 1 second
        Date d2 = new Date(); // now
        System.out.println(d2);

        Date birth = new Date(760887924); // 1994
        var age = new Date(d.getTime() - birth.getTime());
    }
}
