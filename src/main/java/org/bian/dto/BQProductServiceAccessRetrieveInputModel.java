package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceAnalysis;
import org.bian.dto.BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessRetrieveInputModel
 */
public class BQProductServiceAccessRetrieveInputModel   {
  private Object productServiceAccessRetrieveActionTaskRecord = null;

  private String productServiceAccessRetrieveActionRequest = null;

  private BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceReport productServiceAccessInstanceReport = null;

  private BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceAnalysis productServiceAccessInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productServiceAccessRetrieveActionTaskRecord
  **/

  public Object getProductServiceAccessRetrieveActionTaskRecord() {
    return productServiceAccessRetrieveActionTaskRecord;
  }

  public void setProductServiceAccessRetrieveActionTaskRecord(Object productServiceAccessRetrieveActionTaskRecord) {
    this.productServiceAccessRetrieveActionTaskRecord = productServiceAccessRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productServiceAccessRetrieveActionRequest
  **/

  public String getProductServiceAccessRetrieveActionRequest() {
    return productServiceAccessRetrieveActionRequest;
  }

  public void setProductServiceAccessRetrieveActionRequest(String productServiceAccessRetrieveActionRequest) {
    this.productServiceAccessRetrieveActionRequest = productServiceAccessRetrieveActionRequest;
  }


  /**
   * Get productServiceAccessInstanceReport
   * @return productServiceAccessInstanceReport
  **/

  public BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceReport getProductServiceAccessInstanceReport() {
    return productServiceAccessInstanceReport;
  }

  public void setProductServiceAccessInstanceReport(BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceReport productServiceAccessInstanceReport) {
    this.productServiceAccessInstanceReport = productServiceAccessInstanceReport;
  }


  /**
   * Get productServiceAccessInstanceAnalysis
   * @return productServiceAccessInstanceAnalysis
  **/

  public BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceAnalysis getProductServiceAccessInstanceAnalysis() {
    return productServiceAccessInstanceAnalysis;
  }

  public void setProductServiceAccessInstanceAnalysis(BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceAnalysis productServiceAccessInstanceAnalysis) {
    this.productServiceAccessInstanceAnalysis = productServiceAccessInstanceAnalysis;
  }


}

