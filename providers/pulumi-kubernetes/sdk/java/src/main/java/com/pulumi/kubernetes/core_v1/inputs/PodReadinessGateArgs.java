// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * PodReadinessGate contains the reference to a pod condition
 * 
 */
public final class PodReadinessGateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodReadinessGateArgs Empty = new PodReadinessGateArgs();

    /**
     * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
     * 
     * Possible enum values:
     *  - `&#34;ContainersReady&#34;` indicates whether all containers in the pod are ready.
     *  - `&#34;Initialized&#34;` means that all init containers in the pod have started successfully.
     *  - `&#34;PodScheduled&#34;` represents status of the scheduling process for this pod.
     *  - `&#34;Ready&#34;` means the pod is able to service requests and should be added to the load balancing pools of all matching services.
     * 
     */
    @Import(name="conditionType", required=true)
    private Output<String> conditionType;

    /**
     * @return ConditionType refers to a condition in the pod&#39;s condition list with matching type.
     * 
     * Possible enum values:
     *  - `&#34;ContainersReady&#34;` indicates whether all containers in the pod are ready.
     *  - `&#34;Initialized&#34;` means that all init containers in the pod have started successfully.
     *  - `&#34;PodScheduled&#34;` represents status of the scheduling process for this pod.
     *  - `&#34;Ready&#34;` means the pod is able to service requests and should be added to the load balancing pools of all matching services.
     * 
     */
    public Output<String> conditionType() {
        return this.conditionType;
    }

    private PodReadinessGateArgs() {}

    private PodReadinessGateArgs(PodReadinessGateArgs $) {
        this.conditionType = $.conditionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodReadinessGateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodReadinessGateArgs $;

        public Builder() {
            $ = new PodReadinessGateArgs();
        }

        public Builder(PodReadinessGateArgs defaults) {
            $ = new PodReadinessGateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionType ConditionType refers to a condition in the pod&#39;s condition list with matching type.
         * 
         * Possible enum values:
         *  - `&#34;ContainersReady&#34;` indicates whether all containers in the pod are ready.
         *  - `&#34;Initialized&#34;` means that all init containers in the pod have started successfully.
         *  - `&#34;PodScheduled&#34;` represents status of the scheduling process for this pod.
         *  - `&#34;Ready&#34;` means the pod is able to service requests and should be added to the load balancing pools of all matching services.
         * 
         * @return builder
         * 
         */
        public Builder conditionType(Output<String> conditionType) {
            $.conditionType = conditionType;
            return this;
        }

        /**
         * @param conditionType ConditionType refers to a condition in the pod&#39;s condition list with matching type.
         * 
         * Possible enum values:
         *  - `&#34;ContainersReady&#34;` indicates whether all containers in the pod are ready.
         *  - `&#34;Initialized&#34;` means that all init containers in the pod have started successfully.
         *  - `&#34;PodScheduled&#34;` represents status of the scheduling process for this pod.
         *  - `&#34;Ready&#34;` means the pod is able to service requests and should be added to the load balancing pools of all matching services.
         * 
         * @return builder
         * 
         */
        public Builder conditionType(String conditionType) {
            return conditionType(Output.of(conditionType));
        }

        public PodReadinessGateArgs build() {
            $.conditionType = Objects.requireNonNull($.conditionType, "expected parameter 'conditionType' to be non-null");
            return $;
        }
    }

}
