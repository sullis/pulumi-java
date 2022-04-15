// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicaKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaKeyArgs Empty = new ReplicaKeyArgs();

    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    @Import(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    public Output<Boolean> bypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Codegen.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * 
     */
    @Import(name="deletionWindowInDays")
      private final @Nullable Output<Integer> deletionWindowInDays;

    public Output<Integer> deletionWindowInDays() {
        return this.deletionWindowInDays == null ? Codegen.empty() : this.deletionWindowInDays;
    }

    /**
     * A description of the KMS key.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. The default value is `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     * 
     */
    @Import(name="primaryKeyArn", required=true)
      private final Output<String> primaryKeyArn;

    public Output<String> primaryKeyArn() {
        return this.primaryKeyArn;
    }

    /**
     * A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ReplicaKeyArgs(
        @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Output<Integer> deletionWindowInDays,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> policy,
        Output<String> primaryKeyArn,
        @Nullable Output<Map<String,String>> tags) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.deletionWindowInDays = deletionWindowInDays;
        this.description = description;
        this.enabled = enabled;
        this.policy = policy;
        this.primaryKeyArn = Objects.requireNonNull(primaryKeyArn, "expected parameter 'primaryKeyArn' to be non-null");
        this.tags = tags;
    }

    private ReplicaKeyArgs() {
        this.bypassPolicyLockoutSafetyCheck = Codegen.empty();
        this.deletionWindowInDays = Codegen.empty();
        this.description = Codegen.empty();
        this.enabled = Codegen.empty();
        this.policy = Codegen.empty();
        this.primaryKeyArn = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Output<Integer> deletionWindowInDays;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> policy;
        private Output<String> primaryKeyArn;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.deletionWindowInDays = defaults.deletionWindowInDays;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.policy = defaults.policy;
    	      this.primaryKeyArn = defaults.primaryKeyArn;
    	      this.tags = defaults.tags;
        }

        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Codegen.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Output<Integer> deletionWindowInDays) {
            this.deletionWindowInDays = deletionWindowInDays;
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Integer deletionWindowInDays) {
            this.deletionWindowInDays = Codegen.ofNullable(deletionWindowInDays);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder primaryKeyArn(Output<String> primaryKeyArn) {
            this.primaryKeyArn = Objects.requireNonNull(primaryKeyArn);
            return this;
        }
        public Builder primaryKeyArn(String primaryKeyArn) {
            this.primaryKeyArn = Output.of(Objects.requireNonNull(primaryKeyArn));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ReplicaKeyArgs build() {
            return new ReplicaKeyArgs(bypassPolicyLockoutSafetyCheck, deletionWindowInDays, description, enabled, policy, primaryKeyArn, tags);
        }
    }
}
