
import java.util.*;
class book 
{
     String bname,bauthor;
    double bcount;
    Scanner sc=new Scanner(System.in);
    book(String bname, String bauthor, double bcount)
    {
        this.bauthor=bauthor;
        this.bcount=bcount;
        this.bname=bname;
    }
    public void display()
    {
        System.out.println("BOOK NAME: " +bname);
        System.out.println("BOOK AUTHOR: "+bauthor);
        System.out.println("BOOK COUNT: "+bcount);
    }
    void buy(double x)
    {
        if(x>bcount)
        {
            System.out.println("______Insuffient books________");
        }
        else
        {
            bcount = bcount-x;
            System.out.println("_______Purchased succesfully_______:");
            System.out.println(bname+" Remaining books are: "+bcount);
        }
    }
}
class customer
{
    String cid,cname,caddress;
    Scanner sc=new Scanner(System.in);
    customer(String cname,String cid,String caddress)
    {
        this.caddress=caddress;
        this.cid=cid;
        this.cname=cname;
    }
    public void display()
    {
        System.out.println("CUSTOMER NAME: "+cname);
        System.out.println("CUSTOMER ID :"+cid);
        System.out.println("CUSTOMER ADDRESS :" +caddress);
    }
    
}
class E_book_stall
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of type of books: ");
        int n=sc.nextInt();
        book b[]=new book[n];
        for(int i=0;i< n;i++){
            System.out.println("Enter the book name:");
            String bname=sc.next();
            System.out.println("Enter the book author:");
            String bauthor=sc.next();
            System.out.println("Enter the book count:");
            double bcount=sc.nextInt();    
            b[i]=new book(bname,bauthor,bcount);
        }
        System.out.println("Enter the No of cutomers: ");
        int m=sc.nextInt();
        customer arr[] = new customer[m];
        for(int i=0;i< m;i++){
            System.out.println("Enter the customer name:");
            String cname=sc.next();
            System.out.println("Enter the customer id:");
            String cid=sc.next();
            System.out.println("Enter the customer address:");
            String caddress=sc.next();
            arr[i]=new customer(cname,cid,caddress);
        }
        sc.nextLine();
        System.out.println("Enter the customer name to purchase:");
        String ccname=sc.next();
        sc.nextLine();
      
        System.out.println("Enter the bookname to purchase:");
        String rname=sc.next();
        sc.nextLine();
        System.out.println("Enter the no of books to purchase:");
        double x=sc.nextDouble();
        sc.nextLine();
        boolean flag1=false;
        boolean flag2=false;
        System.out.println("-------------BOOKS DETAILS:------------");
        for(int i=0;i<n;i++)
        {
            b[i].display();
        }
        System.out.println("-------------CUSTOMER DETAILS:------------");
        for(int i=0;i<m;i++)
        {
            arr[i].display();
        }
        for(int i=0;i<m;i++)
        {
            if(arr[i].cname.equals(ccname))
            {
                flag1=true;
                for(int j=0;j<n;j++)
                {
                    if(b[j].bname.equals(rname))
                    {
                        flag2=true;
                        b[j].buy(x);
                        b[j].display();
                    }
                }
            }
        }
        if(flag1==false)
        {
            System.out.println("Customer Details Not found:");
        }
        if(flag2==false)
        {
            System.out.println("Book name not found:");
        }   
    }   
}