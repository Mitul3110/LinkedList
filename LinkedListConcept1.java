package PracticeCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept1 {

	public static void main(String[] args) {

		
     LinkedList ll= new LinkedList();
     ll.add("Prisha");
     ll.add("Shriya");
     ll.add("Hina");
     ll.add("Mitul");
     ll.add("Pehal");
     ll.add("Rameshdada");
     ll.add("Sakubaa");
     
     System.out.println("Print the contents of Linkedlist"+ ll);
     
     ll.addFirst("Yashu");
     ll.addLast("Purvi");
     
     System.out.println("Print the contents of Linkedlist"+ ll);
     
     System.out.println(ll.get(3));
     System.out.println(ll.get(5));
     
     
     ll.set(0,"Vishal");
     System.out.println(ll.get(0));
     
     ll.removeFirst();
     ll.removeLast();
     
     for(int n=0;n<ll.size();n++) {
    	 System.out.println(ll.get(n));
     }
     
     Iterator<String> it=ll.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
     
     
     int num=0;
     while(ll.size()>num) {
    	 System.out.println(ll.get(num));
    	 num++;
    	 
     }
     
     
     
     
     

	}

}
