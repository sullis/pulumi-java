// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends io.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * The ARN assigned by AWS for this user.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * When destroying this user, destroy even if it
     * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
     * a user with non-provider-managed access keys and login profile will fail to be destroyed.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Path in which to create the user.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    @Import(name="permissionsBoundary")
      private final @Nullable Output<String> permissionsBoundary;

    public Output<String> getPermissionsBoundary() {
        return this.permissionsBoundary == null ? Output.empty() : this.permissionsBoundary;
    }

    /**
     * Key-value mapping of tags for the IAM user
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The [unique ID][1] assigned by AWS.
     * 
     */
    @Import(name="uniqueId")
      private final @Nullable Output<String> uniqueId;

    public Output<String> getUniqueId() {
        return this.uniqueId == null ? Output.empty() : this.uniqueId;
    }

    public UserState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> name,
        @Nullable Output<String> path,
        @Nullable Output<String> permissionsBoundary,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> uniqueId) {
        this.arn = arn;
        this.forceDestroy = forceDestroy;
        this.name = name;
        this.path = path;
        this.permissionsBoundary = permissionsBoundary;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uniqueId = uniqueId;
    }

    private UserState() {
        this.arn = Output.empty();
        this.forceDestroy = Output.empty();
        this.name = Output.empty();
        this.path = Output.empty();
        this.permissionsBoundary = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.uniqueId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;
        private @Nullable Output<String> permissionsBoundary;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.permissionsBoundary = defaults.permissionsBoundary;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public Builder permissionsBoundary(@Nullable Output<String> permissionsBoundary) {
            this.permissionsBoundary = permissionsBoundary;
            return this;
        }
        public Builder permissionsBoundary(@Nullable String permissionsBoundary) {
            this.permissionsBoundary = Output.ofNullable(permissionsBoundary);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder uniqueId(@Nullable Output<String> uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Builder uniqueId(@Nullable String uniqueId) {
            this.uniqueId = Output.ofNullable(uniqueId);
            return this;
        }        public UserState build() {
            return new UserState(arn, forceDestroy, name, path, permissionsBoundary, tags, tagsAll, uniqueId);
        }
    }
}
