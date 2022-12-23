class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    if(s.length() == 0 || s.equals("")) return "";  
    char[] alphabet1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] alphabet1Rev = new char[26];
    char[] alphabet2Rev = new char[26];
    
    for(int i = 0; i < 26; i++) 
        alphabet1Rev[i] = alphabet1[(i + k)%26];
    for(int i = 0; i < 26; i++) 
        alphabet2Rev[i] = alphabet2[(i + k)%26];
        
    HashMap<Character, Character> hm = new HashMap<>();
    
    for(int i = 0; i < 26; i++) {
        hm.put(alphabet1[i],alphabet1Rev[i]);
        hm.put(alphabet2[i],alphabet2Rev[i]);
    }
    
    char[] str = s.toCharArray();
    char[] str1 = new char[str.length];
    
    for(int i = 0; i < str.length; i++) {
        if(hm.containsKey(str[i]))
            str1[i] = hm.get(str[i]);
        else
            str1[i] = str[i];
    }
    
         
    return new String(str1);
    }


}
