// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse {
    /**
     * A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with 'gs://'.
     * 
     */
    private final String gcsPath;
    /**
     * The parameters of the template to launch. This should be part of the body of the POST request.
     * 
     */
    private final GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters;
    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
     * 
     */
    private final String location;
    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    private final String project;
    /**
     * If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    private final Boolean validateOnly;

    @OutputCustomType.Constructor({"gcsPath","launchParameters","location","project","validateOnly"})
    private GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse(
        String gcsPath,
        GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters,
        String location,
        String project,
        Boolean validateOnly) {
        this.gcsPath = Objects.requireNonNull(gcsPath);
        this.launchParameters = Objects.requireNonNull(launchParameters);
        this.location = Objects.requireNonNull(location);
        this.project = Objects.requireNonNull(project);
        this.validateOnly = Objects.requireNonNull(validateOnly);
    }

    /**
     * A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with 'gs://'.
     * 
    */
    public String getGcsPath() {
        return this.gcsPath;
    }
    /**
     * The parameters of the template to launch. This should be part of the body of the POST request.
     * 
    */
    public GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse getLaunchParameters() {
        return this.launchParameters;
    }
    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * If true, the request is validated but not actually executed. Defaults to false.
     * 
    */
    public Boolean getValidateOnly() {
        return this.validateOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsPath;
        private GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters;
        private String location;
        private String project;
        private Boolean validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
    	      this.launchParameters = defaults.launchParameters;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setGcsPath(String gcsPath) {
            this.gcsPath = Objects.requireNonNull(gcsPath);
            return this;
        }

        public Builder setLaunchParameters(GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters) {
            this.launchParameters = Objects.requireNonNull(launchParameters);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setValidateOnly(Boolean validateOnly) {
            this.validateOnly = Objects.requireNonNull(validateOnly);
            return this;
        }
        public GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse build() {
            return new GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse(gcsPath, launchParameters, location, project, validateOnly);
        }
    }
}