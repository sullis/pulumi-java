// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3DataDistributionType;
import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3InputMode;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The endpoint for a monitoring job.
 * 
 */
public final class MonitoringScheduleEndpointInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleEndpointInputArgs Empty = new MonitoringScheduleEndpointInputArgs();

    @InputImport(name="endpointName", required=true)
    private final Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    @InputImport(name="localPath", required=true)
    private final Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath;
    }

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    @InputImport(name="s3DataDistributionType")
    private final @Nullable Input<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType;

    public Input<MonitoringScheduleEndpointInputS3DataDistributionType> getS3DataDistributionType() {
        return this.s3DataDistributionType == null ? Input.empty() : this.s3DataDistributionType;
    }

    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    @InputImport(name="s3InputMode")
    private final @Nullable Input<MonitoringScheduleEndpointInputS3InputMode> s3InputMode;

    public Input<MonitoringScheduleEndpointInputS3InputMode> getS3InputMode() {
        return this.s3InputMode == null ? Input.empty() : this.s3InputMode;
    }

    public MonitoringScheduleEndpointInputArgs(
        Input<String> endpointName,
        Input<String> localPath,
        @Nullable Input<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType,
        @Nullable Input<MonitoringScheduleEndpointInputS3InputMode> s3InputMode) {
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.localPath = Objects.requireNonNull(localPath, "expected parameter 'localPath' to be non-null");
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
    }

    private MonitoringScheduleEndpointInputArgs() {
        this.endpointName = Input.empty();
        this.localPath = Input.empty();
        this.s3DataDistributionType = Input.empty();
        this.s3InputMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpointName;
        private Input<String> localPath;
        private @Nullable Input<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType;
        private @Nullable Input<MonitoringScheduleEndpointInputS3InputMode> s3InputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleEndpointInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.localPath = defaults.localPath;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
        }

        public Builder setEndpointName(Input<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Input.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder setLocalPath(Input<String> localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder setLocalPath(String localPath) {
            this.localPath = Input.of(Objects.requireNonNull(localPath));
            return this;
        }

        public Builder setS3DataDistributionType(@Nullable Input<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }

        public Builder setS3DataDistributionType(@Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = Input.ofNullable(s3DataDistributionType);
            return this;
        }

        public Builder setS3InputMode(@Nullable Input<MonitoringScheduleEndpointInputS3InputMode> s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }

        public Builder setS3InputMode(@Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = Input.ofNullable(s3InputMode);
            return this;
        }

        public MonitoringScheduleEndpointInputArgs build() {
            return new MonitoringScheduleEndpointInputArgs(endpointName, localPath, s3DataDistributionType, s3InputMode);
        }
    }
}
