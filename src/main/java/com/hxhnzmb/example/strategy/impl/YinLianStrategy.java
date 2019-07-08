package com.hxhnzmb.example.strategy.impl;

import com.hxhnzmb.example.strategy.PayStrategy;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/5 14:57
 */
public class YinLianStrategy implements PayStrategy {

    public String pay() {
        return "调用银联支付接口...";
    }
}
