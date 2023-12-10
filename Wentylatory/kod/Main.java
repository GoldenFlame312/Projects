package kk.zse.edu;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Utwórz dwa wentylatory
        Wentylator wentylator1 = new Wentylator(50);
        Wentylator wentylator2 = new Wentylator(100);

        // Utwórz dwa urządzenia z wentylatorami
        Urzadzenie urzadzenie1 = new Urzadzenie(25, 70, true, 8, wentylator1);
        Urzadzenie urzadzenie2 = new Urzadzenie(25, 70, true, 8, wentylator2);

        while (true) {
            // Symuluj urządzenia
            System.out.println("Symulacja urządzenia 1:");
            System.out.println("<------------------------->");
            urzadzenie1.symuluj();

            System.out.println("Symulacja urządzenia 2:");
            System.out.println("<------------------------->");
            urzadzenie2.symuluj();

            // Utwórz urządzenia z losowymi wartościami
            int poczatkowaTemperatura1 = (int) (Math.random() * 81) + 10;
            int temperaturaZewnetrzna1 = (int) (Math.random() * 56) - 10;
            int czasPracy1 = new int[]{8, 16, 24}[(int) (Math.random() * 3)];

            int poczatkowaTemperatura2 = (int) (Math.random() * 81) + 10;
            int temperaturaZewnetrzna2 = (int) (Math.random() * 56) - 10;
            int czasPracy2 = new int[]{8, 16, 24}[(int) (Math.random() * 3)];

            // Utwórz dwa nowe wentylatory
            Wentylator wentylator3 = new Wentylator(50);
            Wentylator wentylator4 = new Wentylator(100);

            Urzadzenie urzadzenie3 = new Urzadzenie(temperaturaZewnetrzna1, poczatkowaTemperatura1, true, czasPracy1, wentylator3);
            Urzadzenie urzadzenie4 = new Urzadzenie(temperaturaZewnetrzna2, poczatkowaTemperatura2, true, czasPracy2, wentylator4);

            // Symuluj urządzenia z losowymi wartościami
            System.out.println("Symulacja urządzenia 3:");
            System.out.println("<------------------------->");
            urzadzenie3.symuluj();

            System.out.println("Symulacja urządzenia 4:");
            System.out.println("<------------------------->");
            urzadzenie4.symuluj();

            Thread.sleep(1000); // Opóźnienie o 1 sekundę
        }
    }
}