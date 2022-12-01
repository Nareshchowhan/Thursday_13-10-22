package bookDetails;

import java.util.LinkedList;
import java.util.List;


public class BookStore {

	public static void main(String[] args) {
		
		List<BookDetails> bd = new LinkedList<BookDetails>();

	   bd.add(new BookDetails("General English","sp Bakshi",251,"English",2021));
	   bd.add(new BookDetails("Telangana History","Telugu akademi",451,"History",2020));
	   bd.add(new BookDetails("2 States","Chaitan bhagath",151,"Love Story",2016));
	   bd.add(new BookDetails("Room NO 105","Chaitan",351,"crime Story",2021));
	   bd.add(new BookDetails("Inner Engineering","Sadhguru",551,"Devotional",2021));
	   
	  
	 
	   // display all the books
	   for(BookDetails b1:bd) {
		   
		   System.out.println(b1.book+" "+b1.Author+" "+b1.price);
	   }
	   
	   System.out.println("................................................");
	   //display through title only
	   
	  	  
	   
	   for(BookDetails b2:bd) {
		   
		   System.out.println(" The Title of the book is"+" "+ b2.title);
		   
		   
		   
		 
		  
	   }
	   System.out.println("................................................");
	   // display the Author 
	   
	   for(BookDetails b3:bd) {
		   System.out.println("The Name of the Author is"+" "+b3.Author);
	   }
	}

}
