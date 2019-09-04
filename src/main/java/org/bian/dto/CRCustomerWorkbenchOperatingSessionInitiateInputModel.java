package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionInitiateInputModel
 */
public class CRCustomerWorkbenchOperatingSessionInitiateInputModel   {
  private String customerWorkbenchServicingSessionReference = null;

  private Object customerWorkbenchOperatingSessionInitiateActionRecord = null;

  private String customerWorkbenchOperatingSessionInstanceStatus = null;

  private CRCustomerWorkbenchOperatingSessionInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerWorkbenchOperatingSessionInitiateActionRecord
  **/

  public Object getCustomerWorkbenchOperatingSessionInitiateActionRecord() {
    return customerWorkbenchOperatingSessionInitiateActionRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInitiateActionRecord(Object customerWorkbenchOperatingSessionInitiateActionRecord) {
    this.customerWorkbenchOperatingSessionInitiateActionRecord = customerWorkbenchOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Workbench Operating Session instance (e.g. initialised, pending, active) 
   * @return customerWorkbenchOperatingSessionInstanceStatus
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceStatus() {
    return customerWorkbenchOperatingSessionInstanceStatus;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceStatus(String customerWorkbenchOperatingSessionInstanceStatus) {
    this.customerWorkbenchOperatingSessionInstanceStatus = customerWorkbenchOperatingSessionInstanceStatus;
  }


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public CRCustomerWorkbenchOperatingSessionInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(CRCustomerWorkbenchOperatingSessionInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


}

