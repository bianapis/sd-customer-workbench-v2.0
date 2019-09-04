package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceReportRecord
 */
public class CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceReportRecord   {
  private String customerWorkbenchOperatingSessionInstanceReportReference = null;

  private String customerWorkbenchOperatingSessionInstanceReportType = null;

  private String customerWorkbenchOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerWorkbenchOperatingSessionInstanceReportReference
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReportReference() {
    return customerWorkbenchOperatingSessionInstanceReportReference;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReportReference(String customerWorkbenchOperatingSessionInstanceReportReference) {
    this.customerWorkbenchOperatingSessionInstanceReportReference = customerWorkbenchOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerWorkbenchOperatingSessionInstanceReportParameters
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReportParameters() {
    return customerWorkbenchOperatingSessionInstanceReportParameters;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReportParameters(String customerWorkbenchOperatingSessionInstanceReportParameters) {
    this.customerWorkbenchOperatingSessionInstanceReportParameters = customerWorkbenchOperatingSessionInstanceReportParameters;
  }


}

