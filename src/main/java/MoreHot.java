import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MoreHot {


	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.addAll(Arrays.stream(scoville).boxed().collect(Collectors.toList()));

		while (que.peek() >= K) {
			int food = que.poll();
			if (que.peek() == null) return -1;
			answer++;
			food += que.poll() * 2;
			que.offer(food);
		}

		return answer;
	}
}
