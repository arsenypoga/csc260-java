package com.nku.csc260.SeventhWeek.Assign22;

/**
 * @author Arseny
 * @since 8/24/2017
 */
public class Time {

    private long _seconds;
    private long _minutes;
    private long _hours;

    Time () {
        long totalSeconds = System.currentTimeMillis() / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        this._seconds = totalSeconds % 60;
        this._minutes = totalMinutes % 60;
        this._hours = totalHours % 24;
    }

    Time (long seconds, long minutes, long hours) {
        this._seconds = seconds;
        this._minutes = minutes;
        this._hours = hours;
    }
    /*
    // Elapsed time constructor

    Time (long elapsedTime) {
        this._seconds = elapsedTime * 1000;
        this._minute = this._seconds * 60;
        this._hour = this._minute * 60;
    }

    */

    public long getSeconds() {
        return this._seconds;
    }

    public long getMinutes() {
        return this._minutes;
    }

    public long getHours() {
        return this._hours;
    }

}
