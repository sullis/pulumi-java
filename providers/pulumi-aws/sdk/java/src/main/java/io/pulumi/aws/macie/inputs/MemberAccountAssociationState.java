// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberAccountAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final MemberAccountAssociationState Empty = new MemberAccountAssociationState();

    /**
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * 
     */
    @Import(name="memberAccountId")
      private final @Nullable Output<String> memberAccountId;

    public Output<String> memberAccountId() {
        return this.memberAccountId == null ? Codegen.empty() : this.memberAccountId;
    }

    public MemberAccountAssociationState(@Nullable Output<String> memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    private MemberAccountAssociationState() {
        this.memberAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberAccountAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> memberAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberAccountAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberAccountId = defaults.memberAccountId;
        }

        public Builder memberAccountId(@Nullable Output<String> memberAccountId) {
            this.memberAccountId = memberAccountId;
            return this;
        }
        public Builder memberAccountId(@Nullable String memberAccountId) {
            this.memberAccountId = Codegen.ofNullable(memberAccountId);
            return this;
        }        public MemberAccountAssociationState build() {
            return new MemberAccountAssociationState(memberAccountId);
        }
    }
}
