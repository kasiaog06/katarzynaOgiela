
package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Random r= new Random();

while(numbers.size()<6) {
    int num = r.nextInt(100);
    numbers.add(num);
    if(!numbers.contains(num)){
        numbers.add(num);
    }


}

        System.out.println(numbers);
        System.out.prntln(numbers);





    }


}