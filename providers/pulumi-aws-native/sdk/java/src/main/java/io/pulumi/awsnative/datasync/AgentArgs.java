// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.AgentTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentArgs Empty = new AgentArgs();

    /**
     * Activation key of the Agent.
     * 
     */
    @Import(name="activationKey", required=true)
      private final Output<String> activationKey;

    public Output<String> activationKey() {
        return this.activationKey;
    }

    /**
     * The name configured for the agent. Text reference used to identify the agent in the console.
     * 
     */
    @Import(name="agentName")
      private final @Nullable Output<String> agentName;

    public Output<String> agentName() {
        return this.agentName == null ? Codegen.empty() : this.agentName;
    }

    /**
     * The ARNs of the security group used to protect your data transfer task subnets.
     * 
     */
    @Import(name="securityGroupArns")
      private final @Nullable Output<List<String>> securityGroupArns;

    public Output<List<String>> securityGroupArns() {
        return this.securityGroupArns == null ? Codegen.empty() : this.securityGroupArns;
    }

    /**
     * The ARNs of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    @Import(name="subnetArns")
      private final @Nullable Output<List<String>> subnetArns;

    public Output<List<String>> subnetArns() {
        return this.subnetArns == null ? Codegen.empty() : this.subnetArns;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<AgentTagArgs>> tags;

    public Output<List<AgentTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The ID of the VPC endpoint that the agent has access to.
     * 
     */
    @Import(name="vpcEndpointId")
      private final @Nullable Output<String> vpcEndpointId;

    public Output<String> vpcEndpointId() {
        return this.vpcEndpointId == null ? Codegen.empty() : this.vpcEndpointId;
    }

    public AgentArgs(
        Output<String> activationKey,
        @Nullable Output<String> agentName,
        @Nullable Output<List<String>> securityGroupArns,
        @Nullable Output<List<String>> subnetArns,
        @Nullable Output<List<AgentTagArgs>> tags,
        @Nullable Output<String> vpcEndpointId) {
        this.activationKey = Objects.requireNonNull(activationKey, "expected parameter 'activationKey' to be non-null");
        this.agentName = agentName;
        this.securityGroupArns = securityGroupArns;
        this.subnetArns = subnetArns;
        this.tags = tags;
        this.vpcEndpointId = vpcEndpointId;
    }

    private AgentArgs() {
        this.activationKey = Codegen.empty();
        this.agentName = Codegen.empty();
        this.securityGroupArns = Codegen.empty();
        this.subnetArns = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcEndpointId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> activationKey;
        private @Nullable Output<String> agentName;
        private @Nullable Output<List<String>> securityGroupArns;
        private @Nullable Output<List<String>> subnetArns;
        private @Nullable Output<List<AgentTagArgs>> tags;
        private @Nullable Output<String> vpcEndpointId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.agentName = defaults.agentName;
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArns = defaults.subnetArns;
    	      this.tags = defaults.tags;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        public Builder activationKey(Output<String> activationKey) {
            this.activationKey = Objects.requireNonNull(activationKey);
            return this;
        }
        public Builder activationKey(String activationKey) {
            this.activationKey = Output.of(Objects.requireNonNull(activationKey));
            return this;
        }
        public Builder agentName(@Nullable Output<String> agentName) {
            this.agentName = agentName;
            return this;
        }
        public Builder agentName(@Nullable String agentName) {
            this.agentName = Codegen.ofNullable(agentName);
            return this;
        }
        public Builder securityGroupArns(@Nullable Output<List<String>> securityGroupArns) {
            this.securityGroupArns = securityGroupArns;
            return this;
        }
        public Builder securityGroupArns(@Nullable List<String> securityGroupArns) {
            this.securityGroupArns = Codegen.ofNullable(securityGroupArns);
            return this;
        }
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }
        public Builder subnetArns(@Nullable Output<List<String>> subnetArns) {
            this.subnetArns = subnetArns;
            return this;
        }
        public Builder subnetArns(@Nullable List<String> subnetArns) {
            this.subnetArns = Codegen.ofNullable(subnetArns);
            return this;
        }
        public Builder subnetArns(String... subnetArns) {
            return subnetArns(List.of(subnetArns));
        }
        public Builder tags(@Nullable Output<List<AgentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<AgentTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(AgentTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Codegen.ofNullable(vpcEndpointId);
            return this;
        }        public AgentArgs build() {
            return new AgentArgs(activationKey, agentName, securityGroupArns, subnetArns, tags, vpcEndpointId);
        }
    }
}
