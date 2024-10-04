public class IntFunction {
    public static void main(String[] args) {
       
            Integer obj = new Integer(56);
            Integer obj1 = new Integer(86);
    
    //In Java, the equals() function is used to compare two objects for equality.
    //The equals() function in Java takes a single parameter of type Object
    //The equals() function in Java returns a boolean value:
      /*example*/ 
       System.out.println(obj.equals(56)); // prints: true
    
    //The parseInt() function in Java is a method provided by the Integer class that converts a String into a primitive int.
    //The Integer.parseInt() method in Java has two variations based on the parameters passed to it. Both are used to convert a string to an int, but the second variation allows specifying the number system (radix) to be used for conversion.
    //The return type of the parseInt() method in Java is int.
    /*example*/
    String str = "123";
    int number = Integer.parseInt(str); 
    System.out.println(number);  
    
    //The compareTo() method in Java is used to compare two objects to determine their order.
    //The compareTo() method in Java takes one parameter, which is the object to be compared with the current object.
    //The compareTo() method compares the current object with o and returns a comparison result.
    /*example*/System.out.println(obj.compareTo(obj1));
    
    
    //The hashCode() method in Java is used to compute a hash code value for an object.
    //The hashCode() method in Java does not take any parameters. It is a parameterless method defined in the Object class.
    //The method returns an int value, which is the hash code of the object.
    System.out.println(obj.hashCode());


    //The floatValue() method is part of the Float class and returns the value of a Float object as a primitive float.
    //The int to be parsed into a float.
    //Returns the parsed float value.

    /*example*/System.out.println(obj.floatValue());
        }
    }


