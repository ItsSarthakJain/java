
import java.util.Scanner;


class Author
{
private String name=new String();
private String email=new String();
private char gender;
Author(String name,String email,char gender)
{
this.name=name;
this.email=email;
this.gender=gender;
}
public String getName()
{
return name;
}

public String getEmail()
{
return email;
}

public void setEmail(String email)
{
this.email=email;
}

public char getGender()
{
return gender;
}

public String toString()
{
String s=new String("Author [name="+name+",email="+email+",gender="+gender+"]");
return s;
}

}


class Books
{
private String name=new String();
Author author;
private double price;
private int qty=0;
Books(String name,Author author,double price)
{
this.name=name;
this.author=author;
this.price=price;
}
Books(String name,Author author,double price,int qty)
{
this.name=name;
this.author=author;
this.price=price;
this.qty=qty;
}
public String getName()
{
return name;
}
public Author getAuthor()
{
return author;
}
public double getPrice()
{
return price;
}
public void setPrice(double price)
{
this.price=price;
}
public int getQty()
{
return qty;
}

public void setQty(int qty)
{
this.qty=qty;
}

public String toString()
{
String s=new String("Book name[="+name+",author="+author.toString()+",price="+price+",quantity="+qty+"]");
return s;
}

}

class Test2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name,aName,email;
name=sc.nextLine();
double price=sc.nextDouble();
int qty=sc.nextInt();
aName=sc.nextLine();
email=sc.nextLine();
sc.nextLine();
char gender=sc.next().charAt(0);
Author author=new Author(aName,email,gender);
Books book=new Books(name,author,price);
book.setQty(qty);
System.out.println(book.toString());

name=sc.nextLine();
price=sc.nextDouble();
qty=sc.nextInt();
aName=sc.nextLine();
email=sc.nextLine();
sc.nextLine();
gender=sc.next().charAt(0);
Author author2=new Author(aName,email,gender);
author2.setEmail(email);
Books b2=new Books(name,author2,price,qty);
System.out.println(b2.toString());

}
}
