import org.apache.hadoop.io.WritableComparable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class JoinWritableComparable implements WritableComparable<JoinWritableComparable>{
    private int airportId;
    private boolean indicator;
}
