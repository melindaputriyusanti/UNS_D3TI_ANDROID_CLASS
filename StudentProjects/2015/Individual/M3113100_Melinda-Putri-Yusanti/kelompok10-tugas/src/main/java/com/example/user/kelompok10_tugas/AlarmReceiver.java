package com.example.user.kelompok10_tugas;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by User on 12/23/2015.
 */
public class AlarmReceiver extends BroadcastReceiver {
    MediaPlayer player;

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Toast.makeText(context, "Alarm aktif!", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(context, R.raw.alarm);
        player.start();
    }

}