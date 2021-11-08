package Day15;

public class ageCalculator {

    // create excception for providing age<3
    public void ageCalc(int age) throws Exception{
        if(age<=3){
            throw new Exception("Kid!!!. he is neither major nor minor"); // throw used to create new exception
        }
        else if (age>3&&age<18)
        {
            System.out.println("Minor");
        }
        else{
            System.out.println("Major");
        }


    }


}
