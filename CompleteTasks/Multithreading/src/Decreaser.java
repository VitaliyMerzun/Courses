class Decreaser implements Runnable {
    private Resource val;
    private int count = 0;

    public Decreaser(Resource val) {
        this.val = val;
    }

    public void run() {
        for (int i = 1; i < 1000; i++) {
            ResourceProcessor.decreas(val);
            if (val.res < 1) {
                count++;
                if (count > 4) {
                    System.out.println("|Уменьшено до 0 " + count + " раз|");
                    break;
                }
            }
        }
    }
}