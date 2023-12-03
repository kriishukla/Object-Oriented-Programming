class binary_Search_1 implements Runnable {
    private int high;
    private int low;
    private int[] arr;
    private int mid;
    private int elementToBeFound;

    private boolean flag=false;

    public binary_Search_1(int[] arr, int elementToBeFound,int high,int low) {
        this.arr = arr;
        this.elementToBeFound = elementToBeFound;
        this.low = 0;
        this.high = arr.length - 1;
        this.mid = (low + high) / 2;
    }



    @Override
    public void run() {
        while (high >= low) {
            if (arr[mid] == elementToBeFound) {
                flag=true;

            } else if (arr[mid] > elementToBeFound) {
                high = mid - 1;
                mid = (high + low) / 2;
            } else {
                low = mid + 1;
                mid = (high + low) / 2;
            }
        }
    }
}
