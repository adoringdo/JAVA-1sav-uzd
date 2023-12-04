package Homework.savD2;

import java.util.Random;

public class GeoLocation {
    static Random random = new Random();
    //private final GeoLocation test;
    private double lat;
    private double lon;

    private static int numLocations;

    public GeoLocation(){
        this.lat = (double)Math.round((Math.random()*(89-(-90)+1)+(-90)) * 1000000)/1000000;
        this.lon = (double)Math.round((Math.random()*(89-(-90)+1)+(-90)) * 1000000)/1000000;
        numLocations++;
    }

    public GeoLocation(double givenLat, double givenLon) {
        this.lat = givenLat;
        this.lon = givenLon;
        numLocations++;
    }

    public GeoLocation(GeoLocation info) {
        this.lat = (double)Math.round((info.lat+(((Math.random()*(0.1-(-0.1)+1)+(-0.1)))))*1000000)/1000000;
        this.lon = (double)Math.round((info.lon+(((Math.random()*(0.1-(-0.1)+1)+(-0.1)))))*1000000)/1000000;
        numLocations++;
    }

    public void print(){
        System.out.println("[" + lat + ", " + lon + "]");
    }

    public static double distance(GeoLocation first, GeoLocation second){
        double lat1 = first.lat;
        double lat2 = second.lat;
        double lon1 = first.lon;
        double lon2 = second.lon;

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);


        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);


        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return Math.floor((rad * c) * 10) / 10.0;
    }

    public static int getNumLocations(){
        return numLocations;
    }
}
