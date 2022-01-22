package queue;

import java.util.Arrays;
import java.util.LinkedList;

public class RoateArray {

	public boolean solution(int[] arrA, int[] arrB) {
		var source = new LinkedList<>(Arrays.asList(Arrays.stream(arrA).boxed().toArray()));
		var target = new LinkedList<>(Arrays.asList(Arrays.stream(arrB).boxed().toArray()));


		for (int i = 0; i < source.size(); i++) {
			if (source.equals(target)) {
				return true;
			}
			source.offer(source.poll());
		}
		return false;
	}


}
