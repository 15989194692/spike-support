package com.lsz.activity.domainservice;

import com.lsz.activity.ActivityInfo;
import com.lsz.product.ProductInfo;
import org.springframework.stereotype.Service;

/**
 * @ClassName ActivityDomainServiceImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午3:08
 * @Version 1.0.0
 **/
@Service
public class ActivityDomainServiceImpl implements ActivityDomainService {


    @Override
    public void startSpikeActivity(ActivityInfo activityInfo, ProductInfo productInfo) {
        activityInfo.startActivity();
        productInfo.spikeStart();
    }

    @Override
    public void stopSpikeActivity(ActivityInfo activityInfo, ProductInfo productInfo) {
        activityInfo.stopActivity();
        productInfo.spikeStop();
    }
}
