class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                sb.append(c);
                capitalizeNext = true; // 다음 문자를 대문자로
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}
