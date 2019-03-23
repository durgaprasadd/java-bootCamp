package com.bootCamp.logger;

public class Logfile implements Loggable {
    @Override
    public String log(String text) {
        return "Logfile : " + text;
    }
}
