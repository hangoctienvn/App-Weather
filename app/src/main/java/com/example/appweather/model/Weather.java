package com.example.appweather.model;

public class Weather {

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public com.example.appweather.model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.appweather.model.Temperature temperature) {
        Temperature = temperature;
    }

    private String DateTime;
    private int WeatherIcon;
    private String IconPhrase;
    private Temperature Temperature;


}
