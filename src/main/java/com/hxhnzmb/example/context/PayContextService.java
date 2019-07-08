package com.hxhnzmb.example.context;

import com.hxhnzmb.example.mapper.PaymentChannelMapper;
import com.hxhnzmb.example.mapper.entity.PaymentChannelEntity;
import com.hxhnzmb.example.strategy.PayStrategy;
import com.hxhnzmb.example.utils.SpringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/8 10:57
 */
@RestController
public class PayContextService {

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;

    @RequestMapping("/pay")
    public  String pay(String payCode){
        // 1.验证参数
        if(StringUtils.isEmpty(payCode)){
            return  "payCode不能为空!";
        }
        // 2.使用PayCode查询
        PaymentChannelEntity paymentChannel = paymentChannelMapper.getPaymentChannel(payCode);
        if(paymentChannel==null){
            return  "该渠道为空...";
        }
        // 3.获取策略执行的beanid
        String strategyBeanId = paymentChannel.getStrategyBeanId();
        // 4.使用strategyBeanId获取对应spring容器bean信息
        PayStrategy payStrategy = SpringUtils.getBean(strategyBeanId, PayStrategy.class);
        // 5.执行具体策略算法
        return  payStrategy.pay();
    }

}