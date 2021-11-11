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
    String[] list = new String[2];
    count = csv.indexOf(",");
    list[0] = csv.substring(0, count).replaceAll();
    list[1] = csv.substring(count + 1);
    }

//    @Override
//    public String toString() {
//        return "\nCode=" + getCode() + "::Description=" + getDescription();
//    }
}
