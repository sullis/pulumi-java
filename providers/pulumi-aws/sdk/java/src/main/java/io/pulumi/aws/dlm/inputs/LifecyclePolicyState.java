// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyState Empty = new LifecyclePolicyState();

    /**
     * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A description for the DLM lifecycle policy.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The ARN of an IAM role that is able to be assumed by the DLM service.
     * 
     */
    @Import(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Output.empty() : this.executionRoleArn;
    }

    /**
     * See the `policy_details` configuration block. Max of 1.
     * 
     */
    @Import(name="policyDetails")
      private final @Nullable Output<LifecyclePolicyPolicyDetailsGetArgs> policyDetails;

    public Output<LifecyclePolicyPolicyDetailsGetArgs> getPolicyDetails() {
        return this.policyDetails == null ? Output.empty() : this.policyDetails;
    }

    /**
     * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public LifecyclePolicyState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> executionRoleArn,
        @Nullable Output<LifecyclePolicyPolicyDetailsGetArgs> policyDetails,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.executionRoleArn = executionRoleArn;
        this.policyDetails = policyDetails;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private LifecyclePolicyState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.executionRoleArn = Output.empty();
        this.policyDetails = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> executionRoleArn;
        private @Nullable Output<LifecyclePolicyPolicyDetailsGetArgs> policyDetails;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.policyDetails = defaults.policyDetails;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Output.ofNullable(executionRoleArn);
            return this;
        }
        public Builder policyDetails(@Nullable Output<LifecyclePolicyPolicyDetailsGetArgs> policyDetails) {
            this.policyDetails = policyDetails;
            return this;
        }
        public Builder policyDetails(@Nullable LifecyclePolicyPolicyDetailsGetArgs policyDetails) {
            this.policyDetails = Output.ofNullable(policyDetails);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public LifecyclePolicyState build() {
            return new LifecyclePolicyState(arn, description, executionRoleArn, policyDetails, state, tags, tagsAll);
        }
    }
}
