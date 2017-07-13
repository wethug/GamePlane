package com.ispring.gameplane.game;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by wangbicong on 2017/7/12.
 */



public class ScoreRank {

    private SharedPreferences mSharedPreferences;
    private Context context;

    public ScoreRank(Context context){
        this.context = context;
        this.mSharedPreferences = context.getSharedPreferences("SP", 0);

    }

}
