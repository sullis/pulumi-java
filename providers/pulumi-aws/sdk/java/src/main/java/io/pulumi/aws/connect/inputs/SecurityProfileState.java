// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityProfileState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileState Empty = new SecurityProfileState();

    /**
     * The Amazon Resource Name (ARN) of the Security Profile.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Specifies the description of the Security Profile.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Output.empty() : this.instanceId;
    }

    /**
     * Specifies the name of the Security Profile.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The organization resource identifier for the security profile.
     * 
     */
    @Import(name="organizationResourceId")
      private final @Nullable Output<String> organizationResourceId;

    public Output<String> getOrganizationResourceId() {
        return this.organizationResourceId == null ? Output.empty() : this.organizationResourceId;
    }

    /**
     * Specifies a list of permissions assigned to the security profile.
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<String>> permissions;

    public Output<List<String>> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    /**
     * The identifier for the Security Profile.
     * 
     */
    @Import(name="securityProfileId")
      private final @Nullable Output<String> securityProfileId;

    public Output<String> getSecurityProfileId() {
        return this.securityProfileId == null ? Output.empty() : this.securityProfileId;
    }

    /**
     * Tags to apply to the Security Profile. If configured with a provider
     * [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public SecurityProfileState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> name,
        @Nullable Output<String> organizationResourceId,
        @Nullable Output<List<String>> permissions,
        @Nullable Output<String> securityProfileId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.instanceId = instanceId;
        this.name = name;
        this.organizationResourceId = organizationResourceId;
        this.permissions = permissions;
        this.securityProfileId = securityProfileId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private SecurityProfileState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.instanceId = Output.empty();
        this.name = Output.empty();
        this.organizationResourceId = Output.empty();
        this.permissions = Output.empty();
        this.securityProfileId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> organizationResourceId;
        private @Nullable Output<List<String>> permissions;
        private @Nullable Output<String> securityProfileId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.organizationResourceId = defaults.organizationResourceId;
    	      this.permissions = defaults.permissions;
    	      this.securityProfileId = defaults.securityProfileId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Output.ofNullable(instanceId);
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
        public Builder organizationResourceId(@Nullable Output<String> organizationResourceId) {
            this.organizationResourceId = organizationResourceId;
            return this;
        }
        public Builder organizationResourceId(@Nullable String organizationResourceId) {
            this.organizationResourceId = Output.ofNullable(organizationResourceId);
            return this;
        }
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder securityProfileId(@Nullable Output<String> securityProfileId) {
            this.securityProfileId = securityProfileId;
            return this;
        }
        public Builder securityProfileId(@Nullable String securityProfileId) {
            this.securityProfileId = Output.ofNullable(securityProfileId);
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
        }        public SecurityProfileState build() {
            return new SecurityProfileState(arn, description, instanceId, name, organizationResourceId, permissions, securityProfileId, tags, tagsAll);
        }
    }
}
