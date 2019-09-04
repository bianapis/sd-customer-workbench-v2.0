package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceAnalysis
 */
public class CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceAnalysis   {
  private String customerWorkbenchOperatingSessionInstanceAnalysisData = null;

  private String customerWorkbenchOperatingSessionInstanceAnalysisReportType = null;

  private Object customerWorkbenchOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerWorkbenchOperatingSessionInstanceAnalysisData
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceAnalysisData() {
    return customerWorkbenchOperatingSessionInstanceAnalysisData;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysisData(String customerWorkbenchOperatingSessionInstanceAnalysisData) {
    this.customerWorkbenchOperatingSessionInstanceAnalysisData = customerWorkbenchOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerWorkbenchOperatingSessionInstanceAnalysisReportType
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceAnalysisReportType() {
    return customerWorkbenchOperatingSessionInstanceAnalysisReportType;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysisReportType(String customerWorkbenchOperatingSessionInstanceAnalysisReportType) {
    this.customerWorkbenchOperatingSessionInstanceAnalysisReportType = customerWorkbenchOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerWorkbenchOperatingSessionInstanceAnalysisReport
  **/

  public Object getCustomerWorkbenchOperatingSessionInstanceAnalysisReport() {
    return customerWorkbenchOperatingSessionInstanceAnalysisReport;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysisReport(Object customerWorkbenchOperatingSessionInstanceAnalysisReport) {
    this.customerWorkbenchOperatingSessionInstanceAnalysisReport = customerWorkbenchOperatingSessionInstanceAnalysisReport;
  }


}

