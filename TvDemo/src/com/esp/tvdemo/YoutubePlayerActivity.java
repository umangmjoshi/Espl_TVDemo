package com.esp.tvdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

@SuppressLint("SetJavaScriptEnabled")
public class YoutubePlayerActivity extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {
	// get string video url
	private String videoUrl;
	// Developer key
	static private final String DEVELOPER_KEY = "AIzaSyDUtCTvUDzvxOw8oGC6GPttHRk1IDP-duY";
	// dialog recovery request
	private static final int RECOVERY_DIALOG_REQUEST = 1;
	//
	private YouTubePlayerView youTubeView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.youtubeplayer);

		//videoUrl = getIntent().getExtras().getString("VIDEOURL");

//		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
//		youTubeView.initialize(DEVELOPER_KEY, YoutubePlayerActivity.this);
		
		
		/** Initializing YouTube player view **/
		youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
		youTubeView.initialize(DEVELOPER_KEY, this);
		
//		Intent videoIntent = YouTubeStandalonePlayer
//				.createVideoIntent(this, DEVELOPER_KEY,
//						"sjOfxnlGAF4", 0, true, false);
//
//		startActivityForResult(videoIntent, RECOVERY_DIALOG_REQUEST);
	}

//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
//	{
//		super.onActivityResult(requestCode, resultCode, data);
//		
//		if (requestCode == RECOVERY_DIALOG_REQUEST && resultCode != RESULT_OK)
//		{
//			YouTubeInitializationResult errorReason = YouTubeStandalonePlayer
//					.getReturnedInitializationResult(data);
//			if (errorReason.isUserRecoverableError()) {
//				errorReason.getErrorDialog(this, 0).show();
//			} else {
//				String errorMessage = String.format("PLAYER ERROR!!",
//						errorReason.toString());
//				Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
//			}
//		}
//	}

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onInitializationSuccess(Provider provider, YouTubePlayer player,
			boolean wasRestored) {
		
		/** add listeners to YouTubePlayer instance **/
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playbackEventListener);

		/** Start buffering **/
		if (!wasRestored) {
			player.cueVideo("sjOfxnlGAF4");
		}
	}
	
	private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {

		@Override
		public void onBuffering(boolean arg0) {

		}

		@Override
		public void onPaused() {

		}

		@Override
		public void onPlaying() {

		}

		@Override
		public void onSeekTo(int arg0) {

		}

		@Override
		public void onStopped() {

		}

	};

	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {

		@Override
		public void onAdStarted() {

		}

		@Override
		public void onError(ErrorReason arg0) {

		}

		@Override
		public void onLoaded(String arg0) {

		}

		@Override
		public void onLoading() {
		}

		@Override
		public void onVideoEnded() {

		}

		@Override
		public void onVideoStarted() {

		}
	};
	
//	@Override
//	public void onInitializationFailure(Provider provider,
//			YouTubeInitializationResult error) {
//		if (error.isUserRecoverableError()) {
//			error.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
//		} else {
//			String errorMessage = String.format(
//					"There was an error initializing the YouTubePlayer",
//					error.toString());
//			Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
//
//			// When video not found it shows the error and let the user choose
//			// its way to open the video
////			startActivity(new Intent(Intent.ACTION_VIEW,
////					Uri.parse("http://www.youtube.com/watch?v=" + videoUrl)));
//			startActivity(new Intent(Intent.ACTION_VIEW,
//					Uri.parse("http://youtu.be/9cP2DIn620c")));
//		}
//	}
//
//	@Override
//	public void onInitializationSuccess(Provider provider,
//			YouTubePlayer player, boolean wasRestored)
//	{
////		if (!wasRestored)
////			YPlayer = player;
//		try
//		{
//			player.loadVideo(videoUrl);
//		}
//		catch (Exception e)
//		{
//		}
//	}
//
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		if (requestCode == RECOVERY_DIALOG_REQUEST) {
//			getYouTubePlayerProvider().initialize(DEVELOPER_KEY, this);
//		}
//	}
//
//	protected YouTubePlayer.Provider getYouTubePlayerProvider()
//	{
//		return (YouTubePlayerView) findViewById(R.id.youtube_view);
//	}
}