package hackerrank;

import java.io.IOException;
import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write hackerrank.MyBook class here
class MyBook extends Book {
    @Override
    void setTitle(String s){
        //?
        this.title = s;
    }
}

class Main{

    public static void main(String []args){
        //hackerrank.Book new_novel=new hackerrank.Book(); This line prHMain.java:25: error: hackerrank.
        // Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}
