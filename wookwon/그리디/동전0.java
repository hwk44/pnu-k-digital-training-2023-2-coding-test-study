package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동전0 {
    public static void main(String[] args) throws IOException {

        /*
        준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
        동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
        이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]); // 공백 기준으로 잘라서 배열의 첫 번째 요소는 n에 저장
        int k = Integer.parseInt(str.split(" ")[1]); // 공백 기준으로 잘라서 배열의 두 번째 요소는 k에 저장
        int [] coins = new int[n];
        int cnt = 0;

        for(int i=0; i<n; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        for (int i = coins.length-1; i>=0; i-- ){
            cnt += k / coins[i];
            k %= coins[i];
        }
        System.out.println(cnt);

    }
}
