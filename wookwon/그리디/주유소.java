package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소 {
    public static void main(String[] args) throws IOException {
        // 입력을 받을 객체
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 번째로는 정수 하나만 입력받음
        int n = Integer.parseInt(br.readLine());
        long [] roads = new long[n-1];
        long [] price = new long[n];

        // 두 번째 입력값은 띄어쓰기 있으므로 아래의 객체 사용
        StringTokenizer st = new StringTokenizer((br.readLine()));
        // 입력받은 값들을 배열에 저장
        for (int i = 0; i < n - 1; i++) {
            roads[i] = Integer.parseInt(st.nextToken());
        }
        // 세 번째 입력값도 마찬가지
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        /*입력값1 - 도시 n
          입력값2 - 도시 간 거리
          입력값3 - 리터당 가격
        */
        long min = price[0];
        long sum = 0;

        //마지막 주유소는 제외하므로 n-1
        for(int i=0; i< n-1; i++){
            min = Math.min(min, price[i]);
            sum += (roads[i] * min);
        }
        System.out.println(sum);

    }

}
