package exam;

public class CBHArrayCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = null;
		//scores = new int[] {1, 2, 3};
		scores = new int[20];
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("Sum is " + sum);
	}

}
