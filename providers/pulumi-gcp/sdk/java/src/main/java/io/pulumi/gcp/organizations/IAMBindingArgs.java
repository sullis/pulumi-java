// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMBindingArgs Empty = new IAMBindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<IAMBindingConditionArgs> condition;

    public Input<IAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    @InputImport(name="orgId", required=true)
    private final Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public IAMBindingArgs(
        @Nullable Input<IAMBindingConditionArgs> condition,
        Input<List<String>> members,
        Input<String> orgId,
        Input<String> role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private IAMBindingArgs() {
        this.condition = Input.empty();
        this.members = Input.empty();
        this.orgId = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IAMBindingConditionArgs> condition;
        private Input<List<String>> members;
        private Input<String> orgId;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<IAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable IAMBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder setOrgId(Input<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder setOrgId(String orgId) {
            this.orgId = Input.of(Objects.requireNonNull(orgId));
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

        public IAMBindingArgs build() {
            return new IAMBindingArgs(condition, members, orgId, role);
        }
    }
}
