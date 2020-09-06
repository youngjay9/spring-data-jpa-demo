package com.jay.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class FixedDepositDetails {

  @Id
  private int bankAccountId;

  private int fixedDepositId;
  private Date fdCreationDate;
  private int fdAmount;
  private int tenure;
  private String active;

  public int getFixedDepositId() {
    return fixedDepositId;
  }

  public void setFixedDepositId(int fixedDepositId) {
    this.fixedDepositId = fixedDepositId;
  }

  public int getBankAccountId() {
    return bankAccountId;
  }

  public void setBankAccountId(int bankAccountId) {
    this.bankAccountId = bankAccountId;
  }

  public Date getFdCreationDate() {
    return fdCreationDate;
  }

  public void setFdCreationDate(Date fdCreationDate) {
    this.fdCreationDate = fdCreationDate;
  }

  public int getFdAmount() {
    return fdAmount;
  }

  public void setFdAmount(int fdAmount) {
    this.fdAmount = fdAmount;
  }

  public int getTenure() {
    return tenure;
  }

  public void setTenure(int tenure) {
    this.tenure = tenure;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "FixedDepositDetails [fixedDepositId=" + fixedDepositId
        + ", bankAccountId=" + bankAccountId + ", fdCreationDate="
        + fdCreationDate + ", fdAmount=" + fdAmount + ", tenure="
        + tenure + ", active=" + active + "]";
  }
}
