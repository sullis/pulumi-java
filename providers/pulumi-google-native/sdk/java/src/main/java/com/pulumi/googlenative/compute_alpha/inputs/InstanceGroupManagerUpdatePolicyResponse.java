// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerUpdatePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerUpdatePolicyResponse Empty = new InstanceGroupManagerUpdatePolicyResponse();

    /**
     * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
     * 
     */
    @Import(name="instanceRedistributionType", required=true)
    private String instanceRedistributionType;

    /**
     * @return The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
     * 
     */
    public String instanceRedistributionType() {
        return this.instanceRedistributionType;
    }

    /**
     * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
     * 
     */
    @Import(name="maxSurge", required=true)
    private FixedOrPercentResponse maxSurge;

    /**
     * @return The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
     * 
     */
    public FixedOrPercentResponse maxSurge() {
        return this.maxSurge;
    }

    /**
     * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance&#39;s status is RUNNING. - If there is a health check on the instance group, the instance&#39;s health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
     * 
     */
    @Import(name="maxUnavailable", required=true)
    private FixedOrPercentResponse maxUnavailable;

    /**
     * @return The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance&#39;s status is RUNNING. - If there is a health check on the instance group, the instance&#39;s health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
     * 
     */
    public FixedOrPercentResponse maxUnavailable() {
        return this.maxUnavailable;
    }

    /**
     * Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600].
     * 
     */
    @Import(name="minReadySec", required=true)
    private Integer minReadySec;

    /**
     * @return Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600].
     * 
     */
    public Integer minReadySec() {
        return this.minReadySec;
    }

    /**
     * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    @Import(name="minimalAction", required=true)
    private String minimalAction;

    /**
     * @return Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    public String minimalAction() {
        return this.minimalAction;
    }

    /**
     * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
     * 
     */
    @Import(name="mostDisruptiveAllowedAction", required=true)
    private String mostDisruptiveAllowedAction;

    /**
     * @return Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
     * 
     */
    public String mostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction;
    }

    /**
     * What action should be used to replace instances. See minimal_action.REPLACE
     * 
     */
    @Import(name="replacementMethod", required=true)
    private String replacementMethod;

    /**
     * @return What action should be used to replace instances. See minimal_action.REPLACE
     * 
     */
    public String replacementMethod() {
        return this.replacementMethod;
    }

    /**
     * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    public String type() {
        return this.type;
    }

    private InstanceGroupManagerUpdatePolicyResponse() {}

    private InstanceGroupManagerUpdatePolicyResponse(InstanceGroupManagerUpdatePolicyResponse $) {
        this.instanceRedistributionType = $.instanceRedistributionType;
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
        this.minReadySec = $.minReadySec;
        this.minimalAction = $.minimalAction;
        this.mostDisruptiveAllowedAction = $.mostDisruptiveAllowedAction;
        this.replacementMethod = $.replacementMethod;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerUpdatePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerUpdatePolicyResponse $;

        public Builder() {
            $ = new InstanceGroupManagerUpdatePolicyResponse();
        }

        public Builder(InstanceGroupManagerUpdatePolicyResponse defaults) {
            $ = new InstanceGroupManagerUpdatePolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceRedistributionType The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
         * 
         * @return builder
         * 
         */
        public Builder instanceRedistributionType(String instanceRedistributionType) {
            $.instanceRedistributionType = instanceRedistributionType;
            return this;
        }

        /**
         * @param maxSurge The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(FixedOrPercentResponse maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        /**
         * @param maxUnavailable The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance&#39;s status is RUNNING. - If there is a health check on the instance group, the instance&#39;s health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(FixedOrPercentResponse maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param minReadySec Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600].
         * 
         * @return builder
         * 
         */
        public Builder minReadySec(Integer minReadySec) {
            $.minReadySec = minReadySec;
            return this;
        }

        /**
         * @param minimalAction Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
         * 
         * @return builder
         * 
         */
        public Builder minimalAction(String minimalAction) {
            $.minimalAction = minimalAction;
            return this;
        }

        /**
         * @param mostDisruptiveAllowedAction Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
         * 
         * @return builder
         * 
         */
        public Builder mostDisruptiveAllowedAction(String mostDisruptiveAllowedAction) {
            $.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }

        /**
         * @param replacementMethod What action should be used to replace instances. See minimal_action.REPLACE
         * 
         * @return builder
         * 
         */
        public Builder replacementMethod(String replacementMethod) {
            $.replacementMethod = replacementMethod;
            return this;
        }

        /**
         * @param type The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public InstanceGroupManagerUpdatePolicyResponse build() {
            $.instanceRedistributionType = Objects.requireNonNull($.instanceRedistributionType, "expected parameter 'instanceRedistributionType' to be non-null");
            $.maxSurge = Objects.requireNonNull($.maxSurge, "expected parameter 'maxSurge' to be non-null");
            $.maxUnavailable = Objects.requireNonNull($.maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
            $.minReadySec = Objects.requireNonNull($.minReadySec, "expected parameter 'minReadySec' to be non-null");
            $.minimalAction = Objects.requireNonNull($.minimalAction, "expected parameter 'minimalAction' to be non-null");
            $.mostDisruptiveAllowedAction = Objects.requireNonNull($.mostDisruptiveAllowedAction, "expected parameter 'mostDisruptiveAllowedAction' to be non-null");
            $.replacementMethod = Objects.requireNonNull($.replacementMethod, "expected parameter 'replacementMethod' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
