public class Kopilka {

    public static int sluchaynayaMoneta() {
        int[] monety = {1, 2, 5, 10};
        return monety[(int)(Math.random() * 4)];
    }

    public static void main(String[] args) {
    	

        int vsegoMonet = 0;
        int vsegoSumma = 0;

        for (int i = 1; i <= 30; i++) {

            int moneta = sluchaynayaMoneta();

            System.out.println("Moneta: " + moneta);

            vsegoMonet++;
            vseg     oSumma += moneta;

            if (moneta == 10) {
                System.out.println("Bolshaya moneta!");
            }
        }

        System.out.println("Obshee kolichestvo monet: " + vsegoMonet);
        System.out.println("Obshaya summa: " + vsegoSumma);

        double sredniyNominal = (double)vsegoSumma / vsegoMonet;

        System.out.println("Sredniy nominal: " + Math.round(sredniyNominal));
    }
}
