//import the required classes
import java.util.*;

public class CollectionsExample{

	public static void main(String args[]){
		ArrayList<String> alist=new ArrayList<String>();//Creating arraylist    
      		alist.add("Akshay");//Adding object in arraylist    
      		alist.add("kumar");    
      		alist.add("Ananth");    
      		alist.add("Sirsikar");    
      		//Invoking arraylist object   
      		System.out.println(alist);
		//remove method
		alist.remove("Akshay");
		System.out.println(alist);
	
		//isEmpty method
		System.out.println("Is ArrayList Empty: "+alist.isEmpty());
    		
		//set method
		alist.set(1,"Gaurav");  
              	System.out.println("After update: "+alist.get(1));
		//Declare a linkedlist
		LinkedList<String> llist=new LinkedList<String>();  
  		llist.add("R");  
  		llist.add("V");  
  		llist.add("R");  
  		llist.add("A");  
  
  		Iterator<String> itr=llist.iterator();  
  		while(itr.hasNext()){  
   			System.out.println(itr.next());  
  		}
		//Remove elements from linkedlist
		llist.remove("V");  
              	System.out.println("After invoking remove(object) method: "+llist);

		llist.removeLast();  
              	System.out.println("After invoking removeLast() method: "+llist);

		llist.removeFirst();  
              	System.out.println("After invoking removeLast() method: "+llist);

		//Vector method implementation
		Vector<String> v=new Vector<String>();//creating vector  
  		v.add("umesh");//method of Collection  
  		v.addElement("irfan");//method of Vector  
  		v.addElement("kumar");  
  		//traversing elements using Enumeration  
  		Enumeration e=v.elements();  
  		while(e.hasMoreElements()){  
   		System.out.println(e.nextElement());  
  		}

		//Hashset implementation

		HashSet<String> hset=new HashSet<String>();  
           	hset.add("One");    
           	hset.add("Two");    
           	hset.add("Three");   
           	hset.add("Four");  
           	hset.add("Five");  
           	Iterator<String> i=hset.iterator();  
           	while(i.hasNext())  
           	{  
           		System.out.println(i.next());  
           	}

		//remove elements
		hset.remove("One");

		//linkedHashSet implementation

		LinkedHashSet<String> lhset=new LinkedHashSet<String>();  
               	lhset.add("One");    
               	lhset.add("Two");    
               	lhset.add("Three");   
               	lhset.add("Four");  
               	lhset.add("Five");  
               	Iterator<String> j=lhset.iterator();  
               	while(j.hasNext())  
               	{  
               		System.out.println(j.next());  
               	}
		
		//treeset implementation

		TreeSet<String> tset=new TreeSet<String>();  
  		tset.add("Ravi");  
  		tset.add("Vijay");  
  		tset.add("Ravi");  
  		tset.add("Ajay");  
  		//Traversing elements  
  		Iterator<String> itrr=tset.iterator();  
  		while(itrr.hasNext()){  
   			System.out.println(itrr.next());  
  		}
		//remove highest and lowest value
		System.out.println("Highest Value: "+tset.pollFirst());  
         	System.out.println("Lowest Value: "+tset.pollLast());
	
		//Priority queue
		//create queue
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		//add elements
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr1=queue.iterator();  
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}  

		//remove elements
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}

		//Array dequeue implementation
		Deque<String> deque = new ArrayDeque<String>();  
   		deque.add("Ravi");    
   		deque.add("Vijay");     
   		deque.add("Ajay");    
   		//Traversing elements  
   		for (String str : deque) {  
   			System.out.println(str);  
   		}

		//deque.poll();  
    		//deque.pollFirst();//it is same as poll()  
    		deque.pollLast();  
    		System.out.println("After pollLast() Traversal...");  
    		for(String s:deque){  
        		System.out.println(s);  
    		}

		//implementing hashmap

		HashMap<String, Integer> map = new HashMap<>();  
		//adding elements in hashmap
		map.put("Aman", 19);  
		map.put("Sunny", 29);  
		map.put("Ritesh", 39); 

		//Getting an element in hashmap
		map.get("Aman");

		//implementing linkedHashmap

		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  		hm.put(100,"Amit");  
  		hm.put(101,"Vijay");  
  		hm.put(102,"Rahul");  
  
		for(Map.Entry m:hm.entrySet()){  
   			System.out.println(m.getKey()+" "+m.getValue());  
  		}

		//Fetching key  
       		System.out.println("Keys: "+hm.keySet());  
       		//Fetching value  
       		System.out.println("Values: "+hm.values());  
       		//Fetching key-value pair  
       		System.out.println("Key-Value pairs: "+hm.entrySet());
		//Remove method
		System.out.println("Before invoking remove() method: "+map);     
    		map.remove(102);  
    		System.out.println("After invoking remove() method: "+map);

		//Tree map implementation
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();    
      		tmap.put(100,"Amit");    
      		tmap.put(102,"Ravi");    
      		tmap.put(101,"Vijay");    
      		tmap.put(103,"Rahul");    
        
      		for(Map.Entry m:tmap.entrySet()){    
       			System.out.println(m.getKey()+" "+m.getValue());    
      		} 

		//Remove method using map
		tmap.remove(102);      
      		System.out.println("After invoking remove() method");  
      		for(Map.Entry m:tmap.entrySet())  
      		{  
          		System.out.println(m.getKey()+" "+m.getValue());      
      		}

		//Hashtable Implementation

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
  
  		ht.put(100,"Amit");  
  		ht.put(102,"Ravi");  
  		ht.put(101,"Vijay");  
  		ht.put(103,"Rahul");  
  
  		for(Map.Entry m:ht.entrySet()){  
   			System.out.println(m.getKey()+" "+m.getValue());  
  		}

		//remove method for hashtable

		// Remove value for key 102  
       		ht.remove(102);  
       		System.out.println("After remove: "+ ht); 

		//if and else statement as arguments of the method  
     		System.out.println(ht.getOrDefault(101, "Not Found"));  
     		System.out.println(ht.getOrDefault(105, "Not Found"));

		//Default values if absent
		ht.putIfAbsent(101,"Vijay");  
     		System.out.println("Updated Map: "+ht); 
	}

}

