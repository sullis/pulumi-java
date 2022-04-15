// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationMutationProtection;
import io.pulumi.awsnative.route53resolver.inputs.FirewallRuleGroupAssociationTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleGroupAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleGroupAssociationArgs Empty = new FirewallRuleGroupAssociationArgs();

    /**
     * FirewallRuleGroupId
     * 
     */
    @Import(name="firewallRuleGroupId", required=true)
      private final Output<String> firewallRuleGroupId;

    public Output<String> firewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * MutationProtectionStatus
     * 
     */
    @Import(name="mutationProtection")
      private final @Nullable Output<FirewallRuleGroupAssociationMutationProtection> mutationProtection;

    public Output<FirewallRuleGroupAssociationMutationProtection> mutationProtection() {
        return this.mutationProtection == null ? Codegen.empty() : this.mutationProtection;
    }

    /**
     * FirewallRuleGroupAssociationName
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Priority
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<FirewallRuleGroupAssociationTagArgs>> tags;

    public Output<List<FirewallRuleGroupAssociationTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * VpcId
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    public FirewallRuleGroupAssociationArgs(
        Output<String> firewallRuleGroupId,
        @Nullable Output<FirewallRuleGroupAssociationMutationProtection> mutationProtection,
        @Nullable Output<String> name,
        Output<Integer> priority,
        @Nullable Output<List<FirewallRuleGroupAssociationTagArgs>> tags,
        Output<String> vpcId) {
        this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId, "expected parameter 'firewallRuleGroupId' to be non-null");
        this.mutationProtection = mutationProtection;
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private FirewallRuleGroupAssociationArgs() {
        this.firewallRuleGroupId = Codegen.empty();
        this.mutationProtection = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleGroupAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> firewallRuleGroupId;
        private @Nullable Output<FirewallRuleGroupAssociationMutationProtection> mutationProtection;
        private @Nullable Output<String> name;
        private Output<Integer> priority;
        private @Nullable Output<List<FirewallRuleGroupAssociationTagArgs>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleGroupAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallRuleGroupId = defaults.firewallRuleGroupId;
    	      this.mutationProtection = defaults.mutationProtection;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder firewallRuleGroupId(Output<String> firewallRuleGroupId) {
            this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId);
            return this;
        }
        public Builder firewallRuleGroupId(String firewallRuleGroupId) {
            this.firewallRuleGroupId = Output.of(Objects.requireNonNull(firewallRuleGroupId));
            return this;
        }
        public Builder mutationProtection(@Nullable Output<FirewallRuleGroupAssociationMutationProtection> mutationProtection) {
            this.mutationProtection = mutationProtection;
            return this;
        }
        public Builder mutationProtection(@Nullable FirewallRuleGroupAssociationMutationProtection mutationProtection) {
            this.mutationProtection = Codegen.ofNullable(mutationProtection);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder tags(@Nullable Output<List<FirewallRuleGroupAssociationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<FirewallRuleGroupAssociationTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(FirewallRuleGroupAssociationTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public FirewallRuleGroupAssociationArgs build() {
            return new FirewallRuleGroupAssociationArgs(firewallRuleGroupId, mutationProtection, name, priority, tags, vpcId);
        }
    }
}
