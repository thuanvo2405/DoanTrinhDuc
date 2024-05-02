package Model;

import java.sql.Date;

public class Budgets {
	private int budge_id;
	private int category_id;
	private double amount;
	private Date start_date;
	private Date end_date;
	private int user_id;
	public int getBudge_id() {
		return budge_id;
	}
	public void setBudge_id(int budge_id) {
		this.budge_id = budge_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Budgets(int budge_id, int category_id, double amount, Date start_date, Date end_date, int user_id) {
		super();
		this.budge_id = budge_id;
		this.category_id = category_id;
		this.amount = amount;
		this.start_date = start_date;
		this.end_date = end_date;
		this.user_id = user_id;
	}
	
}
