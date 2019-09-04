package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord
 */
public class CRCustomerWorkbenchOperatingSessionInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord   {
  private String customerWorkbenchDeviceAccessPermissions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The bank's access permissions (e.g. local storage access, administrator permissions, system download permission) 
   * @return customerWorkbenchDeviceAccessPermissions
  **/

  public String getCustomerWorkbenchDeviceAccessPermissions() {
    return customerWorkbenchDeviceAccessPermissions;
  }

  public void setCustomerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
    this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
  }


}

