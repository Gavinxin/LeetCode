package GetOfferSolutions;

import java.util.HashSet;
import java.util.Set;

public class duplicateNumber {
	public boolean duplicate(int numbers[],int length,int [] duplication) {

        Set<Integer> set = new HashSet<>();
        for(int i =0 ;i<length;i++){
            if(set.contains(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }else{
                set.add(numbers[i]);
            }
        }
        return false;
    }
}
