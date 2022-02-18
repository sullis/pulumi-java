// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.ModelQualityJobDefinitionProblemType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelQualityJobDefinitionModelQualityAppSpecification {
    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    private final @Nullable List<String> containerArguments;
    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    private final @Nullable List<String> containerEntrypoint;
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
    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    private final @Nullable String postAnalyticsProcessorSourceUri;
    private final ModelQualityJobDefinitionProblemType problemType;
    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    private final @Nullable String recordPreprocessorSourceUri;

    @OutputCustomType.Constructor({"containerArguments","containerEntrypoint","environment","imageUri","postAnalyticsProcessorSourceUri","problemType","recordPreprocessorSourceUri"})
    private ModelQualityJobDefinitionModelQualityAppSpecification(
        @Nullable List<String> containerArguments,
        @Nullable List<String> containerEntrypoint,
        @Nullable Object environment,
        String imageUri,
        @Nullable String postAnalyticsProcessorSourceUri,
        ModelQualityJobDefinitionProblemType problemType,
        @Nullable String recordPreprocessorSourceUri) {
        this.containerArguments = containerArguments;
        this.containerEntrypoint = containerEntrypoint;
        this.environment = environment;
        this.imageUri = Objects.requireNonNull(imageUri);
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
        this.problemType = Objects.requireNonNull(problemType);
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    public List<String> getContainerArguments() {
        return this.containerArguments == null ? List.of() : this.containerArguments;
    }
    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    public List<String> getContainerEntrypoint() {
        return this.containerEntrypoint == null ? List.of() : this.containerEntrypoint;
    }
    /**
     * Sets the environment variables in the Docker container
     * 
     */
    public Optional<Object> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * The container image to be run by the monitoring job.
     * 
     */
    public String getImageUri() {
        return this.imageUri;
    }
    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    public Optional<String> getPostAnalyticsProcessorSourceUri() {
        return Optional.ofNullable(this.postAnalyticsProcessorSourceUri);
    }
    public ModelQualityJobDefinitionProblemType getProblemType() {
        return this.problemType;
    }
    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    public Optional<String> getRecordPreprocessorSourceUri() {
        return Optional.ofNullable(this.recordPreprocessorSourceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionModelQualityAppSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containerArguments;
        private @Nullable List<String> containerEntrypoint;
        private @Nullable Object environment;
        private String imageUri;
        private @Nullable String postAnalyticsProcessorSourceUri;
        private ModelQualityJobDefinitionProblemType problemType;
        private @Nullable String recordPreprocessorSourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionModelQualityAppSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerArguments = defaults.containerArguments;
    	      this.containerEntrypoint = defaults.containerEntrypoint;
    	      this.environment = defaults.environment;
    	      this.imageUri = defaults.imageUri;
    	      this.postAnalyticsProcessorSourceUri = defaults.postAnalyticsProcessorSourceUri;
    	      this.problemType = defaults.problemType;
    	      this.recordPreprocessorSourceUri = defaults.recordPreprocessorSourceUri;
        }

        public Builder setContainerArguments(@Nullable List<String> containerArguments) {
            this.containerArguments = containerArguments;
            return this;
        }

        public Builder setContainerEntrypoint(@Nullable List<String> containerEntrypoint) {
            this.containerEntrypoint = containerEntrypoint;
            return this;
        }

        public Builder setEnvironment(@Nullable Object environment) {
            this.environment = environment;
            return this;
        }

        public Builder setImageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder setPostAnalyticsProcessorSourceUri(@Nullable String postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }

        public Builder setProblemType(ModelQualityJobDefinitionProblemType problemType) {
            this.problemType = Objects.requireNonNull(problemType);
            return this;
        }

        public Builder setRecordPreprocessorSourceUri(@Nullable String recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }

        public ModelQualityJobDefinitionModelQualityAppSpecification build() {
            return new ModelQualityJobDefinitionModelQualityAppSpecification(containerArguments, containerEntrypoint, environment, imageUri, postAnalyticsProcessorSourceUri, problemType, recordPreprocessorSourceUri);
        }
    }
}
