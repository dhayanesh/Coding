class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String res = "";

        for(int i = arr.length - 1; i >= 0; i--) {
            //split(" ") creates empty strings if multiple spaces
            if(!arr[i].equals("")) { 
                if(i != 0)
                    res += arr[i] + " ";
                else
                    res += arr[i];
            }
        }
        
        return res.trim();
    }
}
