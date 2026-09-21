package gnm.learn.hexlet.cycles;

public class CyclesLearn {
    public static void main(String[] args) {
        System.out.println(reverseString("Ban"));
    }

    public static String reverseString(String str) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            result = str.charAt(i) + result;
            i += 1;
        }
        return result;
    }
}
