// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GroupMembershipRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipRoleArgs Empty = new GroupMembershipRoleArgs();

    /**
     * The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public GroupMembershipRoleArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GroupMembershipRoleArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public GroupMembershipRoleArgs build() {
            return new GroupMembershipRoleArgs(name);
        }
    }
}