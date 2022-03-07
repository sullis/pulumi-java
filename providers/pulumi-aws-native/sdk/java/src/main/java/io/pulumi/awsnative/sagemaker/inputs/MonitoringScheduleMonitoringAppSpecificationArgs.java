// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringAppSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringAppSpecificationArgs Empty = new MonitoringScheduleMonitoringAppSpecificationArgs();

    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    @InputImport(name="containerArguments")
      private final @Nullable Input<List<String>> containerArguments;

    public Input<List<String>> getContainerArguments() {
        return this.containerArguments == null ? Input.empty() : this.containerArguments;
    }

    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    @InputImport(name="containerEntrypoint")
      private final @Nullable Input<List<String>> containerEntrypoint;

    public Input<List<String>> getContainerEntrypoint() {
        return this.containerEntrypoint == null ? Input.empty() : this.containerEntrypoint;
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @InputImport(name="imageUri", required=true)
      private final Input<String> imageUri;

    public Input<String> getImageUri() {
        return this.imageUri;
    }

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    @InputImport(name="postAnalyticsProcessorSourceUri")
      private final @Nullable Input<String> postAnalyticsProcessorSourceUri;

    public Input<String> getPostAnalyticsProcessorSourceUri() {
        return this.postAnalyticsProcessorSourceUri == null ? Input.empty() : this.postAnalyticsProcessorSourceUri;
    }

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    @InputImport(name="recordPreprocessorSourceUri")
      private final @Nullable Input<String> recordPreprocessorSourceUri;

    public Input<String> getRecordPreprocessorSourceUri() {
        return this.recordPreprocessorSourceUri == null ? Input.empty() : this.recordPreprocessorSourceUri;
    }

    public MonitoringScheduleMonitoringAppSpecificationArgs(
        @Nullable Input<List<String>> containerArguments,
        @Nullable Input<List<String>> containerEntrypoint,
        Input<String> imageUri,
        @Nullable Input<String> postAnalyticsProcessorSourceUri,
        @Nullable Input<String> recordPreprocessorSourceUri) {
        this.containerArguments = containerArguments;
        this.containerEntrypoint = containerEntrypoint;
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    private MonitoringScheduleMonitoringAppSpecificationArgs() {
        this.containerArguments = Input.empty();
        this.containerEntrypoint = Input.empty();
        this.imageUri = Input.empty();
        this.postAnalyticsProcessorSourceUri = Input.empty();
        this.recordPreprocessorSourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringAppSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> containerArguments;
        private @Nullable Input<List<String>> containerEntrypoint;
        private Input<String> imageUri;
        private @Nullable Input<String> postAnalyticsProcessorSourceUri;
        private @Nullable Input<String> recordPreprocessorSourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringAppSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerArguments = defaults.containerArguments;
    	      this.containerEntrypoint = defaults.containerEntrypoint;
    	      this.imageUri = defaults.imageUri;
    	      this.postAnalyticsProcessorSourceUri = defaults.postAnalyticsProcessorSourceUri;
    	      this.recordPreprocessorSourceUri = defaults.recordPreprocessorSourceUri;
        }

        public Builder setContainerArguments(@Nullable Input<List<String>> containerArguments) {
            this.containerArguments = containerArguments;
            return this;
        }

        public Builder setContainerArguments(@Nullable List<String> containerArguments) {
            this.containerArguments = Input.ofNullable(containerArguments);
            return this;
        }

        public Builder setContainerEntrypoint(@Nullable Input<List<String>> containerEntrypoint) {
            this.containerEntrypoint = containerEntrypoint;
            return this;
        }

        public Builder setContainerEntrypoint(@Nullable List<String> containerEntrypoint) {
            this.containerEntrypoint = Input.ofNullable(containerEntrypoint);
            return this;
        }

        public Builder setImageUri(Input<String> imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder setImageUri(String imageUri) {
            this.imageUri = Input.of(Objects.requireNonNull(imageUri));
            return this;
        }

        public Builder setPostAnalyticsProcessorSourceUri(@Nullable Input<String> postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }

        public Builder setPostAnalyticsProcessorSourceUri(@Nullable String postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = Input.ofNullable(postAnalyticsProcessorSourceUri);
            return this;
        }

        public Builder setRecordPreprocessorSourceUri(@Nullable Input<String> recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }

        public Builder setRecordPreprocessorSourceUri(@Nullable String recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = Input.ofNullable(recordPreprocessorSourceUri);
            return this;
        }
        public MonitoringScheduleMonitoringAppSpecificationArgs build() {
            return new MonitoringScheduleMonitoringAppSpecificationArgs(containerArguments, containerEntrypoint, imageUri, postAnalyticsProcessorSourceUri, recordPreprocessorSourceUri);
        }
    }
}