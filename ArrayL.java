import java.util.*;
public class ArrayL {
	ArrayList<String> list =new ArrayList<String>();
	Scanner in=new Scanner(System.in);
	public void array_display(){
		list.add("CSE");
		list.add("ECE");
		list.add("MECH");
		System.out.println("Array list elements are ");
		System.out.println(list);
		System.out.println("");
	}
	public void append_at_end(){
		System.out.println("Enter the element to append at end : ");
		String ele=in.next();
		list.add(ele);
		System.out.println(list);
		System.out.println("");
	}
	public void insert_at_pos(){
		System.out.println("Enter the position and element to be inserted : ");
		int posindex=in.nextInt();
		String ele=in.next();
		list.add(posindex,ele);
		System.out.println(list);
		System.out.println("");
	}
	public void search_Element(){
		System.out.println("ENter the array elemenet to be searched : ");
		String ele=in.next();
		int index=list.indexOf(ele);
		if(index==-1)
			System.out.println("Element not found.");
		else
			System.out.println("Element found at index : "+index);
	}
	public void print(){
		System.out.println("Enter the strting character to print strings ");
		
		char input_char=in.next().charAt(0);
		String strc=Character.toString(input_char);
		System.out.println("String starting with character "+strc);
		for(int i=0;i<list.size();i++){
			if(list.get(i).startsWith(strc)){
				System.out.println(list.get(i));
			}
		}
	}
	public static void main(String args[]){
		ArrayL obj=new ArrayL();
		obj.array_display();
		obj.append_at_end();
		obj.insert_at_pos();
		obj.search_Element();
		obj.print();
	}
}	

