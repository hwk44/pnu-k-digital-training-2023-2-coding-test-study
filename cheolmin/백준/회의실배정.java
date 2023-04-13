package edu.charpter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 회의실배정 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Map<Integer, Integer>> list = new ArrayList<>();
		int count = 0;
		
		
		for(int i = 0;i < N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Map<Integer, Integer> map = new HashMap<>();
			int a1 =Integer.parseInt(st.nextToken());
			int a2 =Integer.parseInt(st.nextToken());
			map.put(a1,a2);
			list.add(map);
		}
				//끝의 값을 작은순으로 나열해 제일 작은것을 선택
		// 다음시작값을 선택한시간 포함해서 큰순서로 끝의 값을 나열
				//반복
		Iterator<Map<Integer, Integer>> iterator = list.iterator();
		while(iterator.hasNext()) {
			Map<Integer, Integer> map= iterator.next();
			
			System.out.println(map);
			
		}
		System.out.println(list.get(1).values());
		
		
		
	}
}
