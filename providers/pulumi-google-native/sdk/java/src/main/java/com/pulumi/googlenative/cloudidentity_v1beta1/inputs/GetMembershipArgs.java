// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMembershipArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMembershipArgs Empty = new GetMembershipArgs();

    @Import(name="groupId", required=true)
    private Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }

    @Import(name="membershipId", required=true)
    private Output<String> membershipId;

    public Output<String> membershipId() {
        return this.membershipId;
    }

    private GetMembershipArgs() {}

    private GetMembershipArgs(GetMembershipArgs $) {
        this.groupId = $.groupId;
        this.membershipId = $.membershipId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMembershipArgs $;

        public Builder() {
            $ = new GetMembershipArgs();
        }

        public Builder(GetMembershipArgs defaults) {
            $ = new GetMembershipArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder membershipId(Output<String> membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        public Builder membershipId(String membershipId) {
            return membershipId(Output.of(membershipId));
        }

        public GetMembershipArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            return $;
        }
    }

}
