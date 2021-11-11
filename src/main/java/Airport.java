public class Airport {
    private int code;
    private String description;

    Airport(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Airport parse(String csv) {
    int count = 0;
    String [] list;
    count = csv.indexOf(",");
    }

//    @Override
//    public String toString() {
//        return "\nCode=" + getCode() + "::Description=" + getDescription();
//    }
}
