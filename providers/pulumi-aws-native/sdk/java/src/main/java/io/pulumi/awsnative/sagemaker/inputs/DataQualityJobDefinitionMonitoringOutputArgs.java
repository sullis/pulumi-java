// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionS3OutputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The output object for a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionMonitoringOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionMonitoringOutputArgs Empty = new DataQualityJobDefinitionMonitoringOutputArgs();

    @InputImport(name="s3Output", required=true)
    private final Input<DataQualityJobDefinitionS3OutputArgs> s3Output;

    public Input<DataQualityJobDefinitionS3OutputArgs> getS3Output() {
        return this.s3Output;
    }

    public DataQualityJobDefinitionMonitoringOutputArgs(Input<DataQualityJobDefinitionS3OutputArgs> s3Output) {
        this.s3Output = Objects.requireNonNull(s3Output, "expected parameter 's3Output' to be non-null");
    }

    private DataQualityJobDefinitionMonitoringOutputArgs() {
        this.s3Output = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataQualityJobDefinitionS3OutputArgs> s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder setS3Output(Input<DataQualityJobDefinitionS3OutputArgs> s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }

        public Builder setS3Output(DataQualityJobDefinitionS3OutputArgs s3Output) {
            this.s3Output = Input.of(Objects.requireNonNull(s3Output));
            return this;
        }

        public DataQualityJobDefinitionMonitoringOutputArgs build() {
            return new DataQualityJobDefinitionMonitoringOutputArgs(s3Output);
        }
    }
}
