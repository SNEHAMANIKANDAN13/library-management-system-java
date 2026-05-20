// Library Management System
// Console-Based Java CRUD Project
import java.util.*;
class Book{
    int bookid;
    String bookname;
    String author;
    int bookprice;
    
    Book(int bookid,String bookname,String author,int bookprice){
        this.bookid=bookid;
        this.bookname=bookname;
        this.author=author;
        this.bookprice=bookprice;
}

    void display(){
      System.out.println("BOOK ID:"+bookid);
       System.out.println("BOOK NAME:"+bookname);
        System.out.println("AUTHOR:"+author);
         System.out.println("BOOK PRICE"+bookprice);
          System.out.println("----------------------");
    }
}
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Book>library=new ArrayList<>();
	    Scanner sc=new Scanner(System.in);
	    while(true){
	        System.out.println("---LIBRARY MANAGEMENT SYSTEM---");
	        System.out.println("1.ADD BOOK");
	        System.out.println("2.VIEW BOOK");
	        System.out.println("3.SEARCH BOOK");
	        System.out.println("4.UPDATE BOOK");
	        System.out.println("5.DELETE BOOK");
	        System.out.println("6.EXIT");
	        
	    
	
	    System.out.println("enter the choice:");
	    int choice=sc.nextInt();
		//==============ADD BOOK=================//
		if(choice==1){
		 System.out.println("enter the bookid");
		 int bookid=sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("enter the bookname");
		 String bookname=sc.nextLine();
		 System.out.println("entr the author name");
		String author=sc.nextLine();
		 System.out.println("enter the bookprice");
		 int bookprice=sc.nextInt();
		 
		 library.add(new Book(bookid,bookname,author,bookprice));
		 
		 System.out.println("BOOK IS ADDED SUCCESSFULLY!");
		 
	}
	//==============VIEW BOOK=================//
	else if(choice==2){
	  if(library.isEmpty()){
	      System.out.println("NO BOOK FOUND!!");
	  }
	  else{
	      for(Book b:library){
	          b.display();
	      }
	  }
	}
	//==============search Book=================//
	else if(choice==3){
	    System.out.println("enter searchid");
	    int searchid=sc.nextInt();
	    boolean found=false;
	    for(Book b:library){
	    if(b.bookid==searchid){
	        b.display();
	        found=true;
	        break;
	    }
	}
	if(!found){
	    System.out.println("BOOK NOT FOUND!!");
	}
	}
	//==============UPDATE BOOK=================//
	else if(choice==4){
	    System.out.println("enter updateid");
	    int updateid=sc.nextInt();
	    boolean found=false;
	    for(Book b:library){
	    if(b.bookid==updateid){
	        System.out.println("enter updatename");
	        sc.nextLine();
	        String updatename=sc.nextLine();
	        System.out.println("enter update price");
	        int updateprice=sc.nextInt();
	        b.bookname=updatename;
	        b.bookprice=updateprice;
	        found=true;
	        break;
	    }
	}
	if(!found){
	    System.out.println("BOOK NOT FOUND!!");
	}
	}
	else if(choice==5){
	    System.out.println("enter deleteid");
	    Boolean found=false;
	    int deleteid=sc.nextInt();
	    for(int i=0;i<library.size();i++){
	    if(library.get(i).bookid==deleteid){
	        library.remove(i);
	        found=true;
	        break;
	}
	    }
	
	if(!found){
	    System.out.println("BOOK NOT FOUND!!");
	}
}
  else if(choice==6){
      System.out.println("exit");
      break;
  }
  else{
      System.out.println("invalid input");
  }

	}	
}
}

