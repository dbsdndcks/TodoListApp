package com.todo.service;

import java.util.Scanner;

import com.todo.dao.TodoItem;
import com.todo.dao.TodoList;

public class TodoUtil {
	
	//생성
	public static void createItem(TodoList list) {
		
		String title, desc;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[항목 추가]\n" 	
						+ "제목 > ");
		
		title = sc.next();
		if(list.isDuplicate(title)) {
			System.out.println("제목이 중복됩니다.!");
			return;
		}
		sc.nextLine();
		System.out.print("내용 > ");
		desc = sc.nextLine().trim();
		
		TodoItem t = new TodoItem(title, desc);
		list.addItem(t);
		System.out.println("추가되었습니다.");
		
	}
	
	//삭제
	public static void deleteItem(TodoList l) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[항목 삭제]\n" 
						+ "삭제할 항목의 제목을 입력하시오 > ");
		
		String title = sc.next();
		
		for(TodoItem item : l.getList()) {
			if(title.equals(item.getTitle())) {
				l.deleteItem(item);
				System.out.println("삭제되었습니다.");
				break;
			}
		}
	}
	
}
