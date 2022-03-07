// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceIamMemberArgs Empty = new NamespaceIamMemberArgs();

    @InputImport(name="condition")
      private final @Nullable Input<NamespaceIamMemberConditionArgs> condition;

    public Input<NamespaceIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
      private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.servicedirectory.NamespaceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public NamespaceIamMemberArgs(
        @Nullable Input<NamespaceIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> name,
        Input<String> role) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.name = name;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private NamespaceIamMemberArgs() {
        this.condition = Input.empty();
        this.member = Input.empty();
        this.name = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NamespaceIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> name;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<NamespaceIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable NamespaceIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public NamespaceIamMemberArgs build() {
            return new NamespaceIamMemberArgs(condition, member, name, role);
        }
    }
}