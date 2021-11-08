package Day8_AccessModifier;

import Day8.LearnAccessModifiers;

public class OutsidePackageExtendclass extends LearnAccessModifiers {
    public static void main(String[] args) {

        OutsidePackageExtendclass Am = new OutsidePackageExtendclass();
        System.out.println(Am.pubvar);
        //System.out.println(Am.privar); //private, protected variable cannot be accessed outside the class
        System.out.println(Am.provar);
        //System.out.println(Am.defvar);

        Am.pubmethod();
        //Am.primethod(); //private, protected method cannot be accessed outside the class
        Am.promethod();
        //Am.defmethod();
    }
}
