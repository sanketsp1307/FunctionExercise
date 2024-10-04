public class FloatExample {
    public static void main(String[] args) {
        Float obj = new Float(598236.0f);  // Float object initialized with 56.0
        Float obj1 = new Float(4567866.0f); // Float object initialized with 86.0

        // In Java, the equals() function is used to compare two objects for equality.
        // The equals() function in Java takes a single parameter of type Object.
        // The equals() function in Java returns a boolean value.
        /* example */
        System.out.println(obj.equals(56.0f)); // prints: true

        // The parseFloat() function in Java is a method provided by the Float class that converts a String into a primitive float.
        // The Float.parseFloat() method in Java has one variation based on the parameters passed to it.
        // The return type of the parseFloat() method in Java is float.
        /* example */
        String str = "123.45";
        float number = Float.parseFloat(str); 
        System.out.println(number);  // Output: 123.45

        // The compareTo() method in Java is used to compare two objects to determine their order.
        // The compareTo() method in Java takes one parameter, which is the object to be compared with the current object.
        // The compareTo() method compares the current object with o and returns a comparison result.
        /* example */
        System.out.println(obj.compareTo(obj1)); // Output: a negative number since 56.0 is less than 86.0

        // The hashCode() method in Java is used to compute a hash code value for an object.
        // The hashCode() method in Java does not take any parameters. It is a parameterless method defined in the Object class.
        // The method returns an int value, which is the hash code of the object.
        System.out.println(obj.hashCode()); // Output: hash code value for the Float object

        // The floatValue() method is part of the Float class and returns the value of a Float object as a primitive float.
        /* example */
        System.out.println(obj.floatValue()); // Output: 56.0
    }
    
}
