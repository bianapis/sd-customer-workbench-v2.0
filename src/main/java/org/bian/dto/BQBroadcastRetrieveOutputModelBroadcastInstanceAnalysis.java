package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBroadcastRetrieveOutputModelBroadcastInstanceAnalysis
 */
public class BQBroadcastRetrieveOutputModelBroadcastInstanceAnalysis   {
  private Object broadcastInstanceAnalysisRecord = null;

  private String broadcastInstanceAnalysisReportType = null;

  private String broadcastInstanceAnalysisParameters = null;

  private Object broadcastInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return broadcastInstanceAnalysisRecord
  **/

  public Object getBroadcastInstanceAnalysisRecord() {
    return broadcastInstanceAnalysisRecord;
  }

  public void setBroadcastInstanceAnalysisRecord(Object broadcastInstanceAnalysisRecord) {
    this.broadcastInstanceAnalysisRecord = broadcastInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return broadcastInstanceAnalysisReportType
  **/

  public String getBroadcastInstanceAnalysisReportType() {
    return broadcastInstanceAnalysisReportType;
  }

  public void setBroadcastInstanceAnalysisReportType(String broadcastInstanceAnalysisReportType) {
    this.broadcastInstanceAnalysisReportType = broadcastInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return broadcastInstanceAnalysisParameters
  **/

  public String getBroadcastInstanceAnalysisParameters() {
    return broadcastInstanceAnalysisParameters;
  }

  public void setBroadcastInstanceAnalysisParameters(String broadcastInstanceAnalysisParameters) {
    this.broadcastInstanceAnalysisParameters = broadcastInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return broadcastInstanceAnalysisReport
  **/

  public Object getBroadcastInstanceAnalysisReport() {
    return broadcastInstanceAnalysisReport;
  }

  public void setBroadcastInstanceAnalysisReport(Object broadcastInstanceAnalysisReport) {
    this.broadcastInstanceAnalysisReport = broadcastInstanceAnalysisReport;
  }


}

