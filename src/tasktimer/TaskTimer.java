package tasktimer;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
import java.util.function.IntConsumer;
import java.util.function.Consumer;
import java.util.concurrent.atomic.*;  // hack, using AtomicInteger as accumulator

/**
 * Time how long it takes to perform some tasks
 * using different programming constructs.
 * 
 * TODO Improve this code by restructuring it to eliminate duplicate code.
 */
public class TaskTimer
{
	private static final double NANOSECONDS = 1.0E-9;

	private static StopWatch watch = new StopWatch();
	public static void execAndPrint( Runnable task ){
		out.println( "Starting task: " + task.toString() );
		watch.start();
		task.run();
		watch.stop();
		out.printf( "Elapsed time is %f sec\n", watch.getElapsed()*NANOSECONDS);
		
	}

	/** Run all the tasks. */
	public static void main(String [] args) {
		Runnable[] tasks = {new Task1(), new Task2(), new Task3(), new Task4(), new Task5(), new Task6()};
		for(Runnable task: tasks) {
			execAndPrint(task);
		}
	}

}
