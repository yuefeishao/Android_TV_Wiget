package com.open.androidtvwidget.recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.open.androidtvwidget.view.WidgetTvViewBring;

/**
 * Created by 15738 on 2017/8/14.
 * 没有加乱跳的限制，因为有的界面需要左右焦点的跳动
 */
public class RecyclerViewTV1 extends RecyclerView {
    public RecyclerViewTV1(Context context) {
        super(context);
        init(context);
    }

    public RecyclerViewTV1(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public RecyclerViewTV1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    WidgetTvViewBring mWidgetTvViewBring;

    private void init(Context context) {
        setDescendantFocusability(FOCUS_AFTER_DESCENDANTS);
        setHasFixedSize(true);
        setWillNotDraw(true);
        setOverScrollMode(View.OVER_SCROLL_NEVER);
        setChildrenDrawingOrderEnabled(false);
        mWidgetTvViewBring = new WidgetTvViewBring(this);
    }

    @Override
    public void bringChildToFront(View child) {
        mWidgetTvViewBring.bringChildToFront(this, child);
    }

    @Override
    protected int getChildDrawingOrder(int childCount, int i) {
        return mWidgetTvViewBring.getChildDrawingOrder(childCount, i);
    }
}
