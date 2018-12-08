
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Fraction fraction1 = new Fraction(2, 1);
        Fraction fraction2 = new Fraction(1, 4);
        Fraction fraction3 = new Fraction(3);
        Fraction fraction4= new Fraction(fraction2);
        Fraction res = new Fraction(fraction1.subtract(fraction2));
        res.f_print();
        fraction1.add(fraction2).f_print();
        fraction1.multiply(fraction2).f_print();
        fraction1.divide(fraction2).f_print();
        System.out.println("#############################");
        fraction1.f_print();
        fraction2.f_print();
        fraction3.f_print();
        fraction4.f_print();
    }
}
