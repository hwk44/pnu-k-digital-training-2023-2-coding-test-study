package 백준.Week01_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _13305_주유소 {


    /*어떤 나라에 N개의 도시가 있다.
     이 도시들은 일직선 도로 위에 있다.
      편의상 일직선을 수평 방향으로 두자.
       제일 왼쪽의 도시에서 제일 오른쪽의 도시로
       자동차를 이용하여 이동하려고 한다. 인접한 두
        도시 사이의 도로들은 서로 길이가 다를 수 있다.
        도로 길이의 단위는 km를 사용한다.

    처음 출발할 때 자동차에는 기름이 없어서 주유소에서
    기름을 넣고 출발하여야 한다. 기름통의 크기는 무제한이어서 얼마든지 많은
     기름을 넣을 수 있다. 도로를 이용하여 이동할 때 1km마다 1리터의 기름을 사용한다
     . 각 도시에는 단 하나의 주유소가 있으며, 도시 마다 주유소의 리터당 가격은
      다를 수 있다. 가격의 단위는 원을 사용한다.

    예를 들어, 이 나라에 다음 그림처럼 4개의 도시가 있다고 하자.
     원 안에 있는 숫자는 그 도시에 있는 주유소의 리터당 가격이다.
      도로 위에 있는 숫자는 도로의 길이를 표시한 것이다.
*/

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dis = new long[(n-1)];
        for (long i = 0; i < dis.length; i++) {
            dis[(int) i] = sc.nextInt();
        }

        long[] oil_values = new long[n];
        for (int i = 0; i < oil_values.length; i++) {
            oil_values[i] = sc.nextInt();
        }

        long min = 1000000000;
        int inx = 0;
        for (int i = 1; i < oil_values.length -1; i++) {
            if(oil_values[i] < min) {
                min =  oil_values[i];
                inx = i;
            }
        }

        for (int i =  inx; i <oil_values.length -1 ; i++) {
            oil_values[i] = min;
        }

        long sum0 = 0;
        for (int i = 0; i < inx; i++) {
            sum0 += dis[i]*oil_values[i];
        }
        long sum1 = 0;
        for (int i = inx; i < dis.length; i++) {
            sum1 += dis[i];
        }
//        System.out.println(sum1 + "sum1");
        System.out.println("sum1 = " +sum1);
        System.out.println("sum0 = " +sum0);
        System.out.println("min = " +min);
        sum1 *= min;
        System.out.println(sum1 + sum0);

        



    }
}
