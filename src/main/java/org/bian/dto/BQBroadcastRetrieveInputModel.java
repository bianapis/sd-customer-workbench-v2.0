package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBroadcastRetrieveInputModelBroadcastInstanceAnalysis;
import org.bian.dto.BQBroadcastRetrieveInputModelBroadcastInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBroadcastRetrieveInputModel
 */
public class BQBroadcastRetrieveInputModel   {
  private Object broadcastRetrieveActionTaskRecord = null;

  private String broadcastRetrieveActionRequest = null;

  private BQBroadcastRetrieveInputModelBroadcastInstanceReport broadcastInstanceReport = null;

  private BQBroadcastRetrieveInputModelBroadcastInstanceAnalysis broadcastInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return broadcastRetrieveActionTaskRecord
  **/

  public Object getBroadcastRetrieveActionTaskRecord() {
    return broadcastRetrieveActionTaskRecord;
  }

  public void setBroadcastRetrieveActionTaskRecord(Object broadcastRetrieveActionTaskRecord) {
    this.broadcastRetrieveActionTaskRecord = broadcastRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return broadcastRetrieveActionRequest
  **/

  public String getBroadcastRetrieveActionRequest() {
    return broadcastRetrieveActionRequest;
  }

  public void setBroadcastRetrieveActionRequest(String broadcastRetrieveActionRequest) {
    this.broadcastRetrieveActionRequest = broadcastRetrieveActionRequest;
  }


  /**
   * Get broadcastInstanceReport
   * @return broadcastInstanceReport
  **/

  public BQBroadcastRetrieveInputModelBroadcastInstanceReport getBroadcastInstanceReport() {
    return broadcastInstanceReport;
  }

  public void setBroadcastInstanceReport(BQBroadcastRetrieveInputModelBroadcastInstanceReport broadcastInstanceReport) {
    this.broadcastInstanceReport = broadcastInstanceReport;
  }


  /**
   * Get broadcastInstanceAnalysis
   * @return broadcastInstanceAnalysis
  **/

  public BQBroadcastRetrieveInputModelBroadcastInstanceAnalysis getBroadcastInstanceAnalysis() {
    return broadcastInstanceAnalysis;
  }

  public void setBroadcastInstanceAnalysis(BQBroadcastRetrieveInputModelBroadcastInstanceAnalysis broadcastInstanceAnalysis) {
    this.broadcastInstanceAnalysis = broadcastInstanceAnalysis;
  }


}

