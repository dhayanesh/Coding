class Solution {
    public String getHint(String secret, String guess) {
        int[] arr = new int[10];
        int bulls = 0;
        int cows = 0;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g) {
                bulls++;
            } else {
                hm1.put(s, hm1.getOrDefault(s, 0) + 1);
                hm2.put(g, hm2.getOrDefault(g, 0) + 1);
            }
        }
        for(char ch : hm1.keySet()) {
            int s = hm1.getOrDefault(ch, 0);
            int g = hm2.getOrDefault(ch, 0);
            if(s > g)
                cows += g;
            else
                cows += s;
        }
        return bulls + "A" + cows + "B";
    }
}
