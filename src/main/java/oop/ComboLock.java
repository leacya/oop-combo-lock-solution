package oop;

/**
 * Combination Lock
 * The correct (opening) combination code must be set when constructing the ComboLock.
 * The correct sequence of digits making up the code must be entered in order
 * to open the ComboLock.
 * When entering a code, the first digit must be entered by
 * turning Right (clockwise), then Left, and finally Right.
 */

public class ComboLock
{

    // Instance variables (fields)
    // Code combination required to open this lock
    //TODO - create instance fields to store three code digits required to open lock
    private int secret1;
    private int secret2;
    private int secret3;
    private int state;

    // constructor
    // initialize/set the correct combination code for the lock
    //TODO - constructor to initialize lock
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.state = 0;
    }

    public void reset()
    {
        //TODO reset the lock to start state
        this.state = 0;
    }

    public void turnRight(int number)
    {
        //TODO how will turning right to the number
        // change the state of the lock?
        if (this.state == 0 && number == secret1)
        {
            this.state = 1;
        }
        else if (this.state == 2 && number == secret3)
        {
            this.state = 3;
        }
        else
        {
            this.state = 0;
        }


    }

    public void turnLeft(int number)
    {
        //TODO how will turning right to the number
        // change the state of the lock?
        if (state == 1 && number == secret2)
        {
            state = 2;
        }
        else
        {
            state = 0;
        }

    }

    public boolean open()
    {
        //TODO logic for testing if lock is open
        if (this.state == 3)
            return true;
        else
            return false;
//        return this.state == 3;
    }

    //TODO
    // Consider - can a user open this lock by entering the right sequence of
    // codes but with some incorrect ones in between the correct ones.
    // How might this be resolved -  See last line in turnLeft() and turnRight()?
}
