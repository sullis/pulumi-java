// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing;

import com.pulumi.aws.elasticloadbalancing.inputs.LoadBalancerPolicyPolicyAttributeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPolicyArgs Empty = new LoadBalancerPolicyArgs();

    /**
     * The load balancer on which the policy is defined.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private Output<String> loadBalancerName;

    /**
     * @return The load balancer on which the policy is defined.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * Policy attribute to apply to the policy.
     * 
     */
    @Import(name="policyAttributes")
    private @Nullable Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes;

    /**
     * @return Policy attribute to apply to the policy.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyPolicyAttributeArgs>>> policyAttributes() {
        return Optional.ofNullable(this.policyAttributes);
    }

    /**
     * The name of the load balancer policy.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return The name of the load balancer policy.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * The policy type.
     * 
     */
    @Import(name="policyTypeName", required=true)
    private Output<String> policyTypeName;

    /**
     * @return The policy type.
     * 
     */
    public Output<String> policyTypeName() {
        return this.policyTypeName;
    }

    private LoadBalancerPolicyArgs() {}

    private LoadBalancerPolicyArgs(LoadBalancerPolicyArgs $) {
        this.loadBalancerName = $.loadBalancerName;
        this.policyAttributes = $.policyAttributes;
        this.policyName = $.policyName;
        this.policyTypeName = $.policyTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPolicyArgs $;

        public Builder() {
            $ = new LoadBalancerPolicyArgs();
        }

        public Builder(LoadBalancerPolicyArgs defaults) {
            $ = new LoadBalancerPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadBalancerName The load balancer on which the policy is defined.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The load balancer on which the policy is defined.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param policyAttributes Policy attribute to apply to the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyAttributes(@Nullable Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes) {
            $.policyAttributes = policyAttributes;
            return this;
        }

        /**
         * @param policyAttributes Policy attribute to apply to the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyAttributes(List<LoadBalancerPolicyPolicyAttributeArgs> policyAttributes) {
            return policyAttributes(Output.of(policyAttributes));
        }

        /**
         * @param policyAttributes Policy attribute to apply to the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyAttributes(LoadBalancerPolicyPolicyAttributeArgs... policyAttributes) {
            return policyAttributes(List.of(policyAttributes));
        }

        /**
         * @param policyName The name of the load balancer policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the load balancer policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policyTypeName The policy type.
         * 
         * @return builder
         * 
         */
        public Builder policyTypeName(Output<String> policyTypeName) {
            $.policyTypeName = policyTypeName;
            return this;
        }

        /**
         * @param policyTypeName The policy type.
         * 
         * @return builder
         * 
         */
        public Builder policyTypeName(String policyTypeName) {
            return policyTypeName(Output.of(policyTypeName));
        }

        public LoadBalancerPolicyArgs build() {
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.policyTypeName = Objects.requireNonNull($.policyTypeName, "expected parameter 'policyTypeName' to be non-null");
            return $;
        }
    }

}
