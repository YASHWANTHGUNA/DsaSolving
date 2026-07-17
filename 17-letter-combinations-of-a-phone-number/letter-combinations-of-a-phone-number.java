class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String[] map = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz" };
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        backtrack(digits, 0, new StringBuilder(), map);
        return ans;


        
    }
    public void backtrack(String digits,
                      int index,
                      StringBuilder currentWord,
                      String[] map) {
        if(index == digits.length()) {
            ans.add(currentWord.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        
        
        for (int i = 0; i < letters.length(); i++) {
            currentWord.append(letters.charAt(i)); 
            backtrack(digits, index + 1, currentWord, map); 
            currentWord.deleteCharAt(currentWord.length() - 1);
    }
    }
}