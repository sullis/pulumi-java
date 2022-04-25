// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.AddRemoveReplicaScalingMechanismResponse;
import com.pulumi.azurenative.servicefabricmesh.inputs.AverageLoadScalingTriggerResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the auto scaling policy
 * 
 */
public final class AutoScalingPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoScalingPolicyResponse Empty = new AutoScalingPolicyResponse();

    /**
     * The mechanism that is used to scale when auto scaling operation is invoked.
     * 
     */
    @Import(name="mechanism", required=true)
    private AddRemoveReplicaScalingMechanismResponse mechanism;

    /**
     * @return The mechanism that is used to scale when auto scaling operation is invoked.
     * 
     */
    public AddRemoveReplicaScalingMechanismResponse mechanism() {
        return this.mechanism;
    }

    /**
     * The name of the auto scaling policy.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the auto scaling policy.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Determines when auto scaling operation will be invoked.
     * 
     */
    @Import(name="trigger", required=true)
    private AverageLoadScalingTriggerResponse trigger;

    /**
     * @return Determines when auto scaling operation will be invoked.
     * 
     */
    public AverageLoadScalingTriggerResponse trigger() {
        return this.trigger;
    }

    private AutoScalingPolicyResponse() {}

    private AutoScalingPolicyResponse(AutoScalingPolicyResponse $) {
        this.mechanism = $.mechanism;
        this.name = $.name;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScalingPolicyResponse $;

        public Builder() {
            $ = new AutoScalingPolicyResponse();
        }

        public Builder(AutoScalingPolicyResponse defaults) {
            $ = new AutoScalingPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param mechanism The mechanism that is used to scale when auto scaling operation is invoked.
         * 
         * @return builder
         * 
         */
        public Builder mechanism(AddRemoveReplicaScalingMechanismResponse mechanism) {
            $.mechanism = mechanism;
            return this;
        }

        /**
         * @param name The name of the auto scaling policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param trigger Determines when auto scaling operation will be invoked.
         * 
         * @return builder
         * 
         */
        public Builder trigger(AverageLoadScalingTriggerResponse trigger) {
            $.trigger = trigger;
            return this;
        }

        public AutoScalingPolicyResponse build() {
            $.mechanism = Objects.requireNonNull($.mechanism, "expected parameter 'mechanism' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.trigger = Objects.requireNonNull($.trigger, "expected parameter 'trigger' to be non-null");
            return $;
        }
    }

}
