package com.hxhnzmb.example.mapper;

import com.hxhnzmb.example.mapper.entity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/8 10:53
 */
@Service
public interface PaymentChannelMapper {
    @Select("\n" +
            "SELECT  id as id ,CHANNEL_NAME as CHANNELNAME ,CHANNEL_ID as CHANNELID,strategy_bean_id AS strategybeanid\n" +
            "FROM payment_channel where CHANNEL_ID=#{payCode}")
    /**
     * 获取支付渠道
     */
    public PaymentChannelEntity getPaymentChannel(String payCode);
}
