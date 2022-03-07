// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.KnownPerfCounterDataSourceStreams;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of which performance counters will be collected and how they will be collected by this data collection rule.
 * Collected from both Windows and Linux machines where the counter is present.
 * 
 */
public final class PerfCounterDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerfCounterDataSourceArgs Empty = new PerfCounterDataSourceArgs();

    /**
     * A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command 'typeperf'.
     * 
     */
    @InputImport(name="counterSpecifiers")
      private final @Nullable Input<List<String>> counterSpecifiers;

    public Input<List<String>> getCounterSpecifiers() {
        return this.counterSpecifiers == null ? Input.empty() : this.counterSpecifiers;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The number of seconds between consecutive counter measurements (samples).
     * 
     */
    @InputImport(name="samplingFrequencyInSeconds")
      private final @Nullable Input<Integer> samplingFrequencyInSeconds;

    public Input<Integer> getSamplingFrequencyInSeconds() {
        return this.samplingFrequencyInSeconds == null ? Input.empty() : this.samplingFrequencyInSeconds;
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @InputImport(name="streams")
      private final @Nullable Input<List<Either<String,KnownPerfCounterDataSourceStreams>>> streams;

    public Input<List<Either<String,KnownPerfCounterDataSourceStreams>>> getStreams() {
        return this.streams == null ? Input.empty() : this.streams;
    }

    public PerfCounterDataSourceArgs(
        @Nullable Input<List<String>> counterSpecifiers,
        @Nullable Input<String> name,
        @Nullable Input<Integer> samplingFrequencyInSeconds,
        @Nullable Input<List<Either<String,KnownPerfCounterDataSourceStreams>>> streams) {
        this.counterSpecifiers = counterSpecifiers;
        this.name = name;
        this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
        this.streams = streams;
    }

    private PerfCounterDataSourceArgs() {
        this.counterSpecifiers = Input.empty();
        this.name = Input.empty();
        this.samplingFrequencyInSeconds = Input.empty();
        this.streams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerfCounterDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> counterSpecifiers;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> samplingFrequencyInSeconds;
        private @Nullable Input<List<Either<String,KnownPerfCounterDataSourceStreams>>> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(PerfCounterDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSpecifiers = defaults.counterSpecifiers;
    	      this.name = defaults.name;
    	      this.samplingFrequencyInSeconds = defaults.samplingFrequencyInSeconds;
    	      this.streams = defaults.streams;
        }

        public Builder setCounterSpecifiers(@Nullable Input<List<String>> counterSpecifiers) {
            this.counterSpecifiers = counterSpecifiers;
            return this;
        }

        public Builder setCounterSpecifiers(@Nullable List<String> counterSpecifiers) {
            this.counterSpecifiers = Input.ofNullable(counterSpecifiers);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSamplingFrequencyInSeconds(@Nullable Input<Integer> samplingFrequencyInSeconds) {
            this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
            return this;
        }

        public Builder setSamplingFrequencyInSeconds(@Nullable Integer samplingFrequencyInSeconds) {
            this.samplingFrequencyInSeconds = Input.ofNullable(samplingFrequencyInSeconds);
            return this;
        }

        public Builder setStreams(@Nullable Input<List<Either<String,KnownPerfCounterDataSourceStreams>>> streams) {
            this.streams = streams;
            return this;
        }

        public Builder setStreams(@Nullable List<Either<String,KnownPerfCounterDataSourceStreams>> streams) {
            this.streams = Input.ofNullable(streams);
            return this;
        }
        public PerfCounterDataSourceArgs build() {
            return new PerfCounterDataSourceArgs(counterSpecifiers, name, samplingFrequencyInSeconds, streams);
        }
    }
}