import java.io.*;

abstract class Cleaner {
    abstract void clean();
}


interface Rotator{
    public void rotate();
}


class VacuumCleaner extends Cleaner implements java.io.Serializable{
    static final long serialVersionUID = 42L;
    private static int numUnits = 1000;
    private final Motor motor;
    private String modelID;

    public VacuumCleaner(String modelID){
        this.motor = new Motor();
        this.modelID = modelID;
    }


    class Motor implements Rotator, java.io.Serializable{
        static final long serialVersionUID = 20L;
        @Override
        public void rotate() {
            System.out.println("The motor is rotating");
        }
    }


    @Override
    void clean() {
        this.motor.rotate();
        System.out.println("VacuumCleaner is cleaning");
    }


    public int getnumUnits() {
        return numUnits;
    }


    public String getModelID() {
        return modelID;
    }
}


public class MainQ1 {


    public static void main(String[] args) throws IOException, ClassNotFoundException{
        VacuumCleaner cleaner_1 = new VacuumCleaner("Dykon");
        // serialization
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream("cleaner.txt"));
            out.writeObject(cleaner_1);
        }
        finally{
            out.close();
        }



        ObjectInputStream in = null;
        Cleaner cleaner_2 = null;
        try{
            in = new ObjectInputStream(new FileInputStream("cleaner.txt"));
            cleaner_2 = (VacuumCleaner) in.readObject();
        }
        finally{
            in.close();
        }




        //printing
        System.out.format("For cleaner_1: %s\n", cleaner_1.getModelID());
        cleaner_1.clean();


        // The below line will give an error because getModelID is not defined for Cleaner
        // System.out.format("For cleaner_2: %s\n", cleaner_2.getModelID());
        System.out.println("\nFor cleaner_2:");
        cleaner_2.clean();


    }
}
