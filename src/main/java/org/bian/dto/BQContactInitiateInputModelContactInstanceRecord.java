package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactInitiateInputModelContactInstanceRecord
 */
public class BQContactInitiateInputModelContactInstanceRecord   {
  private String contactStartEndTime = null;

  private String contactActivityLog = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Logged duration of the contact 
   * @return contactStartEndTime
  **/

  public String getContactStartEndTime() {
    return contactStartEndTime;
  }

  public void setContactStartEndTime(String contactStartEndTime) {
    this.contactStartEndTime = contactStartEndTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Local record of page/service access as appropriate 
   * @return contactActivityLog
  **/

  public String getContactActivityLog() {
    return contactActivityLog;
  }

  public void setContactActivityLog(String contactActivityLog) {
    this.contactActivityLog = contactActivityLog;
  }


}

