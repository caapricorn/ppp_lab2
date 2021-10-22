import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportWritable {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("L_AIRPORT.csv"));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Airport> airportList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            Airport airport = new Airport();
            scanner = new Scanner(line);
            scanner.useDelimiter()
        }
    }
}
