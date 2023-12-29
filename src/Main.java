public class Main {
    public static void main(String[] args) {

     /*
    Задача 1
Объявите три массива:
Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
new
Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
 Массив сразу заполните значениями.
Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
с помощью ключевого слова или сразу заполненный элементами.
.
     */
        System.out.println(" Задача № 1");
        int[] massiv = new int[]{1, 2, 3};
        double[] drob = new double[]{1.57, 7.654, 9.986};
        int[] maska = {4, 5, 6};
        int[] morcovka = new int[3];
        morcovka[0] = 7;
        morcovka[1] = 8;
        morcovka[2] = 9;

        /*

Задача 2
Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
         */
        System.out.println("задача №2");
        //№1
        System.out.println();
        System.out.println("№1");
        int a = massiv[0];
        int b = massiv[1];
        int c = massiv[2];
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        System.out.println(c);
        //System.out.print(massiv[a-1]+", "); //[a-1]непонятная запись для меня, но работает
        //System.out.print(massiv[b-1]+", "); //непонятная запись для меня
        //System.out.println(massiv[c-1]);   //непонятная запись для меня
        System.out.print(massiv[0]);
        System.out.print(massiv[1]);
        System.out.println(massiv[2]);
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i]+", ");

        }
        System.out.println();


        //№2
        System.out.println();
        System.out.println("№2");
        for (int n = 0; n < drob.length; n++) {
            System.out.print(drob[n]+", " );
        }
        System.out.println();
        System.out.println("№3");
        for (int i =0; i < morcovka.length; i++) {
            System.out.print(morcovka[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача № 3");
 /*
            Задача 3
Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
В конце строки запятую ставить не надо.
Если в задаче 2 в консоль у вас вывелся результат:
             */
        // №1
        for (int i  = massiv.length-1; i >= 0; i--) {
            System.out.print(massiv[i] + ", ");
        }
        System.out.println();
        //№2
        for (int i = drob.length-1; i >= 0; i--) {
            System.out.print(drob[i] + ", ");
        }
        System.out.println();
        //3
        for (int i = morcovka.length-1; i >= 0; i--) {
            System.out.print(morcovka[i]+", ");

        }




    }
    }



