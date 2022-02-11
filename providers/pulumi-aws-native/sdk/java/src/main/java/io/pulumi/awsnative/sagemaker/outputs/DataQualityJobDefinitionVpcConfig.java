// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataQualityJobDefinitionVpcConfig {
    private final List<String> securityGroupIds;
    private final List<String> subnets;

    @OutputCustomType.Constructor({"securityGroupIds","subnets"})
    private DataQualityJobDefinitionVpcConfig(
        List<String> securityGroupIds,
        List<String> subnets) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
        this.subnets = Objects.requireNonNull(subnets);
    }

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    public List<String> getSubnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public DataQualityJobDefinitionVpcConfig build() {
            return new DataQualityJobDefinitionVpcConfig(securityGroupIds, subnets);
        }
    }
}
