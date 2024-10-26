package com.liangquan.OtherCode.CollectionsSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName：StringComparator
 * @Author: liangquan
 * @Date: 2024/10/26 11:01
 * @Description: 排序
 */
public class StringComparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("v", "d", "b", "w", "g", "j");

        StringSort(list);

        sortEmpByIDefineMode();

    }

    /* *
     * @Title:
     * @Author: liangquan
     * @Date: 2024-10-26 17:16:23
     * @Params: List<String> list
     * @Return: null
     * @Description: 字符串排序
     */
    private static void StringSort(List<String> list) {
        // Collections.sort -> list.sort -> Arrays.sort -> (TimSort.sort) OR (ComparableTimSort.sort)
        // 数组，new 比较器
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        // ollections.sort(list, Collections.reverseOrder());
        System.out.println("list = " + list);
    }


    static List<Emp> empList;
    static {
        Emp emp1 = new Emp(2, "Guan YunChang");
        Emp emp2 = new Emp(3, "Zhang Fei");
        Emp emp3 = new Emp(1, "Liu Bei");
        empList = Arrays.asList(emp1, emp2, emp3);
    }

    private static void sortEmpByIDefineMode() {
        // 方法一：这是自己实现 比较器
        Comparator<Emp> comparator = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                /*按员工编号正序排序*/
                return o1.getEmpno() - o2.getEmpno();
                /*按员工编号逆序排序*/
                //return o2.getEmpno()-o1.getEmpno();
                /*按员工姓名正序排序*/
                //return o1.getEname().compareTo(o2.getEname());
                /*按员工姓名逆序排序*/
                //return o2.getEname().compareTo(o1.getEname());
            }
        };

        Collections.sort(empList, comparator.reversed());

        // 方法二：继承Comparable接口并重写compareTo方法
        Collections.sort(empList);

        System.out.println("empList = " + empList);


    }

}
