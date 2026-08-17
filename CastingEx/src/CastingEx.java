public class CastingEx {
    static void main() {

        int myInt = 100;
        long intToLong = myInt;
        System.out.println("The new myInt is: " + intToLong);

        Integer myInteger = 200;
        double myDouble = 75.89;
        int doubleToInt = (int) myDouble;
        System.out.println("The new number is: " + doubleToInt);

        Double myDoubleObj = myDouble;
        System.out.println("The new myDoubleObj is: " + myDoubleObj);

        int integerToInt = myInteger;
        System.out.println("The new myInteger is: " + integerToInt);

        String ageAsString = "21.3";
        System.out.println("Current Age is: " + ageAsString);
        double ageAsDouble = Double.parseDouble(ageAsString);
        ageAsDouble++;
        System.out.println("The age is: " + ageAsDouble);

        String stringFromDouble = String.valueOf(myDouble);
        System.out.println(stringFromDouble);


    }
}