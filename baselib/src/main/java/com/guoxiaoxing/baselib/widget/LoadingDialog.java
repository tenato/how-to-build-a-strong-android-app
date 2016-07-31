package com.guoxiaoxing.baselib.widget;

import android.app.Dialog;
import android.content.Context;

/**
 * Author: guoxiaoxing
 * Date: 16/7/31 下午4:53
 * Function: loading dialog
 * <p>
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingv@163.com
 */
public class LoadingDialog extends Dialog {

    public LoadingDialog(Context context) {
        super(context);
        setupView();
    }

    public LoadingDialog(Context context, int themeResId) {
        super(context, themeResId);
        setupView();
    }

    protected LoadingDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        setupView();
    }

    private void setupView() {

    }

}