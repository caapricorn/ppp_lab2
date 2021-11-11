import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<JoinWritableComparable, Text, Text, Text{
    @Override
    protected void reduce(JoinWritableComparable key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text airport_name = new Text("Airport name: " + iter.next().toString());
        float sum = 0.0f;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        float count = 0.0f;
        while(iter.hasNext()) {
            float delay = Float.parseFloat(iter.next().toString());
            max = Math.max(max, delay);
            min = Math.min(min, delay);
            sum += delay;
            count++;
        }
        context.write(
                airport_name,
                new Text("Average: " + )
        );
    }
}
