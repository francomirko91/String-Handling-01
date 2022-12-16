public class Start {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";


        String x = string1.substring(0, 2);
        //System.out.println(x);


        String y = string2.substring(string2.length() - 2, string2.length());
        //System.out.println(y);


        String charArray = x + y;
        System.out.println(charArray);
    }
}








