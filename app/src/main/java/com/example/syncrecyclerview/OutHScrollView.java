package com.example.syncrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/**
 * @author hongda
 * @date 2020/4/21
 */
public class OutHScrollView extends HorizontalScrollView {


    public OutHScrollView(Context context) {
        this(context, null);
    }

    public OutHScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OutHScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(ev);


    }


}
