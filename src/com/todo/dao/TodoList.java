package com.todo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 할일들의 정보를 리스트로 만들어서 관리하는 곳
public class TodoList {
	// List<Todoitem> list는 Todoitem 객체들을 저장할 수 있는 리스트 변수를 선언한 것입니다. 이 변수를 사용하여 '
	//Todoitem 객체들을 리스트에 추가하거나 검색, 삭제 등의 작업을 수행할 수 있습니다.

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
	
	//제목 중복 방지
	public Boolean isDuplicate(String title) {
		for(TodoItem item : list) {
			if(title.equals(item.getTitle())) return true;
		}
		return false;
	}
}
