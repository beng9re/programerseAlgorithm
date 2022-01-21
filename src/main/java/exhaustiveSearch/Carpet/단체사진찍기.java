package exhaustiveSearch.Carpet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// 순열
public class 단체사진찍기 {

	int count = 0;
	private List<Calc> calcList = new ArrayList<>();

	public static class Calc {

		private static final String EQUAL =  "=";
		private static final String LEFT =  ">";
		private static final String RIGTH =  "<";

		String start;
		String end;
		String op;
		int num;
		public Calc (String data) {
			var datas = data.split("");
			System.out.println("datas = " + datas);
			start = datas[0];
			end = datas[2];
			op = datas[3];
			num = Integer.parseInt(datas[4]) + 1;
		}

		public boolean valied(String[] array) {
			int startIndex = -1;
			int endIndex = -1;
			for (int i = 0; i < array.length; i++) {
				String a = array[i];
				if (a.equals(this.start)) {
					startIndex = i;
				}else if (a.equals(this.end)) {
					endIndex = i;
				}

				if (startIndex != -1 && endIndex != -1) {
					break;
				}
			}

			var vailedIndex = Math.abs(startIndex - endIndex)  ;

			if (EQUAL.equals(this.op)) {
				return vailedIndex == num;
			}

			if(LEFT.equals(this.op)) {
				return vailedIndex > num;
			}

			if(RIGTH.equals(this.op)) {
				return vailedIndex < num;
			}

			return false;
		}

	}

	public int solution(int n, String[] data) {
		var kaKaoFrends = new String[]{"A", "C", "F", "J", "M", "N", "R", "T"};
		calcList  = Arrays.stream(data)
				.map(Calc::new)
				.collect(Collectors.toList());

		doPermutation(kaKaoFrends,0);


		int answer = count;
		return answer;
	}


	//순열
	private void doPermutation(String[] arr, int startIdx) {
		int length = arr.length;
		if (startIdx == length - 1) {
			boolean ck = false;
			for (Calc calc : calcList) {
				if(!calc.valied(arr)) {
					ck = false;
					break;
				}
				ck = true;
			}

			if (ck) {
				count++;
			}

			return; 
		}

		for (int i = startIdx; i < length; i++) {
			swap(arr, startIdx, i);
			doPermutation(arr, startIdx + 1);
			swap(arr, startIdx, i);
		}
	}

	private void swap(String[] arr, int n1, int n2) {
		String temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}
}
