package replit_tasks.week_8;

public class StringIsCharArray {
    public static void main(String[] args) {
        char [] array={'A','D','A','M'};
//        String name="";
//        for (char ch : array) {
//             name+=""+ch;
//        }

      String name=new String(array);
        System.out.println(name);
    }
}
