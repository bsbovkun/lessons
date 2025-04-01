import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //System.out.println("Введите свой вес(кг):");
        // double weight = new Scanner(System.in).nextDouble();
        //System.out.println("Введите свой рост(м):");
        //double height = new Scanner(System.in).nextDouble();
        //System.out.println("BMI = " + weight / (height * height));
//
//        System.out.println("\t\t***Добро пожаловать в калькульоор умножения чисел!***\n\n");
//        System.out.println("Введите число:");
//        int a = new Scanner(System.in).nextByte();
//        System.out.println("Введите второе число:");
//        int b = new Scanner(System.in).nextByte();
//
//        System.out.println(a+ " * " + b + " = " + a * b);
//
//        int a = 15;
//        int b = 25;
//        int catCount = 120;
//        int catBong = 520;
//        int notGoy = 320;
//
//        String cat = "Рыжик";
//        char sumbol = 'a';
//        char sumbols = 'b';
//        int integer = 10;
//        double price = 19.99;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(catCount);
//        System.out.println(notGoy);
//        System.out.println(cat);
//        System.out.println(sumbol);
//        System.out.println(sumbols);
//        System.out.println(integer);
//        System.out.println(price);


//        System.out.println("Калькулятор суммы чисел!");
//        System.out.println("Введите первое число:");
//        double a = new Scanner(System.in).nextDouble();
//
//        System.out.println("Введите второе число:");
//        double b = new Scanner(System.in).nextDouble();
//        System.out.println(a + " + " + b + " = " + (a + b));
//
//
//
//
//
//        System.out.println("Калькулятор разности чисел!");
//        System.out.println("Введите первое число:");
//        double ar = new Scanner(System.in).nextDouble();
//
//        System.out.println("Введите второе число:");
//        double br = new Scanner(System.in).nextDouble();
//        System.out.println(ar + " - " + br + " = " + (ar + br));
//
//
//
//
//        System.out.println("Калькулятор частного чисел!");
//        System.out.println("Введите первое число:");
//        double ac = new Scanner(System.in).nextDouble();
//
//        System.out.println("Введите второе число:");
//        double bc = new Scanner(System.in).nextDouble();
//        System.out.println(ac + " / " + bc + " = " + (ac + bc));

//
//        System.out.println("Конвертор валют");
//
//        System.out.println("Введите количество рублей:");
//        double rubCount = new Scanner(System.in).nextDouble();
//
//        System.out.println("Введите актуальный курс евро:");
//        double eurPrice = new Scanner(System.in).nextDouble();
//
//        System.out.println("Введите актуальный курс доллара:");
//        double dollarPrice = new Scanner(System.in).nextDouble();
//
//        System.out.println(rubCount + " рублей это " + rubCount * (1 / eurPrice));
//
//        System.out.println(rubCount + " рублей это " + rubCount * (1 / dollarPrice) + " долларов.");
//
//        System.out.println("Конвертер температур");
//        System.out.println("Введите градусы по цельсию:");
//        double celsiusCount = new Scanner(System.in).nextDouble();
//        int coef1 = 32;
//        double coef2 = 1.8;
//        System.out.println(celsiusCount + " градусов по цельсию это " + (celsiusCount * coef2 + coef1));

        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int woterPrice = 50;

        boolean isCanBuy = false;

        System.out.println("Доступно: ");
        System.out.println(" Твикс 77 \n Марс 78 \n Сникерс 100 \n Вода 50 ");
//
//
//        System.out.println("Введите колличество денег: ");
//        int maneyAmoyt = new Scanner(System.in).nextInt();
//
//        if (maneyAmoyt >= twixPrice) {
//            System.out.println("Вы можете купить твикс!");
//            isCanBuy = true;
//            if (maneyAmoyt % 3 == 0) {
//                System.out.println("Вы выиграли счастливый билет на 100р. обратитесь к администратору");
//            }
//        }
//
//        if (maneyAmoyt >= marsPrice) {
//            System.out.println("Вы можете купить марс!");
//            isCanBuy = true;
//        }
//
//        if (maneyAmoyt >= snickersPrice) {
//            System.out.println("Вы можете купить cникерс!");
//            isCanBuy = true;
//        }
//
//        if (maneyAmoyt >= woterPrice) {
//            System.out.println("Вы можете купить воду!");
//            isCanBuy = true;
//        }
//
//        if (isCanBuy == false) {
//            System.out.println("У вас недостаточно средст!");
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//        }



         boolean isContinue = true;
         int x = 0;
         int y = 0;
         while (isContinue){
             System.out.println("Выберте куда двинуться:\n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево");
             int input = new Scanner(System.in).nextInt();
             if (input == 1) {
                 y++;
             } else if (input == 2) {
                 y--;
             } else if (input == 3) {
                 x++;
             } else if (input == 4) {
                 x--;
             } else {
                 System.out.println("Error");
                 isContinue = false;
             }
             System.out.println("Координаты робота: по вертикали " + y + ", по горизонтали");
         }
    }
}