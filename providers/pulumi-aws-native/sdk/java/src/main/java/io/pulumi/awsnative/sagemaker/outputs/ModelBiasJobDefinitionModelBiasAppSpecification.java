// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelBiasJobDefinitionModelBiasAppSpecification {
    /**
     * The S3 URI to an analysis configuration file
     * 
     */
    private final String configUri;
    /**
     * Sets the environment variables in the Docker container
     * 
     */
    private final @Nullable Object environment;
    /**
     * The container image to be run by the monitoring job.
     * 
     */
    private final String imageUri;

    @CustomType.Constructor
    private ModelBiasJobDefinitionModelBiasAppSpecification(
        @CustomType.Parameter("configUri") String configUri,
        @CustomType.Parameter("environment") @Nullable Object environment,
        @CustomType.Parameter("imageUri") String imageUri) {
        this.configUri = configUri;
        this.environment = environment;
        this.imageUri = imageUri;
    }

    /**
     * The S3 URI to an analysis configuration file
     * 
    */
    public String configUri() {
        return this.configUri;
    }
    /**
     * Sets the environment variables in the Docker container
     * 
    */
    public Optional<Object> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * The container image to be run by the monitoring job.
     * 
    */
    public String imageUri() {
        return this.imageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionModelBiasAppSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configUri;
        private @Nullable Object environment;
        private String imageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionModelBiasAppSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configUri = defaults.configUri;
    	      this.environment = defaults.environment;
    	      this.imageUri = defaults.imageUri;
        }

        public Builder configUri(String configUri) {
            this.configUri = Objects.requireNonNull(configUri);
            return this;
        }
        public Builder environment(@Nullable Object environment) {
            this.environment = environment;
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }        public ModelBiasJobDefinitionModelBiasAppSpecification build() {
            return new ModelBiasJobDefinitionModelBiasAppSpecification(configUri, environment, imageUri);
        }
    }
}
