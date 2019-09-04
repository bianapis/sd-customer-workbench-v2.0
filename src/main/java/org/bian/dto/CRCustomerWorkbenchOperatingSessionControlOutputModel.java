package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionControlOutputModel
 */
public class CRCustomerWorkbenchOperatingSessionControlOutputModel   {
  private String customerWorkbenchOperatingSessionControlActionTaskReference = null;

  private Object customerWorkbenchOperatingSessionControlActionTaskRecord = null;

  private String customerWorkbenchOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Workbench Operating Session instance control processing service call 
   * @return customerWorkbenchOperatingSessionControlActionTaskReference
  **/

  public String getCustomerWorkbenchOperatingSessionControlActionTaskReference() {
    return customerWorkbenchOperatingSessionControlActionTaskReference;
  }

  public void setCustomerWorkbenchOperatingSessionControlActionTaskReference(String customerWorkbenchOperatingSessionControlActionTaskReference) {
    this.customerWorkbenchOperatingSessionControlActionTaskReference = customerWorkbenchOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerWorkbenchOperatingSessionControlActionTaskRecord
  **/

  public Object getCustomerWorkbenchOperatingSessionControlActionTaskRecord() {
    return customerWorkbenchOperatingSessionControlActionTaskRecord;
  }

  public void setCustomerWorkbenchOperatingSessionControlActionTaskRecord(Object customerWorkbenchOperatingSessionControlActionTaskRecord) {
    this.customerWorkbenchOperatingSessionControlActionTaskRecord = customerWorkbenchOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerWorkbenchOperatingSessionControlActionResponse
  **/

  public String getCustomerWorkbenchOperatingSessionControlActionResponse() {
    return customerWorkbenchOperatingSessionControlActionResponse;
  }

  public void setCustomerWorkbenchOperatingSessionControlActionResponse(String customerWorkbenchOperatingSessionControlActionResponse) {
    this.customerWorkbenchOperatingSessionControlActionResponse = customerWorkbenchOperatingSessionControlActionResponse;
  }


}

