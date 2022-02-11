// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.detective.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMemberInvitationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMemberInvitationArgs Empty = new GetMemberInvitationArgs();

    @InputImport(name="graphArn", required=true)
    private final String graphArn;

    public String getGraphArn() {
        return this.graphArn;
    }

    @InputImport(name="memberId", required=true)
    private final String memberId;

    public String getMemberId() {
        return this.memberId;
    }

    public GetMemberInvitationArgs(
        String graphArn,
        String memberId) {
        this.graphArn = Objects.requireNonNull(graphArn, "expected parameter 'graphArn' to be non-null");
        this.memberId = Objects.requireNonNull(memberId, "expected parameter 'memberId' to be non-null");
    }

    private GetMemberInvitationArgs() {
        this.graphArn = null;
        this.memberId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMemberInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String graphArn;
        private String memberId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMemberInvitationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.graphArn = defaults.graphArn;
    	      this.memberId = defaults.memberId;
        }

        public Builder setGraphArn(String graphArn) {
            this.graphArn = Objects.requireNonNull(graphArn);
            return this;
        }

        public Builder setMemberId(String memberId) {
            this.memberId = Objects.requireNonNull(memberId);
            return this;
        }

        public GetMemberInvitationArgs build() {
            return new GetMemberInvitationArgs(graphArn, memberId);
        }
    }
}
