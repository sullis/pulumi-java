// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.DatasourceResponse;
import com.pulumi.azurenative.dataprotection.inputs.DatasourceSetResponse;
import com.pulumi.azurenative.dataprotection.inputs.PolicyInfoResponse;
import com.pulumi.azurenative.dataprotection.inputs.ProtectionStatusDetailsResponse;
import com.pulumi.azurenative.dataprotection.inputs.UserFacingErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backup Instance
 * 
 */
public final class BackupInstanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackupInstanceResponse Empty = new BackupInstanceResponse();

    /**
     * Specifies the current protection state of the resource
     * 
     */
    @Import(name="currentProtectionState", required=true)
    private String currentProtectionState;

    /**
     * @return Specifies the current protection state of the resource
     * 
     */
    public String currentProtectionState() {
        return this.currentProtectionState;
    }

    /**
     * Gets or sets the data source information.
     * 
     */
    @Import(name="dataSourceInfo", required=true)
    private DatasourceResponse dataSourceInfo;

    /**
     * @return Gets or sets the data source information.
     * 
     */
    public DatasourceResponse dataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Gets or sets the data source set information.
     * 
     */
    @Import(name="dataSourceSetInfo")
    private @Nullable DatasourceSetResponse dataSourceSetInfo;

    /**
     * @return Gets or sets the data source set information.
     * 
     */
    public Optional<DatasourceSetResponse> dataSourceSetInfo() {
        return Optional.ofNullable(this.dataSourceSetInfo);
    }

    /**
     * Gets or sets the Backup Instance friendly name.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return Gets or sets the Backup Instance friendly name.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    @Import(name="objectType", required=true)
    private String objectType;

    public String objectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the policy information.
     * 
     */
    @Import(name="policyInfo", required=true)
    private PolicyInfoResponse policyInfo;

    /**
     * @return Gets or sets the policy information.
     * 
     */
    public PolicyInfoResponse policyInfo() {
        return this.policyInfo;
    }

    /**
     * Specifies the protection error of the resource
     * 
     */
    @Import(name="protectionErrorDetails", required=true)
    private UserFacingErrorResponse protectionErrorDetails;

    /**
     * @return Specifies the protection error of the resource
     * 
     */
    public UserFacingErrorResponse protectionErrorDetails() {
        return this.protectionErrorDetails;
    }

    /**
     * Specifies the protection status of the resource
     * 
     */
    @Import(name="protectionStatus", required=true)
    private ProtectionStatusDetailsResponse protectionStatus;

    /**
     * @return Specifies the protection status of the resource
     * 
     */
    public ProtectionStatusDetailsResponse protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Specifies the provisioning state of the resource i.e. provisioning/updating/Succeeded/Failed
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Specifies the provisioning state of the resource i.e. provisioning/updating/Succeeded/Failed
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    private BackupInstanceResponse() {}

    private BackupInstanceResponse(BackupInstanceResponse $) {
        this.currentProtectionState = $.currentProtectionState;
        this.dataSourceInfo = $.dataSourceInfo;
        this.dataSourceSetInfo = $.dataSourceSetInfo;
        this.friendlyName = $.friendlyName;
        this.objectType = $.objectType;
        this.policyInfo = $.policyInfo;
        this.protectionErrorDetails = $.protectionErrorDetails;
        this.protectionStatus = $.protectionStatus;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupInstanceResponse $;

        public Builder() {
            $ = new BackupInstanceResponse();
        }

        public Builder(BackupInstanceResponse defaults) {
            $ = new BackupInstanceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentProtectionState Specifies the current protection state of the resource
         * 
         * @return builder
         * 
         */
        public Builder currentProtectionState(String currentProtectionState) {
            $.currentProtectionState = currentProtectionState;
            return this;
        }

        /**
         * @param dataSourceInfo Gets or sets the data source information.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceInfo(DatasourceResponse dataSourceInfo) {
            $.dataSourceInfo = dataSourceInfo;
            return this;
        }

        /**
         * @param dataSourceSetInfo Gets or sets the data source set information.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceSetInfo(@Nullable DatasourceSetResponse dataSourceSetInfo) {
            $.dataSourceSetInfo = dataSourceSetInfo;
            return this;
        }

        /**
         * @param friendlyName Gets or sets the Backup Instance friendly name.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param policyInfo Gets or sets the policy information.
         * 
         * @return builder
         * 
         */
        public Builder policyInfo(PolicyInfoResponse policyInfo) {
            $.policyInfo = policyInfo;
            return this;
        }

        /**
         * @param protectionErrorDetails Specifies the protection error of the resource
         * 
         * @return builder
         * 
         */
        public Builder protectionErrorDetails(UserFacingErrorResponse protectionErrorDetails) {
            $.protectionErrorDetails = protectionErrorDetails;
            return this;
        }

        /**
         * @param protectionStatus Specifies the protection status of the resource
         * 
         * @return builder
         * 
         */
        public Builder protectionStatus(ProtectionStatusDetailsResponse protectionStatus) {
            $.protectionStatus = protectionStatus;
            return this;
        }

        /**
         * @param provisioningState Specifies the provisioning state of the resource i.e. provisioning/updating/Succeeded/Failed
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public BackupInstanceResponse build() {
            $.currentProtectionState = Objects.requireNonNull($.currentProtectionState, "expected parameter 'currentProtectionState' to be non-null");
            $.dataSourceInfo = Objects.requireNonNull($.dataSourceInfo, "expected parameter 'dataSourceInfo' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.policyInfo = Objects.requireNonNull($.policyInfo, "expected parameter 'policyInfo' to be non-null");
            $.protectionErrorDetails = Objects.requireNonNull($.protectionErrorDetails, "expected parameter 'protectionErrorDetails' to be non-null");
            $.protectionStatus = Objects.requireNonNull($.protectionStatus, "expected parameter 'protectionStatus' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
