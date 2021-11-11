import org.apache.hadoop.io.WritableComparable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class JoinWritableComparable implements WritableComparable<JoinWritableComparable>{
    private int airportId;
    private boolean indicator;

    JoinWritableComparable(int airportId, boolean indicator) {
        this.airportId = airportId;
        this.indicator = indicator;
    }

    public int getAirportId() {
        return airportId;
    }

    public boolean getIndicator() {
        return indicator;
    }

    @Override
    public void readFields(DataInput input) throws IOException {
        airportId = input.readInt();
        indicator = input.readBoolean();
    }

    @Override
    public void write(DataOutput output) throws IOException {
        output.writeInt(airportId);
        output.writeBoolean(indicator);
    }

    @Override
    public int compareTo(JoinWritableComparable a) {
        if (this.airportId - a.airportId != 0)
    }
}
