package br.com.thindroid.commons.log;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlos.araujo on 14/11/2014.
 */
public enum LogLevel {
    VERBOSE(Log.VERBOSE), DEBUG(Log.DEBUG), INFORMATION(Log.INFO), WARNING(Log.WARN), ERROR(Log.ERROR);

    private int priority;

    private LogLevel(int priority) {
        this.priority = priority;
    }

    public List<LogLevel> getAssociatedLevelsSet() {
        List<LogLevel> associatedLevels = new ArrayList<>();
        boolean findThisLevelOnList = false;
        for(LogLevel logLevel : LogLevel.values()){
            if(this.equals(logLevel)){
                findThisLevelOnList = true;
            }
            if(findThisLevelOnList){
                associatedLevels.add(logLevel);
            }
        }
        return associatedLevels;
    }

    public int getPriority() {
        return priority;
    }
}
