package Competition20200418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
	/**
	 * 4. 最小跳跃次数
	 * 为了给刷题的同学一些奖励，力扣团队引入了一个弹簧游戏机。游戏机由 N 个特殊弹簧排成一排，编号为 0 到 N-1。初始有一个小球在编号 0 的弹簧处。若小球在编号为 i 的弹簧处，通过按动弹簧，可以选择把小球向右弹射 jump[i] 的距离，或者向左弹射到任意左侧弹簧的位置。也就是说，在编号为 i 弹簧处按动弹簧，小球可以弹向 0 到 i-1 中任意弹簧或者 i+jump[i] 的弹簧（若 i+jump[i]>=N ，则表示小球弹出了机器）。小球位于编号 0 处的弹簧时不能再向左弹。
为了获得奖励，你需要将小球弹出机器。请求出最少需要按动多少次弹簧，可以将小球从编号 0 弹簧弹出整个机器，即向右越过编号 N-1 的弹簧。
	 * @param jump
	 * @return
	 */
	 public int minJump(int[] jump) {
		 //当前节点能够达到的最远位置
		 if(jump.length==1 &&jump[0]>=1) return 1;
		 if(jump.length<=jump[0]) return 1;
		 int index = 0;
		 List<Integer> list = new ArrayList<Integer>();
		 for (int i = 0; i < jump.length; i++) {
				if(i+jump[i]>=jump.length)
					list.add(i);		
		}
		 //能够到达i位置的最小步数
		int[] step =new int[jump.length];
		Arrays.fill(step, jump.length+1);
		step[0] = 0;
		for (int i = 1; i < jump.length; i++) {
			for (int j = 0; j < step.length; j++) {
				if(i<j+jump[j])
					step[i] = Math.min(step[i], step[j]+2);
				if(i == j+jump[j])
					step[i] = Math.min(step[i], step[j]+1);
			}
		}
		int min = jump.length+1;
		list.stream().forEach(System.out::println);
		System.out.println(Arrays.toString(step));
		for (int i = 0; i < step.length; i++) {
			if(list.contains(i))
				min = Math.min(step[i], min);
		}
		return min+1;
	 }
	 public static void main(String[] args) {
		int[] arr = new int[]{2, 5,1};
		Solution4 s4 = new Solution4();
		System.out.println(s4.minJump(arr));
	}
}
