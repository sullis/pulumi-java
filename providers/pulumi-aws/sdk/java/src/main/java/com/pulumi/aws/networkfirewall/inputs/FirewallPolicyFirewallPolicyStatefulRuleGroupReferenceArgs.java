// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs Empty = new FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs();

    /**
     * An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the stateful rule group.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs() {}

    private FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs(FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs $) {
        this.priority = $.priority;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs $;

        public Builder() {
            $ = new FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs();
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs defaults) {
            $ = new FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param priority An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the stateful rule group.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the stateful rule group.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
