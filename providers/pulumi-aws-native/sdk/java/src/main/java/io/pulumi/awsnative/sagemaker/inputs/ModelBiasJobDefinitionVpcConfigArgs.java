// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ModelBiasJobDefinitionVpcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionVpcConfigArgs Empty = new ModelBiasJobDefinitionVpcConfigArgs();

    @InputImport(name="securityGroupIds", required=true)
    private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    @InputImport(name="subnets", required=true)
    private final Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets;
    }

    public ModelBiasJobDefinitionVpcConfigArgs(
        Input<List<String>> securityGroupIds,
        Input<List<String>> subnets) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private ModelBiasJobDefinitionVpcConfigArgs() {
        this.securityGroupIds = Input.empty();
        this.subnets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupIds;
        private Input<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionVpcConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
        }

        public Builder setSecurityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder setSubnets(Input<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Input.of(Objects.requireNonNull(subnets));
            return this;
        }

        public ModelBiasJobDefinitionVpcConfigArgs build() {
            return new ModelBiasJobDefinitionVpcConfigArgs(securityGroupIds, subnets);
        }
    }
}
