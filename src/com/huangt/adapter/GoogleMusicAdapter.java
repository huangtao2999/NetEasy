package com.huangt.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/** 
 * 类说明  ''
 * @author : huangtao
 * @version 创建时间：2015年11月30日 上午10:16:13 
 */
public class GoogleMusicAdapter extends FragmentPagerAdapter{
	private List<String> datas;
	public List<String> getDatas() {
		return datas;
	}
	public void setDatas(List<String> datas) {
		this.datas = datas;
	}

	public GoogleMusicAdapter(FragmentManager fm)
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0)
	{
		return TestFragment.newInstance("content:"+arg0);
	}
	@Override
	public CharSequence getPageTitle(int position)
	{
		return datas.get(position);
	}
	@Override
	public int getCount()
	{
		return datas.size();
	}

}
