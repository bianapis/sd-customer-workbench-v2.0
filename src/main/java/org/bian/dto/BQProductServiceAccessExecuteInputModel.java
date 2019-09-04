package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;
import org.bian.dto.BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessExecuteInputModel
 */
public class BQProductServiceAccessExecuteInputModel   {
  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String productServiceAccessInstanceReference = null;

  private BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord = null;

  private Object productServiceAccessExecuteActionTaskRecord = null;

  private BQBrowsingExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactInitiateInputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Service Access instance 
   * @return productServiceAccessInstanceReference
  **/

  public String getProductServiceAccessInstanceReference() {
    return productServiceAccessInstanceReference;
  }

  public void setProductServiceAccessInstanceReference(String productServiceAccessInstanceReference) {
    this.productServiceAccessInstanceReference = productServiceAccessInstanceReference;
  }


  /**
   * Get productServiceAccessInstanceRecord
   * @return productServiceAccessInstanceRecord
  **/

  public BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord getProductServiceAccessInstanceRecord() {
    return productServiceAccessInstanceRecord;
  }

  public void setProductServiceAccessInstanceRecord(BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord) {
    this.productServiceAccessInstanceRecord = productServiceAccessInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productServiceAccessExecuteActionTaskRecord
  **/

  public Object getProductServiceAccessExecuteActionTaskRecord() {
    return productServiceAccessExecuteActionTaskRecord;
  }

  public void setProductServiceAccessExecuteActionTaskRecord(Object productServiceAccessExecuteActionTaskRecord) {
    this.productServiceAccessExecuteActionTaskRecord = productServiceAccessExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQBrowsingExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQBrowsingExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

