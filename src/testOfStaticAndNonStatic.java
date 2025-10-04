import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testOfStaticAndNonStatic {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


        City c1 = new City();
        c1.name = "Meringo";
        c1.founded = sdf.parse("06/23/2014 02:36:14");
        c1.population = 3838383838383838383L;

        City c2 = new City();
        c2.name = "Bob";
        c2.founded = sdf.parse("12/28/2001 02:36:14") ;
        c2.population = 4747474747474747474L;
        System.out.println(c1.name);
        System.out.println(c1.founded);
        System.out.println(c1.population);
        System.out.println(c2.name);
        System.out.println(c2.founded);
        System.out.println(c2.population);
        System.out.println(City.STATE);
    }


    static class City {
        static final String STATE = "CA";
        String name;
        Date founded ;
        long population;

    }
}
