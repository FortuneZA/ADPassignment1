package za.ac.cput;

import java.util.Timer;
import java.util.TimerTask;

//authour: Ridhaa Flanders - 218204191
public class Calculatorridhaa {

    public int addition(int a,int b)
    {
        return a + b;
    }

    public void countToFive()
    {

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Five Seconds Has Passed");

    }

}
