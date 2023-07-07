import java.util.*;
public class Greed{
  public static int greedy(int[] dice){
    Map<String, Integer> map = new HashMap<>();
    map.put("111", 1000);
    map.put("666", 600);
    map.put("555", 500);
    map.put("444", 400);
    map.put("333", 300);
    map.put("222", 200);
    map.put("1", 100);
    map.put("5", 50);
    
    Arrays.sort(dice);
    
    StringBuilder s = new StringBuilder();
    for (int i : dice) {
        s.append(i);
    }
    
    int left = 0, right = 0, res = 0;
    while(right < s.length()) {
      if(s.charAt(left) == s.charAt(right) && right - left < 3) {
        right++;
      } else {
        if(right - left == 3) {
          res += map.getOrDefault(s.substring(left, right), 0);
        } else {
          //for individual 1s and 5s
          for(int i = left; i < right; i++) {
            res += map.getOrDefault(String.valueOf(s.charAt(i)), 0);
          }
        }
        left = right;
      }
    }
    //handling the last sequence
    if(right - left == 3) {
      res += map.getOrDefault(s.substring(left, right), 0);
    } else {
      //for individual 1s and 5s
      for(int i = left; i < right; i++) {
        res += map.getOrDefault(String.valueOf(s.charAt(i)), 0);
      }
    }
    return res;
  }
}
