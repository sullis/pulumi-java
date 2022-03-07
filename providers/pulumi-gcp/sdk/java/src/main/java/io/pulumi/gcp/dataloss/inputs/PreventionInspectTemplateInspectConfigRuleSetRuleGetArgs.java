// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs();

    /**
     * The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
     */
    @InputImport(name="exclusionRule")
      private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> exclusionRule;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> getExclusionRule() {
        return this.exclusionRule == null ? Input.empty() : this.exclusionRule;
    }

    /**
     * Hotword-based detection rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="hotwordRule")
      private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> hotwordRule;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> getHotwordRule() {
        return this.hotwordRule == null ? Input.empty() : this.hotwordRule;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs(
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> exclusionRule,
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> hotwordRule) {
        this.exclusionRule = exclusionRule;
        this.hotwordRule = hotwordRule;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs() {
        this.exclusionRule = Input.empty();
        this.hotwordRule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> exclusionRule;
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusionRule = defaults.exclusionRule;
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder setExclusionRule(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> exclusionRule) {
            this.exclusionRule = exclusionRule;
            return this;
        }

        public Builder setExclusionRule(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs exclusionRule) {
            this.exclusionRule = Input.ofNullable(exclusionRule);
            return this;
        }

        public Builder setHotwordRule(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> hotwordRule) {
            this.hotwordRule = hotwordRule;
            return this;
        }

        public Builder setHotwordRule(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs hotwordRule) {
            this.hotwordRule = Input.ofNullable(hotwordRule);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs(exclusionRule, hotwordRule);
        }
    }
}