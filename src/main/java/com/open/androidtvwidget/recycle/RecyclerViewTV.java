package com.open.androidtvwidget.recycle;

import com.open.androidtvwidget.view.WidgetTvViewBring;

import android.content.Context;
import android.support.annotation.IntDef;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;

public class RecyclerViewTV extends RecyclerView {

	public RecyclerViewTV(Context context) {
		super(context);
		init(context);
	}

	public RecyclerViewTV(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public RecyclerViewTV(Context context, AttributeSet attrs, int defStyle) {
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

	@Override
	public View focusSearch(View focused,int direction) {
		return FocusFinder.getInstance().findNextFocus(this, focused, direction);
	}
}
