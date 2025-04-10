package MISport;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String user = "1187080394";
        String pass = "123456@qqq";
        int count = 31415;
        String apiUrl = "http://api.mmp.cc/api/ZeppLife?user=" + user + "&pass=" + pass + "&count=" + count;

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JSONObject jsonResponse = new JSONObject(response.toString());
                System.out.println(jsonResponse);
            } else {
                System.out.println("failed respcode " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
