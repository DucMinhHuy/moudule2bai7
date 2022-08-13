import java.math.*;
public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities={"savannah","boston","atlanta","tampa"};
        java.util.Arrays.sort(cities);
        for(String city:cities)
            System.out.println(city+"");
        System.out.println();
       String[] hugeNumbers={"232t231092923992",
                "43r334455",
               "34t464646"};
        java.util.Arrays.sort(hugeNumbers);
        for ( String citr:hugeNumbers)
            System.out.println(citr+"");
    }
}
