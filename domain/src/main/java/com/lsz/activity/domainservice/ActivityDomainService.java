package com.lsz.activity.domainservice;

import com.lsz.activity.ActivityInfo;
import com.lsz.product.ProductInfo;

/**
 * @ClassName ActivityDomainService
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午3:06
 * @Version 1.0.0
 **/
public interface ActivityDomainService {

    void startSpikeActivity(ActivityInfo activityInfo, ProductInfo productInfo);


    void stopSpikeActivity(ActivityInfo activityInfo, ProductInfo productInfo);

}
