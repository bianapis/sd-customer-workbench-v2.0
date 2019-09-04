package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionUpdateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionUpdateOutputModel
 */
public class CRCustomerWorkbenchOperatingSessionUpdateOutputModel   {
  private CRCustomerWorkbenchOperatingSessionUpdateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String customerWorkbenchOperatingSessionUpdateActionTaskReference = null;

  private Object customerWorkbenchOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerWorkbenchOperatingSessionUpdateActionTaskReference
  **/

  public String getCustomerWorkbenchOperatingSessionUpdateActionTaskReference() {
    return customerWorkbenchOperatingSessionUpdateActionTaskReference;
  }

  public void setCustomerWorkbenchOperatingSessionUpdateActionTaskReference(String customerWorkbenchOperatingSessionUpdateActionTaskReference) {
    this.customerWorkbenchOperatingSessionUpdateActionTaskReference = customerWorkbenchOperatingSessionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

