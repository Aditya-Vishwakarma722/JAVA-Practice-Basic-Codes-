import java.util.Locale;

public class String_Methods {
    public static void main(String[] args){
        String name = "Aditya Vishwakarma";
        int length = name.length();
        //System.out.println("Length of String : "+length);
        System.out.println("Length of the String : "+name.length());

        String uppercase = name.toUpperCase();
        String lowercase = name.toLowerCase();
        System.out.println("String in Upper Case : "+uppercase);
        System.out.println("String in Lower Case : "+lowercase);

        String trimmed = name.trim();
        System.out.println("Trimmed String : "+trimmed);

        String substring1 = name.substring(0,7);
        System.out.println("Name in the String : "+substring1);

        String substring = name.substring(7);
        System.out.println("Surname in the String : "+substring);

        System.out.println("Replaced Character in the String : "+name.replace('a','b'));
        System.out.println("Replaced Word in the String : "+name.replace("Aditya","Shankar"));

        System.out.println("Name Starts with Aditya? : "+name.startsWith("Aditya"));
        System.out.println("Name Ends with Karma? : "+name.endsWith("karma"));

        System.out.println("Starting Letter in the String : "+name.charAt(0));
        System.out.println("Index of [first - a] in the String : "+name.indexOf('a'));
        System.out.println("Index of [last - a] in the String : "+name.lastIndexOf('a'));

        System.out.println("Is the Name \"Aditya Vishwakarma\" : "+name.equalsIgnoreCase("aditya vishwakarma"));

    }

}
