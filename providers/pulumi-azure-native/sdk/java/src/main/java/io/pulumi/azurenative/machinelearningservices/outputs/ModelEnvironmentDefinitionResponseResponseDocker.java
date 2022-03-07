// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ModelDockerSectionResponseResponseBaseImageRegistry;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelEnvironmentDefinitionResponseResponseDocker {
    /**
     * Base Dockerfile used for Docker-based runs. Mutually exclusive with BaseImage.
     * 
     */
    private final @Nullable String baseDockerfile;
    /**
     * Base image used for Docker-based runs. Mutually exclusive with BaseDockerfile.
     * 
     */
    private final @Nullable String baseImage;
    /**
     * Image registry that contains the base image.
     * 
     */
    private final @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry;

    @OutputCustomType.Constructor({"baseDockerfile","baseImage","baseImageRegistry"})
    private ModelEnvironmentDefinitionResponseResponseDocker(
        @Nullable String baseDockerfile,
        @Nullable String baseImage,
        @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry) {
        this.baseDockerfile = baseDockerfile;
        this.baseImage = baseImage;
        this.baseImageRegistry = baseImageRegistry;
    }

    /**
     * Base Dockerfile used for Docker-based runs. Mutually exclusive with BaseImage.
     * 
    */
    public Optional<String> getBaseDockerfile() {
        return Optional.ofNullable(this.baseDockerfile);
    }
    /**
     * Base image used for Docker-based runs. Mutually exclusive with BaseDockerfile.
     * 
    */
    public Optional<String> getBaseImage() {
        return Optional.ofNullable(this.baseImage);
    }
    /**
     * Image registry that contains the base image.
     * 
    */
    public Optional<ModelDockerSectionResponseResponseBaseImageRegistry> getBaseImageRegistry() {
        return Optional.ofNullable(this.baseImageRegistry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseDocker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseDockerfile;
        private @Nullable String baseImage;
        private @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseDocker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseDockerfile = defaults.baseDockerfile;
    	      this.baseImage = defaults.baseImage;
    	      this.baseImageRegistry = defaults.baseImageRegistry;
        }

        public Builder setBaseDockerfile(@Nullable String baseDockerfile) {
            this.baseDockerfile = baseDockerfile;
            return this;
        }

        public Builder setBaseImage(@Nullable String baseImage) {
            this.baseImage = baseImage;
            return this;
        }

        public Builder setBaseImageRegistry(@Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry) {
            this.baseImageRegistry = baseImageRegistry;
            return this;
        }
        public ModelEnvironmentDefinitionResponseResponseDocker build() {
            return new ModelEnvironmentDefinitionResponseResponseDocker(baseDockerfile, baseImage, baseImageRegistry);
        }
    }
}