package gnm.learn.module1;

public class DayChoice {
    public String calcDays(int day) {
        if(day == 6 || day == 7)
            return "Ура! Выходной!";
        else {
            return "Будни(";
        }
    }
}
