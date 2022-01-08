import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {

	class Job implements Comparable<Job> {
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
			if (this.getJobRunning() == o.getJobRunning()) {
				return this.getRequestTime() - o.getRequestTime();
			}
			return this.getJobRunning() - o.getJobRunning();
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
		PriorityQueue<Job> run = new PriorityQueue<>();
		PriorityQueue<Job> wait = new PriorityQueue<>(Comparator.comparingInt(Job::getRequestTime));

		Arrays.stream(jobs).forEach((job)-> run.offer(new Job(job)));

		while (!run.isEmpty() || !wait.isEmpty()) {
			int remainJob = run.size();
			Job peekJob = null;
			while (!run.isEmpty()) {
				Job job = run.poll();
				if( currentTime < job.getRequestTime()) {
					wait.offer(job);
				}else {
					peekJob = job;
					break;
				}
			}
			if (remainJob == wait.size()) {
				Job waitJob = wait.poll();
				if(currentTime < waitJob.getRequestTime()) {
					currentTime = waitJob.getRequestTime();
				}
				peekJob = waitJob;
			}
			runTime += currentTime - peekJob.getRequestTime() + peekJob.getJobRunning();
			currentTime += peekJob.getJobRunning();
			run.addAll(wait);
			wait.clear();
		}

		return runTime / jobSize;
	}
}