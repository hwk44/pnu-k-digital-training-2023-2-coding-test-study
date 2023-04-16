package 백준.Week03_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1072_게임 {
    public static void main(String[] args) throws IOException {

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());



//        int x=0;
//        int y=0;
//        long x = Long.parseLong(st.nextToken());
        long x = 1000000000;
//        long y = Long.parseLong(st.nextToken());
        long y = 1;


        long z = y * 100 / x;
        long rate = y * 100 / x;
//        System.out.println(x + " " + y + " " + z);

        int cnt = 0;
        if (x == y) cnt = -1;
        if (x!=y ) {
            while (z == rate) {
                x++;
                y++;
                cnt++;
                rate = y * 100 / x;
            }
        }
//        System.out.println(x + " " + y + " " + rate);

        System.out.println(cnt);


        //실험할 코드 추가
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : " + secDiffTime);
    }




}
