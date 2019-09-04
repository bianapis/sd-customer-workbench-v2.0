package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceReportRecord
 */
public class CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceReportRecord   {
  private String customerWorkbenchOperatingSessionInstanceReportData = null;

  private String customerWorkbenchOperatingSessionInstanceReportType = null;

  private Object customerWorkbenchOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerWorkbenchOperatingSessionInstanceReportData
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReportData() {
    return customerWorkbenchOperatingSessionInstanceReportData;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReportData(String customerWorkbenchOperatingSessionInstanceReportData) {
    this.customerWorkbenchOperatingSessionInstanceReportData = customerWorkbenchOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerWorkbenchOperatingSessionInstanceReportType
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReportType() {
    return customerWorkbenchOperatingSessionInstanceReportType;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReportType(String customerWorkbenchOperatingSessionInstanceReportType) {
    this.customerWorkbenchOperatingSessionInstanceReportType = customerWorkbenchOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerWorkbenchOperatingSessionInstanceReport
  **/

  public Object getCustomerWorkbenchOperatingSessionInstanceReport() {
    return customerWorkbenchOperatingSessionInstanceReport;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReport(Object customerWorkbenchOperatingSessionInstanceReport) {
    this.customerWorkbenchOperatingSessionInstanceReport = customerWorkbenchOperatingSessionInstanceReport;
  }


}

