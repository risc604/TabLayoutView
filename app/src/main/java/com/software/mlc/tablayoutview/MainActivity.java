package com.software.mlc.tablayoutview;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private ViewPager viewPager;
    private ArrayList<View> ViewPager_List;
    private MyViewPagerAdapter mAdapter;

    @Overrid
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewpager);

        final LayoutInflater mInflater = getLayoutInflater().from(this);

        View viewpager0 = mInflater.inflate(R.lyout.Intro_layout_0, null);
        View viewpager1 = mInflater.inflate(R.lyout.Intro_layout_1, null);
        View viewpager2 = mInflater.inflate(R.lyout.Intro_layout_2, null);
        View viewpager3 = mInflater.inflate(R.lyout.Intro_layout_3, null);

        viewPager_List = new ArrayList<View>();
        viewPager_List.add(viewpager0);
        viewPager_List.add(viewpager1);
        viewPager_List.add(viewpager2);
        viewPager_List.add(viewpager3);

        viewPager.setAdapter(mAdapter(viewPager_list));
        viewPager.setCurrentItem(0);
    }

    public class MyViewPagerAdapter extends PagerAdapter
    {
        private List<View> mListViews;

        public MyViewPagerAdapter(List<View> mListViews)
        {
            this.mListViews = mListViews;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView((View) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position)
        {
            View view = mListViews.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount()
        {
            return mListViews.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object)
        {
            return arg0 == arg1;
        }
    }

}
