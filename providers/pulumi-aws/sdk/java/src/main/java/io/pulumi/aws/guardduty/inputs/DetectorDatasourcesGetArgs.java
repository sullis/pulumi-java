// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.aws.guardduty.inputs.DetectorDatasourcesS3LogsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorDatasourcesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorDatasourcesGetArgs Empty = new DetectorDatasourcesGetArgs();

    /**
     * Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    @InputImport(name="s3Logs")
      private final @Nullable Input<DetectorDatasourcesS3LogsGetArgs> s3Logs;

    public Input<DetectorDatasourcesS3LogsGetArgs> getS3Logs() {
        return this.s3Logs == null ? Input.empty() : this.s3Logs;
    }

    public DetectorDatasourcesGetArgs(@Nullable Input<DetectorDatasourcesS3LogsGetArgs> s3Logs) {
        this.s3Logs = s3Logs;
    }

    private DetectorDatasourcesGetArgs() {
        this.s3Logs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DetectorDatasourcesS3LogsGetArgs> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorDatasourcesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder setS3Logs(@Nullable Input<DetectorDatasourcesS3LogsGetArgs> s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }

        public Builder setS3Logs(@Nullable DetectorDatasourcesS3LogsGetArgs s3Logs) {
            this.s3Logs = Input.ofNullable(s3Logs);
            return this;
        }
        public DetectorDatasourcesGetArgs build() {
            return new DetectorDatasourcesGetArgs(s3Logs);
        }
    }
}