// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyDimensionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class FirewallPolicyPublishMetricActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyPublishMetricActionArgs Empty = new FirewallPolicyPublishMetricActionArgs();

    @InputImport(name="dimensions", required=true)
    private final Input<List<FirewallPolicyDimensionArgs>> dimensions;

    public Input<List<FirewallPolicyDimensionArgs>> getDimensions() {
        return this.dimensions;
    }

    public FirewallPolicyPublishMetricActionArgs(Input<List<FirewallPolicyDimensionArgs>> dimensions) {
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
    }

    private FirewallPolicyPublishMetricActionArgs() {
        this.dimensions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyPublishMetricActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<FirewallPolicyDimensionArgs>> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyPublishMetricActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder setDimensions(Input<List<FirewallPolicyDimensionArgs>> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }

        public Builder setDimensions(List<FirewallPolicyDimensionArgs> dimensions) {
            this.dimensions = Input.of(Objects.requireNonNull(dimensions));
            return this;
        }

        public FirewallPolicyPublishMetricActionArgs build() {
            return new FirewallPolicyPublishMetricActionArgs(dimensions);
        }
    }
}
