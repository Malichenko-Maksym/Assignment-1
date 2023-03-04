public class Ceny {
    // cena brutto = cena netto + cena netto * podatek
    // cena netto = cena brutto / (1 + podatek) 
    public static double cenaNetto(double cenaBrutto, double podatek){
        return cenaBrutto / (1+0.01*podatek);
    }

    public static void main(String[] args) {
        System.out.println(Ceny.cenaNetto(123, 23));
    }
}

