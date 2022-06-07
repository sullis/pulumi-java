// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMembershipArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMembershipArgs Empty = new GetMembershipArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="membershipId", required=true)
    private Output<String> membershipId;

    public Output<String> membershipId() {
        return this.membershipId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMembershipArgs() {}

    private GetMembershipArgs(GetMembershipArgs $) {
        this.location = $.location;
        this.membershipId = $.membershipId;
        this.project = $.project;
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

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder membershipId(Output<String> membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        public Builder membershipId(String membershipId) {
            return membershipId(Output.of(membershipId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetMembershipArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            return $;
        }
    }

}
