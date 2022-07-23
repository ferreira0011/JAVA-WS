package application;

public class Program {

	public static void main(String[] args) {
		/*
		/Boxing
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		//Unboxing
		int y = (int) obj;
		
		System.out.println(y);
		*/
		//Wrapper classes
		//Boxing
				int x = 20;
				
				Integer obj = x;
				
				System.out.println(obj);
				//Unboxing
				int y =  obj * 2;
				System.out.println(y);
	}

}
