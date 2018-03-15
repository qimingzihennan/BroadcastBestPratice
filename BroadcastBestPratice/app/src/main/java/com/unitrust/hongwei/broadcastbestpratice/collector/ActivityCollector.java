package com.unitrust.hongwei.broadcastbestpratice.collector;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongwei on 2018/3/15.
 */

public class ActivityCollector extends AppCompatActivity {

    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity){
        activityList.add(activity);

    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void  finishAll(){
        for (Activity activity:activityList){
            if (!activity .isFinishing()){
                activity.finish();
            }

        }
    }
}
