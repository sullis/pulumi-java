// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomRequestHandlingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allow traffic towards application.
 * 
 */
public final class RuleGroupRuleActionAllowPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionAllowPropertiesArgs Empty = new RuleGroupRuleActionAllowPropertiesArgs();

    @InputImport(name="customRequestHandling")
    private final @Nullable Input<RuleGroupCustomRequestHandlingArgs> customRequestHandling;

    public Input<RuleGroupCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Input.empty() : this.customRequestHandling;
    }

    public RuleGroupRuleActionAllowPropertiesArgs(@Nullable Input<RuleGroupCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private RuleGroupRuleActionAllowPropertiesArgs() {
        this.customRequestHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllowPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllowPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable Input<RuleGroupCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder setCustomRequestHandling(@Nullable RuleGroupCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Input.ofNullable(customRequestHandling);
            return this;
        }

        public RuleGroupRuleActionAllowPropertiesArgs build() {
            return new RuleGroupRuleActionAllowPropertiesArgs(customRequestHandling);
        }
    }
}
