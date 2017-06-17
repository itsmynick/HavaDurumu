package ana;


import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * Created by mco on 20.05.2017.
 */
public class main {
    OpenWeatherMap owm;
    CurrentWeather cwd;
    public main(){
        owm = new OpenWeatherMap("0ccf9a4e735147733735069b1680e632");
        cwd = owm.currentWeatherByCityCode(314967);
    }


    public static void main(String[] args) throws IOException {

        main weather=new main();



        System.out.println("City: " + weather.cwd.getCityName());

        System.out.println("Temperature: " + weather.cwd.getMainInstance().getTemperature() + "\'F");
        double celsius = (5.0/9.0)*(weather.cwd.getMainInstance().getTemperature() - 32);
        System.out.printf("Temperature: %.2f C \n ",celsius);
        System.out.println(weather.cwd.getMainInstance().getHumidity());
        System.out.println(weather.cwd.getCityCode());
        System.out.println(weather.cwd.getDateTime());




    }
}
