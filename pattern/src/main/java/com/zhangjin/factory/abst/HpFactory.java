package com.zhangjin.factory.abst;

import com.zhangjin.factory.bean.HpKeybo;
import com.zhangjin.factory.bean.HpMouse;
import com.zhangjin.factory.bean.Keybo;
import com.zhangjin.factory.bean.Mouse;

/**
 * Created by zhangjin on 2018/4/20.
 */
public class HpFactory extends PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeyto() {
        return new HpKeybo();
    }
}
