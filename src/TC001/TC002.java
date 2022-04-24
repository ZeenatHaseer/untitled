package TC001;

public class TC002 {
    public static void main(String[] args) {
       String a = "java";
       String b = "vagja";
        for (int i = 0; i <a.length() ; i++) {
            char letter = a.charAt(i);
            b = b.replaceFirst(letter+"","");

        }
        System.out.println(b.isEmpty()?"Yes":"No");


        // updated

        // added some word
        //

    }
}
