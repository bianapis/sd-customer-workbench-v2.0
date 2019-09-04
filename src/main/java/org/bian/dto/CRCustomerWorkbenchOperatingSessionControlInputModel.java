package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionControlInputModelCustomerWorkbenchOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionControlInputModel
 */
public class CRCustomerWorkbenchOperatingSessionControlInputModel   {
  private String customerWorkbenchServicingSessionReference = null;

  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private Object customerWorkbenchOperatingSessionControlActionTaskRecord = null;

  private CRCustomerWorkbenchOperatingSessionControlInputModelCustomerWorkbenchOperatingSessionControlActionRequest customerWorkbenchOperatingSessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerWorkbenchServicingSessionReference
  **/

  public String getCustomerWorkbenchServicingSessionReference() {
    return customerWorkbenchServicingSessionReference;
  }

  public void setCustomerWorkbenchServicingSessionReference(String customerWorkbenchServicingSessionReference) {
    this.customerWorkbenchServicingSessionReference = customerWorkbenchServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Workbench Operating Session instance 
   * @return customerWorkbenchOperatingSessionInstanceReference
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReference() {
    return customerWorkbenchOperatingSessionInstanceReference;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReference(String customerWorkbenchOperatingSessionInstanceReference) {
    this.customerWorkbenchOperatingSessionInstanceReference = customerWorkbenchOperatingSessionInstanceReference;
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
   * Get customerWorkbenchOperatingSessionControlActionRequest
   * @return customerWorkbenchOperatingSessionControlActionRequest
  **/

  public CRCustomerWorkbenchOperatingSessionControlInputModelCustomerWorkbenchOperatingSessionControlActionRequest getCustomerWorkbenchOperatingSessionControlActionRequest() {
    return customerWorkbenchOperatingSessionControlActionRequest;
  }

  public void setCustomerWorkbenchOperatingSessionControlActionRequest(CRCustomerWorkbenchOperatingSessionControlInputModelCustomerWorkbenchOperatingSessionControlActionRequest customerWorkbenchOperatingSessionControlActionRequest) {
    this.customerWorkbenchOperatingSessionControlActionRequest = customerWorkbenchOperatingSessionControlActionRequest;
  }


}

