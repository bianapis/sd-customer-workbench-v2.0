package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactExecuteInputModel
 */
public class BQContactExecuteInputModel   {
  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String contactInstanceReference = null;

  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private Object contactExecuteActionTaskRecord = null;

  private BQBrowsingExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return contactExecuteActionTaskRecord
  **/

  public Object getContactExecuteActionTaskRecord() {
    return contactExecuteActionTaskRecord;
  }

  public void setContactExecuteActionTaskRecord(Object contactExecuteActionTaskRecord) {
    this.contactExecuteActionTaskRecord = contactExecuteActionTaskRecord;
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

