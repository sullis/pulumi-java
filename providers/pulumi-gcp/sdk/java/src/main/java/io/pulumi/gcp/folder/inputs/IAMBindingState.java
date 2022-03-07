// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.folder.inputs.IAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingState extends io.pulumi.resources.ResourceArgs {

    public static final IAMBindingState Empty = new IAMBindingState();

    @InputImport(name="condition")
      private final @Nullable Input<IAMBindingConditionGetArgs> condition;

    public Input<IAMBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the folder's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    @InputImport(name="folder")
      private final @Nullable Input<String> folder;

    public Input<String> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * An array of identities that will be granted the privilege in the `role`.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that is associated with a specific Google account. For example, alice@gmail.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    @InputImport(name="members")
      private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public IAMBindingState(
        @Nullable Input<IAMBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> folder,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.folder = folder;
        this.members = members;
        this.role = role;
    }

    private IAMBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.folder = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IAMBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> folder;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<IAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable IAMBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setFolder(@Nullable Input<String> folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFolder(@Nullable String folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public IAMBindingState build() {
            return new IAMBindingState(condition, etag, folder, members, role);
        }
    }
}