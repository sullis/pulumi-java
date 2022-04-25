// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostVpcConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostVpcConfigurationGetArgs Empty = new HostVpcConfigurationGetArgs();

    /**
     * he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
     * 
     */
    @Import(name="tlsCertificate")
    private @Nullable Output<String> tlsCertificate;

    /**
     * @return The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
     * 
     */
    public Optional<Output<String>> tlsCertificate() {
        return Optional.ofNullable(this.tlsCertificate);
    }

    /**
     * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private HostVpcConfigurationGetArgs() {}

    private HostVpcConfigurationGetArgs(HostVpcConfigurationGetArgs $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.tlsCertificate = $.tlsCertificate;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostVpcConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostVpcConfigurationGetArgs $;

        public Builder() {
            $ = new HostVpcConfigurationGetArgs();
        }

        public Builder(HostVpcConfigurationGetArgs defaults) {
            $ = new HostVpcConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityGroupIds he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds he ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tlsCertificate The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder tlsCertificate(@Nullable Output<String> tlsCertificate) {
            $.tlsCertificate = tlsCertificate;
            return this;
        }

        /**
         * @param tlsCertificate The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder tlsCertificate(String tlsCertificate) {
            return tlsCertificate(Output.of(tlsCertificate));
        }

        /**
         * @param vpcId The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public HostVpcConfigurationGetArgs build() {
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
