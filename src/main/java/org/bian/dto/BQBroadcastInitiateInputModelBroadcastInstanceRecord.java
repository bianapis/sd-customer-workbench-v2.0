package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBroadcastInitiateInputModelBroadcastInstanceRecord
 */
public class BQBroadcastInitiateInputModelBroadcastInstanceRecord   {
  private Object customerWorkbenchBroadcastRecord = null;

  private String customerWorkbenchBroadcastRecordDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Text of the broadcast message 
   * @return customerWorkbenchBroadcastRecord
  **/

  public Object getCustomerWorkbenchBroadcastRecord() {
    return customerWorkbenchBroadcastRecord;
  }

  public void setCustomerWorkbenchBroadcastRecord(Object customerWorkbenchBroadcastRecord) {
    this.customerWorkbenchBroadcastRecord = customerWorkbenchBroadcastRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The timestamp for the broadcast 
   * @return customerWorkbenchBroadcastRecordDateTime
  **/

  public String getCustomerWorkbenchBroadcastRecordDateTime() {
    return customerWorkbenchBroadcastRecordDateTime;
  }

  public void setCustomerWorkbenchBroadcastRecordDateTime(String customerWorkbenchBroadcastRecordDateTime) {
    this.customerWorkbenchBroadcastRecordDateTime = customerWorkbenchBroadcastRecordDateTime;
  }


}

