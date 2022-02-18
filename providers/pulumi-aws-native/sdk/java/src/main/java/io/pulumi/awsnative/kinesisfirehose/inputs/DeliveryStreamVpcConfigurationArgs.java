// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeliveryStreamVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamVpcConfigurationArgs Empty = new DeliveryStreamVpcConfigurationArgs();

    @InputImport(name="roleARN", required=true)
    private final Input<String> roleARN;

    public Input<String> getRoleARN() {
        return this.roleARN;
    }

    @InputImport(name="securityGroupIds", required=true)
    private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    @InputImport(name="subnetIds", required=true)
    private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    public DeliveryStreamVpcConfigurationArgs(
        Input<String> roleARN,
        Input<List<String>> securityGroupIds,
        Input<List<String>> subnetIds) {
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
    }

    private DeliveryStreamVpcConfigurationArgs() {
        this.roleARN = Input.empty();
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> roleARN;
        private Input<List<String>> securityGroupIds;
        private Input<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleARN = defaults.roleARN;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder setRoleARN(Input<String> roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }

        public Builder setRoleARN(String roleARN) {
            this.roleARN = Input.of(Objects.requireNonNull(roleARN));
            return this;
        }

        public Builder setSecurityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public DeliveryStreamVpcConfigurationArgs build() {
            return new DeliveryStreamVpcConfigurationArgs(roleARN, securityGroupIds, subnetIds);
        }
    }
}
