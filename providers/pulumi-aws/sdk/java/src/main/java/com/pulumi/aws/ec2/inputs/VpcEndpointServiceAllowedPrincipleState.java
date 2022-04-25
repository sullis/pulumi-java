// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServiceAllowedPrincipleState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceAllowedPrincipleState Empty = new VpcEndpointServiceAllowedPrincipleState();

    /**
     * The ARN of the principal to allow permissions.
     * 
     */
    @Import(name="principalArn")
    private @Nullable Output<String> principalArn;

    /**
     * @return The ARN of the principal to allow permissions.
     * 
     */
    public Optional<Output<String>> principalArn() {
        return Optional.ofNullable(this.principalArn);
    }

    /**
     * The ID of the VPC endpoint service to allow permission.
     * 
     */
    @Import(name="vpcEndpointServiceId")
    private @Nullable Output<String> vpcEndpointServiceId;

    /**
     * @return The ID of the VPC endpoint service to allow permission.
     * 
     */
    public Optional<Output<String>> vpcEndpointServiceId() {
        return Optional.ofNullable(this.vpcEndpointServiceId);
    }

    private VpcEndpointServiceAllowedPrincipleState() {}

    private VpcEndpointServiceAllowedPrincipleState(VpcEndpointServiceAllowedPrincipleState $) {
        this.principalArn = $.principalArn;
        this.vpcEndpointServiceId = $.vpcEndpointServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceAllowedPrincipleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceAllowedPrincipleState $;

        public Builder() {
            $ = new VpcEndpointServiceAllowedPrincipleState();
        }

        public Builder(VpcEndpointServiceAllowedPrincipleState defaults) {
            $ = new VpcEndpointServiceAllowedPrincipleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalArn The ARN of the principal to allow permissions.
         * 
         * @return builder
         * 
         */
        public Builder principalArn(@Nullable Output<String> principalArn) {
            $.principalArn = principalArn;
            return this;
        }

        /**
         * @param principalArn The ARN of the principal to allow permissions.
         * 
         * @return builder
         * 
         */
        public Builder principalArn(String principalArn) {
            return principalArn(Output.of(principalArn));
        }

        /**
         * @param vpcEndpointServiceId The ID of the VPC endpoint service to allow permission.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceId(@Nullable Output<String> vpcEndpointServiceId) {
            $.vpcEndpointServiceId = vpcEndpointServiceId;
            return this;
        }

        /**
         * @param vpcEndpointServiceId The ID of the VPC endpoint service to allow permission.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceId(String vpcEndpointServiceId) {
            return vpcEndpointServiceId(Output.of(vpcEndpointServiceId));
        }

        public VpcEndpointServiceAllowedPrincipleState build() {
            return $;
        }
    }

}
