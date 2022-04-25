// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricDescriptorMetadataGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorMetadataGetArgs Empty = new MetricDescriptorMetadataGetArgs();

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    @Import(name="ingestDelay")
    private @Nullable Output<String> ingestDelay;

    /**
     * @return The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    public Optional<Output<String>> ingestDelay() {
        return Optional.ofNullable(this.ingestDelay);
    }

    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    @Import(name="samplePeriod")
    private @Nullable Output<String> samplePeriod;

    /**
     * @return The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    public Optional<Output<String>> samplePeriod() {
        return Optional.ofNullable(this.samplePeriod);
    }

    private MetricDescriptorMetadataGetArgs() {}

    private MetricDescriptorMetadataGetArgs(MetricDescriptorMetadataGetArgs $) {
        this.ingestDelay = $.ingestDelay;
        this.samplePeriod = $.samplePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricDescriptorMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricDescriptorMetadataGetArgs $;

        public Builder() {
            $ = new MetricDescriptorMetadataGetArgs();
        }

        public Builder(MetricDescriptorMetadataGetArgs defaults) {
            $ = new MetricDescriptorMetadataGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ingestDelay The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
         * 
         * @return builder
         * 
         */
        public Builder ingestDelay(@Nullable Output<String> ingestDelay) {
            $.ingestDelay = ingestDelay;
            return this;
        }

        /**
         * @param ingestDelay The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
         * 
         * @return builder
         * 
         */
        public Builder ingestDelay(String ingestDelay) {
            return ingestDelay(Output.of(ingestDelay));
        }

        /**
         * @param samplePeriod The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
         * 
         * @return builder
         * 
         */
        public Builder samplePeriod(@Nullable Output<String> samplePeriod) {
            $.samplePeriod = samplePeriod;
            return this;
        }

        /**
         * @param samplePeriod The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&amp;_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
         * 
         * @return builder
         * 
         */
        public Builder samplePeriod(String samplePeriod) {
            return samplePeriod(Output.of(samplePeriod));
        }

        public MetricDescriptorMetadataGetArgs build() {
            return $;
        }
    }

}
