import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
        if (key.get() > 0) {
            String line = value.toString();
            Airport airport = Airport.parse(line);
            //String[] words = line.split("[\\p{Punct}\\p{Space}—]");

            context.write(
                    new Text(word), new IntWritable(1));
        }
    }
}
