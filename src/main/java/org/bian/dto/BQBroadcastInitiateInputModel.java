package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBroadcastInitiateInputModelBroadcastInstanceRecord;
import org.bian.dto.BQBroadcastInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBroadcastInitiateInputModel
 */
public class BQBroadcastInitiateInputModel   {
  private BQBroadcastInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private Object broadcastInitiateActionRecord = null;

  private BQBroadcastInitiateInputModelBroadcastInstanceRecord broadcastInstanceRecord = null;


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
   * @return broadcastInitiateActionRecord
  **/

  public Object getBroadcastInitiateActionRecord() {
    return broadcastInitiateActionRecord;
  }

  public void setBroadcastInitiateActionRecord(Object broadcastInitiateActionRecord) {
    this.broadcastInitiateActionRecord = broadcastInitiateActionRecord;
  }


  /**
   * Get broadcastInstanceRecord
   * @return broadcastInstanceRecord
  **/

  public BQBroadcastInitiateInputModelBroadcastInstanceRecord getBroadcastInstanceRecord() {
    return broadcastInstanceRecord;
  }

  public void setBroadcastInstanceRecord(BQBroadcastInitiateInputModelBroadcastInstanceRecord broadcastInstanceRecord) {
    this.broadcastInstanceRecord = broadcastInstanceRecord;
  }


}

