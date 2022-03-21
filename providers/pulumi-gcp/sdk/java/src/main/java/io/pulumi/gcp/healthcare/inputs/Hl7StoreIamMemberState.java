// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamMemberState Empty = new Hl7StoreIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition;

    public Output<Hl7StoreIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the HL7v2 store's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="hl7V2StoreId")
      private final @Nullable Output<String> hl7V2StoreId;

    public Output<String> getHl7V2StoreId() {
        return this.hl7V2StoreId == null ? Output.empty() : this.hl7V2StoreId;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public Hl7StoreIamMemberState(
        @Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> hl7V2StoreId,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.hl7V2StoreId = hl7V2StoreId;
        this.member = member;
        this.role = role;
    }

    private Hl7StoreIamMemberState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.hl7V2StoreId = Output.empty();
        this.member = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> hl7V2StoreId;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable Hl7StoreIamMemberConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder hl7V2StoreId(@Nullable Output<String> hl7V2StoreId) {
            this.hl7V2StoreId = hl7V2StoreId;
            return this;
        }
        public Builder hl7V2StoreId(@Nullable String hl7V2StoreId) {
            this.hl7V2StoreId = Output.ofNullable(hl7V2StoreId);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }        public Hl7StoreIamMemberState build() {
            return new Hl7StoreIamMemberState(condition, etag, hl7V2StoreId, member, role);
        }
    }
}
