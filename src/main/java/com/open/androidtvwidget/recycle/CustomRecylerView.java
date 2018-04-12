package com.open.androidtvwidget.recycle;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Agent on 2017/11/27.
 */

public class CustomRecylerView extends RecyclerViewTV {
    public CustomRecylerView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public CustomRecylerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public CustomRecylerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // TODO Auto-generated method stub
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}

