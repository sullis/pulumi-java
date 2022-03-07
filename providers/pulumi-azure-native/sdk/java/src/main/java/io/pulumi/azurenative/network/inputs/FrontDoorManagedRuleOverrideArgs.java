// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ActionType;
import io.pulumi.azurenative.network.enums.ManagedRuleEnabledState;
import io.pulumi.azurenative.network.inputs.ManagedRuleExclusionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class FrontDoorManagedRuleOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontDoorManagedRuleOverrideArgs Empty = new FrontDoorManagedRuleOverrideArgs();

    /**
     * Describes the override action to be applied when rule matches.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<Either<String,ActionType>> action;

    public Input<Either<String,ActionType>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
     * 
     */
    @InputImport(name="enabledState")
      private final @Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState;

    public Input<Either<String,ManagedRuleEnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    /**
     * Describes the exclusions that are applied to this specific rule.
     * 
     */
    @InputImport(name="exclusions")
      private final @Nullable Input<List<ManagedRuleExclusionArgs>> exclusions;

    public Input<List<ManagedRuleExclusionArgs>> getExclusions() {
        return this.exclusions == null ? Input.empty() : this.exclusions;
    }

    /**
     * Identifier for the managed rule.
     * 
     */
    @InputImport(name="ruleId", required=true)
      private final Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId;
    }

    public FrontDoorManagedRuleOverrideArgs(
        @Nullable Input<Either<String,ActionType>> action,
        @Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState,
        @Nullable Input<List<ManagedRuleExclusionArgs>> exclusions,
        Input<String> ruleId) {
        this.action = action;
        this.enabledState = enabledState;
        this.exclusions = exclusions;
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
    }

    private FrontDoorManagedRuleOverrideArgs() {
        this.action = Input.empty();
        this.enabledState = Input.empty();
        this.exclusions = Input.empty();
        this.ruleId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorManagedRuleOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ActionType>> action;
        private @Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState;
        private @Nullable Input<List<ManagedRuleExclusionArgs>> exclusions;
        private Input<String> ruleId;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorManagedRuleOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.exclusions = defaults.exclusions;
    	      this.ruleId = defaults.ruleId;
        }

        public Builder setAction(@Nullable Input<Either<String,ActionType>> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Either<String,ActionType> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,ManagedRuleEnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setExclusions(@Nullable Input<List<ManagedRuleExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setExclusions(@Nullable List<ManagedRuleExclusionArgs> exclusions) {
            this.exclusions = Input.ofNullable(exclusions);
            return this;
        }

        public Builder setRuleId(Input<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Input.of(Objects.requireNonNull(ruleId));
            return this;
        }
        public FrontDoorManagedRuleOverrideArgs build() {
            return new FrontDoorManagedRuleOverrideArgs(action, enabledState, exclusions, ruleId);
        }
    }
}