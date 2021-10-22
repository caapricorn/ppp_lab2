import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportWritable {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/caapricorn/ppp_lab2/L_AIRPORT_ID.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Airport> airportList = new ArrayList<>();
        reader.readLine();
        char dm = (char) 34;
        while ((line = reader.readLine()) != null) {
            Airport airport = new Airport();
            scanner = new Scanner(line);
            scanner.useDelimiter(dm + "," + dm);
            while (scanner.hasNext()) {
                String data = scanner.next();
                data = data.substring(1, data.length() - 1);
                if (index == 0) airport.setCode(Integer.parseInt(data));
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
