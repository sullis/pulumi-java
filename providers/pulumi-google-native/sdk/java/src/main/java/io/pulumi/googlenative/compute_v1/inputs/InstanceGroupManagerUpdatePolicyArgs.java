// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.InstanceGroupManagerUpdatePolicyInstanceRedistributionType;
import io.pulumi.googlenative.compute_v1.enums.InstanceGroupManagerUpdatePolicyMinimalAction;
import io.pulumi.googlenative.compute_v1.enums.InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction;
import io.pulumi.googlenative.compute_v1.enums.InstanceGroupManagerUpdatePolicyReplacementMethod;
import io.pulumi.googlenative.compute_v1.enums.InstanceGroupManagerUpdatePolicyType;
import io.pulumi.googlenative.compute_v1.inputs.FixedOrPercentArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerUpdatePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerUpdatePolicyArgs Empty = new InstanceGroupManagerUpdatePolicyArgs();

    /**
     * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
     * 
     */
    @Import(name="instanceRedistributionType")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyInstanceRedistributionType> instanceRedistributionType;

    public Output<InstanceGroupManagerUpdatePolicyInstanceRedistributionType> getInstanceRedistributionType() {
        return this.instanceRedistributionType == null ? Output.empty() : this.instanceRedistributionType;
    }

    /**
     * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
     * 
     */
    @Import(name="maxSurge")
      private final @Nullable Output<FixedOrPercentArgs> maxSurge;

    public Output<FixedOrPercentArgs> getMaxSurge() {
        return this.maxSurge == null ? Output.empty() : this.maxSurge;
    }

    /**
     * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
     * 
     */
    @Import(name="maxUnavailable")
      private final @Nullable Output<FixedOrPercentArgs> maxUnavailable;

    public Output<FixedOrPercentArgs> getMaxUnavailable() {
        return this.maxUnavailable == null ? Output.empty() : this.maxUnavailable;
    }

    /**
     * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    @Import(name="minimalAction")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyMinimalAction> minimalAction;

    public Output<InstanceGroupManagerUpdatePolicyMinimalAction> getMinimalAction() {
        return this.minimalAction == null ? Output.empty() : this.minimalAction;
    }

    /**
     * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
     * 
     */
    @Import(name="mostDisruptiveAllowedAction")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction> mostDisruptiveAllowedAction;

    public Output<InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction> getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction == null ? Output.empty() : this.mostDisruptiveAllowedAction;
    }

    /**
     * What action should be used to replace instances. See minimal_action.REPLACE
     * 
     */
    @Import(name="replacementMethod")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyReplacementMethod> replacementMethod;

    public Output<InstanceGroupManagerUpdatePolicyReplacementMethod> getReplacementMethod() {
        return this.replacementMethod == null ? Output.empty() : this.replacementMethod;
    }

    /**
     * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    @Import(name="type")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyType> type;

    public Output<InstanceGroupManagerUpdatePolicyType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public InstanceGroupManagerUpdatePolicyArgs(
        @Nullable Output<InstanceGroupManagerUpdatePolicyInstanceRedistributionType> instanceRedistributionType,
        @Nullable Output<FixedOrPercentArgs> maxSurge,
        @Nullable Output<FixedOrPercentArgs> maxUnavailable,
        @Nullable Output<InstanceGroupManagerUpdatePolicyMinimalAction> minimalAction,
        @Nullable Output<InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction> mostDisruptiveAllowedAction,
        @Nullable Output<InstanceGroupManagerUpdatePolicyReplacementMethod> replacementMethod,
        @Nullable Output<InstanceGroupManagerUpdatePolicyType> type) {
        this.instanceRedistributionType = instanceRedistributionType;
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
        this.minimalAction = minimalAction;
        this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
        this.replacementMethod = replacementMethod;
        this.type = type;
    }

    private InstanceGroupManagerUpdatePolicyArgs() {
        this.instanceRedistributionType = Output.empty();
        this.maxSurge = Output.empty();
        this.maxUnavailable = Output.empty();
        this.minimalAction = Output.empty();
        this.mostDisruptiveAllowedAction = Output.empty();
        this.replacementMethod = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceGroupManagerUpdatePolicyInstanceRedistributionType> instanceRedistributionType;
        private @Nullable Output<FixedOrPercentArgs> maxSurge;
        private @Nullable Output<FixedOrPercentArgs> maxUnavailable;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyMinimalAction> minimalAction;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction> mostDisruptiveAllowedAction;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyReplacementMethod> replacementMethod;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerUpdatePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceRedistributionType = defaults.instanceRedistributionType;
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.minimalAction = defaults.minimalAction;
    	      this.mostDisruptiveAllowedAction = defaults.mostDisruptiveAllowedAction;
    	      this.replacementMethod = defaults.replacementMethod;
    	      this.type = defaults.type;
        }

        public Builder instanceRedistributionType(@Nullable Output<InstanceGroupManagerUpdatePolicyInstanceRedistributionType> instanceRedistributionType) {
            this.instanceRedistributionType = instanceRedistributionType;
            return this;
        }
        public Builder instanceRedistributionType(@Nullable InstanceGroupManagerUpdatePolicyInstanceRedistributionType instanceRedistributionType) {
            this.instanceRedistributionType = Output.ofNullable(instanceRedistributionType);
            return this;
        }
        public Builder maxSurge(@Nullable Output<FixedOrPercentArgs> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        public Builder maxSurge(@Nullable FixedOrPercentArgs maxSurge) {
            this.maxSurge = Output.ofNullable(maxSurge);
            return this;
        }
        public Builder maxUnavailable(@Nullable Output<FixedOrPercentArgs> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailable(@Nullable FixedOrPercentArgs maxUnavailable) {
            this.maxUnavailable = Output.ofNullable(maxUnavailable);
            return this;
        }
        public Builder minimalAction(@Nullable Output<InstanceGroupManagerUpdatePolicyMinimalAction> minimalAction) {
            this.minimalAction = minimalAction;
            return this;
        }
        public Builder minimalAction(@Nullable InstanceGroupManagerUpdatePolicyMinimalAction minimalAction) {
            this.minimalAction = Output.ofNullable(minimalAction);
            return this;
        }
        public Builder mostDisruptiveAllowedAction(@Nullable Output<InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction> mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }
        public Builder mostDisruptiveAllowedAction(@Nullable InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = Output.ofNullable(mostDisruptiveAllowedAction);
            return this;
        }
        public Builder replacementMethod(@Nullable Output<InstanceGroupManagerUpdatePolicyReplacementMethod> replacementMethod) {
            this.replacementMethod = replacementMethod;
            return this;
        }
        public Builder replacementMethod(@Nullable InstanceGroupManagerUpdatePolicyReplacementMethod replacementMethod) {
            this.replacementMethod = Output.ofNullable(replacementMethod);
            return this;
        }
        public Builder type(@Nullable Output<InstanceGroupManagerUpdatePolicyType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable InstanceGroupManagerUpdatePolicyType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public InstanceGroupManagerUpdatePolicyArgs build() {
            return new InstanceGroupManagerUpdatePolicyArgs(instanceRedistributionType, maxSurge, maxUnavailable, minimalAction, mostDisruptiveAllowedAction, replacementMethod, type);
        }
    }
}
