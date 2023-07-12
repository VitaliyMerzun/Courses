class Increaser extends Thread {
    private Resource val;
    private int count = 0;
    private boolean fastInc = false;

    public Increaser(Resource val) {
        this.val = val;
    }

    public Increaser(Resource val, boolean fastInc) {
        this.val = val;
        this.fastInc = fastInc;
    }

    public void setFastInc(boolean fastInc) {
        this.fastInc = fastInc;
    }

    public void run() {
        for (int i = 1; i < 1000; i++) {
            synchronized (val) {
                if (fastInc) {
                    ResourceProcessor.increas(val);
                    System.out.println("Поток " + getId() + " увеличивает до: " + val.res);
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (i > 5) {
                        break;
                    }
                } else {
                    while (val.res >= 5) {
                        try {
                            val.wait();
                        } catch (InterruptedException e) {
                            // Обработка исключения прерывания
                        }
                    }
                    ResourceProcessor.increas(val);
                    System.out.println("Увеличено до: " + val.res);
                    val.notify();
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
    }
}