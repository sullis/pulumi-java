// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.aws.codedeploy.outputs.DeploymentGroupEc2TagSetEc2TagFilter;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupEc2TagSet {
    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    private final @Nullable List<DeploymentGroupEc2TagSetEc2TagFilter> ec2TagFilters;

    @CustomType.Constructor
    private DeploymentGroupEc2TagSet(@CustomType.Parameter("ec2TagFilters") @Nullable List<DeploymentGroupEc2TagSetEc2TagFilter> ec2TagFilters) {
        this.ec2TagFilters = ec2TagFilters;
    }

    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
    */
    public List<DeploymentGroupEc2TagSetEc2TagFilter> ec2TagFilters() {
        return this.ec2TagFilters == null ? List.of() : this.ec2TagFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupEc2TagSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeploymentGroupEc2TagSetEc2TagFilter> ec2TagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupEc2TagSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2TagFilters = defaults.ec2TagFilters;
        }

        public Builder ec2TagFilters(@Nullable List<DeploymentGroupEc2TagSetEc2TagFilter> ec2TagFilters) {
            this.ec2TagFilters = ec2TagFilters;
            return this;
        }
        public Builder ec2TagFilters(DeploymentGroupEc2TagSetEc2TagFilter... ec2TagFilters) {
            return ec2TagFilters(List.of(ec2TagFilters));
        }        public DeploymentGroupEc2TagSet build() {
            return new DeploymentGroupEc2TagSet(ec2TagFilters);
        }
    }
}
