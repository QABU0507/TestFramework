package Day8;

public class Encapsulation {

    private int age=10;

    public int getAge() {
        return age;
    }
    /*public void setAge(int age){  // disabling this method will remove access for the user to set the value for the age variable.
        this.age=age;
    }*/

    private String validateAge(){ //we can access this method in main method
        if(age>=18)
        {
            return "Major";
        }
        else
            return "Minor";
    }
    //inorder to access the above method in main method

    public String getAgeStatus(){
        String S= validateAge();
        return S;

    }

}
