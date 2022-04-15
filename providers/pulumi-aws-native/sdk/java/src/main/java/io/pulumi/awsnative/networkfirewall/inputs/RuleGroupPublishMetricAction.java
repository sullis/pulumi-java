// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupDimension;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupPublishMetricAction extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupPublishMetricAction Empty = new RuleGroupPublishMetricAction();

    @Import(name="dimensions", required=true)
      private final List<RuleGroupDimension> dimensions;

    public List<RuleGroupDimension> dimensions() {
        return this.dimensions;
    }

    public RuleGroupPublishMetricAction(List<RuleGroupDimension> dimensions) {
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
    }

    private RuleGroupPublishMetricAction() {
        this.dimensions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupPublishMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupDimension> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupPublishMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder dimensions(List<RuleGroupDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(RuleGroupDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }        public RuleGroupPublishMetricAction build() {
            return new RuleGroupPublishMetricAction(dimensions);
        }
    }
}
