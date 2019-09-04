package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingInitiateInputModelBrowsingInstanceRecord;
import org.bian.dto.BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBrowsingInitiateOutputModel
 */
public class BQBrowsingInitiateOutputModel   {
  private BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String browsingInstanceReference = null;

  private String browsingInitiateActionReference = null;

  private Object browsingInitiateActionRecord = null;

  private String browsingInstanceStatus = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return browsingInitiateActionReference
  **/

  public String getBrowsingInitiateActionReference() {
    return browsingInitiateActionReference;
  }

  public void setBrowsingInitiateActionReference(String browsingInitiateActionReference) {
    this.browsingInitiateActionReference = browsingInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Browsing instance (e.g. initialised, pending, active) 
   * @return browsingInstanceStatus
  **/

  public String getBrowsingInstanceStatus() {
    return browsingInstanceStatus;
  }

  public void setBrowsingInstanceStatus(String browsingInstanceStatus) {
    this.browsingInstanceStatus = browsingInstanceStatus;
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

