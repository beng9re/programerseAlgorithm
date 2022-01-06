import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiskController {

	class Job implements Comparable<Job>{
		private int requestTime;
		private int jobRunning;
		Job(int [] jobTime ){
			this.requestTime = jobTime[0];
			this.jobRunning = jobTime[1];
		}

		public int getJobRunning() {
			return jobRunning;
		}

		public int getRequestTime() {
			return requestTime;
		}


		@Override
		public int compareTo(Job o) {
			return this.getRequestTime() - o.getRequestTime();
		}

		@Override
		public String toString() {
			return "Job{" +
				"requestTime=" + requestTime +
				", jobRunning=" + jobRunning +
				'}';
		}
	};



	public int solution(int[][] jobs) {
		int jobSize = jobs.length;
		int runTime = 0;
		int currentTime = 0;

		List<Job> jobList = Arrays.stream(jobs)
			.map(Job::new)
			.sorted((near,next)->{
				if (near.getJobRunning() == next.getJobRunning()){
					return near.getRequestTime() - next.getRequestTime();
				}
				return near.getJobRunning() - next.getJobRunning();
			})
			.collect(Collectors.toList());

		PriorityQueue<Job> priorityQueue = new PriorityQueue<>();
		jobList.forEach(priorityQueue::offer);


		while (priorityQueue.size() != 0) {
			Job job = priorityQueue.poll();
			if( currentTime < job.getRequestTime()) {
				priorityQueue.offer(job);
			} else {
				runTime += currentTime - job.getRequestTime() + job.getJobRunning();
				currentTime += job.getJobRunning();
			}
		}

		System.out.println("runTime = " + runTime);


		return runTime / jobSize;
	}
}