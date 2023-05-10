package problems;

public class BeautifyDays {

	public static void main(String[] args) {
		new BeautifyDays().entry();
	}

	private void entry() {
		int i = 20, j = 23, k = 6;
		int temp, rev ,digit, count = 0;
		for(int start = i;start<=j;start++){
            temp = start;
            rev = 0;
            while(temp > 0){
                digit = temp%10;
                rev = rev*10 +digit;
                temp = temp/10;
            }
            if(Math.abs((start-rev)%k) == 0){
                count++;
            }
        }
		System.out.println(count);
	}

}
