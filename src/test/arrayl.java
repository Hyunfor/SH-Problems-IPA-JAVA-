package test;

public class arrayl {

	public static void main(String[] args) {
		// 21년 2회차 70번
		
		int cnt = 0;
		do {
			cnt++;
		} while (cnt < 0);
		if(cnt==1)
			cnt++;
		else
			cnt = cnt + 3;
		System.out.printf("%d", cnt);

	}

}
