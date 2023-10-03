package Question1;

interface rotatable{
    public void rotate();

}

interface rotateandFly extends rotatable{
    void fly();

}

class rotator implements rotatable{
    @Override
    public void rotate(){
        System.out.println("I am rotating my friend");

    }

}

class helicopter extends rotator implements rotateandFly {
    public void fly(){
        System.out.println("I am flying");

    }

    public void drive(){
         // demonstarate polymorphism by calling this method with argument of type rotator , flyer and helicopter nd printing the type name inside the function
        System.out.println("I am driving");
        rotate();
        fly();


    }

}


public class question1 {
    // make classes according to your need
    
}
