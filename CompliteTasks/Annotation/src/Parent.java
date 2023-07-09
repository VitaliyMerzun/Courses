@DataAnn(num = 12, str = "1232qwerty")
@InheritedAnnotation("Parent")
class Parent {

    public  static void main(String[] args) {
        Parent parent = new Parent();
        DataAnn annotation = parent.getClass().getAnnotation(DataAnn.class);
        System.out.println(annotation.num() + "--" + annotation.str());
    }
}
