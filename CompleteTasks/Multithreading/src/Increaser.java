class Increaser extends Thread {
    private Resource val;
    private int count = 0;

    public Increaser(Resource val) {
        this.val = val;
    }

    public void run() {
        for (int i = 1; i < 1000; i++) {
            ResourceProcessor.increas(val);
            if (val.res > 4) {
                count++;
                if (count > 4) {
                    System.out.println("|Увеличено до 5 " + count + " раз|");
                    break;
                }
            }
        }
    }
}