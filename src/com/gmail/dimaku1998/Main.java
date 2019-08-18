/*2) С помощью циклов вывести на экран все простые числа от 1 до 100.
Простое число — число которое делиться нацело только на единицу или
само на себя. Первые простые числа это — 2,3,5,7…
*/
package com.gmail.dimaku1998;

public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100 ; i++){
            byte count  = 0;
            for (int j = 2; j <= i/2 ; j++){
                if (i%j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(" "+ i);
            }
        }
    }
}
