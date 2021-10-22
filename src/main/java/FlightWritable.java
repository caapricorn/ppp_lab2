import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightWritable {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/caapricorn/ppp_lab2/664600583_T_ONTIME_sample.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Flight> flightList = new ArrayList<>();
        reader.readLine();
        char dm = (char) 34;
        while ((line = reader.readLine()) != null) {
            Flight flight = new Flight();
            scanner = new Scanner(line);
            scanner.useDelimiter(dm + "," + dm);
            while (scanner.hasNext()) {
                String data = scanner.next();
                data = data.substring(1, data.length() - 1);
                if (index == 15) flight.setDEST_AEROPORT_ID(Integer.parseInt(data));
                else if (index == 1) airport.setDescription(data);
                else System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            airportList.add(airport);
        }
        reader.close();
        System.out.println(airportList);
    }
}
