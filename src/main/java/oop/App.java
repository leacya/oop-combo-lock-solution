package oop;

/**
 * Combination Lock - Combo Lock App
 * (See Exercise P8.9 from Big Java Book)
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Combo Lock App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {

        //TODO - instantiate (create) a lock object

        //TODO - turn dial to enter digits

        //TODO - test to see if lock has opened

        //TODO- reset lock

        ComboLock lock = new ComboLock(1, 2, 3);
        System.out.println("Testing ComboLock");
        System.out.print("Attempt One :");
        lock.turnRight(1);
        lock.turnLeft(2);
        lock.turnRight(3);
        if (lock.open())
        {
            System.out.println("OPEN lock");
        }
        else
        {
            System.out.println("CLOSED lock");
        }


        lock.reset();


//
        System.out.print("\nAttempt Two :");
        lock.turnRight(10);  //additional incorrect #1
        lock.turnRight(1);
        lock.turnLeft(2);
//        lock.turnLeft(2);   //additional incorrect #2
        lock.turnRight(3);
//        lock.turnRight(3);  // additional incorrect #3 - disallow?
        if (lock.open())
        {
            System.out.println("OPEN lock");
        }
        else
        {
            System.out.println("CLOSED lock");
        }

        System.out.println("\n\n\n\n\n\n\n\nTesting ComboLock using Enum:");
        ComboLockEnum lock2 = new ComboLockEnum(1, 2, 3);

        System.out.print("Attempt One :");
        lock2.turnRight(1);
        lock2.turnLeft(2);
        lock2.turnRight(3);
        if (lock2.open())
        {
            System.out.println("OPEN lock");
        }
        else
        {
            System.out.println("CLOSED lock");
        }
//
//        lock2.turnRight(10);
//        lock2.reset();
//        System.out.print("Attempt Two :");
//        lock2.turnRight(1);
//        lock2.turnLeft(2);
//        lock2.turnRight(3);
//        if (lock2.open())
//        {
//            System.out.println("OPEN lock");
//        }
//        else
//        {
//            System.out.println("CLOSED lock");
//        }


    }
}
