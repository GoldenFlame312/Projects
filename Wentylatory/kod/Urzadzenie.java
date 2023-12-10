package kk.zse.edu;
public class Urzadzenie {
    private Czujniki czujnikOtoczenia;
    private Czujniki czujnikUrzadzenia;
    private Wentylator wentylator;
    private int temperaturaZewnetrzna;
    private float temperaturaUrzadzenia;
    private boolean wlaczone;
    private int czasPracy;



    public Urzadzenie(int temperaturaZewnetrzna, int temperaturaUrzadzenia, boolean wlaczone, int czasPracy, Wentylator wentylator) {
        this.temperaturaZewnetrzna = temperaturaZewnetrzna;
        this.temperaturaUrzadzenia = temperaturaUrzadzenia;
        this.wlaczone = wlaczone;
        this.czasPracy = czasPracy;
        this.wentylator = wentylator;
    }

    public void symuluj() throws InterruptedException {
        System.out.println("Symulacja urządzenia:");
        System.out.println("Temperatura zewnętrzna: " + temperaturaZewnetrzna);
        System.out.println("Temperatura urządzenia: " + temperaturaUrzadzenia);
        System.out.println("Czas pracy urządzenia: " + czasPracy + " godzin");

        int tempZew = temperaturaZewnetrzna;
        float tempUrz = temperaturaUrzadzenia;
        wentylator.setMoc(0);

        for (int i = 0; i < czasPracy; i++) {
            if (wlaczone) {
                    if (wentylator.getMoc() == 50) {
                        tempUrz += 1;
                    } else if (wentylator.getMoc() == 100) {
                        tempUrz += 0.5;
                    } else if (wentylator.getMoc() == 0) {
                        tempUrz += 3;
                    }
                else {
                    wentylator.wylacz();
                }
            }

            tempUrz -= (tempZew / 60);

            if (tempUrz > 100) {
                System.out.println("Ostrzeżenie: wysoka temperatura");
                wentylator.setMoc(100);
            }

            if (tempUrz > 130) {
                System.out.println("Urządzenie osiągnęło krytyczną temperaturę. Wyłączanie urządzenia...");
                wentylator.pracuj();
                wentylator.setMoc(0);
                System.out.println("Urządzenie zostało wyłączone");
                wlaczone = false;
                Thread.sleep(2000); // Symulacja opóźnienia po wyłączeniu urządzenia
                break;
            }

            if (tempUrz >= 75) {
                wentylator.pracuj();
                wentylator.setMoc(100);
            } else if (tempUrz >= 50) {
                wentylator.pracuj();
                wentylator.setMoc(50);
            } else {
                wentylator.wylacz();
                wentylator.setMoc(0);
            }

            System.out.println("Aktualna temperatura urządzenia: " + tempUrz);

            Thread.sleep(1000); // Symulacja opóźnienia co sekundę
        }

        System.out.println("Końcowa temperatura urządzenia: " + tempUrz);
    }
}
