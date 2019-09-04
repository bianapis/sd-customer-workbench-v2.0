package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBroadcastInitiateOutputModelBroadcastInstanceRecord
 */
public class BQBroadcastInitiateOutputModelBroadcastInstanceRecord   {
  private String customerWorkbenchBroadcastRecordDateTime = null;


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

