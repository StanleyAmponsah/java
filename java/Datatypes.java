

public class Datatypes {
    public static void main(String[] args) {
        /*  Every primitive type has a corresponding class defined in the Java API class library. This class is sometimes called a wrapper class
        //becaause it wraps a primitive value with the object-oriented equivalent of pretty wrapping paper and a bow to make the primitive type 
        // look and behave like an object.*/
        int age = 80;
        String stan = Integer.toString(age);

        String s = "Hello World";
        //an empty string
        String t = "";

        String a = "10";
        int x = Integer.parseInt(a);

        // parse is used to convert strings to other data types
        
        // type casting
        //to cast a primitive value from one type to another, you use a cast operator, which is simply the name of a primitive type in parentheesis
        // placed before the value you want to cast.

        double PI = 3.942;
        int me = (int)PI;
        Math.round(PI);
        System.out.println(me);

        


    }
}
