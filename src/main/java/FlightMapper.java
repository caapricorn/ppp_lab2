import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, JoinWritableComparable, Text>{
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
        if (key.get() > 0) {
            String line = value.toString();
            Flight flight = Flight.parse(line);
            if (flight.getARR_DELAY() > 0) {
                context.write(
                        new JoinWritableComparable(flight.getDEST_AEROPORT_ID(), true),
                        new Text(String.valueOf(flight.getARR_DELAY()))
                );
            }
        }
    }
}
