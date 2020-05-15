package GetOfferSolutions;

import java.util.ArrayList;
import java.util.List;

public class Offer57II {
	public int[][] findContinuousSequence(int target) {
		List<int[]> result = new ArrayList<>();
		for (int i = 1; i < target/2+1; i++) {
			int sum = i;

			int j = i+1;
			while(sum<target) sum  += j++;
			if(sum == target) {
				int[] res = new int[j-i];
				j=i;
				for (int k = 0; k < res.length; k++) {
					res[k] = j++;
				}
				result.add(res);
			}
		}
		return result.toArray(new int[0][]);
    }
	public static void main(String[] args) {
		Offer57II o =new Offer57II();
		System.out.println(o.findContinuousSequence(9).length);
	}
}
