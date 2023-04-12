package 백준.Week02_정렬;

import java.util.*;

public class _10814_나이순정렬 {

    static class Person{
        int age;
        String name;
        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return this.age +" " + this.name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

//        int[] ages = new int[n] ;
//        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String name = sc.next();
                list.add(new Person(a,name));
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int flag = 0;
                if(o1.getAge() < o2.getAge()) {
                    flag = -1;
                }
                else if (o1.getAge() > o2.getAge()) {
                    flag = 1;
                    return flag;
                }
                return flag;
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
//            for (Object en : list.get(i).entrySet()) {
//            for (Object en : list.get(i).entrySet()) {
//                System.out.println();
            }
        }

    }

