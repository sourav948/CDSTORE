package net.cd.owen.model;

public class Category {
	
	private long categoryId;
	private String categoryName;
	private String categoryDescription;

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return categoryDescription;
	}

	public void setDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}
