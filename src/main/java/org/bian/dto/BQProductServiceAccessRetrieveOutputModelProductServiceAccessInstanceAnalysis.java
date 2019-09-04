package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceAnalysis
 */
public class BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceAnalysis   {
  private Object productServiceAccessInstanceAnalysisRecord = null;

  private String productServiceAccessInstanceAnalysisReportType = null;

  private String productServiceAccessInstanceAnalysisParameters = null;

  private Object productServiceAccessInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productServiceAccessInstanceAnalysisRecord
  **/

  public Object getProductServiceAccessInstanceAnalysisRecord() {
    return productServiceAccessInstanceAnalysisRecord;
  }

  public void setProductServiceAccessInstanceAnalysisRecord(Object productServiceAccessInstanceAnalysisRecord) {
    this.productServiceAccessInstanceAnalysisRecord = productServiceAccessInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productServiceAccessInstanceAnalysisReportType
  **/

  public String getProductServiceAccessInstanceAnalysisReportType() {
    return productServiceAccessInstanceAnalysisReportType;
  }

  public void setProductServiceAccessInstanceAnalysisReportType(String productServiceAccessInstanceAnalysisReportType) {
    this.productServiceAccessInstanceAnalysisReportType = productServiceAccessInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productServiceAccessInstanceAnalysisParameters
  **/

  public String getProductServiceAccessInstanceAnalysisParameters() {
    return productServiceAccessInstanceAnalysisParameters;
  }

  public void setProductServiceAccessInstanceAnalysisParameters(String productServiceAccessInstanceAnalysisParameters) {
    this.productServiceAccessInstanceAnalysisParameters = productServiceAccessInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return productServiceAccessInstanceAnalysisReport
  **/

  public Object getProductServiceAccessInstanceAnalysisReport() {
    return productServiceAccessInstanceAnalysisReport;
  }

  public void setProductServiceAccessInstanceAnalysisReport(Object productServiceAccessInstanceAnalysisReport) {
    this.productServiceAccessInstanceAnalysisReport = productServiceAccessInstanceAnalysisReport;
  }


}

