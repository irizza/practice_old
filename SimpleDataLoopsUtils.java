package practice1;


public class SimpleDataLoopsUtils {

    public static byte myByte;
    public static int myInt;
    public static  float myFloat;
    public static char myChar;

    public static void printVariables(){
        System.out.println(myByte);
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myChar);
    }
/**4) Заданы значения 2-х катетов и гипотенузы треугольника. Проверить является ли
 данный треугольник прямоугольным. Вычисления записать выражением, состоящим из
 одной строки (используя оператор “?:”).*/
    public static void checkTriangle(int side1, int side2, int hypotenuse) {
        if(side1 + side2 > hypotenuse){
            System.out.println((side1*side1+side2*side2 == hypotenuse*hypotenuse)?"Rectangle":"Not Rectangle" );
        }else{
            System.out.println("it is not triangle");
        }

    }

    public static void initFloatVariables() {
        float a = 1.f;
        float b = 1;
        float c = 0x1;
        float d = 0b1;
        float e = 1.0e1f;
        float f = 01;
        System.out.println(a + "  " + b + "  " + c + "  " + d + "  " + e + "  " + f);
    }

    public static void shortTypeCheck() {
        byte t = 2;
        short y = 4;
        short a = 1 + 3;
        short b = (short)(2 + 3.4);
        short c = (short)(34F + 12);
        short d = (short)(t + y );
        short e = (short)(34F + 32.2);
        System.out.println(a + "  " + b + "  " + c + "  " + d + "  " + e );
    }
/**9) Две переменные типа int, имеют положительные значения int a - начало
 диапазона, int b - конец диапазона, a&gt;b. Вычислить среднее значение чисел в
 заданном диапазоне.*/
    public static void Srednee(int a, int b, int r) {
        r = (a+b)/2;
        System.out.println("Srednee znachenie bydet  " + r);
    }
/**8) Имея три переменных типа int a, b, c выведите на экран “true”, если сумма
 значений двух любых из этих переменных равна значению третьей.*/
    public static void sumArg(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("true");
        } else if (c + b == a) {
            System.out.println("true");

         } else if (a + c == b) {
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }

/**7) Подсчитать    сумму простых чисел в диапазоне от 1 до 20. */
    public static void sumArg1to20(int i) {


            System.out.println(i);
        }

    }
/**10) Написать программу расчета обязательных платежей кредитора при
 пользовании банковским кредитом.

 К*n*%/360 или 365(6)


 */
   /* public static void Credit(int sum, int percent, int time, int fullsum ) {
        fullsum = (sum*percent)/time;
        System.out.println("");

    }*/
