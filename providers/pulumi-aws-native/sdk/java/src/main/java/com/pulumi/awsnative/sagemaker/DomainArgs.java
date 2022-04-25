// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.enums.DomainAppNetworkAccessType;
import com.pulumi.awsnative.sagemaker.enums.DomainAuthMode;
import com.pulumi.awsnative.sagemaker.inputs.DomainTagArgs;
import com.pulumi.awsnative.sagemaker.inputs.DomainUserSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    @Import(name="appNetworkAccessType")
    private @Nullable Output<DomainAppNetworkAccessType> appNetworkAccessType;

    /**
     * @return Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    public Optional<Output<DomainAppNetworkAccessType>> appNetworkAccessType() {
        return Optional.ofNullable(this.appNetworkAccessType);
    }

    /**
     * The mode of authentication that members use to access the domain.
     * 
     */
    @Import(name="authMode", required=true)
    private Output<DomainAuthMode> authMode;

    /**
     * @return The mode of authentication that members use to access the domain.
     * 
     */
    public Output<DomainAuthMode> authMode() {
        return this.authMode;
    }

    /**
     * The default user settings.
     * 
     */
    @Import(name="defaultUserSettings", required=true)
    private Output<DomainUserSettingsArgs> defaultUserSettings;

    /**
     * @return The default user settings.
     * 
     */
    public Output<DomainUserSettingsArgs> defaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * A name for the domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return A name for the domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return The VPC subnets that Studio uses for communication.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * A list of tags to apply to the user profile.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DomainTagArgs>> tags;

    /**
     * @return A list of tags to apply to the user profile.
     * 
     */
    public Optional<Output<List<DomainTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.appNetworkAccessType = $.appNetworkAccessType;
        this.authMode = $.authMode;
        this.defaultUserSettings = $.defaultUserSettings;
        this.domainName = $.domainName;
        this.kmsKeyId = $.kmsKeyId;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
         * 
         * @return builder
         * 
         */
        public Builder appNetworkAccessType(@Nullable Output<DomainAppNetworkAccessType> appNetworkAccessType) {
            $.appNetworkAccessType = appNetworkAccessType;
            return this;
        }

        /**
         * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
         * 
         * @return builder
         * 
         */
        public Builder appNetworkAccessType(DomainAppNetworkAccessType appNetworkAccessType) {
            return appNetworkAccessType(Output.of(appNetworkAccessType));
        }

        /**
         * @param authMode The mode of authentication that members use to access the domain.
         * 
         * @return builder
         * 
         */
        public Builder authMode(Output<DomainAuthMode> authMode) {
            $.authMode = authMode;
            return this;
        }

        /**
         * @param authMode The mode of authentication that members use to access the domain.
         * 
         * @return builder
         * 
         */
        public Builder authMode(DomainAuthMode authMode) {
            return authMode(Output.of(authMode));
        }

        /**
         * @param defaultUserSettings The default user settings.
         * 
         * @return builder
         * 
         */
        public Builder defaultUserSettings(Output<DomainUserSettingsArgs> defaultUserSettings) {
            $.defaultUserSettings = defaultUserSettings;
            return this;
        }

        /**
         * @param defaultUserSettings The default user settings.
         * 
         * @return builder
         * 
         */
        public Builder defaultUserSettings(DomainUserSettingsArgs defaultUserSettings) {
            return defaultUserSettings(Output.of(defaultUserSettings));
        }

        /**
         * @param domainName A name for the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName A name for the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param subnetIds The VPC subnets that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The VPC subnets that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The VPC subnets that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A list of tags to apply to the user profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DomainTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to apply to the user profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DomainTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to apply to the user profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(DomainTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vpcId The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public DomainArgs build() {
            $.authMode = Objects.requireNonNull($.authMode, "expected parameter 'authMode' to be non-null");
            $.defaultUserSettings = Objects.requireNonNull($.defaultUserSettings, "expected parameter 'defaultUserSettings' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
