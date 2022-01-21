package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
    public ArraysAndStreams(){



    }

    public void run(){

        Predicate<Integer> Valuesgreaterthen4 = value -> value > 4;

        System.out.printf("values before sorted %s%n",Arrays.stream(values).collect(Collectors.toList()));


        System.out.printf("sorted values:%s%n " ,Arrays.stream(values).sorted().collect(Collectors.toList()));


        //filter the values

        List<Integer> greaterThan4 =   Arrays.stream(values).filter(Valuesgreaterthen4).collect(Collectors.toList()); //.sort();
        System.out.printf("values greater than 4 %s%n ", greaterThan4);

        System.out.printf("values greater then 4 accending with streams : %s%n",
                greaterThan4.stream().sorted().collect(Collectors.toList())
                );
    }

//    public void  printValue(){
//        System.out.printf("%s%n",values);
//    }


}
