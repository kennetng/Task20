package no.noroff.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.noroff.models.*;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@Component
public class DataCollector {
    public static String requestURL(String url){
        final URLConnection connection;
        final BufferedReader buffer;
        final StringBuilder stringBuilder = new StringBuilder();
        try{
            connection = new URL(url).openConnection();

            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

            connection.connect();

            buffer = new BufferedReader(new InputStreamReader((connection.getInputStream())));

            String line;
            while((line = buffer.readLine()) != null) {
                stringBuilder.append(line);
            }
        }catch(MalformedURLException e){
            System.out.println(e.toString());
        }catch(IOException e){
            System.out.println(e.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }

        return stringBuilder.toString();
    }

    public RandomJoke findRandomJoke(){
        final String url = "https://official-joke-api.appspot.com/random_joke";
        final Gson gson = new GsonBuilder().create();
        final RandomJoke randomJoke = gson.fromJson(requestURL(url), RandomJoke.class);

        return randomJoke;
    }

    public DadJoke findDadJoke() {
        final String url = "https://icanhazdadjoke.com/slack";
        final Gson gson = new GsonBuilder().create();
        final DadJoke dadJoke = gson.fromJson(requestURL(url), DadJoke.class);

        return dadJoke;
    }

    public Advice findAdvice() {
        final String url = "https://api.adviceslip.com/advice";
        final Gson gson = new GsonBuilder().create();
        final Advice advice = gson.fromJson(requestURL(url), Advice.class);

        return advice;
    }

    public Quote[] findQuote() {
        final String url = "http://quotesondesign.com/wp-json/posts?filter[orderby]=rand&filter[posts_per_page]=1";
        final Gson gson = new GsonBuilder().create();
        final Quote quote[] = gson.fromJson(requestURL(url), Quote[].class);
        System.out.println(quote.toString());
        return quote;
    }
}
