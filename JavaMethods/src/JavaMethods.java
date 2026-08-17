public class JavaMethods {
    public static void main(String[] args) {
        myFirstMethod();
        myFirstParamMethod("Idan", 28);

        int result = simpleCalculator(1, 2);
        System.out.println(result);

        System.out.println(checkAge(17));
    }

    //Without Params
    public static void myFirstMethod() {
        System.out.println("Hello World");
    }

    //With Params
    static void myFirstParamMethod(String firstName, int age) {
        System.out.println("Hello " + firstName + ". You are " + age + " years old.");
    }

    static int simpleCalculator(int a, int b) {
        return a + b;
    }

    static boolean checkAge(int age) {
        if (age < 18) {
            return true;
        } else {
            return false;
        }
    }

}
