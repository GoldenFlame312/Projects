
 // klasa przechowująca dane o wycieczce

public class Wycieczka
{
    Data dateWyjazdu = new Data();
    Data dataPowrotu = new Data();
    Czas czasWyjazdu = new Czas();
    Czas czasPowrotu = new Czas();
    String cel;
    String opis;
    float cena;
    float iloscMiejsc;

    float iloscKlientow = 0;
    float wypelnienieTransportu = 0F;
    boolean first = false;


     // Konstruktor domyślny

    public Wycieczka(){}


    //  Konstruktor pobiera obiekt typu Wycieczka i zapisuje jego dane w zmiennych


    public Wycieczka(Wycieczka wycieczka)
    {
        this.dateWyjazdu = wycieczka.dateWyjazdu;
        this.dataPowrotu = wycieczka.dataPowrotu;
        this.czasWyjazdu = wycieczka.czasWyjazdu;
        this.czasPowrotu = wycieczka.czasPowrotu;
        this.cel = wycieczka.cel;
        this.opis = wycieczka.opis;
        this.cena = wycieczka.cena;
        this.iloscMiejsc = wycieczka.iloscMiejsc;
    }


     // Konstruktor. pobiera dane wycieczki  i zapisuje je w zmiennych


    public Wycieczka(Data dataWyjazdy, Data dataPowrotu, Czas czasWyjazdu, Czas czasPowrotu, String cel,
                     String opis, float cena, float iloscMiejsc)
    {
        this.dateWyjazdu = dataWyjazdy;
        this.dataPowrotu = dataPowrotu;
        this.czasWyjazdu = czasWyjazdu;
        this.czasPowrotu = czasPowrotu;
        this.cel = cel;
        this.opis = opis;
        this.cena = cena;
        this.iloscMiejsc = iloscMiejsc;
    }

   // Fuckcja oblicza w jakim procencie wypełniony jest srodek transportu

    public void obliczWypelnienie()
    {
        iloscKlientow++;
        this.wypelnienieTransportu = (float) (iloscKlientow/this.iloscMiejsc * 100F);
    }
}
