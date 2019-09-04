package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactUpdateInputModel
 */
public class BQContactUpdateInputModel   {
  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String contactInstanceReference = null;

  private Object contactUpdateActionTaskRecord = null;

  private String contactUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact instance 
   * @return contactInstanceReference
  **/

  public String getContactInstanceReference() {
    return contactInstanceReference;
  }

  public void setContactInstanceReference(String contactInstanceReference) {
    this.contactInstanceReference = contactInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return contactUpdateActionTaskRecord
  **/

  public Object getContactUpdateActionTaskRecord() {
    return contactUpdateActionTaskRecord;
  }

  public void setContactUpdateActionTaskRecord(Object contactUpdateActionTaskRecord) {
    this.contactUpdateActionTaskRecord = contactUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return contactUpdateActionRequest
  **/

  public String getContactUpdateActionRequest() {
    return contactUpdateActionRequest;
  }

  public void setContactUpdateActionRequest(String contactUpdateActionRequest) {
    this.contactUpdateActionRequest = contactUpdateActionRequest;
  }


}

