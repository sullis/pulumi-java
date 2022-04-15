// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPolicyArgs Empty = new LoadBalancerPolicyArgs();

    /**
     * The load balancer on which the policy is defined.
     * 
     */
    @Import(name="loadBalancerName", required=true)
      private final Output<String> loadBalancerName;

    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * Policy attribute to apply to the policy.
     * 
     */
    @Import(name="policyAttributes")
      private final @Nullable Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes;

    public Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes() {
        return this.policyAttributes == null ? Codegen.empty() : this.policyAttributes;
    }

    /**
     * The name of the load balancer policy.
     * 
     */
    @Import(name="policyName", required=true)
      private final Output<String> policyName;

    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * The policy type.
     * 
     */
    @Import(name="policyTypeName", required=true)
      private final Output<String> policyTypeName;

    public Output<String> policyTypeName() {
        return this.policyTypeName;
    }

    public LoadBalancerPolicyArgs(
        Output<String> loadBalancerName,
        @Nullable Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes,
        Output<String> policyName,
        Output<String> policyTypeName) {
        this.loadBalancerName = Objects.requireNonNull(loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
        this.policyAttributes = policyAttributes;
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.policyTypeName = Objects.requireNonNull(policyTypeName, "expected parameter 'policyTypeName' to be non-null");
    }

    private LoadBalancerPolicyArgs() {
        this.loadBalancerName = Codegen.empty();
        this.policyAttributes = Codegen.empty();
        this.policyName = Codegen.empty();
        this.policyTypeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> loadBalancerName;
        private @Nullable Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes;
        private Output<String> policyName;
        private Output<String> policyTypeName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.policyAttributes = defaults.policyAttributes;
    	      this.policyName = defaults.policyName;
    	      this.policyTypeName = defaults.policyTypeName;
        }

        public Builder loadBalancerName(Output<String> loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Output.of(Objects.requireNonNull(loadBalancerName));
            return this;
        }
        public Builder policyAttributes(@Nullable Output<List<LoadBalancerPolicyPolicyAttributeArgs>> policyAttributes) {
            this.policyAttributes = policyAttributes;
            return this;
        }
        public Builder policyAttributes(@Nullable List<LoadBalancerPolicyPolicyAttributeArgs> policyAttributes) {
            this.policyAttributes = Codegen.ofNullable(policyAttributes);
            return this;
        }
        public Builder policyAttributes(LoadBalancerPolicyPolicyAttributeArgs... policyAttributes) {
            return policyAttributes(List.of(policyAttributes));
        }
        public Builder policyName(Output<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public Builder policyName(String policyName) {
            this.policyName = Output.of(Objects.requireNonNull(policyName));
            return this;
        }
        public Builder policyTypeName(Output<String> policyTypeName) {
            this.policyTypeName = Objects.requireNonNull(policyTypeName);
            return this;
        }
        public Builder policyTypeName(String policyTypeName) {
            this.policyTypeName = Output.of(Objects.requireNonNull(policyTypeName));
            return this;
        }        public LoadBalancerPolicyArgs build() {
            return new LoadBalancerPolicyArgs(loadBalancerName, policyAttributes, policyName, policyTypeName);
        }
    }
}
