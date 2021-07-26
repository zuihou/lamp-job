package com.xxl.job.executor.service;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import top.tangyh.basic.context.ContextConstants;
import top.tangyh.basic.database.mybatis.conditions.Wraps;
import top.tangyh.basic.database.mybatis.conditions.query.LbqWrapper;
import top.tangyh.lamp.tenant.entity.Tenant;
import top.tangyh.lamp.tenant.enumeration.TenantStatusEnum;
import top.tangyh.lamp.tenant.service.TenantService;
import com.xxl.job.core.context.XxlJobHelper;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * @author zuihou
 * @date 2021/1/4 11:35 下午
 */
public abstract class AbstractTenantJob {
    @Autowired
    private TenantService tenantService;

    protected void loadTenant(BiConsumer<Tenant, String> consumer) {
        String traceId = IdUtil.fastSimpleUUID();
        MDC.put(ContextConstants.LOG_TRACE_ID, StrUtil.isEmpty(traceId) ? StrUtil.EMPTY : traceId);

        LbqWrapper<Tenant> wrapper = Wraps.<Tenant>lbQ()
                .eq(Tenant::getStatus, TenantStatusEnum.NORMAL);

        List<Tenant> list = tenantService.list(wrapper);

        list.forEach(tenant -> {
            MDC.put(ContextConstants.JWT_KEY_TENANT, tenant.getCode());
            consumer.accept(tenant, XxlJobHelper.getJobParam());
        });
    }

}
