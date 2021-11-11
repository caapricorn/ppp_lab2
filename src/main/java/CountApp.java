import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class CountApp {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: CountApp <airport> <flight> <output>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(CountApp.class);
        job.setJobName("Count App");

        MultipleInputs.addInputPath(job, new Path());

        FileOutputFormat.setOutputPath(job, new Path(args[2]));
        //job.setMapperClass(WordMapper.class);
        //job.setReducerClass(WordReducer.class);
        //job.setOutputKeyClass(Text.class);
        //job.setOutputValueClass(IntWritable.class);
        //job.setNumReduceTasks(2);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
