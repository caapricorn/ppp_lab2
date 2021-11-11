import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, JoinWritableComparable, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
        if (key.get() > 0) {
            String line = value.toString();
            Airport airport = Airport.parse(line);
            context.write(
                    new JoinWritableComparable(airport.getCode(), false),
                    new Text(airport.getDescription())
            );
        }
    }
}
