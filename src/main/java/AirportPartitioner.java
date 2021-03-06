import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<JoinWritableComparable, Text> {
    @Override
    public int getPartition(JoinWritableComparable key, Text value, int i) {
        return (key.getAirportId() & Integer.MAX_VALUE) % i;
    }
}
