public class Main {
    public static void main() {

        int myInt = 50000;
        float myFloat = 5.75f;
        double myDouble = 19.99d;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("--- Primitive Variables ---");
        System.out.println("Int: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Bool: " + myBoolean);

        // Narrowing Type Casting
        double doubleForNarrowing = 9.78d;
        int narrowedInt = (int) doubleForNarrowing;
        System.out.println("\n--- Narrowing Cast ---");
        System.out.println("Original double: " + doubleForNarrowing);
        System.out.println("Narrowed int: " + narrowedInt);

        // Widening Type Casting
        int intForWidening = 9;
        double widenedDouble = intForWidening;
        System.out.println("\n--- Widening Cast ---");
        System.out.println("Original int: " + intForWidening);
        System.out.println("Widened double: " + widenedDouble);

        // Attempting to cast a boolean to an int is illegal in Java.
        // boolean myBool = true;
        // int illegalCast = (int) myBool;
    }
}