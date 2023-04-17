package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        int[] arr = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            arr[i] = words[i].length();
        }
        Arrays.sort(arr);

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (arr[i] == words[j].length()) {
                    answer.add(words[j]);
                    words[j] = words[j].replace(words[j], "");
                    break;
                }
            }
        }
        for(int i =0; i< answer.size(); i++){
            for (int j = i+1; j < answer.size(); j++) {
                if(answer.get(i).equals(answer.get(j))){
                    answer.remove(j);
                }
            }
        }
        String[]str = answer.toArray(new String[0]);
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == (o2.length())) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]).append("\n");
        }
        System.out.println(sb);
    }
}
