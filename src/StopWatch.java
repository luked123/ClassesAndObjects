/** Class that represents a stop watch*/
public class StopWatch {
    private long startTime;
    private long endTime;

    /** Initializes stopwatch with the current time */
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    /** Resets the stopwatch with the current time */
    public void start(){
        startTime = System.currentTimeMillis();
    }

    /** Stops the stopwatch and sets current time to endtime */
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    /** Returns the elapsed time in milliseconds */
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
