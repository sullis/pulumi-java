// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Template Options for the static site.
 * 
 */
public final class StaticSiteTemplateOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteTemplateOptionsArgs Empty = new StaticSiteTemplateOptionsArgs();

    /**
     * Description of the newly generated repository.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     */
    @Import(name="isPrivate")
      private final @Nullable Output<Boolean> isPrivate;

    public Output<Boolean> getIsPrivate() {
        return this.isPrivate == null ? Output.empty() : this.isPrivate;
    }

    /**
     * Owner of the newly generated repository.
     * 
     */
    @Import(name="owner")
      private final @Nullable Output<String> owner;

    public Output<String> getOwner() {
        return this.owner == null ? Output.empty() : this.owner;
    }

    /**
     * Name of the newly generated repository.
     * 
     */
    @Import(name="repositoryName")
      private final @Nullable Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName == null ? Output.empty() : this.repositoryName;
    }

    /**
     * URL of the template repository. The newly generated repository will be based on this one.
     * 
     */
    @Import(name="templateRepositoryUrl")
      private final @Nullable Output<String> templateRepositoryUrl;

    public Output<String> getTemplateRepositoryUrl() {
        return this.templateRepositoryUrl == null ? Output.empty() : this.templateRepositoryUrl;
    }

    public StaticSiteTemplateOptionsArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> isPrivate,
        @Nullable Output<String> owner,
        @Nullable Output<String> repositoryName,
        @Nullable Output<String> templateRepositoryUrl) {
        this.description = description;
        this.isPrivate = isPrivate;
        this.owner = owner;
        this.repositoryName = repositoryName;
        this.templateRepositoryUrl = templateRepositoryUrl;
    }

    private StaticSiteTemplateOptionsArgs() {
        this.description = Output.empty();
        this.isPrivate = Output.empty();
        this.owner = Output.empty();
        this.repositoryName = Output.empty();
        this.templateRepositoryUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteTemplateOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> isPrivate;
        private @Nullable Output<String> owner;
        private @Nullable Output<String> repositoryName;
        private @Nullable Output<String> templateRepositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteTemplateOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.isPrivate = defaults.isPrivate;
    	      this.owner = defaults.owner;
    	      this.repositoryName = defaults.repositoryName;
    	      this.templateRepositoryUrl = defaults.templateRepositoryUrl;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder isPrivate(@Nullable Output<Boolean> isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }
        public Builder isPrivate(@Nullable Boolean isPrivate) {
            this.isPrivate = Output.ofNullable(isPrivate);
            return this;
        }
        public Builder owner(@Nullable Output<String> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = Output.ofNullable(owner);
            return this;
        }
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Output.ofNullable(repositoryName);
            return this;
        }
        public Builder templateRepositoryUrl(@Nullable Output<String> templateRepositoryUrl) {
            this.templateRepositoryUrl = templateRepositoryUrl;
            return this;
        }
        public Builder templateRepositoryUrl(@Nullable String templateRepositoryUrl) {
            this.templateRepositoryUrl = Output.ofNullable(templateRepositoryUrl);
            return this;
        }        public StaticSiteTemplateOptionsArgs build() {
            return new StaticSiteTemplateOptionsArgs(description, isPrivate, owner, repositoryName, templateRepositoryUrl);
        }
    }
}
