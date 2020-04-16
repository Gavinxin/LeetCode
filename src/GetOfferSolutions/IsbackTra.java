package GetOfferSolutions;

public class IsbackTra {
	public static void main(String[] args) {
		int [] sequence= {1,4,5,3};
		System.out.println(VerifySquenceOfBST(sequence));
	}
	public static boolean VerifySquenceOfBST(int [] sequence) {
        int length =sequence.length;
        return isVerifySquenceOfBST(sequence,0,length-1);
    }
	

	private static boolean isVerifySquenceOfBST(int[] sequence,int left, int right) {
		if(left>=right)
			return true;
		int base = sequence[right];
		int i = left,j =right-1;
		while(i<j&&sequence[j]>base) {
        	j--;
        }

		for ( ; i<j; i++) {
			if(sequence[i]>base)
				return false;
		}
		return isVerifySquenceOfBST(sequence,left,j-1)&&isVerifySquenceOfBST(sequence,j,right-1);
	}
}
