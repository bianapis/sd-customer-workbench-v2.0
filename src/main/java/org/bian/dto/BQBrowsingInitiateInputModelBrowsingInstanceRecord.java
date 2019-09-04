package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrowsingInitiateInputModelBrowsingInstanceRecord
 */
public class BQBrowsingInitiateInputModelBrowsingInstanceRecord   {
  private String customerURL = null;

  private String bankWebsiteURL = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The device URL can be used to detect known and repeat customer access 
   * @return customerURL
  **/

  public String getCustomerURL() {
    return customerURL;
  }

  public void setCustomerURL(String customerURL) {
    this.customerURL = customerURL;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The access URL to the public web based bank information 
   * @return bankWebsiteURL
  **/

  public String getBankWebsiteURL() {
    return bankWebsiteURL;
  }

  public void setBankWebsiteURL(String bankWebsiteURL) {
    this.bankWebsiteURL = bankWebsiteURL;
  }


}

