package mainpackage;

public class S implements Comparable<S>{
	private int x;
	
	public S(int x){
		this.x = x;
	}

	@Override
	public int compareTo(S other) {
		return (other.x < this.x) ? 1 : -1;
	}
	
	public int getX(){
		return x;
	}

}
