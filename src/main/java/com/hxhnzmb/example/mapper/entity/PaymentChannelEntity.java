package com.hxhnzmb.example.mapper.entity;

import lombok.Data;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/8 10:53
 */
@Data
public class PaymentChannelEntity {
    /** ID */
    private Integer id;
    /** 渠道名称 */
    private String channelName;
    /** 渠道ID */
    private String channelId;
    /**
     * 策略执行beanId
     */
    private String strategyBeanId;

}
