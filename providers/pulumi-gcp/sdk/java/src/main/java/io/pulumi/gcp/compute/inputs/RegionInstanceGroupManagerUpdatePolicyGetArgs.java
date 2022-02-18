// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerUpdatePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerUpdatePolicyGetArgs Empty = new RegionInstanceGroupManagerUpdatePolicyGetArgs();

    /**
     * - The instance redistribution policy for regional managed instance groups. Valid values are: `"PROACTIVE"`, `"NONE"`. If `PROACTIVE` (default), the group attempts to maintain an even distribution of VM instances across zones in the region. If `NONE`, proactive redistribution is disabled.
     * 
     */
    @InputImport(name="instanceRedistributionType")
    private final @Nullable Input<String> instanceRedistributionType;

    public Input<String> getInstanceRedistributionType() {
        return this.instanceRedistributionType == null ? Input.empty() : this.instanceRedistributionType;
    }

    /**
     * , The maximum number of instances that can be created above the specified targetSize during the update process. Conflicts with `max_surge_percent`. It has to be either 0 or at least equal to the number of zones.  If fixed values are used, at least one of `max_unavailable_fixed` or `max_surge_fixed` must be greater than 0.
     * 
     */
    @InputImport(name="maxSurgeFixed")
    private final @Nullable Input<Integer> maxSurgeFixed;

    public Input<Integer> getMaxSurgeFixed() {
        return this.maxSurgeFixed == null ? Input.empty() : this.maxSurgeFixed;
    }

    /**
     * , The maximum number of instances(calculated as percentage) that can be created above the specified targetSize during the update process. Conflicts with `max_surge_fixed`. Percent value is only allowed for regional managed instance groups with size at least 10.
     * 
     */
    @InputImport(name="maxSurgePercent")
    private final @Nullable Input<Integer> maxSurgePercent;

    public Input<Integer> getMaxSurgePercent() {
        return this.maxSurgePercent == null ? Input.empty() : this.maxSurgePercent;
    }

    /**
     * , The maximum number of instances that can be unavailable during the update process. Conflicts with `max_unavailable_percent`. It has to be either 0 or at least equal to the number of zones. If fixed values are used, at least one of `max_unavailable_fixed` or `max_surge_fixed` must be greater than 0.
     * 
     */
    @InputImport(name="maxUnavailableFixed")
    private final @Nullable Input<Integer> maxUnavailableFixed;

    public Input<Integer> getMaxUnavailableFixed() {
        return this.maxUnavailableFixed == null ? Input.empty() : this.maxUnavailableFixed;
    }

    /**
     * , The maximum number of instances(calculated as percentage) that can be unavailable during the update process. Conflicts with `max_unavailable_fixed`. Percent value is only allowed for regional managed instance groups with size at least 10.
     * 
     */
    @InputImport(name="maxUnavailablePercent")
    private final @Nullable Input<Integer> maxUnavailablePercent;

    public Input<Integer> getMaxUnavailablePercent() {
        return this.maxUnavailablePercent == null ? Input.empty() : this.maxUnavailablePercent;
    }

    /**
     * ), Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600]
     * 
     */
    @InputImport(name="minReadySec")
    private final @Nullable Input<Integer> minReadySec;

    public Input<Integer> getMinReadySec() {
        return this.minReadySec == null ? Input.empty() : this.minReadySec;
    }

    /**
     * - Minimal action to be taken on an instance. You can specify either `RESTART` to restart existing instances or `REPLACE` to delete and create new instances from the target template. If you specify a `RESTART`, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    @InputImport(name="minimalAction", required=true)
    private final Input<String> minimalAction;

    public Input<String> getMinimalAction() {
        return this.minimalAction;
    }

    /**
     * , The instance replacement method for managed instance groups. Valid values are: "RECREATE", "SUBSTITUTE". If SUBSTITUTE (default), the group replaces VM instances with new instances that have randomly generated names. If RECREATE, instance names are preserved.  You must also set max_unavailable_fixed or max_unavailable_percent to be greater than 0.
     * ***
     * 
     */
    @InputImport(name="replacementMethod")
    private final @Nullable Input<String> replacementMethod;

    public Input<String> getReplacementMethod() {
        return this.replacementMethod == null ? Input.empty() : this.replacementMethod;
    }

    /**
     * - The type of update process. You can specify either `PROACTIVE` so that the instance group manager proactively executes actions in order to bring instances to their target versions or `OPPORTUNISTIC` so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RegionInstanceGroupManagerUpdatePolicyGetArgs(
        @Nullable Input<String> instanceRedistributionType,
        @Nullable Input<Integer> maxSurgeFixed,
        @Nullable Input<Integer> maxSurgePercent,
        @Nullable Input<Integer> maxUnavailableFixed,
        @Nullable Input<Integer> maxUnavailablePercent,
        @Nullable Input<Integer> minReadySec,
        Input<String> minimalAction,
        @Nullable Input<String> replacementMethod,
        Input<String> type) {
        this.instanceRedistributionType = instanceRedistributionType;
        this.maxSurgeFixed = maxSurgeFixed;
        this.maxSurgePercent = maxSurgePercent;
        this.maxUnavailableFixed = maxUnavailableFixed;
        this.maxUnavailablePercent = maxUnavailablePercent;
        this.minReadySec = minReadySec;
        this.minimalAction = Objects.requireNonNull(minimalAction, "expected parameter 'minimalAction' to be non-null");
        this.replacementMethod = replacementMethod;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RegionInstanceGroupManagerUpdatePolicyGetArgs() {
        this.instanceRedistributionType = Input.empty();
        this.maxSurgeFixed = Input.empty();
        this.maxSurgePercent = Input.empty();
        this.maxUnavailableFixed = Input.empty();
        this.maxUnavailablePercent = Input.empty();
        this.minReadySec = Input.empty();
        this.minimalAction = Input.empty();
        this.replacementMethod = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerUpdatePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceRedistributionType;
        private @Nullable Input<Integer> maxSurgeFixed;
        private @Nullable Input<Integer> maxSurgePercent;
        private @Nullable Input<Integer> maxUnavailableFixed;
        private @Nullable Input<Integer> maxUnavailablePercent;
        private @Nullable Input<Integer> minReadySec;
        private Input<String> minimalAction;
        private @Nullable Input<String> replacementMethod;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerUpdatePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceRedistributionType = defaults.instanceRedistributionType;
    	      this.maxSurgeFixed = defaults.maxSurgeFixed;
    	      this.maxSurgePercent = defaults.maxSurgePercent;
    	      this.maxUnavailableFixed = defaults.maxUnavailableFixed;
    	      this.maxUnavailablePercent = defaults.maxUnavailablePercent;
    	      this.minReadySec = defaults.minReadySec;
    	      this.minimalAction = defaults.minimalAction;
    	      this.replacementMethod = defaults.replacementMethod;
    	      this.type = defaults.type;
        }

        public Builder setInstanceRedistributionType(@Nullable Input<String> instanceRedistributionType) {
            this.instanceRedistributionType = instanceRedistributionType;
            return this;
        }

        public Builder setInstanceRedistributionType(@Nullable String instanceRedistributionType) {
            this.instanceRedistributionType = Input.ofNullable(instanceRedistributionType);
            return this;
        }

        public Builder setMaxSurgeFixed(@Nullable Input<Integer> maxSurgeFixed) {
            this.maxSurgeFixed = maxSurgeFixed;
            return this;
        }

        public Builder setMaxSurgeFixed(@Nullable Integer maxSurgeFixed) {
            this.maxSurgeFixed = Input.ofNullable(maxSurgeFixed);
            return this;
        }

        public Builder setMaxSurgePercent(@Nullable Input<Integer> maxSurgePercent) {
            this.maxSurgePercent = maxSurgePercent;
            return this;
        }

        public Builder setMaxSurgePercent(@Nullable Integer maxSurgePercent) {
            this.maxSurgePercent = Input.ofNullable(maxSurgePercent);
            return this;
        }

        public Builder setMaxUnavailableFixed(@Nullable Input<Integer> maxUnavailableFixed) {
            this.maxUnavailableFixed = maxUnavailableFixed;
            return this;
        }

        public Builder setMaxUnavailableFixed(@Nullable Integer maxUnavailableFixed) {
            this.maxUnavailableFixed = Input.ofNullable(maxUnavailableFixed);
            return this;
        }

        public Builder setMaxUnavailablePercent(@Nullable Input<Integer> maxUnavailablePercent) {
            this.maxUnavailablePercent = maxUnavailablePercent;
            return this;
        }

        public Builder setMaxUnavailablePercent(@Nullable Integer maxUnavailablePercent) {
            this.maxUnavailablePercent = Input.ofNullable(maxUnavailablePercent);
            return this;
        }

        public Builder setMinReadySec(@Nullable Input<Integer> minReadySec) {
            this.minReadySec = minReadySec;
            return this;
        }

        public Builder setMinReadySec(@Nullable Integer minReadySec) {
            this.minReadySec = Input.ofNullable(minReadySec);
            return this;
        }

        public Builder setMinimalAction(Input<String> minimalAction) {
            this.minimalAction = Objects.requireNonNull(minimalAction);
            return this;
        }

        public Builder setMinimalAction(String minimalAction) {
            this.minimalAction = Input.of(Objects.requireNonNull(minimalAction));
            return this;
        }

        public Builder setReplacementMethod(@Nullable Input<String> replacementMethod) {
            this.replacementMethod = replacementMethod;
            return this;
        }

        public Builder setReplacementMethod(@Nullable String replacementMethod) {
            this.replacementMethod = Input.ofNullable(replacementMethod);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public RegionInstanceGroupManagerUpdatePolicyGetArgs build() {
            return new RegionInstanceGroupManagerUpdatePolicyGetArgs(instanceRedistributionType, maxSurgeFixed, maxSurgePercent, maxUnavailableFixed, maxUnavailablePercent, minReadySec, minimalAction, replacementMethod, type);
        }
    }
}
