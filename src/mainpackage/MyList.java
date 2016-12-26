package mainpackage;

/**
 * This is one way list example;
 * 
 * @author Eugene
 *
 * @param <T>
 */
public class MyList<T extends A>{
	
	T head;
	T tail;
	
	int size = 0;
	
	@SuppressWarnings("unchecked")
	public void add(T newT){
		if(tail == null && head == null){
			head = newT;
			tail = newT;
			size = 1;
		}else{
			tail.next = newT;
			tail = (T)tail.next;
			size++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void printAll(){
		T current = head;
		while(true){
			if(current == null)break;
			System.out.println(current.val);
			current = (T)current.next;		
		}
	}
	
	@SuppressWarnings("unchecked")
	public void remove(T removeObj){
		T current = head;
		while(true){
			if(current.next == null)break;
			if(current.next == removeObj){
				System.out.println("Object " + current.next.val + " has been removed");
				current.next = current.next.next;
				size--;
				break;
			}
			current = (T)current.next;
			
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		if(index >= size)throw new IndexOutOfBoundsException();
		
		if(index == 0)return head;
		if(index == (size - 1))return tail;
		
		T returned = (T)head.next;
		for(int i = 1; i < index; i++){
			returned = (T) returned.next;
		}
		
		return returned;
	}
	
	@SuppressWarnings("unchecked")
	public void push(T obj, int index){
		if(index >= size)throw new IndexOutOfBoundsException();
		
		T current = head;
		for(int i = 0; i < index; i++){
			if(i == index - 1){
				obj.next = current.next;
				current.next = obj;		
			}else{
				current = (T)current.next;
			}
		}
		
		
		
	}

}
