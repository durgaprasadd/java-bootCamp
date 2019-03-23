package com.bootCamp.logger;

public class Console implements Loggable {

    @Override
    public String log(String text) {
        return "Console : " + text;
    }
}
