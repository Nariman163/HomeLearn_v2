package gnm.learn.module1;

public class LogicalLessonAND {

    public String driverCheck(int age, boolean hasLicense) {
        if (age > 18 && hasLicense)
            return "Можно садиться за руль";
        else {
            return "Водить нельзя";
        }
    }
}
