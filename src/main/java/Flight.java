public class Flight {
    private String DEST_AEROPORT_ID;
    private int ARR_DELAY;
    private int ARR_DELAY_NEW;

    public String getDEST_AEROPORT_ID() {
        return DEST_AEROPORT_ID;
    }

    public void setDEST_AEROPORT_ID(String DEST_AEROPORT_ID) {
        this.DEST_AEROPORT_ID = DEST_AEROPORT_ID;
    }

    public int getARR_DELAY() {
        return ARR_DELAY;
    }

    public void setARR_DELAY(int ARR_DELAY) {
        this.ARR_DELAY = ARR_DELAY;
    }

    public int getARR_DELAY_NEW() {
        return ARR_DELAY_NEW;
    }

    public void setARR_DELAY_NEW(int ARR_DELAY_NEW) {
        this.ARR_DELAY_NEW = ARR_DELAY_NEW;
    }

    @Override
    public String toString() {
        return "\nDEST_AEROPORT_ID=" + getDEST_AEROPORT_ID() + "::ARR_DELAY=" + getARR_DELAY() + "::ARR_DELAY_NEW=" + getARR_DELAY_NEW();
    }
}
