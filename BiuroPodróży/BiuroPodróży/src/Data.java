
// Klasa przechowująca datę.

public class Data
{
    int rok;
    int miesiac;
    int dzien;

    public Data() {}


     // Konstruktor. pobiera obiekt typu Data i zapisuje jego dane w zmiennych


    public Data(Data data) {
        this.rok = data.rok;
        this.miesiac = data.miesiac;
        this.dzien = data.dzien;
    }


     // Konstruktor. pobiera rok, miesiac, dzien


    public Data(int rok, int miesiac, int dzien) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }


     // Oblicza i zwraca ilość dni pobranej daty, zamienia lata i miesiące na dni


    public int amountOfDays()
    {
        int days = this.dzien;
        int year = this.rok;
        int month = this.miesiac;

        //YEARS TO DAYS
        int leapYears = year / 4;
        int normalYears = year - leapYears;

        days += normalYears * 365;
        days += leapYears * 366;

        //MONTHS TO DAYS
        int febLenght = (year % 4 == 0) ? 29 : 28;
        int[] monthsDayAmount = {31, febLenght, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i<month;i++)
        {
            days += monthsDayAmount[i];
        }
        return days;
    }
}
