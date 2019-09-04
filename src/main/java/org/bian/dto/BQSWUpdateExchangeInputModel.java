package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSWUpdateExchangeInputModelSWUpdateExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQSWUpdateExchangeInputModel
 */
public class BQSWUpdateExchangeInputModel   {
  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String sWUpdateInstanceReference = null;

  private Object sWUpdateExchangeActionTaskRecord = null;

  private BQSWUpdateExchangeInputModelSWUpdateExchangeActionRequest sWUpdateExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Workbench Operating Session instance 
   * @return customerWorkbenchOperatingSessionInstanceReference
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReference() {
    return customerWorkbenchOperatingSessionInstanceReference;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReference(String customerWorkbenchOperatingSessionInstanceReference) {
    this.customerWorkbenchOperatingSessionInstanceReference = customerWorkbenchOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the SW Update instance 
   * @return sWUpdateInstanceReference
  **/

  public String getSWUpdateInstanceReference() {
    return sWUpdateInstanceReference;
  }

  @JsonProperty("sWUpdateInstanceReference")
  public void setSWUpdateInstanceReference(String sWUpdateInstanceReference) {
    this.sWUpdateInstanceReference = sWUpdateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return sWUpdateExchangeActionTaskRecord
  **/

  public Object getSWUpdateExchangeActionTaskRecord() {
    return sWUpdateExchangeActionTaskRecord;
  }

  public void setSWUpdateExchangeActionTaskRecord(Object sWUpdateExchangeActionTaskRecord) {
    this.sWUpdateExchangeActionTaskRecord = sWUpdateExchangeActionTaskRecord;
  }


  /**
   * Get sWUpdateExchangeActionRequest
   * @return sWUpdateExchangeActionRequest
  **/

  public BQSWUpdateExchangeInputModelSWUpdateExchangeActionRequest getSWUpdateExchangeActionRequest() {
    return sWUpdateExchangeActionRequest;
  }

  public void setSWUpdateExchangeActionRequest(BQSWUpdateExchangeInputModelSWUpdateExchangeActionRequest sWUpdateExchangeActionRequest) {
    this.sWUpdateExchangeActionRequest = sWUpdateExchangeActionRequest;
  }


}

