// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TestGridProjectVpcConfig {
    private final List<String> securityGroupIds;
    private final List<String> subnetIds;
    private final String vpcId;

    @OutputCustomType.Constructor({"securityGroupIds","subnetIds","vpcId"})
    private TestGridProjectVpcConfig(
        List<String> securityGroupIds,
        List<String> subnetIds,
        String vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
        this.subnetIds = Objects.requireNonNull(subnetIds);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestGridProjectVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TestGridProjectVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public TestGridProjectVpcConfig build() {
            return new TestGridProjectVpcConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}
