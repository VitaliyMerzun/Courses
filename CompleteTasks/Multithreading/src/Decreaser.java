class Decreaser implements Runnable{
    private Resource val;
    private int count = 0;

    public Decreaser(Resource i){ this.val=i; }

    public void run(){
        for (int i = 1; i < 1000; i++) {
            synchronized (val) {
                while (val.res<1) {
                    try {
                        val.wait();
                    }
                    catch (InterruptedException e) {
                    }
                }
                ResourceProcessor.decreas(val);
                System.out.println("Уменьшенно до: " + val.res);
                val.notify();
                if (val.res < 1){
                    count++;
                    if(count > 4) {
                        System.out.println("|Уменьшенно до 0 " + count + " раз|");
                        break;
                    }
                }
            }
        }
    }
}