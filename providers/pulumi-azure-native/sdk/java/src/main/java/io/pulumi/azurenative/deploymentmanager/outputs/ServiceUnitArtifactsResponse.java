// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceUnitArtifactsResponse {
    /**
     * The path to the ARM parameters file relative to the artifact source.
     * 
     */
    private final @Nullable String parametersArtifactSourceRelativePath;
    /**
     * The full URI of the ARM parameters file with the SAS token.
     * 
     */
    private final @Nullable String parametersUri;
    /**
     * The path to the ARM template file relative to the artifact source.
     * 
     */
    private final @Nullable String templateArtifactSourceRelativePath;
    /**
     * The full URI of the ARM template file with the SAS token.
     * 
     */
    private final @Nullable String templateUri;

    @OutputCustomType.Constructor({"parametersArtifactSourceRelativePath","parametersUri","templateArtifactSourceRelativePath","templateUri"})
    private ServiceUnitArtifactsResponse(
        @Nullable String parametersArtifactSourceRelativePath,
        @Nullable String parametersUri,
        @Nullable String templateArtifactSourceRelativePath,
        @Nullable String templateUri) {
        this.parametersArtifactSourceRelativePath = parametersArtifactSourceRelativePath;
        this.parametersUri = parametersUri;
        this.templateArtifactSourceRelativePath = templateArtifactSourceRelativePath;
        this.templateUri = templateUri;
    }

    /**
     * The path to the ARM parameters file relative to the artifact source.
     * 
    */
    public Optional<String> getParametersArtifactSourceRelativePath() {
        return Optional.ofNullable(this.parametersArtifactSourceRelativePath);
    }
    /**
     * The full URI of the ARM parameters file with the SAS token.
     * 
    */
    public Optional<String> getParametersUri() {
        return Optional.ofNullable(this.parametersUri);
    }
    /**
     * The path to the ARM template file relative to the artifact source.
     * 
    */
    public Optional<String> getTemplateArtifactSourceRelativePath() {
        return Optional.ofNullable(this.templateArtifactSourceRelativePath);
    }
    /**
     * The full URI of the ARM template file with the SAS token.
     * 
    */
    public Optional<String> getTemplateUri() {
        return Optional.ofNullable(this.templateUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUnitArtifactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String parametersArtifactSourceRelativePath;
        private @Nullable String parametersUri;
        private @Nullable String templateArtifactSourceRelativePath;
        private @Nullable String templateUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUnitArtifactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parametersArtifactSourceRelativePath = defaults.parametersArtifactSourceRelativePath;
    	      this.parametersUri = defaults.parametersUri;
    	      this.templateArtifactSourceRelativePath = defaults.templateArtifactSourceRelativePath;
    	      this.templateUri = defaults.templateUri;
        }

        public Builder setParametersArtifactSourceRelativePath(@Nullable String parametersArtifactSourceRelativePath) {
            this.parametersArtifactSourceRelativePath = parametersArtifactSourceRelativePath;
            return this;
        }

        public Builder setParametersUri(@Nullable String parametersUri) {
            this.parametersUri = parametersUri;
            return this;
        }

        public Builder setTemplateArtifactSourceRelativePath(@Nullable String templateArtifactSourceRelativePath) {
            this.templateArtifactSourceRelativePath = templateArtifactSourceRelativePath;
            return this;
        }

        public Builder setTemplateUri(@Nullable String templateUri) {
            this.templateUri = templateUri;
            return this;
        }
        public ServiceUnitArtifactsResponse build() {
            return new ServiceUnitArtifactsResponse(parametersArtifactSourceRelativePath, parametersUri, templateArtifactSourceRelativePath, templateUri);
        }
    }
}