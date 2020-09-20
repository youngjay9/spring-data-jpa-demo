package com.jay.dao.entiries;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ObBindingInfo implements Serializable {

  @Id
  @Column(name = "channel_id")
  private String channelId;

  @Column(name = "open_flag")
  private String openFlag;

  @Column(name = "afinity_code")
  private String afinityCode;

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public String getOpenFlag() {
    return openFlag;
  }

  public void setOpenFlag(String openFlag) {
    this.openFlag = openFlag;
  }

  public String getAfinityCode() {
    return afinityCode;
  }

  public void setAfinityCode(String afinityCode) {
    this.afinityCode = afinityCode;
  }

  @Override
  public String toString() {
    return "ObBindingInfo{" +
        "channelId='" + channelId + '\'' +
        ", openFlag='" + openFlag + '\'' +
        ", afinityCode='" + afinityCode + '\'' +
        '}';
  }
}
