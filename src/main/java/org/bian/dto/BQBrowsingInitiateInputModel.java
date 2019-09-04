package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingInitiateInputModelBrowsingInstanceRecord;
import org.bian.dto.BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBrowsingInitiateInputModel
 */
public class BQBrowsingInitiateInputModel   {
  private BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private Object browsingInitiateActionRecord = null;

  private BQBrowsingInitiateInputModelBrowsingInstanceRecord browsingInstanceRecord = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return browsingInitiateActionRecord
  **/

  public Object getBrowsingInitiateActionRecord() {
    return browsingInitiateActionRecord;
  }

  public void setBrowsingInitiateActionRecord(Object browsingInitiateActionRecord) {
    this.browsingInitiateActionRecord = browsingInitiateActionRecord;
  }


  /**
   * Get browsingInstanceRecord
   * @return browsingInstanceRecord
  **/

  public BQBrowsingInitiateInputModelBrowsingInstanceRecord getBrowsingInstanceRecord() {
    return browsingInstanceRecord;
  }

  public void setBrowsingInstanceRecord(BQBrowsingInitiateInputModelBrowsingInstanceRecord browsingInstanceRecord) {
    this.browsingInstanceRecord = browsingInstanceRecord;
  }


}

