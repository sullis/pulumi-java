// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricDescriptorMetadata {
    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    private final @Nullable String ingestDelay;
    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    private final @Nullable String samplePeriod;

    @OutputCustomType.Constructor({"ingestDelay","samplePeriod"})
    private MetricDescriptorMetadata(
        @Nullable String ingestDelay,
        @Nullable String samplePeriod) {
        this.ingestDelay = ingestDelay;
        this.samplePeriod = samplePeriod;
    }

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    public Optional<String> getIngestDelay() {
        return Optional.ofNullable(this.ingestDelay);
    }
    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    public Optional<String> getSamplePeriod() {
        return Optional.ofNullable(this.samplePeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ingestDelay;
        private @Nullable String samplePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestDelay = defaults.ingestDelay;
    	      this.samplePeriod = defaults.samplePeriod;
        }

        public Builder setIngestDelay(@Nullable String ingestDelay) {
            this.ingestDelay = ingestDelay;
            return this;
        }

        public Builder setSamplePeriod(@Nullable String samplePeriod) {
            this.samplePeriod = samplePeriod;
            return this;
        }

        public MetricDescriptorMetadata build() {
            return new MetricDescriptorMetadata(ingestDelay, samplePeriod);
        }
    }
}
