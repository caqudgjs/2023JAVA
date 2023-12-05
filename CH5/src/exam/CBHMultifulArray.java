package exam;

public class CBHMultifulArray {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] [] scores = null;
//		scores = new int[2] [3];
		int[][] scores = {{95,80},{92, 96, 80}};
		
//		for(int i =0; i<scores.length; i++)
//			for(int j = 0; j<scores[i].length; j++) {
//				scores[i][j] = i+j;
//				System.out.println("" + scores[i][j]);
//			}
		
		for(int i =0; i<scores.length; i++)
			for(int j = 0; j<scores[i].length; j++) {
				System.out.println("" + scores[i][j]);
			}
	}
}
 

