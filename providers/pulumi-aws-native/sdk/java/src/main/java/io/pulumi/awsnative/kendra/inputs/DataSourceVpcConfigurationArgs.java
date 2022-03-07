// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataSourceVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceVpcConfigurationArgs Empty = new DataSourceVpcConfigurationArgs();

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

    public DataSourceVpcConfigurationArgs(
        Input<List<String>> securityGroupIds,
        Input<List<String>> subnetIds) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
    }

    private DataSourceVpcConfigurationArgs() {
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupIds;
        private Input<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
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
        public DataSourceVpcConfigurationArgs build() {
            return new DataSourceVpcConfigurationArgs(securityGroupIds, subnetIds);
        }
    }
}