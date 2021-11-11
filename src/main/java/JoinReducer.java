import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<JoinWritableComparable, Text, Text, Text{
    @Override
    protected void reduce(JoinWritableComparable key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        //long count=0;
        Iterator<Text> iter = values.iterator();
        Text airport_name = new Text("Airport name: " + iter.next().toString());
        float sum = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        while(iter.hasNext()) {
            float delay = Float.parseFloat(iter.next().toString());
            
        }
        context.write(key, new LongWritable(count));
    }
}
