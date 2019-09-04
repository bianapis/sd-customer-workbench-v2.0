package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceAnalysis
 */
public class CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceAnalysis   {
  private String customerWorkbenchOperatingSessionInstanceAnalysisReference = null;

  private String customerWorkbenchOperatingSessionInstanceAnalysisReportType = null;

  private String customerWorkbenchOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerWorkbenchOperatingSessionInstanceAnalysisReference
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceAnalysisReference() {
    return customerWorkbenchOperatingSessionInstanceAnalysisReference;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysisReference(String customerWorkbenchOperatingSessionInstanceAnalysisReference) {
    this.customerWorkbenchOperatingSessionInstanceAnalysisReference = customerWorkbenchOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerWorkbenchOperatingSessionInstanceAnalysisParameters
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceAnalysisParameters() {
    return customerWorkbenchOperatingSessionInstanceAnalysisParameters;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysisParameters(String customerWorkbenchOperatingSessionInstanceAnalysisParameters) {
    this.customerWorkbenchOperatingSessionInstanceAnalysisParameters = customerWorkbenchOperatingSessionInstanceAnalysisParameters;
  }


}

