class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int low = 0;
        int high = citations.length - 1;
        int n = citations.length;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(citations[mid] == (n - mid)){
                return n - mid;
            }else if(citations[mid] < (n - mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (n - low);
    }
}
