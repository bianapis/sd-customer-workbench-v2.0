package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSWUpdateInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.BQSWUpdateInitiateOutputModelSWUpdateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSWUpdateInitiateOutputModel
 */
public class BQSWUpdateInitiateOutputModel   {
  private BQSWUpdateInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String sWUpdateInstanceReference = null;

  private String sWUpdateInitiateActionReference = null;

  private Object sWUpdateInitiateActionRecord = null;

  private String sWUpdateInstanceStatus = null;

  private BQSWUpdateInitiateOutputModelSWUpdateInstanceRecord sWUpdateInstanceRecord = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQSWUpdateInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQSWUpdateInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the SW Update instance 
   * @return sWUpdateInstanceReference
  **/

  public String getSWUpdateInstanceReference() {
    return sWUpdateInstanceReference;
  }

  @JsonProperty("sWUpdateInstanceReference")
  public void setSWUpdateInstanceReference(String sWUpdateInstanceReference) {
    this.sWUpdateInstanceReference = sWUpdateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return sWUpdateInitiateActionReference
  **/

  public String getSWUpdateInitiateActionReference() {
    return sWUpdateInitiateActionReference;
  }

  @JsonProperty("sWUpdateInitiateActionReference")
  public void setSWUpdateInitiateActionReference(String sWUpdateInitiateActionReference) {
    this.sWUpdateInitiateActionReference = sWUpdateInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return sWUpdateInitiateActionRecord
  **/

  public Object getSWUpdateInitiateActionRecord() {
    return sWUpdateInitiateActionRecord;
  }

  @JsonProperty("sWUpdateInitiateActionRecord")
  public void setSWUpdateInitiateActionRecord(Object sWUpdateInitiateActionRecord) {
    this.sWUpdateInitiateActionRecord = sWUpdateInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the SW Update instance (e.g. initialised, pending, active) 
   * @return sWUpdateInstanceStatus
  **/

  public String getSWUpdateInstanceStatus() {
    return sWUpdateInstanceStatus;
  }

  
  @JsonProperty("sWUpdateInstanceStatus")
  public void setSWUpdateInstanceStatus(String sWUpdateInstanceStatus) {
    this.sWUpdateInstanceStatus = sWUpdateInstanceStatus;
  }


  /**
   * Get sWUpdateInstanceRecord
   * @return sWUpdateInstanceRecord
  **/

  public BQSWUpdateInitiateOutputModelSWUpdateInstanceRecord getSWUpdateInstanceRecord() {
    return sWUpdateInstanceRecord;
  }

  @JsonProperty("sWUpdateInstanceRecord")
  public void setSWUpdateInstanceRecord(BQSWUpdateInitiateOutputModelSWUpdateInstanceRecord sWUpdateInstanceRecord) {
    this.sWUpdateInstanceRecord = sWUpdateInstanceRecord;
  }


}

