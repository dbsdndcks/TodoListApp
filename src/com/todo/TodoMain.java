package com.todo;

import java.util.Scanner;

import com.todo.dao.TodoList;
import com.todo.menu.Menu;
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
				TodoUtil.createItem(l);
				break;
				
			case "del":
				TodoUtil.deleteItem(l);
				break;
				
			case "edit":
				TodoUtil.updateItem(l);
				break;
				
			case "ls":           //�ҹ���L
				TodoUtil.listAll(l);
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
				Menu.displaymenu();
				break;
				
			case "exit":
				quit = true;
				break;
				
			default:
				System.out.println("��Ȯ�� ��ɾ �Է��ϼ���");
				break;
			}
			
			if(isList)TodoUtil.listAll(l);
		}while (!quit);
	}
}
