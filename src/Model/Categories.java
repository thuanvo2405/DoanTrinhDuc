package Model;

public class Categories {
	private int category_id;
	private String name;
	private boolean type;
	private int user_id;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Categories(int category_id, String name, boolean type, int user_id) {
		super();
		this.category_id = category_id;
		this.name = name;
		this.type = type;
		this.user_id = user_id;
	}
}
