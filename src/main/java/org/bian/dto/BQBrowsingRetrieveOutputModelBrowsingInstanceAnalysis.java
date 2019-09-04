package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrowsingRetrieveOutputModelBrowsingInstanceAnalysis
 */
public class BQBrowsingRetrieveOutputModelBrowsingInstanceAnalysis   {
  private Object browsingInstanceAnalysisRecord = null;

  private String browsingInstanceAnalysisReportType = null;

  private String browsingInstanceAnalysisParameters = null;

  private Object browsingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return browsingInstanceAnalysisRecord
  **/

  public Object getBrowsingInstanceAnalysisRecord() {
    return browsingInstanceAnalysisRecord;
  }

  public void setBrowsingInstanceAnalysisRecord(Object browsingInstanceAnalysisRecord) {
    this.browsingInstanceAnalysisRecord = browsingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return browsingInstanceAnalysisReportType
  **/

  public String getBrowsingInstanceAnalysisReportType() {
    return browsingInstanceAnalysisReportType;
  }

  public void setBrowsingInstanceAnalysisReportType(String browsingInstanceAnalysisReportType) {
    this.browsingInstanceAnalysisReportType = browsingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return browsingInstanceAnalysisParameters
  **/

  public String getBrowsingInstanceAnalysisParameters() {
    return browsingInstanceAnalysisParameters;
  }

  public void setBrowsingInstanceAnalysisParameters(String browsingInstanceAnalysisParameters) {
    this.browsingInstanceAnalysisParameters = browsingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return browsingInstanceAnalysisReport
  **/

  public Object getBrowsingInstanceAnalysisReport() {
    return browsingInstanceAnalysisReport;
  }

  public void setBrowsingInstanceAnalysisReport(Object browsingInstanceAnalysisReport) {
    this.browsingInstanceAnalysisReport = browsingInstanceAnalysisReport;
  }


}

