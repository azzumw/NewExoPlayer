package com.example.macintosh.newexoplayer;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

public class MainActivity extends AppCompatActivity {

    private PlayerView mPlayerView;
    private SimpleExoPlayer player;

    private final String PATH = "file:///android_asset/videoplayback.mp4";

    int currentWindow;
    long playBackPosition;
    private boolean autoPlay = false;

    public static final String AUTOPLAY = "autoplay";
    public static final String CURRENT_WINDOW_INDEX = "current_window_index";
    public static final String PLAYBACK_POSITION = "playback_position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyFragment  myFragment = new MyFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().add(R.id.fragmentContainerFLMasterAct,myFragment).commit();

//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE && PATH.length()>0){
//
//            hideSystemUI();
//        }

//        if(savedInstanceState!= null){
//
//            currentWindow = savedInstanceState.getInt(CURRENT_WINDOW_INDEX);
//            playBackPosition = savedInstanceState.getLong(PLAYBACK_POSITION);
//            autoPlay = savedInstanceState.getBoolean(AUTOPLAY);
//        }
//
//        setContentView(R.layout.activity_main);
//        mPlayerView = findViewById(R.id.playerview);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        initialisePlayer();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        autoPlay = false;
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        releasePlayer();
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        if(player==null){
//            outState.putInt(CURRENT_WINDOW_INDEX,currentWindow);
//            outState.putLong(PLAYBACK_POSITION,playBackPosition);
//            outState.putBoolean(AUTOPLAY,autoPlay);
//        }
//    }
//
//    private void initialisePlayer(){
//        Uri uri = Uri.parse(PATH);
//
//        //create exoplayer object
//        BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
//
//        TrackSelection.Factory videoTrackSelectionFactory = new AdaptiveTrackSelection.Factory(bandwidthMeter);
//        TrackSelector trackSelector = new DefaultTrackSelector(videoTrackSelectionFactory);
//        player = ExoPlayerFactory.newSimpleInstance(this,trackSelector);
//
//        MediaSource mediaSource = buildMediaSource(uri);
//        player.prepare(mediaSource);
//        //attach the player to the view
//        mPlayerView.setPlayer(player);
//        player.seekTo(currentWindow,playBackPosition);
//        player.setPlayWhenReady(autoPlay);
//
//    }
//
//    private MediaSource buildMediaSource(Uri uri) {
//        DefaultExtractorsFactory extractorSourceFactory = new DefaultExtractorsFactory();
//        String userAgent = Util.getUserAgent(this, getApplicationContext().getApplicationInfo().packageName);
//        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this, userAgent);
//        return new ExtractorMediaSource(uri, dataSourceFactory, extractorSourceFactory, null, null);
//    }
//
//    private void releasePlayer(){
//        currentWindow = player.getCurrentWindowIndex();
//        playBackPosition = player.getCurrentPosition();
//        autoPlay = player.getPlayWhenReady();
//        player.release();
//        player = null;
//    }
//
//    private void hideSystemUI() {
//        // Enables regular immersive mode.
//        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
//        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//        View decorView = getWindow().getDecorView();
//        decorView.setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_IMMERSIVE
//                        // Set the content to appear under the system bars so that the
//                        // content doesn't resize when the system bars hide and show.
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                        // Hide the nav bar and status bar
//                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
//                        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
//                            @Override
//                            public void onSystemUiVisibilityChange(int visibility) {
//                                if(visibility == 6){
//                                    hideSystemUI();
//                                }else showSystemUI();
//                            }
//                        });
//    }
//
//
//
//
//    private void showSystemUI() {
//        View decorView = getWindow().getDecorView();
//        decorView.setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//    }
}
