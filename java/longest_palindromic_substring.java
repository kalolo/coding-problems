class Solution {
    
    private Map<String,Boolean> wordsChecked = new HashMap<>();
    
    public String longestPalindrome(String s) {
        
        if (s == null || s.isEmpty() || s.length() <= 1 ) return s;
        
        int n = s.length();
        int biggest = 0, start = 0, end = 0;
        
        boolean[][] table = new boolean[n][n];
        
        for (int x = 0; x < n; x++) {
            table[x][x] = true;
            for (int y= 0; y < x; y++) {
                if (s.charAt(x) == s.charAt(y) && (x-y <= 2 || table[y+1][x-1] )) {
                    table[y][x]=true;
                    if (x-y+1 > biggest) {
                        biggest = x-y+1;
                        start = y;
                        end = x;
                    }
                }
                
            }
        }
        
        return s.substring(start, end + 1);
    }
    
}



    
    
