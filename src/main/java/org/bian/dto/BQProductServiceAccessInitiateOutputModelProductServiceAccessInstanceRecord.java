package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord
 */
public class BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord   {
  private String accessStartEndTime = null;

  private String customerResidentFiles = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Logged time and duration spent on Product Service screens 
   * @return accessStartEndTime
  **/

  public String getAccessStartEndTime() {
    return accessStartEndTime;
  }

  public void setAccessStartEndTime(String accessStartEndTime) {
    this.accessStartEndTime = accessStartEndTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Local copies of requested information, application forms etc. 
   * @return customerResidentFiles
  **/

  public String getCustomerResidentFiles() {
    return customerResidentFiles;
  }

  public void setCustomerResidentFiles(String customerResidentFiles) {
    this.customerResidentFiles = customerResidentFiles;
  }


}

