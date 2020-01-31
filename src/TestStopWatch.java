/** Driver for the stop watch class */
public class TestStopWatch {
    public static void main(String[] args){
        int[] list = new int[100000];

        // Tests Selection sort
        System.out.println("Creating random numbers");
        for(int i = 0; i < list.length; i++){
            list[i]  =  (int) (Math.random() * 100000);
        }

        System.out.println("Starting selection sort");
        StopWatch watch = new StopWatch();
        ArrayMethods.selectionSort(list);
        watch.stop();
        System.out.printf("Sorting done, the elapsed time in milliseconds is %d\n", watch.getElapsedTime());
        System.out.println();

        System.out.println("Creating random numbers");
        for(int i = 0; i < list.length; i++){
            list[i]  =  (int) (Math.random() * 100000);
        }

        //Tests Bubble sort
        System.out.println("Starting bubble sort");
        watch.start();
        ArrayMethods.bubbleSort(list);
        watch.stop();
        System.out.printf("Sorting done, the elapsed time in milliseconds is %d\n", watch.getElapsedTime());
        System.out.println();

    }
}
