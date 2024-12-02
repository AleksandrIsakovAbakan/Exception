public class Main {

    public static void main(String[] args) {
        methodTakesIntegerParameter(0);
        //methodTakesIntegerParameter(1);
        methodTakesIntegerParameter(2);
        methodTakesIntegerParameter(100);
        //methodTakesIntegerParameter(55);

        methodTakesStringInput("Значение ошибка");
        //methodTakesStringInput("Значение -123, ошибка 404");

    }

    public static void methodTakesIntegerParameter(int a){
        if (a % 2 != 0){
            throw new RuntimeException("Число нечетное");
        } else {
            System.out.println(a);
        }
    }

    public static void methodTakesStringInput(String s){
        for (char a : s.toCharArray()) {
            if (Character.isDigit(a)) throw new NumberFormatException("строка содержит числа: " + s);
        }
        System.out.println(s);
    }
}
