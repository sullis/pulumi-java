// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorCloudWatchLogsLogDelivery;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorFirehoseLogDelivery;
import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorS3LogDelivery;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorWorkerLogDelivery {
    private final @Nullable ConnectorCloudWatchLogsLogDelivery cloudWatchLogs;
    private final @Nullable ConnectorFirehoseLogDelivery firehose;
    private final @Nullable ConnectorS3LogDelivery s3;

    @OutputCustomType.Constructor
    private ConnectorWorkerLogDelivery(
        @OutputCustomType.Parameter("cloudWatchLogs") @Nullable ConnectorCloudWatchLogsLogDelivery cloudWatchLogs,
        @OutputCustomType.Parameter("firehose") @Nullable ConnectorFirehoseLogDelivery firehose,
        @OutputCustomType.Parameter("s3") @Nullable ConnectorS3LogDelivery s3) {
        this.cloudWatchLogs = cloudWatchLogs;
        this.firehose = firehose;
        this.s3 = s3;
    }

    public Optional<ConnectorCloudWatchLogsLogDelivery> getCloudWatchLogs() {
        return Optional.ofNullable(this.cloudWatchLogs);
    }
    public Optional<ConnectorFirehoseLogDelivery> getFirehose() {
        return Optional.ofNullable(this.firehose);
    }
    public Optional<ConnectorS3LogDelivery> getS3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorWorkerLogDelivery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorCloudWatchLogsLogDelivery cloudWatchLogs;
        private @Nullable ConnectorFirehoseLogDelivery firehose;
        private @Nullable ConnectorS3LogDelivery s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorWorkerLogDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogs = defaults.cloudWatchLogs;
    	      this.firehose = defaults.firehose;
    	      this.s3 = defaults.s3;
        }

        public Builder setCloudWatchLogs(@Nullable ConnectorCloudWatchLogsLogDelivery cloudWatchLogs) {
            this.cloudWatchLogs = cloudWatchLogs;
            return this;
        }

        public Builder setFirehose(@Nullable ConnectorFirehoseLogDelivery firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder setS3(@Nullable ConnectorS3LogDelivery s3) {
            this.s3 = s3;
            return this;
        }
        public ConnectorWorkerLogDelivery build() {
            return new ConnectorWorkerLogDelivery(cloudWatchLogs, firehose, s3);
        }
    }
}
