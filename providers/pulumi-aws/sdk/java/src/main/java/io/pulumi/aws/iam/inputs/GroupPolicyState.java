// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final GroupPolicyState Empty = new GroupPolicyState();

    /**
     * The IAM group to attach to the policy.
     * 
     */
    @Import(name="group")
      private final @Nullable Output<String> group;

    public Output<String> group() {
        return this.group == null ? Codegen.empty() : this.group;
    }

    /**
     * The name of the policy. If omitted, this provider will
     * assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    public GroupPolicyState(
        @Nullable Output<String> group,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> policy) {
        this.group = group;
        this.name = name;
        this.namePrefix = namePrefix;
        this.policy = policy;
    }

    private GroupPolicyState() {
        this.group = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> group;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.policy = defaults.policy;
        }

        public Builder group(@Nullable Output<String> group) {
            this.group = group;
            return this;
        }
        public Builder group(@Nullable String group) {
            this.group = Codegen.ofNullable(group);
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
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }        public GroupPolicyState build() {
            return new GroupPolicyState(group, name, namePrefix, policy);
        }
    }
}
