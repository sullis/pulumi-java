// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.DatasourceArgs;
import com.pulumi.azurenative.dataprotection.inputs.DatasourceSetArgs;
import com.pulumi.azurenative.dataprotection.inputs.PolicyInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backup Instance
 * 
 */
public final class BackupInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupInstanceArgs Empty = new BackupInstanceArgs();

    /**
     * Gets or sets the data source information.
     * 
     */
    @Import(name="dataSourceInfo", required=true)
    private Output<DatasourceArgs> dataSourceInfo;

    /**
     * @return Gets or sets the data source information.
     * 
     */
    public Output<DatasourceArgs> dataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Gets or sets the data source set information.
     * 
     */
    @Import(name="dataSourceSetInfo")
    private @Nullable Output<DatasourceSetArgs> dataSourceSetInfo;

    /**
     * @return Gets or sets the data source set information.
     * 
     */
    public Optional<Output<DatasourceSetArgs>> dataSourceSetInfo() {
        return Optional.ofNullable(this.dataSourceSetInfo);
    }

    /**
     * Gets or sets the Backup Instance friendly name.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Gets or sets the Backup Instance friendly name.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    @Import(name="objectType", required=true)
    private Output<String> objectType;

    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the policy information.
     * 
     */
    @Import(name="policyInfo", required=true)
    private Output<PolicyInfoArgs> policyInfo;

    /**
     * @return Gets or sets the policy information.
     * 
     */
    public Output<PolicyInfoArgs> policyInfo() {
        return this.policyInfo;
    }

    private BackupInstanceArgs() {}

    private BackupInstanceArgs(BackupInstanceArgs $) {
        this.dataSourceInfo = $.dataSourceInfo;
        this.dataSourceSetInfo = $.dataSourceSetInfo;
        this.friendlyName = $.friendlyName;
        this.objectType = $.objectType;
        this.policyInfo = $.policyInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupInstanceArgs $;

        public Builder() {
            $ = new BackupInstanceArgs();
        }

        public Builder(BackupInstanceArgs defaults) {
            $ = new BackupInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceInfo Gets or sets the data source information.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceInfo(Output<DatasourceArgs> dataSourceInfo) {
            $.dataSourceInfo = dataSourceInfo;
            return this;
        }

        /**
         * @param dataSourceInfo Gets or sets the data source information.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceInfo(DatasourceArgs dataSourceInfo) {
            return dataSourceInfo(Output.of(dataSourceInfo));
        }

        /**
         * @param dataSourceSetInfo Gets or sets the data source set information.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceSetInfo(@Nullable Output<DatasourceSetArgs> dataSourceSetInfo) {
            $.dataSourceSetInfo = dataSourceSetInfo;
            return this;
        }

        /**
         * @param dataSourceSetInfo Gets or sets the data source set information.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceSetInfo(DatasourceSetArgs dataSourceSetInfo) {
            return dataSourceSetInfo(Output.of(dataSourceSetInfo));
        }

        /**
         * @param friendlyName Gets or sets the Backup Instance friendly name.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Gets or sets the Backup Instance friendly name.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param policyInfo Gets or sets the policy information.
         * 
         * @return builder
         * 
         */
        public Builder policyInfo(Output<PolicyInfoArgs> policyInfo) {
            $.policyInfo = policyInfo;
            return this;
        }

        /**
         * @param policyInfo Gets or sets the policy information.
         * 
         * @return builder
         * 
         */
        public Builder policyInfo(PolicyInfoArgs policyInfo) {
            return policyInfo(Output.of(policyInfo));
        }

        public BackupInstanceArgs build() {
            $.dataSourceInfo = Objects.requireNonNull($.dataSourceInfo, "expected parameter 'dataSourceInfo' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.policyInfo = Objects.requireNonNull($.policyInfo, "expected parameter 'policyInfo' to be non-null");
            return $;
        }
    }

}
