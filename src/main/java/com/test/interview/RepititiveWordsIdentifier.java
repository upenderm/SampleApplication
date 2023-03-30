package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class RepititiveWordsIdentifier {

	public static void main(String[] args) {
		
		String s="java test java test code done done done ";

		List<String> list = Arrays.asList(s.split(" "));
		List<String> list2 = new ArrayList<>();
		System.out.println(list);
		Map<String, Integer> map = new HashMap<>();
		
		Set<String> collect = list.stream().filter(a -> {
//			System.out.println(">>-------->"+a+"::"+ Collections.frequency(list, a));
			int i=0;
			if(list2.contains(a)) {
//				System.out.println(a);
				i++;
				map.replace(a, i);
				return true;
			} else {
				list2.add(a);
				map.put(a, 1);
			}
			return false;
		}).collect(Collectors.toSet());

		String str2="java test code done";
		System.out.println(str2);
		System.out.println(StringUtils.reverse(str2));
		
		StringTokenizer strt = new StringTokenizer(str2, " ");
		while(strt.hasMoreElements()) {
			System.out.print(StringUtils.reverse(strt.nextToken()));
			System.out.print(" ");
			
		}
		
		
	}
	
}
