// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs Empty = new ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs();

    /**
     * The S3 URI to an analysis configuration file
     * 
     */
    @Import(name="configUri", required=true)
      private final Output<String> configUri;

    public Output<String> configUri() {
        return this.configUri;
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<Object> environment;

    public Output<Object> environment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @Import(name="imageUri", required=true)
      private final Output<String> imageUri;

    public Output<String> imageUri() {
        return this.imageUri;
    }

    public ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs(
        Output<String> configUri,
        @Nullable Output<Object> environment,
        Output<String> imageUri) {
        this.configUri = Objects.requireNonNull(configUri, "expected parameter 'configUri' to be non-null");
        this.environment = environment;
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
    }

    private ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs() {
        this.configUri = Codegen.empty();
        this.environment = Codegen.empty();
        this.imageUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configUri;
        private @Nullable Output<Object> environment;
        private Output<String> imageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configUri = defaults.configUri;
    	      this.environment = defaults.environment;
    	      this.imageUri = defaults.imageUri;
        }

        public Builder configUri(Output<String> configUri) {
            this.configUri = Objects.requireNonNull(configUri);
            return this;
        }
        public Builder configUri(String configUri) {
            this.configUri = Output.of(Objects.requireNonNull(configUri));
            return this;
        }
        public Builder environment(@Nullable Output<Object> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable Object environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder imageUri(Output<String> imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Output.of(Objects.requireNonNull(imageUri));
            return this;
        }        public ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs build() {
            return new ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs(configUri, environment, imageUri);
        }
    }
}
