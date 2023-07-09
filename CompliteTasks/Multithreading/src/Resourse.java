class Resource{

    public int res=0;

    public synchronized void decreas() {
        res--;
    }

    public synchronized void increas() {
        res++;
    }
}