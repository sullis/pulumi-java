// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentNetworkConfiguration {
    /**
     * A list of security groups to use for the environment.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * A list of subnets to use for the environment. These must be private subnets, in the same VPC, in two different availability zones.
     * 
     */
    private final @Nullable List<String> subnetIds;

    @CustomType.Constructor
    private EnvironmentNetworkConfiguration(
        @CustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") @Nullable List<String> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    /**
     * A list of security groups to use for the environment.
     * 
    */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * A list of subnets to use for the environment. These must be private subnets, in the same VPC, in two different availability zones.
     * 
    */
    public List<String> subnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public EnvironmentNetworkConfiguration build() {
            return new EnvironmentNetworkConfiguration(securityGroupIds, subnetIds);
        }
    }
}
