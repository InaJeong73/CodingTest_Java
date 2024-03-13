class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer;
	       String str1=my_string.substring(0, s)+overwrite_string;
	       if(str1.length()<my_string.length()) {
	    	   answer=str1+my_string.substring(str1.length());
	       }else {
	    	   answer=str1;
	       }
	        return answer;
    }
}