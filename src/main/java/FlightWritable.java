import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FlightWritable {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/caapricorn/ppp_lab2/664600583_T_ONTIME_sample.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Flight> flightList = new ArrayList<>();
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            Flight flight = new Flight();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 14 && !Objects.equals(data, "")) flight.setDEST_AEROPORT_ID(Integer.parseInt(data));
                else if (index == 17 && !Objects.equals(data, "")) flight.setARR_DELAY(Double.parseDouble(data));
                else if (index == 18 && !Objects.equals(data, "")) flight.setARR_DELAY_NEW(Double.parseDouble(data));
                //else System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            flightList.add(flight);
        }
        reader.close();
        System.out.println(flightList);
    }
}
