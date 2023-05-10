package problems;

public class TwoStrings {

	public static void main(String[] args) {
		System.out.print("\n"+twoStrings("writetoyourparents","fghmqzldbc"));
	}
	public static String twoStrings(String s1, String s2) {
        int[] a = new int[26];
        int value ,count =0,length=0,len1 = s1.length(), len2 = s2.length();
        if(len1>len2) length = len1;
        else length= len2;
        for(int i=0;i<26;i++) {
        	System.out.print(a[i]+" ");
        }
        for(int i=0; i<length; i++){
            if(i<len1){
                value = s1.charAt(i) - 'a';
                a[value]+=2;
            }
            if(i<len2){
                value = s2.charAt(i) - 'a';
                if(a[value]!=1)
                a[value]--;
            }
        }
        for(int i=0; i<26; i++){
            if(a[i] == 1 || a[i]%2==1){
                count ++; 
            }
        }
        if(count > 0) return "YES";
        else return "NO";
    }

}
