package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSWUpdateRetrieveInputModelSWUpdateInstanceAnalysis;
import org.bian.dto.BQSWUpdateRetrieveInputModelSWUpdateInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSWUpdateRetrieveInputModel
 */
public class BQSWUpdateRetrieveInputModel   {
  private Object sWUpdateRetrieveActionTaskRecord = null;

  private String sWUpdateRetrieveActionRequest = null;

  private BQSWUpdateRetrieveInputModelSWUpdateInstanceReport sWUpdateInstanceReport = null;

  private BQSWUpdateRetrieveInputModelSWUpdateInstanceAnalysis sWUpdateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return sWUpdateRetrieveActionTaskRecord
  **/

  public Object getSWUpdateRetrieveActionTaskRecord() {
    return sWUpdateRetrieveActionTaskRecord;
  }

  public void setSWUpdateRetrieveActionTaskRecord(Object sWUpdateRetrieveActionTaskRecord) {
    this.sWUpdateRetrieveActionTaskRecord = sWUpdateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return sWUpdateRetrieveActionRequest
  **/

  public String getSWUpdateRetrieveActionRequest() {
    return sWUpdateRetrieveActionRequest;
  }

  public void setSWUpdateRetrieveActionRequest(String sWUpdateRetrieveActionRequest) {
    this.sWUpdateRetrieveActionRequest = sWUpdateRetrieveActionRequest;
  }


  /**
   * Get sWUpdateInstanceReport
   * @return sWUpdateInstanceReport
  **/

  public BQSWUpdateRetrieveInputModelSWUpdateInstanceReport getSWUpdateInstanceReport() {
    return sWUpdateInstanceReport;
  }

  @JsonProperty("sWUpdateInstanceReport")
  public void setSWUpdateInstanceReport(BQSWUpdateRetrieveInputModelSWUpdateInstanceReport sWUpdateInstanceReport) {
    this.sWUpdateInstanceReport = sWUpdateInstanceReport;
  }


  /**
   * Get sWUpdateInstanceAnalysis
   * @return sWUpdateInstanceAnalysis
  **/

  public BQSWUpdateRetrieveInputModelSWUpdateInstanceAnalysis getSWUpdateInstanceAnalysis() {
    return sWUpdateInstanceAnalysis;
  }

  public void setSWUpdateInstanceAnalysis(BQSWUpdateRetrieveInputModelSWUpdateInstanceAnalysis sWUpdateInstanceAnalysis) {
    this.sWUpdateInstanceAnalysis = sWUpdateInstanceAnalysis;
  }


}

