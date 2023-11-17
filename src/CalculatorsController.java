import java.util.Scanner;

public class CalculatorsController {
    private Scanner scanner = new Scanner(System.in);
    public void mainPage(){
        System.out.println("Адирхаєв Данило Сосланович");
        System.out.println("Виберіть дію:\n" +
                "1. Додавання класів\n" +
                "2.Знайти зворотні елементи\n" +
                "3.Віднімання класів\n" +
                "4.Множення класів\n" +
                "5. Ділення класів\n" +
                "6. Вийти");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                System.out.println("========================================");
                sumClasses();
            case 2:
                System.out.println("========================================");
                subClasses();
                break;
            case 3:
                System.out.println("========================================");
                reverseElements();
            case 4:
                System.out.println("========================================");
                multClasses();
            case 5:
                System.out.println("========================================");
                break;
            case 6:
                scanner.close();
                break;
        }
    }


    private void sumClasses(){
        System.out.println("Введіть числа першого рядку через пробіл:");
        String stringA = scanner.nextLine();
        int[] a = stringSplit(stringA);
        System.out.println("Введіть числа другого рядку через пробіл:");
        String stringB = scanner.nextLine();
        int[] b = stringSplit(stringB);
        System.out.println("Введіть модуль:");
        int mod = scanner.nextInt();
        double[][] val = new Calculator().sumClases(a, b, mod);
        new Calculator().displayResult(val);
        System.out.println("========================================");
        mainPage();
    }


    private void subClasses(){
        System.out.println("Введіть числа першого рядку через пробіл:");
        String stringA = scanner.nextLine();
        int[] a = stringSplit(stringA);
        System.out.println("Введіть числа другого рядку через пробіл:");
        String stringB = scanner.nextLine();
        int[] b = stringSplit(stringB);
        System.out.println("Введіть модуль:");
        int mod = scanner.nextInt();
        double[][] val = new Calculator().subClases(a, b, mod);
        new Calculator().displayResult(val);
        System.out.println("========================================");
        mainPage();
    }


    private void multClasses(){
        System.out.println("Введіть числа першого рядку через пробіл:");
        String stringA = scanner.nextLine();
        int[] a = stringSplit(stringA);
        System.out.println("Введіть числа другого рядку через пробіл:");
        String stringB = scanner.nextLine();
        int[] b = stringSplit(stringB);
        System.out.println("Введіть модуль:");
        int mod = scanner.nextInt();
        double[][] val = new Calculator().multClasses(a, b, mod);
        new Calculator().displayResult(val);
        System.out.println("========================================");
        mainPage();
    }


    private void reverseElements(){
        System.out.println("Введіть числа рядка через пробіл:");
        String stringA = scanner.nextLine();
        int[] a = stringSplit(stringA);
        System.out.println("Введіть модуль:");
        int mod = scanner.nextInt();
        double[] val = new Calculator().reverseElements(a, mod);
        System.out.println("РЕЗУЛЬТАТ:");
        new Calculator().displayResult(val);
        System.out.println("========================================");
        mainPage();
    }




    private int[] stringSplit(String string){
        String[] stringArray = string.split(" ");
        int[] a = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            a[i] = Integer.parseInt(stringArray[i]);
        }
        return a;
    }
}

