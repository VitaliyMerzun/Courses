class Increaser extends Thread{

    public Resource val;

    public int count = 0;

    public boolean fastInc = false;

    public Increaser(Resource i){ this.val=i; }

    public Increaser(Resource i, boolean fastInc){ this.val=i; this.fastInc = true;}


    public void run(){
        for (int i = 1; i < 1000; i++) {
            synchronized (val) {
                if (fastInc) {
                    val.increas();
                    System.out.println("Поток " + getId() + " увеличивает до: " + val.res);
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (i > 5)
                        break;
                }
                else {
                    while (val.res>=5) {
                        try {
                            val.wait();
                        }
                        catch (InterruptedException e) {
                        }
                    }
                    val.increas();
                    System.out.println("Увеличенно до: " + val.res);
                    val.notify();
                    if (val.res > 4){
                        count++;
                        if(count > 4) {
                            System.out.println("|Увеличенно до 5 " + count + " раз|");
                            break;
                        }
                    }
                }
            }
        }
    }
}
