public class Flight {
    private int DEST_AEROPORT_ID;
    private double ARR_DELAY;
    private double ARR_DELAY_NEW;

    Flight(int DEST_AEROPORT_ID, double ARR_DELAY, double ARR_DELAY_NEW) {
        this.DEST_AEROPORT_ID = DEST_AEROPORT_ID;
        this.ARR_DELAY = ARR_DELAY;
        this.ARR_DELAY_NEW = ARR_DELAY_NEW;
    }

    public int getDEST_AEROPORT_ID() {
        return DEST_AEROPORT_ID;
    }

    //public void setDEST_AEROPORT_ID(int DEST_AEROPORT_ID) {
    //    this.DEST_AEROPORT_ID = DEST_AEROPORT_ID;
    //}

    public double getARR_DELAY() {
        return ARR_DELAY;
    }

    //public void setARR_DELAY(double ARR_DELAY) {
    //    this.ARR_DELAY = ARR_DELAY;
    //}

    public double getARR_DELAY_NEW() {
        return ARR_DELAY_NEW;
    }

    //public void setARR_DELAY_NEW(double ARR_DELAY_NEW) {
    //    this.ARR_DELAY_NEW = ARR_DELAY_NEW;
    //}

    public static Flight parse(String csv) {
        String[] list = new String[3];
        for (int i = 0; i < 14; i++) {
            int count = csv.indexOf(",");
            csv = csv.substring(0, count + 1);
        }
        int count = csv.indexOf(",");
        list[0] = csv.substring(0, count);
        for (int i = 0; i < 3; i++) {
            int cnt = csv.indexOf(",");
            csv = csv.substring(0, count + 1);
        }
        list[1] = csv.substring(0, count);
        count = csv.indexOf(",");
        csv = csv.substring(0, count + 1);
        list[2] = csv.substring(0, count);
    }

//    @Override
//    public String toString() {
//        return "\nDEST_AEROPORT_ID=" + getDEST_AEROPORT_ID() + "::ARR_DELAY=" + getARR_DELAY() + "::ARR_DELAY_NEW=" + getARR_DELAY_NEW();
//    }
}
