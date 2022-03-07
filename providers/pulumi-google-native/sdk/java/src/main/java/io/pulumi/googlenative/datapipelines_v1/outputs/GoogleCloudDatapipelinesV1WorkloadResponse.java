// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatapipelinesV1WorkloadResponse {
    /**
     * Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * 
     */
    private final GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest;
    /**
     * Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * 
     */
    private final GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest;

    @OutputCustomType.Constructor({"dataflowFlexTemplateRequest","dataflowLaunchTemplateRequest"})
    private GoogleCloudDatapipelinesV1WorkloadResponse(
        GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest,
        GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest) {
        this.dataflowFlexTemplateRequest = Objects.requireNonNull(dataflowFlexTemplateRequest);
        this.dataflowLaunchTemplateRequest = Objects.requireNonNull(dataflowLaunchTemplateRequest);
    }

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * 
    */
    public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse getDataflowFlexTemplateRequest() {
        return this.dataflowFlexTemplateRequest;
    }
    /**
     * Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * 
    */
    public GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse getDataflowLaunchTemplateRequest() {
        return this.dataflowLaunchTemplateRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1WorkloadResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest;
        private GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1WorkloadResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataflowFlexTemplateRequest = defaults.dataflowFlexTemplateRequest;
    	      this.dataflowLaunchTemplateRequest = defaults.dataflowLaunchTemplateRequest;
        }

        public Builder setDataflowFlexTemplateRequest(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest) {
            this.dataflowFlexTemplateRequest = Objects.requireNonNull(dataflowFlexTemplateRequest);
            return this;
        }

        public Builder setDataflowLaunchTemplateRequest(GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest) {
            this.dataflowLaunchTemplateRequest = Objects.requireNonNull(dataflowLaunchTemplateRequest);
            return this;
        }
        public GoogleCloudDatapipelinesV1WorkloadResponse build() {
            return new GoogleCloudDatapipelinesV1WorkloadResponse(dataflowFlexTemplateRequest, dataflowLaunchTemplateRequest);
        }
    }
}