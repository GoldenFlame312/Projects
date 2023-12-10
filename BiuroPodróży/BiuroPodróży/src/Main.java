import java.util.Random;


//  klasa z funkcja main

public class Main
{


    // tworzenie tablic klientow i wycieczek
     //  wyniki raportow


    public static void main(String[] args)
    {
        int ktoraWycieczka = 0;
        int ktoryKlient = 0;

        Random rand = new Random();

        Wycieczka[] wycieczki = {
                new Wycieczka(new Data(2022,10,6), new Data(2022,11,6), new Czas(15,30), new Czas(19,30), "Malta", "Wycieczka na Malte", 5000, 25),
                new Wycieczka(new Data(2022,11,6), new Data(2022,12,6), new Czas(15,45), new Czas(16,30), "Zimbabwe", "Wycieczka do Zimbabwe", 6000, 20),
                new Wycieczka(new Data(2022,12,6), new Data(2023,1,6), new Czas(16,30), new Czas(17,30), "Hiszpania", "Wycieczka do Hiszpani", 2500, 40),
                new Wycieczka(new Data(2023,1,6), new Data(2023,2,6), new Czas(18,0), new Czas(18,30), "Egipt", "Wycieczka do Egiptu", 1500, 50),
                new Wycieczka(new Data(2023,2,6), new Data(2023,3,6), new Czas(6,30), new Czas(10,15), "Francja", "Wycieczka do Francji", 9000, 10),
                new Wycieczka(new Data(2023,3,6), new Data(2023,4,6), new Czas(12,45), new Czas(20,30), "Niemcy", "Wycieczka do Niemiec", 1000, 60),
                new Wycieczka(new Data(2023,4,6), new Data(2023,5,6), new Czas(11,45), new Czas(21,0), "Stany", "Wyciecka do Stanów Zjednoczonych", 4500, 30),
        };

        Klient[] klienci = {
                new Klient("Adam","Nowak",41,"Łódz"),
                new Klient("Stanisław","Nowicki",22,"Katowice"),
                new Klient("Grzegorz","Floryda",35,"Sosnowiec"),
                new Klient("Alan","Chachoł",67,"Czeladź"),
                new Klient("Kamil","Korczyk",83,"Mysłowice"),
                new Klient("Natalia","Rózycka",19,"Gdańsk"),
                new Klient("Wojtek","Gola",71,"Kołobrzeg"),
                new Klient("Gracjan","Roztocki",55,"Warszawa"),
                new Klient("Paweł","Ociepka",38,"Kraków"),
                new Klient("Kuba","Przbysz",29,"Szczecin")
        };

        ktoraWycieczka = rand.nextInt(7);
        ktoryKlient = rand.nextInt(10);

        wycieczki[ktoraWycieczka].obliczWypelnienie();

        WykupionaWycieczka wykupionaWycieczka = new WykupionaWycieczka(wycieczki[ktoraWycieczka],
                new Data(2022,10,1),klienci[ktoryKlient]);
        wykupionaWycieczka.sprawdzRabat();

        WykupionaWycieczka[] wykupioneWycieczki = {wykupionaWycieczka};

        while(wykupioneWycieczki.length <= 20)
        {
            ktoraWycieczka = rand.nextInt(7);
            ktoryKlient = rand.nextInt(10);

            wycieczki[ktoraWycieczka].obliczWypelnienie();

            wykupionaWycieczka = new WykupionaWycieczka(wycieczki[ktoraWycieczka],
                    new Data(2022,10,1),klienci[ktoryKlient]);
            wykupionaWycieczka.sprawdzRabat();


            wykupioneWycieczki = dodajWycieczke(wykupioneWycieczki,wykupionaWycieczka);

        }

        //RAPORTY


        System.out.println();

        int suma = 0;

        for(WykupionaWycieczka ww : wykupioneWycieczki)
        {
            suma += ww.wycieczka.cena;
        }

        System.out.printf("Suma cen wycieczek: %dzł\n\n",suma);


        for(WykupionaWycieczka w : wykupioneWycieczki)
        {
            System.out.printf("Wykupiona Wycieczka do %s, kosztowała %dzł, od %d.%d.%d do %d.%d.%d," +
                            " %s, Wypełnienie środka transportu po wykupieniu wynosiło %d%%\n"
                    ,w.wycieczka.cel,Math.round(w.wycieczka.cena),
                    w.wycieczka.dateWyjazdu.dzien,w.wycieczka.dateWyjazdu.miesiac,w.wycieczka.dateWyjazdu.rok,
                    w.wycieczka.dataPowrotu.dzien,w.wycieczka.dataPowrotu.miesiac
                    ,w.wycieczka.dataPowrotu.rok,w.wycieczka.opis,Math.round(w.wypelnienieTransportu));
        }

        System.out.println();

        for(Klient k : klienci)
        {
            int ilosc = 0;
            for(WykupionaWycieczka ww : wykupioneWycieczki)
            {
                if(ww.klient == k)
                {
                    ilosc++;
                }
            }
            System.out.printf("Klient %s %s wykupił %d wycieczek\n",k.imie,k.nazwisko,ilosc);
        }

        System.out.println();

        Klient klient = new Klient();
        for(Klient k : klienci)
        {
            if(klient.lacznaCena < k.lacznaCena)
            {
                klient = k;
            }
        }
        System.out.printf("%s %s wydał %dzł\n",klient.imie,klient.nazwisko,Math.round(klient.lacznaCena));

        System.out.println();

        Wycieczka[] wycieczki2 = new Wycieczka[wycieczki.length];
        System.arraycopy(wycieczki,0,wycieczki2,0,wycieczki.length);

        int[] iloscWycieczek = new int[wycieczki.length];
        for(int i = 0; i < wycieczki.length; i++)
        {
            int ile = 0;
            for(WykupionaWycieczka ww : wykupioneWycieczki)
            {
                if(wycieczki[i].dateWyjazdu.dzien == ww.wycieczka.dateWyjazdu.dzien
                && wycieczki[i].dateWyjazdu.miesiac == ww.wycieczka.dateWyjazdu.miesiac
                && wycieczki[i].dateWyjazdu.rok == ww.wycieczka.dateWyjazdu.rok)
                {
                    ile++;
                }
            }
            iloscWycieczek[i] = ile;
        }
        int i2, j2, temp;
        Wycieczka temp_w;
        for (i2 = 0; i2 < iloscWycieczek.length - 1; i2++){
            for (j2 = 0; j2 < iloscWycieczek.length - 1; j2++){
                if(iloscWycieczek[j2] < iloscWycieczek[j2 + 1]){
                    temp = iloscWycieczek[j2];
                    iloscWycieczek[j2] = iloscWycieczek[j2 + 1];
                    iloscWycieczek[j2 + 1] = temp;

                    temp_w = wycieczki2[j2];
                    wycieczki2[j2] = wycieczki2[j2 + 1];
                    wycieczki2[j2 + 1] = temp_w;
                }
            }
        }
        for (int i = 0; i<iloscWycieczek.length;i++)
        {
            System.out.printf("W dniu %d.%d.%d odbyło się %d wycieczek\n",
                    wycieczki2[i].dateWyjazdu.dzien,wycieczki2[i].dateWyjazdu.miesiac,
                    wycieczki2[i].dateWyjazdu.rok,iloscWycieczek[i]);
        }
    }

     //Funkcja rozszerz tablice  o parametr i ją zwraca

    public static WykupionaWycieczka[] dodajWycieczke(WykupionaWycieczka[] wwTab, WykupionaWycieczka ww)
    {
        int i = 0;
        WykupionaWycieczka[] wwTab2 = new WykupionaWycieczka[wwTab.length+1];

        System.arraycopy(wwTab,0,wwTab2,0,wwTab.length);
        wwTab2[wwTab2.length-1] = ww;

        return  wwTab2;
    }

}
