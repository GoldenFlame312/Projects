
 // klasa przechowująca dane na temat wykupionej wycieczki

public class WykupionaWycieczka
{
    Wycieczka wycieczka = new Wycieczka();
    Data dataZakupu = new Data();
    Klient klient = new Klient();
    float wypelnienieTransportu;


     // Konstruktor domyślny

    public WykupionaWycieczka() {}


    //  Konstruktor. pobiera obiekt typu WykupionaWycieczka i zapisuje jego dane w zmiennych


    public WykupionaWycieczka(WykupionaWycieczka wykupionaWycieczka)
    {
        this.wycieczka.dateWyjazdu = wykupionaWycieczka.wycieczka.dateWyjazdu;
        this.wycieczka.dataPowrotu = wykupionaWycieczka.wycieczka.dataPowrotu;
        this.wycieczka.czasWyjazdu = wykupionaWycieczka.wycieczka.czasWyjazdu;
        this.wycieczka.czasPowrotu = wykupionaWycieczka.wycieczka.czasPowrotu;
        this.dataZakupu = wykupionaWycieczka.dataZakupu;
        this.wycieczka.cel = wykupionaWycieczka.wycieczka.cel;
        this.wycieczka.opis = wykupionaWycieczka.wycieczka.opis;
        this.klient = wykupionaWycieczka.klient;
        this.wycieczka.cena = wykupionaWycieczka.wycieczka.cena;
        this.wypelnienieTransportu = wykupionaWycieczka.wycieczka.wypelnienieTransportu;
    }


    //  Konstruktor. pobiera Wyciecczke, date zakupu i klienta, i zapisuje je w zmiennych


    public WykupionaWycieczka(Wycieczka wycieczka, Data dataZakupu, Klient klient)
    {
        this.wycieczka.dateWyjazdu = wycieczka.dateWyjazdu;
        this.wycieczka.dataPowrotu = wycieczka.dataPowrotu;
        this.wycieczka.czasWyjazdu = wycieczka.czasWyjazdu;
        this.wycieczka.czasPowrotu = wycieczka.czasPowrotu;
        this.dataZakupu = dataZakupu;
        this.wycieczka.cel = wycieczka.cel;
        this.wycieczka.opis = wycieczka.opis;
        this.klient = klient;
        this.wycieczka.cena = wycieczka.cena;
        this.wypelnienieTransportu = wycieczka.wypelnienieTransportu;

    }


     // Funkcja przy użyciu funkcji zapiszWycieczke sprawdza czy klient powinien dostać rabat
    // jeśli tak nakładany jest rabat 10%. Wykonywana jest również funkcja obliczCene.

    public void sprawdzRabat()
    {
        if(this.klient.zapiszWycieczke(this.wycieczka.dateWyjazdu,this.wycieczka.dataPowrotu))
        {
            this.wycieczka.cena = this.wycieczka.cena - this.wycieczka.cena * 0.1F;
        }

        this.klient.obliczCene(this.wycieczka.cena);
    }
}
