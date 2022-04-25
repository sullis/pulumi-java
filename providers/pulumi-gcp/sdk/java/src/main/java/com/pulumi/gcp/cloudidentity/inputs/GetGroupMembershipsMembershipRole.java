// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupMembershipsMembershipRole extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupMembershipsMembershipRole Empty = new GetGroupMembershipsMembershipRole();

    /**
     * The name of the MembershipRole. One of OWNER, MANAGER, MEMBER.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the MembershipRole. One of OWNER, MANAGER, MEMBER.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetGroupMembershipsMembershipRole() {}

    private GetGroupMembershipsMembershipRole(GetGroupMembershipsMembershipRole $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupMembershipsMembershipRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupMembershipsMembershipRole $;

        public Builder() {
            $ = new GetGroupMembershipsMembershipRole();
        }

        public Builder(GetGroupMembershipsMembershipRole defaults) {
            $ = new GetGroupMembershipsMembershipRole(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the MembershipRole. One of OWNER, MANAGER, MEMBER.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetGroupMembershipsMembershipRole build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
