public class binarySearch {
    public static int findPivot(int arr[], int n){
        int st=0;
        int end=n-1;
        while(st<=end){
            if(arr[st]<=arr[end]) return st;
            int mid=st+(end-st)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid] <= arr[next]) return mid;
            if(arr[st]<=arr[mid]) st=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        

    }
}