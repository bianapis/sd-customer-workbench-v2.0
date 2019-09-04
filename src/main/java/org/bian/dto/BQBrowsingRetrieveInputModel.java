package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingRetrieveInputModelBrowsingInstanceAnalysis;
import org.bian.dto.BQBrowsingRetrieveInputModelBrowsingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBrowsingRetrieveInputModel
 */
public class BQBrowsingRetrieveInputModel   {
  private Object browsingRetrieveActionTaskRecord = null;

  private String browsingRetrieveActionRequest = null;

  private BQBrowsingRetrieveInputModelBrowsingInstanceReport browsingInstanceReport = null;

  private BQBrowsingRetrieveInputModelBrowsingInstanceAnalysis browsingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return browsingRetrieveActionTaskRecord
  **/

  public Object getBrowsingRetrieveActionTaskRecord() {
    return browsingRetrieveActionTaskRecord;
  }

  public void setBrowsingRetrieveActionTaskRecord(Object browsingRetrieveActionTaskRecord) {
    this.browsingRetrieveActionTaskRecord = browsingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return browsingRetrieveActionRequest
  **/

  public String getBrowsingRetrieveActionRequest() {
    return browsingRetrieveActionRequest;
  }

  public void setBrowsingRetrieveActionRequest(String browsingRetrieveActionRequest) {
    this.browsingRetrieveActionRequest = browsingRetrieveActionRequest;
  }


  /**
   * Get browsingInstanceReport
   * @return browsingInstanceReport
  **/

  public BQBrowsingRetrieveInputModelBrowsingInstanceReport getBrowsingInstanceReport() {
    return browsingInstanceReport;
  }

  public void setBrowsingInstanceReport(BQBrowsingRetrieveInputModelBrowsingInstanceReport browsingInstanceReport) {
    this.browsingInstanceReport = browsingInstanceReport;
  }


  /**
   * Get browsingInstanceAnalysis
   * @return browsingInstanceAnalysis
  **/

  public BQBrowsingRetrieveInputModelBrowsingInstanceAnalysis getBrowsingInstanceAnalysis() {
    return browsingInstanceAnalysis;
  }

  public void setBrowsingInstanceAnalysis(BQBrowsingRetrieveInputModelBrowsingInstanceAnalysis browsingInstanceAnalysis) {
    this.browsingInstanceAnalysis = browsingInstanceAnalysis;
  }


}

