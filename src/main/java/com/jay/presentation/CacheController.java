package com.jay.presentation;

import com.jay.dao.entiries.ObBindingInfo;
import com.jay.service.ObBindingInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cache")
public class CacheController {

  private final Logger logger = LoggerFactory.getLogger(CacheController.class);

  @Autowired
  ObBindingInfoService obBindingInfoService;


  @RequestMapping(value = "/getObBindingInfoByChannelId", method = RequestMethod.GET)
  public ObBindingInfo getObBindingInfoByChannelId(@RequestParam("channelId") String channelId) {

    return obBindingInfoService.getBindingInfo(channelId);
  }

  @RequestMapping(value = "/cleanBindingInfoCacheByChannelId", method = RequestMethod.GET)
  public ObBindingInfo cleanBindingInfoCacheByChannelId(@RequestParam("channelId") String channelId) {

    return obBindingInfoService.cleanBindingInfoCacheByChannelId(channelId);
  }

}
