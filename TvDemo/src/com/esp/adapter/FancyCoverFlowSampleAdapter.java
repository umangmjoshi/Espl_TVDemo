/*
 * Copyright 2013 David Schreiber
 *           2013 John Paul Nalog
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.esp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import at.technikum.mti.fancycoverflow.FancyCoverFlow;
import at.technikum.mti.fancycoverflow.FancyCoverFlowAdapter;

import com.esp.bean.ListBean;
import com.esp.tvdemo.R;

public class FancyCoverFlowSampleAdapter extends FancyCoverFlowAdapter {

	// =============================================================================
	// Private members
	// =============================================================================

	// =============================================================================
	// Supertype overrides
	// =============================================================================
	public ListBean listBean;

	public FancyCoverFlowSampleAdapter(ListBean listbean) {
		// TODO Auto-generated constructor stub
		listBean = new ListBean();
		this.listBean = listbean;
	}

	@Override
	public int getCount() {
		return this.listBean.listarray.size();
	}

	@Override
	public String getItem(int i) {
		return this.listBean.listarray.get(i).image;
	}

	@Override
	public long getItemId(int i) {
		return i;
	}

	@Override
	public View getCoverFlowItem(int i, View reuseableView, ViewGroup viewGroup) {
		ImageView imageView = null;

		if (reuseableView != null) {
			imageView = (ImageView) reuseableView;
		} else {
			imageView = new ImageView(viewGroup.getContext());
	//		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView
					.setLayoutParams(new FancyCoverFlow.LayoutParams(500, 700));

		}
		if (listBean.listarray.get(i).image.equals("cover1.jpg")) {
			imageView.setImageResource(R.drawable.cover1);
		} else if (listBean.listarray.get(i).image.equals("cover2.jpg")) {
			imageView.setImageResource(R.drawable.cover2);
		} else if (listBean.listarray.get(i).image.equals("cover3.jpg")) {
			imageView.setImageResource(R.drawable.cover3);
		} else if (listBean.listarray.get(i).image.equals("cover4.jpg")) {
			imageView.setImageResource(R.drawable.cover4);
		} else if (listBean.listarray.get(i).image.equals("cover5.jpg")) {
			imageView.setImageResource(R.drawable.cover5);
		} else if (listBean.listarray.get(i).image.equals("cover6.jpg")) {
			imageView.setImageResource(R.drawable.cover6);
		} else if (listBean.listarray.get(i).image.equals("cover7.jpg")) {
			imageView.setImageResource(R.drawable.cover7);
		} else if (listBean.listarray.get(i).image.equals("cover8.jpg")) {
			imageView.setImageResource(R.drawable.cover8);
		} else if (listBean.listarray.get(i).image.equals("cover9.jpg")) {
			imageView.setImageResource(R.drawable.cover9);
		}

		return imageView;
	}
}
