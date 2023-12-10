
 // Klasa przechowująca dane klienta

public class Klient
{
    String imie;
    String nazwisko;
    int wiek;
    String adres;
    Data ostatniaWycieczka = new Data();
    boolean first = false;
    float lacznaCena = 0;


    //  Konstruktor domyślny

    public Klient() {}


     // Konstruktor. pobiera obiekt typu Klient i zapisuje jego dane w zmiennych


    public Klient(Klient klient)
    {
        this.adres = klient.adres;
        this.imie = klient.imie;
        this.nazwisko = klient.nazwisko;
        this.wiek = klient.wiek;
    }


     // Konstruktor. pobiera imie, nazwisko, wiek i adres, i zapisuje je zmiennych


    public Klient(String imie,String nazwisko, int wiek, String adres)
    {
        this.adres = adres;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    //  Funkcja sprawdza czy jest wywoływana po raz pierwszy, jeśli tak przypisuje zmiennej
    //  ostatniaWycieczka parametr powrot
      //i zwraca false, jeśli nie porównuje date zmiennej ostatniaWycieczka
    // z parametrem wyjazd za pomocą metody amountOfDays,
      //jeśli różnica między nimi jest większa niż 30 funkcja zwraca false, jeśli nie zwraca true.


    public boolean zapiszWycieczke(Data wyjazd, Data powrot)
    {
        if(!first)
        {
            this.ostatniaWycieczka = powrot;
            first = true;
            return false;
        }

        int dni1 = ostatniaWycieczka.amountOfDays();
        int dni2 = wyjazd.amountOfDays();
        int difference = (dni1 > dni2) ? dni1 - dni2 : dni2 - dni1;

        if(difference > 30)
        {
            this.ostatniaWycieczka = powrot;
            return false;
        }

        this.ostatniaWycieczka = powrot;
        return true;
    }


     // Funkcja dodaje wartosc parametru cena do zmiennej lacznaCena


    public void obliczCene(float cena)
    {
        lacznaCena+=cena;
    }
}
