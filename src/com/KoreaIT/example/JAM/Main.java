package com.KoreaIT.example.JAM;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);
		
		List<Article> articles = new ArrayList<>();
		int lastArticleId = 0;
		
		while (true) {
			System.out.print("명령어 > ");
			String command = sc.nextLine().trim();
			
			if(command.equals("article write")) {
				System.out.printf("제목  :  ");
			    int id = lastArticleId + 1;
			    String title = sc.nextLine();
			    System.out.printf("내용  :  ");
			    String body = sc.nextLine();
			    
			    Article article = new Article(id,title,body);
			    articles.add(article);
			    
				System.out.printf("%d번글이 생성 되었습니다\n",id);
			    lastArticleId ++;
			    
			    
			} else if(command.equals("article list")) {
				 System.out.println("-게시글 목록-");
				 if(articles.size() == 0) {
					 System.out.println("게시글이 없습니다");
					 continue;
				 }
				 System.out.println("번호  /  제목");
				 for(Article article : articles) {
					 System.out.printf("%d   /   %s\n",article.id,article.body);
				 }
			 }   

			if(command.equals("exit")) {
				break;
			}
		}

		System.out.println("==프로그램 종료==");
		sc.close();
	}
}

