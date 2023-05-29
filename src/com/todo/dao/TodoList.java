package com.todo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ���ϵ��� ������ ����Ʈ�� ���� �����ϴ� ��
public class TodoList {
	// List<Todoitem> list�� Todoitem ��ü���� ������ �� �ִ� ����Ʈ ������ ������ ���Դϴ�. �� ������ ����Ͽ� '
	//Todoitem ��ü���� ����Ʈ�� �߰��ϰų� �˻�, ���� ���� �۾��� ������ �� �ֽ��ϴ�.

	private List<TodoItem> list;
	
	public TodoList() {
		this.list = new ArrayList<TodoItem>();
	}
	
	public void addItem(TodoItem t) {
		list.add(t);
	}
	
	public void deleteItem(TodoItem t) {
		list.remove(t);
	}
	
	public void editItem(TodoItem t, TodoItem updated) {
		int index = list.indexOf(t);
		list.remove(index);
		list.add(updated);
	}
	
	public ArrayList<TodoItem> getList(){
		return new ArrayList<TodoItem>(list);
	}
	
	public void sortByName() {
		Collections.sort(list, new TodoSortByName());
	}
	
	public void reverseList() {
		Collections.reverse(list);
	}
	
	public void sortByDate() {
		Collections.sort(list,new TodoSortByDate());
	}
	
	public int indexOf(TodoItem t) {
		return list.indexOf(t);
	}
	
	//���� �ߺ� ����
	public Boolean isDuplicate(String title) {
		for(TodoItem item : list) {
			if(title.equals(item.getTitle())) return true;
		}
		return false;
	}
}
