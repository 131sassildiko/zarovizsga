package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class Digitscounter {


    public int getCountOfDigits(String s, int number) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)) == number) {
                count++;
            }
        }
        return count;
    }
}




