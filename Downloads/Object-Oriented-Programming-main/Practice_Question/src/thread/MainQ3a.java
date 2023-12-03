import java.util.ArrayList;
import java.util.Scanner;

class LimitsError extends Exception{
    LimitsError(String message){
        super(message);
    }
}


class elementFinderRunnable implements Runnable{
    private ArrayList<Integer> arr;
    private int toFind;
    private int low, high;


    private boolean result = false;


    public elementFinderRunnable(ArrayList<Integer> arr, int low, int high, int toFind){
        this.arr = arr;
        this.toFind = toFind;
        this.low = low;
        this.high = high;
    }


    @Override
    public void run() {
        int start = this.low, end = this.high;
        boolean elementFound = false;       // to check if it has been found


        while (start < end){
            int mid = start + (end - start)/2;
            if (arr.get(mid) == this.toFind){
                this.result = true;
                elementFound = true;
                break;
            }
            else if(arr.get(mid) > this.toFind){
                // search in lower bracket
                end = mid-1;
            }
            else{
                // search upper bracket
                start = mid+1;
            }
        }
        // if it hasn't been found
        if (elementFound == false){
            if(arr.get(start) == this.toFind){
                this.result = true;
            }
            else{
                this.result = false;
            }
        }
    }


    boolean getResult(){
        return this.result;
    }
}


public class MainQ3a {
    public static void main(String[] args) throws InterruptedException {


        Scanner s = new Scanner(System.in);


        int low, high;
        while (true){
            try{
                // for the lower limit
                while(true){
                    try{
                        System.out.print("Please enter the start of the array: ");
                        low = Integer.parseInt(s.next());
                        break;
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("Please enter a valid integer\n");
                    }
                }


                // for the upper limit
                while(true){
                    try{
                        System.out.print("Please enter the end of the array: ");
                        high = Integer.parseInt(s.next());
                        break;
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("Please enter a valid integer\n");
                    }
                }


                // check that the low point of the array is lower than the high point
                if (low >= high){
                    throw new LimitsError("The limit should be set properly!");
                }


                break;
            }
            catch (LimitsError e){
                System.out.println(e.getMessage());
            }
        }




        ArrayList<Integer> findElement = new ArrayList<Integer>();
        for (int i = low; i < high; i++){
            findElement.add(i);
        }


        // input the number that we have to search for
        int toFind;
        while(true){
            try{
                System.out.print("Please enter the number you want to find: ");
                toFind = Integer.parseInt(s.next());
                break;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Please enter a valid integer\n");
            }
        }


        s.close();


        int mid = findElement.size()/2;
        elementFinderRunnable left = new elementFinderRunnable(findElement, 0, mid, toFind);
        elementFinderRunnable right = new elementFinderRunnable(findElement, mid+1, findElement.size()-1, toFind);


        Thread t1 = new Thread(left);
        Thread t2 = new Thread(right);


        t1.start();
        t2.start();


        t1.join();
        t2.join();


        boolean res = left.getResult() || right.getResult();


        System.out.format("The search result is: %s", res);
    }
}
