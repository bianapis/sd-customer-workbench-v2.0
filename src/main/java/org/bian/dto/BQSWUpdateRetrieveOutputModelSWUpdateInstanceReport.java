package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateRetrieveOutputModelSWUpdateInstanceReport
 */
public class BQSWUpdateRetrieveOutputModelSWUpdateInstanceReport   {
  private Object sWUpdateInstanceReportRecord = null;

  private String sWUpdateInstanceReportType = null;

  private String sWUpdateInstanceReportParameters = null;

  private Object sWUpdateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return sWUpdateInstanceReportRecord
  **/

  public Object getSWUpdateInstanceReportRecord() {
    return sWUpdateInstanceReportRecord;
  }

  @JsonProperty("sWUpdateInstanceReportRecord")
  public void setSWUpdateInstanceReportRecord(Object sWUpdateInstanceReportRecord) {
    this.sWUpdateInstanceReportRecord = sWUpdateInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return sWUpdateInstanceReportType
  **/

  public String getSWUpdateInstanceReportType() {
    return sWUpdateInstanceReportType;
  }

  @JsonProperty("sWUpdateInstanceReportType")
  public void setSWUpdateInstanceReportType(String sWUpdateInstanceReportType) {
    this.sWUpdateInstanceReportType = sWUpdateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return sWUpdateInstanceReportParameters
  **/

  public String getSWUpdateInstanceReportParameters() {
    return sWUpdateInstanceReportParameters;
  }

  @JsonProperty("sWUpdateInstanceReportParameters")
  public void setSWUpdateInstanceReportParameters(String sWUpdateInstanceReportParameters) {
    this.sWUpdateInstanceReportParameters = sWUpdateInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return sWUpdateInstanceReport
  **/

  public Object getSWUpdateInstanceReport() {
    return sWUpdateInstanceReport;
  }

  @JsonProperty("sWUpdateInstanceReport")
  public void setSWUpdateInstanceReport(Object sWUpdateInstanceReport) {
    this.sWUpdateInstanceReport = sWUpdateInstanceReport;
  }


}

