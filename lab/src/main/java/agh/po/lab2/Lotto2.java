package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lotto2 {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj 6 liczb");
        while (input.size() < 6){
            int number = myObj.nextInt();
            input.add(number);

        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r= new Random();
        while(numbers.size()<6) {
            int num = r.nextInt(100);
            numbers.add(num);
            if(!numbers.contains(num)){
                numbers.add(num);
            }
        }
        ArrayList <Integer> compare = new ArrayList<Integer>();

                }
            }






