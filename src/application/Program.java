package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		List<Post> post = new ArrayList<>();
		
		for (int i=0; i<2; i++) {
			Date moment;
			String title;
			String content;
			Integer likes;
			if (i == 0) {
				moment = sdf.parse("21/06/2018 13:05:14");
				title = "Travelling to new Zealand";
				content = "I'm going to visit this wonderful country!";
				likes = 15;
			} else {
				moment = sdf.parse("28/07/2018 23:14:19");
				title = "Good night guys";
				content = "See you tomorrow";
				likes = 5;
			}
			
			Post newPost = new Post(moment, title, content, likes);
			
			post.add(newPost);
			
			Comment comment, comment2;
			if (i == 0) {
				comment = new Comment("Have a nice trip");
				comment2 = new Comment("Wow that's awesome!");
			} else {
				comment = new Comment("Good night");
				comment2 = new Comment("May the force be with you");
			}
			
			newPost.addComment(comment);
			newPost.addComment(comment2);
			

		}
		
		
		for(Post p : post) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
