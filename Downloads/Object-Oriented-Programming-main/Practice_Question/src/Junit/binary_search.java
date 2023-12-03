class BinarySearch {
    private int high;
    private int low;
    private int[] arr;
    private int mid;
    private int elementToBeFound;

    public BinarySearch(int[] arr, int elementToBeFound) {
        this.arr = arr;
        this.elementToBeFound = elementToBeFound;
        this.low = 0;
        this.high = arr.length - 1;
        this.mid = (low + high) / 2;
    }

    int binarySearch() {
        while (high >= low) {
            if (arr[mid] == elementToBeFound) {
                return 1;
            } else if (arr[mid] > elementToBeFound) {
                high = mid - 1;
                mid = (high + low) / 2;
            } else {
                low = mid + 1;
                mid = (high + low) / 2;
            }
        }
        return -1;
    }
}
