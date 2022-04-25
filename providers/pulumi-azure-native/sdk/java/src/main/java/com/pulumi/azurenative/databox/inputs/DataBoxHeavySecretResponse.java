// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.AccountCredentialDetailsResponse;
import com.pulumi.azurenative.databox.inputs.ApplianceNetworkConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The secrets related to a databox heavy.
 * 
 */
public final class DataBoxHeavySecretResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataBoxHeavySecretResponse Empty = new DataBoxHeavySecretResponse();

    /**
     * Per account level access credentials.
     * 
     */
    @Import(name="accountCredentialDetails", required=true)
    private List<AccountCredentialDetailsResponse> accountCredentialDetails;

    /**
     * @return Per account level access credentials.
     * 
     */
    public List<AccountCredentialDetailsResponse> accountCredentialDetails() {
        return this.accountCredentialDetails;
    }

    /**
     * Password for out of the box experience on device.
     * 
     */
    @Import(name="devicePassword", required=true)
    private String devicePassword;

    /**
     * @return Password for out of the box experience on device.
     * 
     */
    public String devicePassword() {
        return this.devicePassword;
    }

    /**
     * Serial number of the assigned device.
     * 
     */
    @Import(name="deviceSerialNumber", required=true)
    private String deviceSerialNumber;

    /**
     * @return Serial number of the assigned device.
     * 
     */
    public String deviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    /**
     * The base 64 encoded public key to authenticate with the device
     * 
     */
    @Import(name="encodedValidationCertPubKey", required=true)
    private String encodedValidationCertPubKey;

    /**
     * @return The base 64 encoded public key to authenticate with the device
     * 
     */
    public String encodedValidationCertPubKey() {
        return this.encodedValidationCertPubKey;
    }

    /**
     * Network configuration of the appliance.
     * 
     */
    @Import(name="networkConfigurations", required=true)
    private List<ApplianceNetworkConfigurationResponse> networkConfigurations;

    /**
     * @return Network configuration of the appliance.
     * 
     */
    public List<ApplianceNetworkConfigurationResponse> networkConfigurations() {
        return this.networkConfigurations;
    }

    private DataBoxHeavySecretResponse() {}

    private DataBoxHeavySecretResponse(DataBoxHeavySecretResponse $) {
        this.accountCredentialDetails = $.accountCredentialDetails;
        this.devicePassword = $.devicePassword;
        this.deviceSerialNumber = $.deviceSerialNumber;
        this.encodedValidationCertPubKey = $.encodedValidationCertPubKey;
        this.networkConfigurations = $.networkConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataBoxHeavySecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataBoxHeavySecretResponse $;

        public Builder() {
            $ = new DataBoxHeavySecretResponse();
        }

        public Builder(DataBoxHeavySecretResponse defaults) {
            $ = new DataBoxHeavySecretResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountCredentialDetails Per account level access credentials.
         * 
         * @return builder
         * 
         */
        public Builder accountCredentialDetails(List<AccountCredentialDetailsResponse> accountCredentialDetails) {
            $.accountCredentialDetails = accountCredentialDetails;
            return this;
        }

        /**
         * @param accountCredentialDetails Per account level access credentials.
         * 
         * @return builder
         * 
         */
        public Builder accountCredentialDetails(AccountCredentialDetailsResponse... accountCredentialDetails) {
            return accountCredentialDetails(List.of(accountCredentialDetails));
        }

        /**
         * @param devicePassword Password for out of the box experience on device.
         * 
         * @return builder
         * 
         */
        public Builder devicePassword(String devicePassword) {
            $.devicePassword = devicePassword;
            return this;
        }

        /**
         * @param deviceSerialNumber Serial number of the assigned device.
         * 
         * @return builder
         * 
         */
        public Builder deviceSerialNumber(String deviceSerialNumber) {
            $.deviceSerialNumber = deviceSerialNumber;
            return this;
        }

        /**
         * @param encodedValidationCertPubKey The base 64 encoded public key to authenticate with the device
         * 
         * @return builder
         * 
         */
        public Builder encodedValidationCertPubKey(String encodedValidationCertPubKey) {
            $.encodedValidationCertPubKey = encodedValidationCertPubKey;
            return this;
        }

        /**
         * @param networkConfigurations Network configuration of the appliance.
         * 
         * @return builder
         * 
         */
        public Builder networkConfigurations(List<ApplianceNetworkConfigurationResponse> networkConfigurations) {
            $.networkConfigurations = networkConfigurations;
            return this;
        }

        /**
         * @param networkConfigurations Network configuration of the appliance.
         * 
         * @return builder
         * 
         */
        public Builder networkConfigurations(ApplianceNetworkConfigurationResponse... networkConfigurations) {
            return networkConfigurations(List.of(networkConfigurations));
        }

        public DataBoxHeavySecretResponse build() {
            $.accountCredentialDetails = Objects.requireNonNull($.accountCredentialDetails, "expected parameter 'accountCredentialDetails' to be non-null");
            $.devicePassword = Objects.requireNonNull($.devicePassword, "expected parameter 'devicePassword' to be non-null");
            $.deviceSerialNumber = Objects.requireNonNull($.deviceSerialNumber, "expected parameter 'deviceSerialNumber' to be non-null");
            $.encodedValidationCertPubKey = Objects.requireNonNull($.encodedValidationCertPubKey, "expected parameter 'encodedValidationCertPubKey' to be non-null");
            $.networkConfigurations = Objects.requireNonNull($.networkConfigurations, "expected parameter 'networkConfigurations' to be non-null");
            return $;
        }
    }

}
