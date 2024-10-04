public class LongExample {
    public static void main(String[] args) {
        Long obj = new Long(5665565656L); // Creating Long object with a long value
        Long obj1 = new Long(2232565886L); // Creating another Long object

        // In Java, the equals() function is used to compare two objects for equality.
        // The equals() function in Java takes a single parameter of type Object
        // The equals() function in Java returns a boolean value:
        /* example */
        System.out.println(obj.equals(56L)); // prints: true

        // The parseLong() function in Java is a method provided by the Long class that converts a String into a primitive long.
        // The Long.parseLong() method in Java has two variations based on the parameters passed to it.
        // The return type of the parseLong() method in Java is long.
        /* example */
        String str = "123456";
        long number = Long.parseLong(str); 
        System.out.println(number);  // prints: 123456

        // The compareTo() method in Java is used to compare two objects to determine their order.
        // The compareTo() method in Java takes one parameter, which is the object to be compared with the current object.
        // The compareTo() method compares the current object with o and returns a comparison result.
        /* example */
        System.out.println(obj.compareTo(obj1)); // prints a negative number since 56 < 86

        // The hashCode() method in Java is used to compute a hash code value for an object.
        // The hashCode() method in Java does not take any parameters. It is a parameterless method defined in the Object class.
        // The method returns an int value, which is the hash code of the object.
        System.out.println(obj.hashCode()); // prints the hash code of obj

        // The longValue() method is part of the Long class and returns the value of a Long object as a primitive long.
        /* example */
        System.out.println(obj.longValue()); // prints: 56
    }
    }
    

