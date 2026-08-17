public class JavaRecursion {
    public static void main(String[] args) {
        System.out.println(addNumber(3));

        int result = sum(1, 2);
       System.out.println(result);

        System.out.println("Multiplication of range (4, 6): " + multiplyRange(4, 6));
        System.out.println("Multiplication of range (2, 7): " + multiplyRange(2, 7));
    }

    static int addNumber (int number){
        if (number == 1){ //Stopping condition
            return number;
        }
        return addNumber(number -1);
    }

    static int returnNumber(){
        return 2;
    }

    static int sum(int start, int end){
        if (end > start){
            return end + sum(start, end -1);
        }
        else {
            return end;
        }
    }

    public static int multiplyRange(int start, int end) {
        if (start == end) {
            return start;
        } else {
            return start * multiplyRange(start + 1, end);
        }
    }
}