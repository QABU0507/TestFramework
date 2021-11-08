package Day8;

public class OutsideClassSamePackage {
    // Same package outside the class

    public static void main(String[] args) {
        LearnAccessModifiers Am = new LearnAccessModifiers();
        System.out.println(Am.pubvar);
        //System.out.println(Am.privar); private variable cannot be accessed outside the class
        System.out.println(Am.provar);
        System.out.println(Am.defvar);

        Am.pubmethod();
        //Am.primethod(); private method cannot be accessed outside the class
        Am.promethod();
        Am.defmethod();
    }
}
