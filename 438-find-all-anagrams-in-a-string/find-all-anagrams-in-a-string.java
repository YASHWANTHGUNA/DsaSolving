class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if(n < k) return result;

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // frequency of p
        for(int i = 0; i < k; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        // build first window
        for(int i = 0; i < k; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(pFreq, windowFreq)) {
            result.add(0);
        }

        // sliding window
        for(int i = k; i < n; i++) {

            windowFreq[s.charAt(i) - 'a']++;      // add new char
            windowFreq[s.charAt(i-k) - 'a']--;    // remove old char

            if(Arrays.equals(pFreq, windowFreq)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }
}