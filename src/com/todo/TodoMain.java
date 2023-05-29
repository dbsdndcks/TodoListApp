package com.todo;

import java.util.Scanner;

import com.todo.dao.TodoList;
import com.todo.service.TodoUtil;

public class TodoMain {
	
	public static void start() {
		Scanner sc = new Scanner(System.in);
		TodoList l = new TodoList();
		boolean isList = false;
		boolean quit = false;
		
		Menu.displaymenu();
		do {
			Menu.prompt();
			String choice = sc.nextLine();
			switch (choice) {
			
			case "add":
				break;
				
			case "del":
				break;
				
			case "edit":
				break;
				
			case "ls":           //�ҹ���L
				break;
				
			case "ls_name_asc":
				l.sortByName();
				System.out.println("��������� �����Ͽ����ϴ�.");
				isList = true;
				break;
				
			case "ls_name_desc":
				System.out.println("���񿪼����� �����Ͽ����ϴ�.");
				l.sortByName();
				l.reverseList();
				isList = true;
				break;
				
			case "ls_date":			
				l.sortByDate();
				System.out.println("��¥������ �����Ͽ����ϴ�.");
				isList = true;
				break;
				
			case "help":
				break;
				
			case "exit":
				quit = true;
				break;
				
			default:
				System.out.println("��Ȯ�� ��ɾ �Է��ϼ���");
				break;
			}
			
			if(isList)TodoUtil.listAll(l)
		}while (!quit);
	}
}
