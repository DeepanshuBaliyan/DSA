package Hashing;

import java.util.HashMap;

public class ItineraryOfTicket {
    public static String getStart(HashMap<String,String>ticket){

    }
    public static void main(String[] args) {
        HashMap<String , String> ticket = new HashMap<>();
        ticket.put("Chennai" , "Bengluru");
        ticket.put("Mumbai" , " Delhi");
        ticket.put("Goa" , "Chennai");
        ticket.put("Delhi" , "Goa");

        String start = getStart(ticket); 
    }
}
