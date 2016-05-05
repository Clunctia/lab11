package tasktimer;

/**
 * StopWatch this class can start timing, stop timing, and elapsed time.
 * @author Clunctia
 *
 */
public class StopWatch {
	private long startTime;
	private long stopTime;
	private boolean running;
	
	/**
	 * initialize StopWatch.
	 */
	public StopWatch() {
		startTime = 0;
		stopTime = 0;
		running = false;
	}
	
	/**
	 * Start timing.
	 */
	public void start() {
		startTime = System.nanoTime();
		running = true;
	}
	
	/**
	 * Stop timing.
	 */
	public void stop() {
		stopTime = System.nanoTime();
		running = false;
	}
	
	/**
	 * Calculate elapsed time and return result.
	 * @return result of elapsed time.
	 */
	public double getElapsed() {
		return (stopTime - startTime);
	}
}
