// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The VPC security groups and subnets that are attached to a Lambda function. When you connect a function to a VPC, Lambda creates an elastic network interface for each combination of security group and subnet in the function's VPC configuration. The function can only access resources and the internet through that VPC.
 * 
 */
public final class FunctionVpcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionVpcConfigArgs Empty = new FunctionVpcConfigArgs();

    /**
     * A list of VPC security groups IDs.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * A list of VPC subnet IDs.
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    public FunctionVpcConfigArgs(
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<List<String>> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private FunctionVpcConfigArgs() {
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionVpcConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }
        public FunctionVpcConfigArgs build() {
            return new FunctionVpcConfigArgs(securityGroupIds, subnetIds);
        }
    }
}