// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximity {
    /**
     * Number of characters after the finding to consider. Either this or window_before must be specified
     * 
     */
    private final @Nullable Integer windowAfter;
    /**
     * Number of characters before the finding to consider. Either this or window_after must be specified
     * 
     */
    private final @Nullable Integer windowBefore;

    @CustomType.Constructor
    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximity(
        @CustomType.Parameter("windowAfter") @Nullable Integer windowAfter,
        @CustomType.Parameter("windowBefore") @Nullable Integer windowBefore) {
        this.windowAfter = windowAfter;
        this.windowBefore = windowBefore;
    }

    /**
     * Number of characters after the finding to consider. Either this or window_before must be specified
     * 
    */
    public Optional<Integer> getWindowAfter() {
        return Optional.ofNullable(this.windowAfter);
    }
    /**
     * Number of characters before the finding to consider. Either this or window_after must be specified
     * 
    */
    public Optional<Integer> getWindowBefore() {
        return Optional.ofNullable(this.windowBefore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer windowAfter;
        private @Nullable Integer windowBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowAfter = defaults.windowAfter;
    	      this.windowBefore = defaults.windowBefore;
        }

        public Builder windowAfter(@Nullable Integer windowAfter) {
            this.windowAfter = windowAfter;
            return this;
        }
        public Builder windowBefore(@Nullable Integer windowBefore) {
            this.windowBefore = windowBefore;
            return this;
        }        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximity build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximity(windowAfter, windowBefore);
        }
    }
}
