package mooc.vandy.java4android.birthdayprob.logic;

import java.util.Random;

import mooc.vandy.java4android.birthdayprob.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early Android interactions.
 * Designing the assignments this way allows you to first learn key 'Java' features without
 * having to beforehand learn the complexities of Android.
 *
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG =
            Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * <p>
     * It is called 'mOut' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'mOut' is good enough).
     */
    OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labelled 'Process...' is pressed.
     */
    public void process() {
        int groupSize = mOut.getSize();
        int simulationCount = mOut.getCount();

        if (groupSize < 2 || groupSize > 365) {
            mOut.makeAlertToast("Group Size must be in the range 2-365.");
            return;
        }
        if (simulationCount <= 0) {
            mOut.makeAlertToast("Simulation Count must be positive.");
            return;
        }

        double percent = calculate(groupSize, simulationCount);

        // report results
        mOut.println("For a group of " + groupSize + " people, the percentage");
        mOut.println("of times that two people share the same birthday is");
        mOut.println(String.format("%.2f%% of the time.", percent));

    }

    /**
     * This is the method that actually does the calculations.
     * <p>
     * We provide you this method that way we can test it with unit testing.
     */
    public double calculate(int size, int count) {
        // TODO -- add your code here
        int i;
        int bingo = 0;
        for (i = 1; i <= count; i++) {
            int[] days = new int[size];
            Random gene = new Random(i); // See note below.
            for (int j = 0; j < size; j++) {
                // I used to put "Random gene = new Random(i);" here
                // It caused a lot of trouble
                // Answer was given by Minion91 from Stackoverflow:
                // Problem is that you seed the random generator again.
                // Every time you seed it, the initial state of the random number
                //   generator gets reset and the first random number you generate
                //   will be the first random number after the initial state.
                // That's aaaaaaaawesome!
                days[j] = gene.nextInt(365);
            }
            if (hasRepeat(days)) {
                bingo++;
            }
        }
        double per = (10000*bingo)/count;
        double pre = per/100;
        return pre;
    }


    // TODO - add your code here

    // consumes an array of ints and determines whether there has repeat ints
    public static boolean hasRepeat(int[] dates){
        int i;
        int k;
        for (i=0;i<dates.length;i++) {
            for (k=i+1;k<dates.length;k++) {
                if (dates[k] == dates[i]){
                    return true;
                }
            }
        }
        return false;
    }

}