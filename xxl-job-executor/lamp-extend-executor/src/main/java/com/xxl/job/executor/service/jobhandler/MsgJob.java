package com.xxl.job.executor.service.jobhandler;

import com.alibaba.fastjson.JSONObject;
import top.tangyh.basic.context.ContextConstants;
import top.tangyh.basic.context.ContextUtil;
import top.tangyh.lamp.sms.strategy.SmsContext;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.executor.service.AbstractTenantJob;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author zuihou
 * @date 2021/1/4 11:44 下午
 */
@Component
@RequiredArgsConstructor
public class MsgJob extends AbstractTenantJob {
    private final SmsContext smsContext;

    @XxlJob("smsSendJobHandler")
    public void smsSend() {
        XxlJobHelper.log("进入短信定时发送方法");
        JSONObject map = JSONObject.parseObject(XxlJobHelper.getJobParam());
        ContextUtil.setTenant(map.getString(ContextConstants.JWT_KEY_TENANT));
        Long id = map.getLong("id");
        XxlJobHelper.log("租户={}, 短信任务={}", ContextUtil.getTenant(), id);
        smsContext.smsSend(id);
    }
}
