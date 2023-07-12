@Weekday(weekday = 1)
class Parent {
    public DataContainer dataContainer = new DataContainer();

    Parent() {

    }

    Parent(int i1, String s) {
        dataContainer.num = i1;
        dataContainer.str = s;
    }
}
