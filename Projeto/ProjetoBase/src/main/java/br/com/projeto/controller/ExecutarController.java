package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.model.Book;

@RestController
public class ExecutarController {
	
	@GetMapping("/primeiro")
	public List<String> primeiro(){
		//array of strings
			String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
			//initialize an immutable list from array using asl=List method
			List<String> mylist = Arrays.asList(strArray);
			//print the list
			return mylist;
	}
	@GetMapping("/segundo")
	public List<String> segundo(){
		
			List<String> list = new ArrayList<String>();
			//adding elements in the list
			list.add("Mango");
			list.add("Apple");
			list.add("Banana");
			list.add("Grapes");
			return list;
	}
	@GetMapping("/terceiro")
	public List<Book> terceiro(){
		//creating list of Books
		List<Book> list = new ArrayList<Book>();
		//creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking","Forouzan", "MC Graw Hill",4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		//adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		return list;
	}
	
}
