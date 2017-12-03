package edu.csu.cs;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Stopwatch stopwatch = Stopwatch.createStarted();

        try
        {
            TimeUnit.MILLISECONDS.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        stopwatch.stop(); // optional

        long millis = stopwatch.elapsed(MILLISECONDS);

        System.out.println( "Time Elapsed - "+ millis);

    }
}
