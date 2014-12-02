package net.cd.owen.util;


public class Page {
	private int pageSize = 12;
	private int totalNum = 0;
	private int index = 0;
	private int currentPage = 0;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}


	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getCurrentIndex() {
		return (Integer.valueOf(currentPage) - 1) * pageSize;
	}
}

