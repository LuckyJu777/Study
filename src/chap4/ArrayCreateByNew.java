package chap4;
public class ArrayCreateByNew{
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr[" +i+ "]:" + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i +"] :"+arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" +i+"]"+arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" +i+"]"+arr3[i]);
		}
		
		arr3[0] = "학생";
		arr3[1] = "선생";
		arr3[2] = "부모";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" +i+"]"+arr3[i]);
		}
	}
}