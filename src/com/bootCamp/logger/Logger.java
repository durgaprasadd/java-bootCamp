package com.bootCamp.logger;

class Logger {
    private Loggable loggable;

    Logger(Loggable loggable) {
        this.loggable = loggable;
    }

    String log(String text) {
        return this.loggable.log(text);
    }
}
