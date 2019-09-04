package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQBrowsingInitiateInputModelBrowsingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBrowsingExecuteInputModel
 */
public class BQBrowsingExecuteInputModel   {
  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String browsingInstanceReference = null;

  private BQBrowsingInitiateInputModelBrowsingInstanceRecord browsingInstanceRecord = null;

  private Object browsingExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Browsing instance 
   * @return browsingInstanceReference
  **/

  public String getBrowsingInstanceReference() {
    return browsingInstanceReference;
  }

  public void setBrowsingInstanceReference(String browsingInstanceReference) {
    this.browsingInstanceReference = browsingInstanceReference;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return browsingExecuteActionTaskRecord
  **/

  public Object getBrowsingExecuteActionTaskRecord() {
    return browsingExecuteActionTaskRecord;
  }

  public void setBrowsingExecuteActionTaskRecord(Object browsingExecuteActionTaskRecord) {
    this.browsingExecuteActionTaskRecord = browsingExecuteActionTaskRecord;
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

