package Model;

import java.sql.Date;

public class Transactions {
	private int transaction_id;
	private float amount;
	private Date date;
	private String Description;
	private int category_id;
	private int user_id;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Transactions(int transaction_id, float amount, Date date, String description, int category_id, int user_id) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.date = date;
		this.Description = description;
		this.category_id = category_id;
		this.user_id = user_id;
	}
	
}
