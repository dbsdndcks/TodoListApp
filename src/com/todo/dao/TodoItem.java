package com.todo.dao;


// 할일들의 제목,내용,날짜를 묶어서 관리하는 데이터
import java.util.Date;

public class TodoItem {
	private String title;
	private String desc;
	private Date current_date;
	
	public TodoItem(String title, String desc) {
		super();
		this.title = title;
		this.desc = desc;
		this.current_date = new Date();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCurrent_date() {
		return current_date;
	}

	public void setCurrent_date(Date current_date) {
		this.current_date = current_date;
	}

	@Override
	public String toString() {
		return "TodoItem [title=" + title + ", desc=" + desc + ", current_date=" + current_date + "]";
	}
	
	
	
	
	
}
