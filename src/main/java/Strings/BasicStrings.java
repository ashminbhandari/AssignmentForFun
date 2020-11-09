package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String ret = "";
        for (int i = 0; i < string.length(); i++) {
            ret += " ";
        }
        return ret;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String ret = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                ret += Character.toLowerCase(string.charAt(i));
            } else {
                ret += Character.toUpperCase(string.charAt(i));
            }
        }
        return ret;
    }

    public String oneAtATime(String string1, String string2) {
        int handA = 0;
        int handB = 0;
        String ret = "";
        while (handA < string1.length() || handB < string2.length()) {
            if (handA < string1.length()) ret += string1.charAt(handA);
            if (handB < string2.length()) ret += string2.charAt(handB);
            handA += 1;
            handB += 1;
        }
        return ret;
    }
}
