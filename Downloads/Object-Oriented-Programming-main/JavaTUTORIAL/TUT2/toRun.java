import java.util.Scanner;

class trial {
    private int classVar;

    trial() {
        classVar = 0;
    }

    trial(int varToAssign) {
        this.classVar = varToAssign;
    }

    public int getClassVar() {
        return this.classVar;
    }

    public void setClassVar(int temp) {
        this.classVar = temp;
        System.out.println("Var set to " + this.classVar);
    }

    public void inputPrint() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("AP is easy");
        } else {
            System.out.println("Study for OS");
        }
        sc.close();
    }
}

public class toRun {
    public static void main(String[] args) {
        trial objTrial = new trial(0);
        System.out.println("Current Var is " + objTrial.getClassVar());
        objTrial.setClassVar(1);
        objTrial.inputPrint(); 
        System.out.println("Hi");
    }
}
