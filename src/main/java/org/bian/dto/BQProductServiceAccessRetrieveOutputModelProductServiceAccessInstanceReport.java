package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceReport
 */
public class BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceReport   {
  private Object productServiceAccessInstanceReportRecord = null;

  private String productServiceAccessInstanceReportType = null;

  private String productServiceAccessInstanceReportParameters = null;

  private Object productServiceAccessInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productServiceAccessInstanceReportRecord
  **/

  public Object getProductServiceAccessInstanceReportRecord() {
    return productServiceAccessInstanceReportRecord;
  }

  public void setProductServiceAccessInstanceReportRecord(Object productServiceAccessInstanceReportRecord) {
    this.productServiceAccessInstanceReportRecord = productServiceAccessInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productServiceAccessInstanceReportType
  **/

  public String getProductServiceAccessInstanceReportType() {
    return productServiceAccessInstanceReportType;
  }

  public void setProductServiceAccessInstanceReportType(String productServiceAccessInstanceReportType) {
    this.productServiceAccessInstanceReportType = productServiceAccessInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productServiceAccessInstanceReportParameters
  **/

  public String getProductServiceAccessInstanceReportParameters() {
    return productServiceAccessInstanceReportParameters;
  }

  public void setProductServiceAccessInstanceReportParameters(String productServiceAccessInstanceReportParameters) {
    this.productServiceAccessInstanceReportParameters = productServiceAccessInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productServiceAccessInstanceReport
  **/

  public Object getProductServiceAccessInstanceReport() {
    return productServiceAccessInstanceReport;
  }

  public void setProductServiceAccessInstanceReport(Object productServiceAccessInstanceReport) {
    this.productServiceAccessInstanceReport = productServiceAccessInstanceReport;
  }


}

