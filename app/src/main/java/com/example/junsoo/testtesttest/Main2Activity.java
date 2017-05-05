package com.example.junsoo.testtesttest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;

import static android.R.id.button2;

public class Main2Activity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final int RECOVERY_DIALOG_REQUEST = 1;
    private YouTubePlayerView youTubeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);

        // Initializing video player with developer key
        youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);

        ImageButton button;
        final ImageButton button_after;
        final ImageButton button_after_after;
        final ImageView iv;
        button = (ImageButton)findViewById(R.id.button1);
        button_after = (ImageButton)findViewById(R.id.button2);
        button_after_after = (ImageButton)findViewById(R.id.button3);
        //iv = (ImageView) findViewById(R.id.imageView1);

        button.setBackgroundDrawable(null);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Drawable drawable = button_after.getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    bitmap.recycle();
                }
                button_after.setImageResource(R.drawable.after_youtube_flop);

            }

        });
        button_after.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                //iv.setImageResource(R.drawable.test1);
                //button_after_after.setBackgroundDrawable(null);
                button_after_after.setImageResource(R.drawable.after_youtube);
            }

        });
        button_after_after.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                //iv.setImageResource(R.drawable.test1);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bbia.co.kr/shop/shopdetail.html?branduid=87330"));
                startActivity(intent);
            }

        });

    }
    @Override
    public void onInitializationSuccess(Provider provider,
                                        YouTubePlayer player, boolean wasRestored) {

        if (!wasRestored) {
            //player.cueVideo("wKJ9KzGQq0w"); //video id.

            player.cueVideo("pdrn6-4sfiA");  //http://www.youtube.com/watch?v=IA1hox-v0jQ

            // Hiding player controls
            //player.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);
            //cueVideo(String videoId)
            //지정한 동영상의 미리보기 이미지를 로드하고 플레이어가 동영상을 재생하도록 준비하지만
            //play()를 호출하기 전에는 동영상 스트림을 다운로드하지 않습니다.
            //https://developers.google.com/youtube/android/player/reference/com/google/android/youtube/player/YouTubePlayer
        }
        else {
            player.cueVideo("pdrn6-4sfiA");
            //player.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);
        }
    }

    //플레이어가 초기화되지 못할 때 호출됩니다.
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
            String errorMessage = String.format(
                    getString(R.string.error_player), errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.youtube_view);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_DIALOG_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(DeveloperKey.DEVELOPER_KEY, this);
        }
    }
}
