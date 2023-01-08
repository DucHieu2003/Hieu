package Strategy;

public class Test {
    public static void main(String[] args) {
        BuildContext buildContext = new BuildContext(new House());
        System.out.println(buildContext.executeStrategy(" ngoại ô"));


        buildContext = new BuildContext(new Mall());
        System.out.println(buildContext.executeStrategy(" trung tâm thành phố"));
    }
}
