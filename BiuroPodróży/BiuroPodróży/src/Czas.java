
 // klasa przechowująca czas.

public class Czas
{
    int godzina;
    int minuta;


     // Konstruktor domyślny.

    public Czas() {}


     // Konstruktor. pobiera obiekt typu Czas i zapisuje jego dane w zmiennych


    public Czas(Czas czas) {
        this.godzina = czas.godzina;
        this.minuta = czas.minuta;
    }


     // Konstruktor. pobiera godzine i minute  i zapisuje je w zmiennych


    public Czas(int godzina, int minuta) {
        this.godzina = godzina;
        this.minuta = minuta;
    }
}
