package BaekJoon.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortByAge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        Person[] persons = new Person[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Person p = new Person(age, name);
            persons[i] = p;
        }

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        for (int i = 0; i < persons.length; i++) {
            sb.append(persons[i]+"\n");
        }

        System.out.println(sb);
    }

    static class Person {
        private int age;
        private String name;
        public Person() {

        }
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public String toString() {
            return age + " " + name;
        }
    }
}
