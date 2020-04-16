package InterviewSolutions;

public class Count1 {
	public int NumberOf1(int n) {
		int c = 0;
		String b = Integer.toBinaryString(n);
		char[] chr = b.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			if(chr[i] == '1')
				c++;
		}
        return  c;
    }

}
