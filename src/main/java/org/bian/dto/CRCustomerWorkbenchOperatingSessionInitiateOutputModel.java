package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionInitiateOutputModel
 */
public class CRCustomerWorkbenchOperatingSessionInitiateOutputModel   {
  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String customerWorkbenchOperatingSessionInitiateActionReference = null;

  private Object customerWorkbenchOperatingSessionInitiateActionRecord = null;

  private String customerWorkbenchOperatingSessionInstanceStatus = null;

  private CRCustomerWorkbenchOperatingSessionInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerWorkbenchOperatingSessionInitiateActionReference
  **/

  public String getCustomerWorkbenchOperatingSessionInitiateActionReference() {
    return customerWorkbenchOperatingSessionInitiateActionReference;
  }

  public void setCustomerWorkbenchOperatingSessionInitiateActionReference(String customerWorkbenchOperatingSessionInitiateActionReference) {
    this.customerWorkbenchOperatingSessionInitiateActionReference = customerWorkbenchOperatingSessionInitiateActionReference;
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

  public CRCustomerWorkbenchOperatingSessionInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(CRCustomerWorkbenchOperatingSessionInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


}

