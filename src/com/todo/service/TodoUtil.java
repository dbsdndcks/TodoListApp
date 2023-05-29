package com.todo.service;

import java.util.Scanner;

import com.todo.dao.TodoItem;
import com.todo.dao.TodoList;

public class TodoUtil {
	
	//����
	public static void createItem(TodoList list) {
		
		String title, desc;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[�׸� �߰�]\n" 	
						+ "���� > ");
		
		title = sc.next();
		if(list.isDuplicate(title)) {
			System.out.println("������ �ߺ��˴ϴ�.!");
			return;
		}
		sc.nextLine();
		System.out.print("���� > ");
		desc = sc.nextLine().trim();
		
		TodoItem t = new TodoItem(title, desc);
		list.addItem(t);
		System.out.println("�߰��Ǿ����ϴ�.");
		
	}
	
	//����
	public static void deleteItem(TodoList l) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[�׸� ����]\n" 
						+ "������ �׸��� ������ �Է��Ͻÿ� > ");
		
		String title = sc.next();
		
		for(TodoItem item : l.getList()) {
			if(title.equals(item.getTitle())) {
				l.deleteItem(item);
				System.out.println("�����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
}
