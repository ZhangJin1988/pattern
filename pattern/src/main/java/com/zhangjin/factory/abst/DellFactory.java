package com.zhangjin.factory.abst;

import com.zhangjin.factory.bean.DellKeybo;
import com.zhangjin.factory.bean.DellMouse;
import com.zhangjin.factory.bean.Keybo;
import com.zhangjin.factory.bean.Mouse;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeyto() {
        return new DellKeybo();
    }
}
