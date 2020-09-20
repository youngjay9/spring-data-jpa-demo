package com.jay.service;

import com.jay.dao.entiries.ObBindingInfo;
import com.jay.dao.persistence.ObBindingInforepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ObBindingInfoService {

  private final Logger logger = LoggerFactory.getLogger(ObBindingInfoService.class);

  @Autowired
  private ObBindingInforepository obBindingInforepository;

  @Cacheable(value = "bindingInfo" ,key = "targetClass + methodName +#p0")
  public ObBindingInfo getBindingInfo(String channelId) {

    logger.info("cache is not working!!");

    return obBindingInforepository.findByChannelId(channelId);
  }

  @CacheEvict(value = "bindingInfo" ,key = "targetClass + methodName +#p0")
  public ObBindingInfo cleanBindingInfoCacheByChannelId(String channelId) {

    logger.info("cleanBindingInfoCache!!");

    return obBindingInforepository.findByChannelId(channelId);
  }
}
