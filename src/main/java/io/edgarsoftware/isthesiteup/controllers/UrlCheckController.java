package io.edgarsoftware.isthesiteup.controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {
    private final String SITE_IS_UP = "Site is up!";
    private final String SITE_IS_DOWN = "Site is down!";
    private final String INCORRECT_URL = "URL is incorrect!";

    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url) {
        String returnMessage = "";
        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCodeCategory = connection.getResponseCode() / 100;
            System.out.println("ZERO" + connection.getResponseCode());
            if (responseCodeCategory < 2 || responseCodeCategory > 3) {
                returnMessage = SITE_IS_DOWN;
                System.out.println("FIRST" + returnMessage);
            } else {
                returnMessage = SITE_IS_UP;
                System.out.println("SECOND" + returnMessage);
            }
        } catch (MalformedURLException e) {
            returnMessage = INCORRECT_URL;
            System.out.println("THIRD" + returnMessage);
        } catch (IOException e) {
            returnMessage = SITE_IS_DOWN;
            System.out.println("FOURTH" + returnMessage);
        }
        return returnMessage;
    }

}
