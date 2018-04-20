package com.zhangjin.factory.abst;

import com.zhangjin.factory.bean.Keybo;
import com.zhangjin.factory.bean.Mouse;

/**
 * Created by zhangjin on 2018/4/20.
 */
public interface PcFactory {

    Mouse createMouse();
    Keybo createKeyto();

}
