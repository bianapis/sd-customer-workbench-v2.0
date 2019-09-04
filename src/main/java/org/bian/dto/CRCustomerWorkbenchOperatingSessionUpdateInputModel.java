package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionUpdateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionUpdateInputModel
 */
public class CRCustomerWorkbenchOperatingSessionUpdateInputModel   {
  private String customerWorkbenchServicingSessionReference = null;

  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private CRCustomerWorkbenchOperatingSessionUpdateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private Object customerWorkbenchOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public CRCustomerWorkbenchOperatingSessionUpdateInputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(CRCustomerWorkbenchOperatingSessionUpdateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerWorkbenchOperatingSessionUpdateActionTaskRecord
  **/

  public Object getCustomerWorkbenchOperatingSessionUpdateActionTaskRecord() {
    return customerWorkbenchOperatingSessionUpdateActionTaskRecord;
  }

  public void setCustomerWorkbenchOperatingSessionUpdateActionTaskRecord(Object customerWorkbenchOperatingSessionUpdateActionTaskRecord) {
    this.customerWorkbenchOperatingSessionUpdateActionTaskRecord = customerWorkbenchOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

