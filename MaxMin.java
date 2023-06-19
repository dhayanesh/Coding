class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
    int min = Integer.MAX_VALUE;
    Collections.sort(arr);
    
    for(int i = 0; i < arr.size() - k + 1; i++) {
        int diff = arr.get(i + k - 1) - arr.get(i);
        if(diff < min)
            min = diff;
    } 

    return min;
    }

}
