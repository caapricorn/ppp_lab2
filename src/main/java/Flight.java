public class Flight {
    private int DEST_AEROPORT_ID;
    private double ARR_DELAY;

    Flight(int DEST_AEROPORT_ID, double ARR_DELAY) {
        this.DEST_AEROPORT_ID = DEST_AEROPORT_ID;
        this.ARR_DELAY = ARR_DELAY;
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

    public static Flight parse(String csv) {
        String[] list = new String[2];
        for (int i = 0; i < 14; i++) {
            int count = csv.indexOf(",");
            csv = csv.substring(count + 1);
        }
        int count = csv.indexOf(",");
        list[0] = csv.substring(0, count);
        for (int i = 0; i < 3; i++) {
            int cnt = csv.indexOf(",");
            csv = csv.substring(cnt + 1);
        }
        count = csv.indexOf(",");
        list[1] = csv.substring(0, count);
        csv = csv.substring(count + 1);
        count = csv.indexOf(",");
        //list[2] = csv.substring(0, count);
        if (list[1].length() == 0) list[1] = "0";
        //if (list[2].length() == 0) list[2] = "0";
        return new Flight(Integer.parseInt(list[0]), Float.parseFloat(list[1]));
    }

//    @Override
//    public String toString() {
//        return "\nDEST_AEROPORT_ID=" + getDEST_AEROPORT_ID() + "::ARR_DELAY=" + getARR_DELAY() + "::ARR_DELAY_NEW=" + getARR_DELAY_NEW();
//    }
}
