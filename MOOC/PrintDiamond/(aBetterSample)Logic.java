package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        //prints a diamond of a given size
        printDiamond(size);

    }

    /**
     * This method contains all the sub-methods to print a diamond.
     * @param size is the size of the diamond, that the user selected, to be printed.
     */
    private void printDiamond(int size){

        // prints the top frame line
        printFrame(size);

        // prints top triangle
        for (int i=1; i<=size-1; i++) {
            printLine(size, i, '/','\\');
        }

        // prints the middle line
        printLine(size, size, '<', '>');

        // prints bottom triangle
        for (int i=size-1; i>=1; i--) {
            printLine(size, i, '\\','/');
        }

        // prints the bottom frame line
        printFrame(size);

    }

    /**
     * This method repeatedly prints a single character.
     * @param ch is the character to be printed
     * @param num is the number of times to print the character
     */
    private void printChars(char ch, int num) {
        for (int i=1; i<=num; i++) {
            mOut.print(ch);
        }
    }

    /**
     * This method to prints the top & bottom line of the frame
     * @param size is the given size of the diamond that the user selects
     */
    private void printFrame(int size) {
        mOut.print('+');
        printChars('-',2*size);
        mOut.println('+');
    }

    /**
     * This method prints a single line of the diamond
     * @param size is the given size of the diamond that the user selects
     * @param rowIndex is the number of the line to be printed
     * @param leftDiamondChar is the character that represents the left side od the diamond itself
     * @param rightDiamondChar is the character that represents the right side od the diamond itself
     */
    private void printLine(int size, int rowIndex, char leftDiamondChar, char rightDiamondChar) {
        mOut.print('|');
        printChars(' ',size-rowIndex);
        mOut.print(leftDiamondChar);
        //decides whether to print '-' or '=' based on the check if rowIndex is even or not
        if (rowIndex%2==0) {
            printChars('-',2*(rowIndex-1));
        } else {
            printChars('=',2*(rowIndex-1));
        }
        mOut.print(rightDiamondChar);
        printChars(' ',size-rowIndex);
        mOut.println('|');
    }

}
