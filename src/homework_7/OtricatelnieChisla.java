package homework_7;

public class OtricatelnieChisla {

    public static void main(String[] args) {

        double[] massiv = {5, -3, 8, -12, 4, -7, 1, -9, 6, -2};

        System.out.println("Chisla i ih moduli:");

        double minAbs = Math.abs(massiv[0]);
        double maxAbs = Math.abs(massiv[0]);
        double summa = 0;

        for (double n : massiv) {

            double a = Math.abs(n);

            System.out.println(n + " modul " + a);

            minAbs = Math.min(minAbs, a);
            maxAbs = Math.max(maxAbs, a);

            summa += a;
        }

        System.out.println("Minimalniy modul: " + minAbs);
        System.out.println("Maksimalniy modul: " + maxAbs);
        System.out.println("Summa vseh moduley: " + summa);
    }
}
