// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.DataQualityJobDefinitionEndpointInputS3DataDistributionType;
import io.pulumi.awsnative.sagemaker.enums.DataQualityJobDefinitionEndpointInputS3InputMode;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataQualityJobDefinitionEndpointInput {
    private final String endpointName;
    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    private final String localPath;
    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    private final @Nullable DataQualityJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType;
    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    private final @Nullable DataQualityJobDefinitionEndpointInputS3InputMode s3InputMode;

    @CustomType.Constructor
    private DataQualityJobDefinitionEndpointInput(
        @CustomType.Parameter("endpointName") String endpointName,
        @CustomType.Parameter("localPath") String localPath,
        @CustomType.Parameter("s3DataDistributionType") @Nullable DataQualityJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType,
        @CustomType.Parameter("s3InputMode") @Nullable DataQualityJobDefinitionEndpointInputS3InputMode s3InputMode) {
        this.endpointName = endpointName;
        this.localPath = localPath;
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
    }

    public String getEndpointName() {
        return this.endpointName;
    }
    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
    */
    public String getLocalPath() {
        return this.localPath;
    }
    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
    */
    public Optional<DataQualityJobDefinitionEndpointInputS3DataDistributionType> getS3DataDistributionType() {
        return Optional.ofNullable(this.s3DataDistributionType);
    }
    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
    */
    public Optional<DataQualityJobDefinitionEndpointInputS3InputMode> getS3InputMode() {
        return Optional.ofNullable(this.s3InputMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionEndpointInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;
        private String localPath;
        private @Nullable DataQualityJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType;
        private @Nullable DataQualityJobDefinitionEndpointInputS3InputMode s3InputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionEndpointInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.localPath = defaults.localPath;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
        }

        public Builder endpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public Builder s3DataDistributionType(@Nullable DataQualityJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }
        public Builder s3InputMode(@Nullable DataQualityJobDefinitionEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }        public DataQualityJobDefinitionEndpointInput build() {
            return new DataQualityJobDefinitionEndpointInput(endpointName, localPath, s3DataDistributionType, s3InputMode);
        }
    }
}
