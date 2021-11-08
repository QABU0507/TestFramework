package Day8_AccessModifier;

import Day8.LearnAccessModifiers;

public class OutsidePackageclass {
    public static void main(String[] args) {
        LearnAccessModifiers Am = new LearnAccessModifiers();
        System.out.println(Am.pubvar);
        /*System.out.println(Am.privar); //private, protected, default variable cannot be accessed outside the class
        System.out.println(Am.provar);
        System.out.println(Am.defvar);

        Am.pubmethod();
        Am.primethod(); //private, protected, default method cannot be accessed outside the class
        Am.promethod();
        Am.defmethod();*/
    }
}
