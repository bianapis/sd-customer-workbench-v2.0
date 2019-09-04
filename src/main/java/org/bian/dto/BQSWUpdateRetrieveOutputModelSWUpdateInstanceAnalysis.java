package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateRetrieveOutputModelSWUpdateInstanceAnalysis
 */
public class BQSWUpdateRetrieveOutputModelSWUpdateInstanceAnalysis   {
  private Object sWUpdateInstanceAnalysisRecord = null;

  private String sWUpdateInstanceAnalysisReportType = null;

  private String sWUpdateInstanceAnalysisParameters = null;

  private Object sWUpdateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return sWUpdateInstanceAnalysisRecord
  **/

  public Object getSWUpdateInstanceAnalysisRecord() {
    return sWUpdateInstanceAnalysisRecord;
  }

  @JsonProperty("sWUpdateInstanceAnalysisRecord")
  public void setSWUpdateInstanceAnalysisRecord(Object sWUpdateInstanceAnalysisRecord) {
    this.sWUpdateInstanceAnalysisRecord = sWUpdateInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return sWUpdateInstanceAnalysisReportType
  **/

  public String getSWUpdateInstanceAnalysisReportType() {
    return sWUpdateInstanceAnalysisReportType;
  }

  @JsonProperty("sWUpdateInstanceAnalysisReportType")
  public void setSWUpdateInstanceAnalysisReportType(String sWUpdateInstanceAnalysisReportType) {
    this.sWUpdateInstanceAnalysisReportType = sWUpdateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return sWUpdateInstanceAnalysisParameters
  **/

  public String getSWUpdateInstanceAnalysisParameters() {
    return sWUpdateInstanceAnalysisParameters;
  }

  @JsonProperty("sWUpdateInstanceAnalysisParameters")
  public void setSWUpdateInstanceAnalysisParameters(String sWUpdateInstanceAnalysisParameters) {
    this.sWUpdateInstanceAnalysisParameters = sWUpdateInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return sWUpdateInstanceAnalysisReport
  **/

  public Object getSWUpdateInstanceAnalysisReport() {
    return sWUpdateInstanceAnalysisReport;
  }

  @JsonProperty("sWUpdateInstanceAnalysisReport")
  public void setSWUpdateInstanceAnalysisReport(Object sWUpdateInstanceAnalysisReport) {
    this.sWUpdateInstanceAnalysisReport = sWUpdateInstanceAnalysisReport;
  }


}

