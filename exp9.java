import java.util.*;
public class exp9{
    ArrayList<String>list =new ArrayList<String>();
    Scanner in=new Scanner(System.in);
    public void arrdisplay(){
        list.add("CSE");
        list.add("EEE");
        list.add("ECE");
        System.out.println("Array List elements are : ");
        System.out.println("");
    }
    public void append_at_end(){
        System.out.println("enter the element to append at end : ");
        String n=in.next();
        list.add(n);
        System.out.println(list);
        System.out.println("");
    }
    public void insert_at_pos(){
        System.out.println("Enter the position and element to be inserted : ");
        int index=in.nextInt();
        String ele=in.next();
        list.add(index,ele);
        System.out.println(list);
        System.out.println("");
    }
    public void search(){
        System.out.println("Enter the element to be searched : ");
        String ele=in.next();
        int index=list.indexOf(ele);
        if(index==-1){
            System.out.println("Element not found");
        }
        else 
            System.out.println("Element found at index : "+index);
    }

    public void print(){
        System.out.println("Enter the starting character to print strings : ");
        char ch=in.next().charAt(0);
        String strc=Character.toString(ch);
        System.out.println("String starting with character "+strc);
        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith(strc)){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String[] args){
        exp9 obj=new exp9();
        obj.arrdisplay();
        obj.append_at_end();
        obj.insert_at_pos();
        obj.search();
        obj.print();
        
    }
}
