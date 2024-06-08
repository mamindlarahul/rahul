package array;

public class MergedArray {

	public static void main(String[] args) {
		
		String [] array1 = {"chai","coffee"};
		String [] array2 = {"milk","water","coke"};
		
		int mergedLength = array1.length + array2.length;
		
		String [] mergedArray = new String[mergedLength];
		
		for(int k = 0; k < array1.length ; k++ ) {
			mergedArray[k] = array1[k];
		}
		
		for(int k = 0 ; k < array2.length ; k++) {
			mergedArray[array1.length + k] = array2[k];
		}
		
		System.out.println("merged Array :");
		
		for(String n : mergedArray) {
			System.out.println(n + "  ");
		}
	}

}
