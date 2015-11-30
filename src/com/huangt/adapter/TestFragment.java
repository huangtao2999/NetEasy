package com.huangt.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;


/** 
 * 类说明  ''
 * @author : huangtao
 * @version 创建时间：2015年11月30日 上午10:17:15 
 */
public class TestFragment extends Fragment{
	private final static String KEY_CONTENT = "TestFragment:Content";
	
	private String mContent = "???";
	public static TestFragment newInstance(String content)
	{
		TestFragment fragment = new TestFragment();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<8;i++)
		{
			builder.append(content).append(" ");
		}
		builder.deleteCharAt(builder.length()-1);
		fragment.mContent = builder.toString();
		return fragment;
	}
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		if((savedInstanceState != null)
				&& savedInstanceState.containsKey(KEY_CONTENT))
		{
			mContent = savedInstanceState.getString(KEY_CONTENT);
		}
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		TextView text = new TextView(getActivity());
		text.setGravity(Gravity.CENTER);
		text.setText(mContent);
        text.setTextSize(20 * getResources().getDisplayMetrics().density);
        text.setPadding(20, 20, 20, 20);

        LinearLayout layout = new LinearLayout(getActivity());
        layout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        layout.setGravity(Gravity.CENTER);
        layout.addView(text);
        
        return layout;

	}
	@Override
	public void onSaveInstanceState(Bundle outState)
	{
		super.onSaveInstanceState(outState);
		outState.putString(KEY_CONTENT, mContent);
	}

}
