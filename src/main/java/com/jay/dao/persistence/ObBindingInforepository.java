package com.jay.dao.persistence;

import com.jay.dao.entiries.ObBindingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObBindingInforepository extends JpaRepository<ObBindingInfo, String> {

  ObBindingInfo findByChannelId(String channelId);
}
