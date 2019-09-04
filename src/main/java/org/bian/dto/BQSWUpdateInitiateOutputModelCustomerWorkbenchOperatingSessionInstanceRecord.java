package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord
 */
public class BQSWUpdateInitiateOutputModelCustomerWorkbenchOperatingSessionInstanceRecord   {
  private String installedBankApplicationType = null;

  private String installedBankApplicationVersionNumber = null;

  private String lastUpdateDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the local bank applications  
   * @return installedBankApplicationType
  **/

  public String getInstalledBankApplicationType() {
    return installedBankApplicationType;
  }

  public void setInstalledBankApplicationType(String installedBankApplicationType) {
    this.installedBankApplicationType = installedBankApplicationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version number(s) of device resident bank software 
   * @return installedBankApplicationVersionNumber
  **/

  public String getInstalledBankApplicationVersionNumber() {
    return installedBankApplicationVersionNumber;
  }

  public void setInstalledBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
    this.installedBankApplicationVersionNumber = installedBankApplicationVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The last update date time stamp for local bank software 
   * @return lastUpdateDateTime
  **/

  public String getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(String lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }


}

