package Day7;

public class driverInheritance {

    //Main class

    public static void main(String[] args) {
        ScriptInheritance Si = new ScriptInheritance();
        Si.launchApp("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String EMI=Si.extractEMI("3000000","12","120");
        System.out.println(EMI);
        Si.tearDown();

        ScriptBingInheritance bi = new ScriptBingInheritance();
        bi.launchApp("https://www.bing.com/");
        bi.Search("Automation");
        bi.tearDown();

    }
}
