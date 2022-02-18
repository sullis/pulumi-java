// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupPublishMetricAction;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupActionDefinition extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupActionDefinition Empty = new RuleGroupActionDefinition();

    @InputImport(name="publishMetricAction")
    private final @Nullable RuleGroupPublishMetricAction publishMetricAction;

    public Optional<RuleGroupPublishMetricAction> getPublishMetricAction() {
        return this.publishMetricAction == null ? Optional.empty() : Optional.ofNullable(this.publishMetricAction);
    }

    public RuleGroupActionDefinition(@Nullable RuleGroupPublishMetricAction publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    private RuleGroupActionDefinition() {
        this.publishMetricAction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupPublishMetricAction publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder setPublishMetricAction(@Nullable RuleGroupPublishMetricAction publishMetricAction) {
            this.publishMetricAction = publishMetricAction;
            return this;
        }

        public RuleGroupActionDefinition build() {
            return new RuleGroupActionDefinition(publishMetricAction);
        }
    }
}
