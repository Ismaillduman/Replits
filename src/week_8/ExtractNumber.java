package week_8;

public class ExtractNumber {
    public static void main(String[] args) {
        String str= "1v2ghjk35uz";
        String digit="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                digit+=str.charAt(i);
            }
        }
        System.out.println(digit);
    }
}
