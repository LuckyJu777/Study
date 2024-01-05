	package Test;

	public class ForEx0 {
		public static void ForEx0(String[] args) {
			int numArray[]= {1, 2, 3, 4, 5, 6,7,8,9,10};
			for(int i=0; i<numArray.length; i++) {
				if(i % 5 == 1) {
					System.out.print(numArray[i]);
				}
				System.out.println();
			}
		}
	}