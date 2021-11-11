import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class JoinComparator extends WritableComparator {
    public JoinComparator() {
        super(JoinWritableComparable.class, true);
    }

    @Override
    
}
