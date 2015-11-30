package com.huangt.neteasy;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.huangt.adapter.GoogleMusicAdapter;
import com.huangt.view.MyHorizontalScrollView;

public class HomeActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{
	private List<String> datas = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		initData();
		GoogleMusicAdapter adapter = new GoogleMusicAdapter(getSupportFragmentManager());
		adapter.setDatas(datas);
		
		ViewPager viewPager = (ViewPager) this.findViewById(R.id.pager);
		viewPager.setAdapter(adapter);
		MyHorizontalScrollView indicator = (MyHorizontalScrollView) this.findViewById(R.id.indicator);
		indicator.setOnPagerChangeListener(this);
		indicator.setViewPager(viewPager);
		
	}
	private void initData()
	{
		datas.add("title0");
		datas.add("title1");
		datas.add("title2");
		datas.add("title3");
		datas.add("title4");
		datas.add("title5");
		datas.add("title6");
		datas.add("title7");
		datas.add("title8");
	}
	@Override
	public void onPageScrollStateChanged(int arg0) 
	{
		
	}
	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2)
	{
		
	}
	@Override
	public void onPageSelected(int arg0)
	{
		
	}
}
