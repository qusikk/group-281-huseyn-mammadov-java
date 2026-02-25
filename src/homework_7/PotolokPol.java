package homework_7;

public class PotolokPol {

    public static void main(String[] args) {

        int countBolshe7 = 0;

        for (int i = 1; i <= 15; i++) {

            double chislo = Math.random() * 10;

            System.out.println("Chislo: " + chislo);

            double potolok = Math.ceil(chislo);
            double pol = Math.floor(chislo);

            System.out.println("Potolok: " + potolok);
            System.out.println("Pol: " + pol);

            if (chislo < 5) {
                System.out.println("Malenkoe chislo");
            }

            if (chislo > 7) {
                countBolshe7++;
            }

           
        }

        System.out.println("Kolichestvo chisel bolshe 7: " + countBolshe7);
    }
}
