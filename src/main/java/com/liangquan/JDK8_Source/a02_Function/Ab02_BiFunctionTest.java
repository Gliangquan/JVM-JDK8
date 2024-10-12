package com.liangquan.JDK8_Source.a02_Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName：Ab02_BiFunctionTest
 * @Author: liangquan
 * @Date: 2024/10/12 15:53
 * @Description:
 */
public class Ab02_BiFunctionTest {

    public static void main(String[] args) {
        Persons persons1 = new Persons("name1", 11);
        Persons persons2 = new Persons("name2", 22);
        Persons persons3 = new Persons("name3", 33);
        Persons persons4 = new Persons("name4", 44);

        List<Persons> list = Arrays.asList(persons1, persons2, persons3, persons4);

        Ab02_BiFunctionTest test = new Ab02_BiFunctionTest();
        List<Persons> personsByAge = test.getPersonsByAge2(22, list);
        personsByAge.forEach(v -> System.out.println(v.getName()));


        BiFunction<Integer, List<Persons>, List<Persons>> biFunction = (ageForPerson, personsList) ->
                personsList.stream().filter(v -> v.getAge() > ageForPerson).collect(Collectors.toList());

        List<Persons> personsByAge3 = test.getPersonsByAge3(22, list, biFunction);
        personsByAge3.forEach(v -> System.out.println(v.getName()));

    }

    public List<Persons> getPersonsByAge1(int age, List<Persons> persons) {
        return persons.stream()
                .filter(person -> person.getAge() > age)
                .collect(Collectors.toList());
    }

    public List<Persons> getPersonsByAge2(int age, List<Persons> persons) {
        BiFunction<Integer, List<Persons>, List<Persons>> biFunction = (ageForPerson, personsList) ->
            personsList.stream().filter(v -> v.getAge() > ageForPerson).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    public List<Persons> getPersonsByAge3(int age, List<Persons> persons, BiFunction<Integer, List<Persons>, List<Persons>> biFunction) {
        return biFunction.apply(age, persons);
    }

}
