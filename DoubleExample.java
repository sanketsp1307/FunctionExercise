public class DoubleExample {
    public static void main(String[] args) {
        Double obj = new Double(896.0);
        Double obj1 = new Double(7236.0);

        // Using equals() to compare two Double objects for equality
        // The equals() function in Java takes a single parameter of type Object
        // The equals() function in Java returns a boolean value
        System.out.println(obj.equals(56.0)); 

        // The parseDouble() function in Java is a method provided by the Double class that converts a String into a primitive double.
        // The Double.parseDouble() method in Java has a single variation that takes a String as a parameter.
        // The return type of the parseDouble() method in Java is double.
        String str = "123.45";
        double number = Double.parseDouble(str);
        System.out.println(number); 

        // The compareTo() method in Java is used to compare two objects to determine their order.
        // The compareTo() method in Java takes one parameter, which is the object to be compared with the current object.
        // The compareTo() method compares the current object with obj1 and returns a comparison result.
        System.out.println(obj.compareTo(obj1)); 
        // The hashCode() method in Java is used to compute a hash code value for an object.
        // The hashCode() method in Java does not take any parameters. It is a parameterless method defined in the Object class.
        // The method returns an int value, which is the hash code of the object.
        System.out.println(obj.hashCode());

        // The doubleValue() method is part of the Double class and returns the value of a Double object as a primitive double.
        System.out.println(obj.doubleValue()); 
    }
    
}
