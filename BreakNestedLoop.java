
public class Main {

	public static void main(String[] args) {
		
		labelsExit(/*Some Parameters*/);
		// or
		functionExit(/*Some Parameters*/);
		System.out.println("Print quack");
		System.out.println("Print Meow");
		System.out.println("Print Raww");
	}
	
	private static void labelsExit(/*Some Parameters*/) {
		Quack:{
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					if (j == 5) {
						break Quack;
					}
					System.out.println("i: " + i +"\n" + "i: " + j);
				}
			}
		}
	
		// SOME CODE
	
		System.out.println("Print quack");
		System.out.println("Print Meow");
		System.out.println("Print Raww");
	}
	
	private static void functionExit(/*Some Parameters*/) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if (j == 5) {
					return;
				}
				System.out.println("i: " + i +"\n" + "i: " + j);
			}
		}
	}

}
