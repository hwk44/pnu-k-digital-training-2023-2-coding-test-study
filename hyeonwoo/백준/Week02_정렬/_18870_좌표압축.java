package 백준.Week02_정렬;

import java.io.*;
import java.util.*;

public class _18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 그대로 리스트 nums 에 add (중복 허용)
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        // nums 에서 중복 제거한 새로운 리스트 nums_copy
        List<Integer> nums_copy = new ArrayList<>(new HashSet<>(nums));
        // List.copyOf 한 List 는 Collections.sort 안됨
        // unsupportedoperationexception

        // nums_copy 오름차순 정렬
        Collections.sort(nums_copy);

        // 정렬 확인
            // 원본
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.print(nums.get(i) + " ");
//        }
//        System.out.println();

            // 중복 제거 후 정렬
//        for (int i = 0; i < nums_copy.size(); i++) {
//            System.out.println(nums_copy.get(i)+ " ");
//        }

        // 맵에 put (k, v) = (입력받은 숫자 : 인덱스)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums_copy.size(); i++) {
            map.put(nums_copy.get(i) , i);  // map.put ( 숫자 , index )
        }

        // map 값 확인
//        for (Map.Entry en: map.entrySet() ) {
//            System.out.println(en.getKey() + " : " + en.getValue());
//        }

        // 출력시 StringBuilder 사용
//        StringBuilder sb = new StringBuilder();
//        for (int i: nums) {
//            sb.append(map.get(i)).append(" ");
//        }
//        System.out.println(sb);

        // 출력시 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < nums.size(); i++) {
            bw.write(map.get(nums.get(i)) + " ");
        }
        bw.close();






//        for (int i = 0; i < nums.size(); i++) {
//            if (i == nums.size()-1) System.out.print(Collections.binarySearch(nums_copy, nums.get(i)));
//            else System.out.print(Collections.binarySearch(nums_copy, nums.get(i)) + " ");
//        }

        // 이진탐색
        // 입력된 배열 nums 을 순회 <= target
        // 정렬된 배열 nums_copy 속에서 target 찾으면 인덱스 반환
//        for (int i = 0; i < nums.size(); i++) {
//            int start = 0;
//            int end = nums_copy.size() - 1;
//
//            while (start <= end) {
//                int middle = (start + end) / 2;
//                // nums.get(i) 가 target, nums_copy 는 정렬된 배열
//                if (nums.get(i).equals(nums_copy.get(middle))) {
//                    // Integer VS Integer 는 equals 써야함
//                    if (i == nums.size() - 1) System.out.print(middle); // 맨 마지막에는 공백 제거
//                    else System.out.print(middle + " "); // 찾으면 인덱스 출력
//                    break;
//                } else if (nums.get(i) < nums_copy.get(middle)) end = middle - 1;
//                  else                                          start = middle + 1;
//
//            }
//        }

    }

}
