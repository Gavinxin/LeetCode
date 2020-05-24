package LeetCodeSolutions;

public class LeetCode922 {
	public static void main(String[] args) {
		LeetCode922 l =new LeetCode922();
		int[] a= new int[] {1,2,3,4,5};
		l.sortArrayByParityII(a);
	}
	public int[] sortArrayByParityII(int[] A) {
		for (int i = 0,j=1; i < A.length; i = i+2) {
			if(A[i]%2 !=0) {
				while(j<A.length && A[j]%2!=0 ) j+=2;
				int temp = A[i];
				A[j] = A[i];
				A[j] = temp;
			}
			
				
				
		}
		return A;
    }
}
