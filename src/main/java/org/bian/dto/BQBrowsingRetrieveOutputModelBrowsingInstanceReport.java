package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrowsingRetrieveOutputModelBrowsingInstanceReport
 */
public class BQBrowsingRetrieveOutputModelBrowsingInstanceReport   {
  private Object browsingInstanceReportRecord = null;

  private String browsingInstanceReportType = null;

  private String browsingInstanceReportParameters = null;

  private Object browsingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return browsingInstanceReportRecord
  **/

  public Object getBrowsingInstanceReportRecord() {
    return browsingInstanceReportRecord;
  }

  public void setBrowsingInstanceReportRecord(Object browsingInstanceReportRecord) {
    this.browsingInstanceReportRecord = browsingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return browsingInstanceReportType
  **/

  public String getBrowsingInstanceReportType() {
    return browsingInstanceReportType;
  }

  public void setBrowsingInstanceReportType(String browsingInstanceReportType) {
    this.browsingInstanceReportType = browsingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return browsingInstanceReportParameters
  **/

  public String getBrowsingInstanceReportParameters() {
    return browsingInstanceReportParameters;
  }

  public void setBrowsingInstanceReportParameters(String browsingInstanceReportParameters) {
    this.browsingInstanceReportParameters = browsingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return browsingInstanceReport
  **/

  public Object getBrowsingInstanceReport() {
    return browsingInstanceReport;
  }

  public void setBrowsingInstanceReport(Object browsingInstanceReport) {
    this.browsingInstanceReport = browsingInstanceReport;
  }


}

