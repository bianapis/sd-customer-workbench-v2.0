package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBroadcastRetrieveOutputModelBroadcastInstanceReport
 */
public class BQBroadcastRetrieveOutputModelBroadcastInstanceReport   {
  private Object broadcastInstanceReportRecord = null;

  private String broadcastInstanceReportType = null;

  private String broadcastInstanceReportParameters = null;

  private Object broadcastInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return broadcastInstanceReportRecord
  **/

  public Object getBroadcastInstanceReportRecord() {
    return broadcastInstanceReportRecord;
  }

  public void setBroadcastInstanceReportRecord(Object broadcastInstanceReportRecord) {
    this.broadcastInstanceReportRecord = broadcastInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return broadcastInstanceReportType
  **/

  public String getBroadcastInstanceReportType() {
    return broadcastInstanceReportType;
  }

  public void setBroadcastInstanceReportType(String broadcastInstanceReportType) {
    this.broadcastInstanceReportType = broadcastInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return broadcastInstanceReportParameters
  **/

  public String getBroadcastInstanceReportParameters() {
    return broadcastInstanceReportParameters;
  }

  public void setBroadcastInstanceReportParameters(String broadcastInstanceReportParameters) {
    this.broadcastInstanceReportParameters = broadcastInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return broadcastInstanceReport
  **/

  public Object getBroadcastInstanceReport() {
    return broadcastInstanceReport;
  }

  public void setBroadcastInstanceReport(Object broadcastInstanceReport) {
    this.broadcastInstanceReport = broadcastInstanceReport;
  }


}

