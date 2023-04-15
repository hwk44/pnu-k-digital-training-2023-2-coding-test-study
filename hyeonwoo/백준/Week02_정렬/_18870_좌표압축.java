package 백준.Week02_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
//        for (int i = 0; i < nums_copy.size(); i++) {
//            System.out.println(nums_copy.get(i));
//        }


        // 이진탐색
        // 입력된 배열 nums 을 순회 <= target
        // 정렬된 배열 nums_copy 속에서 target 찾으면 인덱스 반환
        for (int i = 0; i < nums.size(); i++) {
            int start = 0;
            int end = nums_copy.size() - 1;
            int middle = (start + end) / 2;
            while (start <= end) {
                // nums.get(i) 가 target, nums_copy 는 정렬된 배열
                if (nums.get(i).equals(nums_copy.get(middle))) {
                    // Integer VS Integer 는 equals 써야함
                    if (i == nums.size() - 1) System.out.print(middle); // 맨 마지막에는 공백 제거
                    else System.out.print(middle + " "); // 찾으면 인덱스 출력
                    break;
                } else if (nums.get(i) < nums_copy.get(middle)) {
                    end = middle - 1;
                    middle = (start + end) / 2;
                } else {
                    start = middle + 1;
                    middle = (start + end) / 2;
                }
            }
        }

    }

}
