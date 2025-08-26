package dsa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int n=0;
        ob.nextLine();
        System.out.println("Enter the number of elements:");
        while (true) {
            try {
                n = Integer.parseInt(ob.nextLine().trim()); // Convert input to integer safely
                if (n > 0) break; // Exit if valid number is entered
                System.out.println("Please enter a positive integer.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }
        for(int i=0;i<n;i++){
            list.add(ob.nextLine());
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
           if(( list.get(i).substring(0,1).equals("A"))||(list.get(i).substring(0,1).equals("E"))||(list.get(i).substring(0,1).equals("I"))||( list.get(i).substring(0,1).equals("O"))||(list.get(i).substring(0,1).equals("U"))) {
                System.out.println(i+list.get(i));
            }
        }
        ob.close();
    }

}
