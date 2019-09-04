package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord
 */
public class BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord   {
  private String customerDetailsPreferences = null;

  private String productServiceMenu = null;

  private String productServiceMenuAccessLog = null;

  private String accessStartEndTime = null;

  private String customerResidentFiles = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Locally maintained values used for auto-fill and local validation 
   * @return customerDetailsPreferences
  **/

  public String getCustomerDetailsPreferences() {
    return customerDetailsPreferences;
  }

  public void setCustomerDetailsPreferences(String customerDetailsPreferences) {
    this.customerDetailsPreferences = customerDetailsPreferences;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Locally maintained structured dialogue to access bank services as appropriate 
   * @return productServiceMenu
  **/

  public String getProductServiceMenu() {
    return productServiceMenu;
  }

  public void setProductServiceMenu(String productServiceMenu) {
    this.productServiceMenu = productServiceMenu;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Locally record of Product Service screen access 
   * @return productServiceMenuAccessLog
  **/

  public String getProductServiceMenuAccessLog() {
    return productServiceMenuAccessLog;
  }

  public void setProductServiceMenuAccessLog(String productServiceMenuAccessLog) {
    this.productServiceMenuAccessLog = productServiceMenuAccessLog;
  }


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

