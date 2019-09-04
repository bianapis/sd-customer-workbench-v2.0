package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBroadcastInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.BQBroadcastInitiateOutputModelBroadcastInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBroadcastInitiateOutputModel
 */
public class BQBroadcastInitiateOutputModel   {
  private BQBroadcastInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String broadcastInstanceReference = null;

  private String broadcastInitiateActionReference = null;

  private Object broadcastInitiateActionRecord = null;

  private String broadcastInstanceStatus = null;

  private BQBroadcastInitiateOutputModelBroadcastInstanceRecord broadcastInstanceRecord = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQBroadcastInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQBroadcastInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Broadcast instance 
   * @return broadcastInstanceReference
  **/

  public String getBroadcastInstanceReference() {
    return broadcastInstanceReference;
  }

  public void setBroadcastInstanceReference(String broadcastInstanceReference) {
    this.broadcastInstanceReference = broadcastInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return broadcastInitiateActionReference
  **/

  public String getBroadcastInitiateActionReference() {
    return broadcastInitiateActionReference;
  }

  public void setBroadcastInitiateActionReference(String broadcastInitiateActionReference) {
    this.broadcastInitiateActionReference = broadcastInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return broadcastInitiateActionRecord
  **/

  public Object getBroadcastInitiateActionRecord() {
    return broadcastInitiateActionRecord;
  }

  public void setBroadcastInitiateActionRecord(Object broadcastInitiateActionRecord) {
    this.broadcastInitiateActionRecord = broadcastInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Broadcast instance (e.g. initialised, pending, active) 
   * @return broadcastInstanceStatus
  **/

  public String getBroadcastInstanceStatus() {
    return broadcastInstanceStatus;
  }

  public void setBroadcastInstanceStatus(String broadcastInstanceStatus) {
    this.broadcastInstanceStatus = broadcastInstanceStatus;
  }


  /**
   * Get broadcastInstanceRecord
   * @return broadcastInstanceRecord
  **/

  public BQBroadcastInitiateOutputModelBroadcastInstanceRecord getBroadcastInstanceRecord() {
    return broadcastInstanceRecord;
  }

  public void setBroadcastInstanceRecord(BQBroadcastInitiateOutputModelBroadcastInstanceRecord broadcastInstanceRecord) {
    this.broadcastInstanceRecord = broadcastInstanceRecord;
  }


}

