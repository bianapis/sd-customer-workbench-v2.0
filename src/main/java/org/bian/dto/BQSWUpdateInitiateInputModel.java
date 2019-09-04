package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSWUpdateInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.BQSWUpdateInitiateInputModelSWUpdateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSWUpdateInitiateInputModel
 */
public class BQSWUpdateInitiateInputModel   {
  private BQSWUpdateInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private Object sWUpdateInitiateActionRecord = null;

  private BQSWUpdateInitiateInputModelSWUpdateInstanceRecord sWUpdateInstanceRecord = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQSWUpdateInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQSWUpdateInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Workbench Operating Session instance 
   * @return customerWorkbenchOperatingSessionInstanceReference
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReference() {
    return customerWorkbenchOperatingSessionInstanceReference;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReference(String customerWorkbenchOperatingSessionInstanceReference) {
    this.customerWorkbenchOperatingSessionInstanceReference = customerWorkbenchOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return sWUpdateInitiateActionRecord
  **/

  public Object getSWUpdateInitiateActionRecord() {
    return sWUpdateInitiateActionRecord;
  }

  
  @JsonProperty("sWUpdateInitiateActionRecord")
  public void setSWUpdateInitiateActionRecord(Object sWUpdateInitiateActionRecord) {
    this.sWUpdateInitiateActionRecord = sWUpdateInitiateActionRecord;
  }


  /**
   * Get sWUpdateInstanceRecord
   * @return sWUpdateInstanceRecord
  **/

  public BQSWUpdateInitiateInputModelSWUpdateInstanceRecord getSWUpdateInstanceRecord() {
    return sWUpdateInstanceRecord;
  }

  //@JsonProperty("sWUpdateInstanceRecord")
  public void setSWUpdateInstanceRecord(BQSWUpdateInitiateInputModelSWUpdateInstanceRecord sWUpdateInstanceRecord) {
    this.sWUpdateInstanceRecord = sWUpdateInstanceRecord;
  }


}

