@Weekday(weekday = 3)
class Heir1 extends Parent {

    @DataAnn(hour = 12, n = 7734, str = "12asd")
    public void myMethod1(int num, int hour, String str) {
        System.out.print("myMethod1 in Heir1: " + " priority = " + num + " hour =  " + hour + " str = " + str + " | ");
        this.dataContainer.num = hour;
        this.dataContainer.str = str;
        System.out.print(dataContainer.toString() + " | ");
    }

    @DataAnn(hour = 12, n = 11111, str = "12asd")
    public void myMethod2(int num, int hour, String str) {
        System.out.print("myMethod2 in Heir1: " + " priority = " + num + " hour =  " + hour + " str = " + str + " | ");
        this.dataContainer.num = hour;
        this.dataContainer.str = str;
        System.out.print(dataContainer.toString() + " | ");
    }

    @DataAnn(hour = 2, n = 1, str = "Three")
    public void myMethod3(int num, int hour, String str) {
        System.out.print("myMethod3 in Heir1: " + " priority = " + num + " hour =  " + hour + " str = " + str + " | ");
        this.dataContainer.num = hour;
        this.dataContainer.str = str;
        System.out.print(dataContainer.toString() + " | ");
    }

}