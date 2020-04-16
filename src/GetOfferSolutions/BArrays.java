package GetOfferSolutions;

public class BArrays {
	public int[] multiply(int[] A) {
		int[] B = new int[A.length];
		int length = A.length;
		B[0] = 1;
		for (int i = 1; i < length; i++) {
			B[i] = A[i-1]*B[i-1];
		}
		for (int i = length-2,temp =1; i >=0; i--) {
			temp*=A[i+1];
			B[i] *= temp;
		}
		
		return B;
    }
}
