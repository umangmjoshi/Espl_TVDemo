package com.esp.tvdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import at.technikum.mti.fancycoverflow.FancyCoverFlow;

import com.esp.adapter.FancyCoverFlowSampleAdapter;
import com.esp.bean.ListBean;
import com.esp.bean.MovieBean;

public class MainActivity extends Activity {
	// private ListView movieListview;
	private TextView tv_title;
	private HorizontalScrollView hscrol;
	private ArrayList<ListBean> mainlist = null;
	private ArrayList<MovieBean> movielist = null;
	MovieBean moviebean = null;
	ListBean listbean = null;
	//private int listIndex = 0;
	//private int movieIndex = 0;

	// CustomAdapter customAdapter = null;
	View currentSelectView;

	// private HorizontalListView movieCustomListView;

	private LinearLayout movieListView;
	FancyCoverFlow fancyCoverFlow;
	FancyCoverFlowSampleAdapter fancyCoverFlowSampleAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_main);
		// movieListview = (ListView) findViewById(R.id.movieListView);
		// movieCustomListView = (HorizontalListView)
		// findViewById(R.id.movieCustomListView);
		tv_title = (TextView) findViewById(R.id.tv_title);
		// movieCustomListView.setFocusable(true);
		// movieCustomListView.setSelected(true);
		// movieCustomListView.setSelection(0);
		// create the carousel object.
		fancyCoverFlow = (FancyCoverFlow) findViewById(R.id.fancyCoverFlow);

		// create list
		mainlist = new ArrayList<ListBean>();
		listbean = new ListBean();
		listbean.id = 1;
		listbean.title = "Top Videos";
		movielist = new ArrayList<MovieBean>();
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS";
		moviebean.image = "cover1.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS";
		moviebean.image = "cover9.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS";
		moviebean.image = "cover3.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS";
		moviebean.image = "cover4.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS";
		moviebean.image = "cover5.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		listbean.listarray = movielist;
		mainlist.add(listbean);

		listbean = new ListBean();
		listbean.id = 2;
		listbean.title = "Popular Videos";
		movielist = new ArrayList<MovieBean>();
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS11";
		moviebean.image = "cover6.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS111";
		moviebean.image = "cover7.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS111";
		moviebean.image = "cover8.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		moviebean = new MovieBean();
		moviebean.id = 1;
		moviebean.title = "FRIENDS11";
		moviebean.image = "cover9.jpg";
		moviebean.url = "https://www.youtube.com/watch?v=KgNSAXGVY8A";
		movielist.add(moviebean);
		listbean.listarray = movielist;
		mainlist.add(listbean);

		fancyCoverFlowSampleAdapter = new FancyCoverFlowSampleAdapter(
				mainlist.get(0));
		fancyCoverFlow.setAdapter(fancyCoverFlowSampleAdapter);
		tv_title.setText(mainlist.get(0).title);
		// customAdapter = new CustomAdapter(mainlist.get(0));
		// movieCustomListView.setAdapter(customAdapter);
		// movieListView.setAdapter(customAdapter);
		// set images for the carousel.

		// generateCertificateUI(mainlist.get(0));
		// tv_title.setText(mainlist.get(0).title);
		// movieListView.setFocusable(true);
		// movieListView.setOnFocusChangeListener(new OnFocusChangeListener() {
		//
		// @Override
		// public void onFocusChange(View v, boolean hasFocus) {
		// System.out.println("============= VVVVVVVVVV " + v);
		// System.out.println("============= Has focus " + hasFocus);
		// if(hasFocus)
		// {
		// v.setPadding(10, 10, 10, 10);
		// v.setBackgroundColor(Color.parseColor("#ff0000"));
		// }
		// else{
		// v.setBackgroundColor(Color.parseColor("#00000000"));
		// }
		// }
		// });

		// movieCustomListView.post(new Runnable()
		// {
		// @Override
		// public void run()
		// {
		// movieCustomListView.setSelection(0);
		// }
		// });
		//
		// movieCustomListView.setOnItemSelectedListener(new
		// OnItemSelectedListener()
		// {
		// @Override
		// public void onItemSelected(AdapterView<?> parent, View view,
		// int position, long id) {
		// System.out.println("=============== pos ===="+position);
		// System.out.println("=============== ID ===="+id);
		// }
		//
		// @Override
		// public void onNothingSelected(AdapterView<?> parent) {
		// }
		// });

		// movieListView.post(new Runnable() {
		// @Override
		// public void run() {
		// movieListView.setSelection(0);
		// }
		// });
		//
		// movieListView.setOnItemSelectedListener(new OnItemSelectedListener()
		// {
		//
		// @Override
		// public void onItemSelected(AdapterView<?> parent, View view,
		// int position, long id) {
		// if (view.getTag() != null) {
		// ViewHolder holder = (ViewHolder) view.getTag();
		// if (holder.main_lin != null && holder.main_lin.isShown()) {
		// holder.main_lin.setBackgroundColor(Color.BLUE);
		// currentSelectView = view;
		// } else {
		// currentSelectView = null;
		// }
		// } else {
		// currentSelectView = null;
		// }
		// }
		//
		// @Override
		// public void onNothingSelected(AdapterView<?> parent) {
		// }
		// });
	}

	/*
	 * public void generateCertificateUI(ListBean listbean) {
	 * 
	 * View inflateView = null; ViewHolder holder = null; ListBean listBean =
	 * null; MovieBean movibean; listBean = new ListBean(); listBean = listbean;
	 * int count = 0;
	 * 
	 * movieListView.removeAllViews(); try {
	 * 
	 * for (int i = 0; i < listBean.listarray.size(); i++) {
	 * 
	 * movibean = listBean.listarray.get(i); holder = new ViewHolder();
	 * 
	 * inflateView = LayoutInflater.from(MainActivity.this).inflate(
	 * R.layout.row_item, null, true);
	 * 
	 * holder.main_lin = (LinearLayout) inflateView .findViewById(R.id.lin1);
	 * holder.imageTitle = (TextView) inflateView .findViewById(R.id.tv1);
	 * holder.imagemovie = (ImageView) inflateView .findViewById(R.id.iv1);
	 * holder.imageTitle.setText(listBean.listarray.get(i).title);
	 * 
	 * if(listBean.listarray.get(i).image.equals("cover1.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover1); } else
	 * if(listBean.listarray.get(i).image.equals("cover2.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover2); } else
	 * if(listBean.listarray.get(i).image.equals("cover3.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover3); } else
	 * if(listBean.listarray.get(i).image.equals("cover4.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover4); } else
	 * if(listBean.listarray.get(i).image.equals("cover5.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover5); } else
	 * if(listBean.listarray.get(i).image.equals("cover6.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover6); } else
	 * if(listBean.listarray.get(i).image.equals("cover7.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover7); } else
	 * if(listBean.listarray.get(i).image.equals("cover8.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover8); } else
	 * if(listBean.listarray.get(i).image.equals("cover9.jpg")) {
	 * holder.imagemovie.setImageResource(R.drawable.cover9); }
	 * 
	 * holder.main_lin.setTag(count);
	 * 
	 * holder.main_lin .setOnFocusChangeListener(new OnFocusChangeListener() {
	 * 
	 * @Override public void onFocusChange(View v, boolean hasFocus) { if
	 * (hasFocus) { v.setBackgroundColor(Color .parseColor("#ec940d")); } else {
	 * v.setBackgroundColor(Color .parseColor("#00000000")); } } });
	 * 
	 * holder.main_lin.setOnClickListener(new OnClickListener() {
	 * 
	 * @Override public void onClick(View v) {
	 * 
	 * System.out.println("main lin::::" +
	 * Integer.parseInt(v.getTag().toString()));
	 * 
	 * Intent intent_youtube = new
	 * Intent(MainActivity.this,YoutubePlayerActivity.class);
	 * startActivity(intent_youtube); } }); movieListView.addView(inflateView);
	 * count++; } } catch (Exception e) { e.printStackTrace(); // Log.d(tag,
	 * msg)(this.getClass() + // " :: generateCertificatesUI :: ", e); //
	 * Log.print(this.getClass() + " :: generateCertificatesUI :: ", e); }
	 * finally { inflateView = null; listBean = null; movibean = null; } }
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		boolean handled = false;

		switch (keyCode) {
		case KeyEvent.KEYCODE_DPAD_RIGHT:
			// System.out.println("============= CCCCC====="+currentSelectView);
			// if (currentSelectView != null) {
			// ViewHolder holder = (ViewHolder) currentSelectView.getTag();
			// movieListView.clearFocus();
			//
			// return true;
			// }
			break;
		case KeyEvent.KEYCODE_DPAD_LEFT:
		case KeyEvent.KEYCODE_DPAD_UP:
			fancyCoverFlowSampleAdapter = new FancyCoverFlowSampleAdapter(
					mainlist.get(0));
			fancyCoverFlow.setAdapter(fancyCoverFlowSampleAdapter);
			tv_title.setText(mainlist.get(0).title);
			break;

		case KeyEvent.KEYCODE_DPAD_DOWN:
			fancyCoverFlowSampleAdapter = new FancyCoverFlowSampleAdapter(
					mainlist.get(1));
			fancyCoverFlow.setAdapter(fancyCoverFlowSampleAdapter);
			// generateCertificateUI(mainlist.get(1));
			tv_title.setText(mainlist.get(1).title);
			break;
		default:
			break;
		}
		return super.onKeyDown(keyCode, event);
	}

	//
	// public class CustomAdapter extends BaseAdapter {
	// private ListBean listBean = null;
	//
	// public CustomAdapter(ListBean listbean) {
	// listBean = listbean;
	// }
	//
	// @Override
	// public int getCount() {
	// return listBean.listarray.size();
	// }
	//
	// @Override
	// public Object getItem(int position) {
	// return null;
	// }
	//
	// @Override
	// public long getItemId(int position) {
	// return 0;
	// }
	//
	// @Override
	// public View getView(int position, View convertView, ViewGroup parent) {
	// View row = convertView;
	// ViewHolder holder = null;
	// if (convertView == null) {
	// LayoutInflater li = (LayoutInflater) MainActivity.this
	// .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	// row = li.inflate(R.layout.row_item, null);
	// } else {
	// row = (View) convertView;
	// }
	//
	// holder = new ViewHolder();
	//
	// holder.main_lin = (LinearLayout) row.findViewById(R.id.lin1);
	// holder.imageTitle = (TextView) row.findViewById(R.id.tv1);
	// holder.imagemovie = (ImageView) row.findViewById(R.id.iv1);
	// holder.imageTitle.setText(listBean.listarray.get(position).title);
	// return row;
	// }
	// }

	class ViewHolder {
		TextView imageTitle;
		ImageView imagemovie;
		LinearLayout main_lin;
	}
}