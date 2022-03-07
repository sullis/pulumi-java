// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The default branch of the repository. The branch specified here needs to exist.
     * 
     */
    @InputImport(name="defaultBranch")
      private final @Nullable Input<String> defaultBranch;

    public Input<String> getDefaultBranch() {
        return this.defaultBranch == null ? Input.empty() : this.defaultBranch;
    }

    /**
     * The description of the repository. This needs to be less than 1000 characters
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @InputImport(name="repositoryName", required=true)
      private final Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RepositoryArgs(
        @Nullable Input<String> defaultBranch,
        @Nullable Input<String> description,
        Input<String> repositoryName,
        @Nullable Input<Map<String,String>> tags) {
        this.defaultBranch = defaultBranch;
        this.description = description;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.tags = tags;
    }

    private RepositoryArgs() {
        this.defaultBranch = Input.empty();
        this.description = Input.empty();
        this.repositoryName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultBranch;
        private @Nullable Input<String> description;
        private Input<String> repositoryName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBranch = defaults.defaultBranch;
    	      this.description = defaults.description;
    	      this.repositoryName = defaults.repositoryName;
    	      this.tags = defaults.tags;
        }

        public Builder setDefaultBranch(@Nullable Input<String> defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }

        public Builder setDefaultBranch(@Nullable String defaultBranch) {
            this.defaultBranch = Input.ofNullable(defaultBranch);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setRepositoryName(Input<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }

        public Builder setRepositoryName(String repositoryName) {
            this.repositoryName = Input.of(Objects.requireNonNull(repositoryName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(defaultBranch, description, repositoryName, tags);
        }
    }
}