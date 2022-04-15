// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.iam.inputs.RoleInlinePolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * Policy that grants an entity permission to assume the role.
     * 
     */
    @Import(name="assumeRolePolicy", required=true)
      private final Output<String> assumeRolePolicy;

    public Output<String> assumeRolePolicy() {
        return this.assumeRolePolicy;
    }

    /**
     * Description of the role.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
     * 
     */
    @Import(name="forceDetachPolicies")
      private final @Nullable Output<Boolean> forceDetachPolicies;

    public Output<Boolean> forceDetachPolicies() {
        return this.forceDetachPolicies == null ? Codegen.empty() : this.forceDetachPolicies;
    }

    /**
     * Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, this provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inline_policy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
     * 
     */
    @Import(name="inlinePolicies")
      private final @Nullable Output<List<RoleInlinePolicyArgs>> inlinePolicies;

    public Output<List<RoleInlinePolicyArgs>> inlinePolicies() {
        return this.inlinePolicies == null ? Codegen.empty() : this.inlinePolicies;
    }

    /**
     * Set of exclusive IAM managed policy ARNs to attach to the IAM role. If this attribute is not configured, this provider will ignore policy attachments to this resource. When configured, the provider will align the role's managed policy attachments with this set by attaching or detaching managed policies. Configuring an empty set (i.e., `managed_policy_arns = []`) will cause the provider to remove _all_ managed policy attachments.
     * 
     */
    @Import(name="managedPolicyArns")
      private final @Nullable Output<List<String>> managedPolicyArns;

    public Output<List<String>> managedPolicyArns() {
        return this.managedPolicyArns == null ? Codegen.empty() : this.managedPolicyArns;
    }

    /**
     * Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    @Import(name="maxSessionDuration")
      private final @Nullable Output<Integer> maxSessionDuration;

    public Output<Integer> maxSessionDuration() {
        return this.maxSessionDuration == null ? Codegen.empty() : this.maxSessionDuration;
    }

    /**
     * Name of the role policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * ARN of the policy that is used to set the permissions boundary for the role.
     * 
     */
    @Import(name="permissionsBoundary")
      private final @Nullable Output<String> permissionsBoundary;

    public Output<String> permissionsBoundary() {
        return this.permissionsBoundary == null ? Codegen.empty() : this.permissionsBoundary;
    }

    /**
     * Key-value mapping of tags for the IAM role. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RoleArgs(
        Output<String> assumeRolePolicy,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceDetachPolicies,
        @Nullable Output<List<RoleInlinePolicyArgs>> inlinePolicies,
        @Nullable Output<List<String>> managedPolicyArns,
        @Nullable Output<Integer> maxSessionDuration,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> path,
        @Nullable Output<String> permissionsBoundary,
        @Nullable Output<Map<String,String>> tags) {
        this.assumeRolePolicy = Objects.requireNonNull(assumeRolePolicy, "expected parameter 'assumeRolePolicy' to be non-null");
        this.description = description;
        this.forceDetachPolicies = forceDetachPolicies;
        this.inlinePolicies = inlinePolicies;
        this.managedPolicyArns = managedPolicyArns;
        this.maxSessionDuration = maxSessionDuration;
        this.name = name;
        this.namePrefix = namePrefix;
        this.path = path;
        this.permissionsBoundary = permissionsBoundary;
        this.tags = tags;
    }

    private RoleArgs() {
        this.assumeRolePolicy = Codegen.empty();
        this.description = Codegen.empty();
        this.forceDetachPolicies = Codegen.empty();
        this.inlinePolicies = Codegen.empty();
        this.managedPolicyArns = Codegen.empty();
        this.maxSessionDuration = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.path = Codegen.empty();
        this.permissionsBoundary = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> assumeRolePolicy;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceDetachPolicies;
        private @Nullable Output<List<RoleInlinePolicyArgs>> inlinePolicies;
        private @Nullable Output<List<String>> managedPolicyArns;
        private @Nullable Output<Integer> maxSessionDuration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> path;
        private @Nullable Output<String> permissionsBoundary;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRolePolicy = defaults.assumeRolePolicy;
    	      this.description = defaults.description;
    	      this.forceDetachPolicies = defaults.forceDetachPolicies;
    	      this.inlinePolicies = defaults.inlinePolicies;
    	      this.managedPolicyArns = defaults.managedPolicyArns;
    	      this.maxSessionDuration = defaults.maxSessionDuration;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.path = defaults.path;
    	      this.permissionsBoundary = defaults.permissionsBoundary;
    	      this.tags = defaults.tags;
        }

        public Builder assumeRolePolicy(Output<String> assumeRolePolicy) {
            this.assumeRolePolicy = Objects.requireNonNull(assumeRolePolicy);
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
        public Builder forceDetachPolicies(@Nullable Output<Boolean> forceDetachPolicies) {
            this.forceDetachPolicies = forceDetachPolicies;
            return this;
        }
        public Builder forceDetachPolicies(@Nullable Boolean forceDetachPolicies) {
            this.forceDetachPolicies = Codegen.ofNullable(forceDetachPolicies);
            return this;
        }
        public Builder inlinePolicies(@Nullable Output<List<RoleInlinePolicyArgs>> inlinePolicies) {
            this.inlinePolicies = inlinePolicies;
            return this;
        }
        public Builder inlinePolicies(@Nullable List<RoleInlinePolicyArgs> inlinePolicies) {
            this.inlinePolicies = Codegen.ofNullable(inlinePolicies);
            return this;
        }
        public Builder inlinePolicies(RoleInlinePolicyArgs... inlinePolicies) {
            return inlinePolicies(List.of(inlinePolicies));
        }
        public Builder managedPolicyArns(@Nullable Output<List<String>> managedPolicyArns) {
            this.managedPolicyArns = managedPolicyArns;
            return this;
        }
        public Builder managedPolicyArns(@Nullable List<String> managedPolicyArns) {
            this.managedPolicyArns = Codegen.ofNullable(managedPolicyArns);
            return this;
        }
        public Builder managedPolicyArns(String... managedPolicyArns) {
            return managedPolicyArns(List.of(managedPolicyArns));
        }
        public Builder maxSessionDuration(@Nullable Output<Integer> maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Builder maxSessionDuration(@Nullable Integer maxSessionDuration) {
            this.maxSessionDuration = Codegen.ofNullable(maxSessionDuration);
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
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder permissionsBoundary(@Nullable Output<String> permissionsBoundary) {
            this.permissionsBoundary = permissionsBoundary;
            return this;
        }
        public Builder permissionsBoundary(@Nullable String permissionsBoundary) {
            this.permissionsBoundary = Codegen.ofNullable(permissionsBoundary);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public RoleArgs build() {
            return new RoleArgs(assumeRolePolicy, description, forceDetachPolicies, inlinePolicies, managedPolicyArns, maxSessionDuration, name, namePrefix, path, permissionsBoundary, tags);
        }
    }
}
