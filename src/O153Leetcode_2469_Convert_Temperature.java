import java.util.Arrays;

public class O153Leetcode_2469_Convert_Temperature {
    static double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double farenheight=celsius*1.80+32;


        return new double[]{kelvin,farenheight};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(273.15)));
    }
}
