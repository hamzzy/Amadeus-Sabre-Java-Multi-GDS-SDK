package utils;


import dto.HttpResponseDto;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by Igbalajobi Jamiu O. on 4/15/2016.
 */
public class HttpPost {
    private static final String USER_AGENT = "travelden-http-agent";

    public static HttpResponseDto reqDataPost(String url, String postData, Map<String, String> headers) {
        System.out.println(postData);
        String response = "";
        int statusCode = 0;
        try {
            URL connUrl = new URL(url);
            HttpsURLConnection urlConnection = (HttpsURLConnection) connUrl.openConnection();
            headers.forEach(urlConnection::addRequestProperty);
            // do post request
            urlConnection.setDoOutput(true);
            urlConnection.setConnectTimeout(60 * 1000);
            urlConnection.setReadTimeout(60 * 1000);
            // write request content
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(urlConnection.getOutputStream());
            outputStreamWriter.write(postData);
            outputStreamWriter.close();
            // read response content
            statusCode = urlConnection.getResponseCode();
            System.out.println("Status:" + urlConnection.getResponseCode());
            if (statusCode != 500) {
                InputStream inputStream = urlConnection.getInputStream();
                String line;
                StringBuilder resultBuffer = new StringBuilder();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader);
                while ((line = reader.readLine()) != null) {
                    resultBuffer.append(line);
                }
                response = resultBuffer.toString();
            }
            System.out.println(response + "\n\n");
            return new HttpResponseDto(urlConnection.getResponseCode(), response, urlConnection.getHeaderFields(), "");
        } catch (Exception e) {
            e.printStackTrace();
            return new HttpResponseDto(statusCode, response, null, "");
        }
    }

    public static HttpResponseDto reqDataGet(String endpoint, Map<String, String> header) {
        try {
            URL url = new URL(endpoint);

            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", USER_AGENT);
            header.forEach(connection::setRequestProperty);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("GET");
            InputStream ins = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(ins);
            BufferedReader in = new BufferedReader(isr);

            StringBuilder resultBuffer = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                resultBuffer.append(line);
            }
            in.close();
            String response = new String(resultBuffer.toString().getBytes("UTF-8"));
            return new HttpResponseDto(connection.getResponseCode(), response, connection.getHeaderFields(), "");
        } catch (Exception e) {
            e.printStackTrace();
            return new HttpResponseDto(500, "", null, "");
        }
    }
}
