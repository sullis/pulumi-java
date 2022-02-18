// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceContainerImage {
    /**
     * The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    private final String repository;
    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    private final @Nullable String tag;

    @OutputCustomType.Constructor({"repository","tag"})
    private InstanceContainerImage(
        String repository,
        @Nullable String tag) {
        this.repository = Objects.requireNonNull(repository);
        this.tag = tag;
    }

    /**
     * The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    public String getRepository() {
        return this.repository;
    }
    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceContainerImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repository;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceContainerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder setRepository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        public InstanceContainerImage build() {
            return new InstanceContainerImage(repository, tag);
        }
    }
}
