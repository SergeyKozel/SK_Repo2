package testSK;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testCars {

    static void main(String[] args) throws IllegalAccessException {

//        String city = "Vitebsk";
//
//        Sedan sedan = new Sedan(7, 55, 120);
//        sedan.driveTo("Minsk");
//
//        Track track = new Track(22, 900, 15);
//        track.driveTo("Gomel");

        List<String> testers1 = new ArrayList();
        testers1.add("Danila");
        testers1.add("Bogdan");
        testers1.add("Gena");
        testers1.add("Alex");
        System.out.println("Список 1: " + testers1);

        List<String> testers2 = new ArrayList();
        testers2.add("Alex");
        testers2.add("Dima");
        testers2.add("Elena");
        testers2.add("Janna");
        testers2.add("Bogdan");
        System.out.println("Список 2: " + testers2);
        System.out.println("*****************");

        //1 добавление в список одинаковых
        Massive massive = new Massive();
        System.out.println("intersection: " + massive.intersection(testers1, testers2));
        System.out.println("---------------------");

        //2 объединение в 1 список без повторений
        System.out.println("union: " + massive.union(testers1, testers2));
        System.out.println("---------------------");

        //3 объединение в список отличающихся
        System.out.println("symmetricDiff: " + massive.symmetricDiff(testers1, testers2));
        System.out.println("---------------------");

        //4 Список 1 - Список 2
        System.out.println("subtract: " + massive.subtract(testers1, testers2));



        System.out.println("---------------------");


        //5 CollectionUtils
        System.out.println("Util inter: "+CollectionUtils.intersection(testers1,testers2));
        System.out.println("Util union: "+CollectionUtils.union(testers1,testers2));
        System.out.println("Util   dis: "+CollectionUtils.disjunction(testers1,testers2));
        System.out.println("Util   sub: "+CollectionUtils.subtract(testers1,testers2));

        12312312



    }
}
