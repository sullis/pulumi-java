// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TopicPolicyState Empty = new TopicPolicyState();

    /**
     * The ARN of the SNS topic
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The AWS Account ID of the SNS topic owner
     * 
     */
    @Import(name="owner")
      private final @Nullable Output<String> owner;

    public Output<String> owner() {
        return this.owner == null ? Codegen.empty() : this.owner;
    }

    /**
     * The fully-formed AWS policy as JSON.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    public TopicPolicyState(
        @Nullable Output<String> arn,
        @Nullable Output<String> owner,
        @Nullable Output<String> policy) {
        this.arn = arn;
        this.owner = owner;
        this.policy = policy;
    }

    private TopicPolicyState() {
        this.arn = Codegen.empty();
        this.owner = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> owner;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.owner = defaults.owner;
    	      this.policy = defaults.policy;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder owner(@Nullable Output<String> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = Codegen.ofNullable(owner);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }        public TopicPolicyState build() {
            return new TopicPolicyState(arn, owner, policy);
        }
    }
}
