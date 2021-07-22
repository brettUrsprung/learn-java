package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Add a num");
//        int num =scan.nextInt();
//        System.out.println(num);
//    asks to input a num in the log(outprint)


//        if(5>0) {
//            code
//        } else if {more code}


//arrays
//        String[] arr = new string[5];
//        either way works
//
//        String[] arr = {"john", "tommy", "mika"};
//
//        System.out.println(arr[0]);
//prints john
//        System.out.println(arr[arr.length]);


//        array list needs a reference data type within <>
//        array lists can be altered
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(7);
//        arrayList.add(9);
//        arrayList.add(0,9);
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.size());
//

//          DAY 2

        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);
// => [frog, giraffe, buffalo, mongoose]

// Puts shark as the first element in the ArrayList
        animalList.addFirst("shark");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose]

// Puts koala as the last element in the ArrayList
        animalList.addLast("koala");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose, koala]

// This adds the value cuttlefish to the 3rd index of the LinkedList
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);
// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]


    }
}
