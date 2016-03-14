package br.com.thindroid;

/**
 * Created by Carlos on 01/03/2016.
 */
public class Tests {
    @AlarmTask(interval = AlarmTask.MINUTE, wakeUp = true)
    public static void foo(){
        System.out.print("Executing this code every 60 seconds");
        try {
            Thread.sleep(30 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AlarmTask(interval = AlarmTask.MINUTE, wakeUp = true)
    public static void foo2(){
        System.out.print("Executing this code every 60 seconds");
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
