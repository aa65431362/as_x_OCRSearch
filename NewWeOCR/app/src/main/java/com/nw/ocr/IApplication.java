package com.nw.ocr;

import com.nw.ocr.wm.FloatService;
import com.yline.application.BaseApplication;

public class IApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        FloatService.launcher(this);
    }

    @Override
    public void onTerminate() {
        // 防止内存泄漏
        FloatService.unRegisterCircleClickListener();

        super.onTerminate();
    }
}
