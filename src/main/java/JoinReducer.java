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
        
//        while(iter.hasNext()) {
//            iter.next();
//            count++;
//        }
        context.write(key, new LongWritable(count));
    }
}
