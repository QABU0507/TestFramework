package Day8;

public class LearnAccessModifiers {
    public int pubvar=10;
    private int privar=30;
    protected int provar=15;
    int defvar=20;

    public void pubmethod()
    {
        System.out.println("public method");
    }

    private void primethod()
    {
        System.out.println("private method");
    }
   protected void promethod()
    {
        System.out.println("protected method");
    }
   void defmethod()
    {
        System.out.println("Default method");
    }
    //inside the class
    public static void main(String[] args) {
        LearnAccessModifiers Am = new LearnAccessModifiers();
        System.out.println(Am.pubvar);
        System.out.println(Am.privar);
        System.out.println(Am.provar);
        System.out.println(Am.defvar);

        Am.pubmethod();
        Am.primethod();
        Am.promethod();
        Am.defmethod();
    }
}
