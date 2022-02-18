// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ModelBiasJobDefinitionMonitoringGroundTruthS3Input {
    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    private final String s3Uri;

    @OutputCustomType.Constructor({"s3Uri"})
    private ModelBiasJobDefinitionMonitoringGroundTruthS3Input(String s3Uri) {
        this.s3Uri = Objects.requireNonNull(s3Uri);
    }

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    public String getS3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionMonitoringGroundTruthS3Input defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionMonitoringGroundTruthS3Input defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder setS3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }

        public ModelBiasJobDefinitionMonitoringGroundTruthS3Input build() {
            return new ModelBiasJobDefinitionMonitoringGroundTruthS3Input(s3Uri);
        }
    }
}
