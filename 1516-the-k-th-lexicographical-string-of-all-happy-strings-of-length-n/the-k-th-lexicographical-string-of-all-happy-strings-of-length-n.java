class Solution {
    private int count = 0; 
    private String result = "";

    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        generate(sb, n, k);
        return result; 
    }

    private void generate(StringBuilder sb, int n, int k) {
        if (sb.length() == n) { 
            count++;
            if (count == k) {
                result = sb.toString(); 
            }
            return;
        }

        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {
                sb.append(ch); 
                generate(sb, n, k); 
                if (!result.isEmpty()) return; 
                sb.deleteCharAt(sb.length() - 1); 
            }
        }
    }
}
