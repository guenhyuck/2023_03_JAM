
package com.KoreaIT.example.JAM;

public class Article extends Object {
	public int id;
	public String regDate;
	public String updateDate;
	public String title;
	public String body;
	
	public Article(int id, String regDate) { //update
		this.id = id;
		this.updateDate = updateDate;
	}

	public Article(int id, String title, String body) {  //select
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public Article(int id, String regDate, String updateDate, String title, String body) {  //insert
		this.id = id;
		this.regDate = regDate;
		this.updateDate = updateDate;
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
