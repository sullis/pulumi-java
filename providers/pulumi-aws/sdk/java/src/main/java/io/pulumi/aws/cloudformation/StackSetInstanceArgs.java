// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation;

import io.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackSetInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetInstanceArgs Empty = new StackSetInstanceArgs();

    /**
     * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deployment_targets below.
     * 
     */
    @Import(name="deploymentTargets")
      private final @Nullable Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets;

    public Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets() {
        return this.deploymentTargets == null ? Codegen.empty() : this.deploymentTargets;
    }

    /**
     * Key-value map of input parameters to override from the StackSet for this Instance.
     * 
     */
    @Import(name="parameterOverrides")
      private final @Nullable Output<Map<String,String>> parameterOverrides;

    public Output<Map<String,String>> parameterOverrides() {
        return this.parameterOverrides == null ? Codegen.empty() : this.parameterOverrides;
    }

    /**
     * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
     * 
     */
    @Import(name="retainStack")
      private final @Nullable Output<Boolean> retainStack;

    public Output<Boolean> retainStack() {
        return this.retainStack == null ? Codegen.empty() : this.retainStack;
    }

    /**
     * Name of the StackSet.
     * 
     */
    @Import(name="stackSetName", required=true)
      private final Output<String> stackSetName;

    public Output<String> stackSetName() {
        return this.stackSetName;
    }

    public StackSetInstanceArgs(
        @Nullable Output<String> accountId,
        @Nullable Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets,
        @Nullable Output<Map<String,String>> parameterOverrides,
        @Nullable Output<String> region,
        @Nullable Output<Boolean> retainStack,
        Output<String> stackSetName) {
        this.accountId = accountId;
        this.deploymentTargets = deploymentTargets;
        this.parameterOverrides = parameterOverrides;
        this.region = region;
        this.retainStack = retainStack;
        this.stackSetName = Objects.requireNonNull(stackSetName, "expected parameter 'stackSetName' to be non-null");
    }

    private StackSetInstanceArgs() {
        this.accountId = Codegen.empty();
        this.deploymentTargets = Codegen.empty();
        this.parameterOverrides = Codegen.empty();
        this.region = Codegen.empty();
        this.retainStack = Codegen.empty();
        this.stackSetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets;
        private @Nullable Output<Map<String,String>> parameterOverrides;
        private @Nullable Output<String> region;
        private @Nullable Output<Boolean> retainStack;
        private Output<String> stackSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.deploymentTargets = defaults.deploymentTargets;
    	      this.parameterOverrides = defaults.parameterOverrides;
    	      this.region = defaults.region;
    	      this.retainStack = defaults.retainStack;
    	      this.stackSetName = defaults.stackSetName;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder deploymentTargets(@Nullable Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets) {
            this.deploymentTargets = deploymentTargets;
            return this;
        }
        public Builder deploymentTargets(@Nullable StackSetInstanceDeploymentTargetsArgs deploymentTargets) {
            this.deploymentTargets = Codegen.ofNullable(deploymentTargets);
            return this;
        }
        public Builder parameterOverrides(@Nullable Output<Map<String,String>> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }
        public Builder parameterOverrides(@Nullable Map<String,String> parameterOverrides) {
            this.parameterOverrides = Codegen.ofNullable(parameterOverrides);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder retainStack(@Nullable Output<Boolean> retainStack) {
            this.retainStack = retainStack;
            return this;
        }
        public Builder retainStack(@Nullable Boolean retainStack) {
            this.retainStack = Codegen.ofNullable(retainStack);
            return this;
        }
        public Builder stackSetName(Output<String> stackSetName) {
            this.stackSetName = Objects.requireNonNull(stackSetName);
            return this;
        }
        public Builder stackSetName(String stackSetName) {
            this.stackSetName = Output.of(Objects.requireNonNull(stackSetName));
            return this;
        }        public StackSetInstanceArgs build() {
            return new StackSetInstanceArgs(accountId, deploymentTargets, parameterOverrides, region, retainStack, stackSetName);
        }
    }
}
