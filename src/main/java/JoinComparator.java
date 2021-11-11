import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class JoinComparator extends WritableComparator {
    public JoinComparator() {
        super(JoinWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        JoinWritableComparable o1 = (JoinWritableComparable) a;
        JoinWritableComparable o2 = (JoinWritableComparable) b;
        return o1.getAirportId() - o2.getAirportId();
    }
}
