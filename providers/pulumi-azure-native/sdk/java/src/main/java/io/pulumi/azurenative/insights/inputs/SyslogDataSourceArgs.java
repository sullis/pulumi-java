// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.KnownSyslogDataSourceFacilityNames;
import io.pulumi.azurenative.insights.enums.KnownSyslogDataSourceLogLevels;
import io.pulumi.azurenative.insights.enums.KnownSyslogDataSourceStreams;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of which syslog data will be collected and how it will be collected.
 * Only collected from Linux machines.
 * 
 */
public final class SyslogDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyslogDataSourceArgs Empty = new SyslogDataSourceArgs();

    /**
     * The list of facility names.
     * 
     */
    @Import(name="facilityNames")
      private final @Nullable Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames;

    public Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> getFacilityNames() {
        return this.facilityNames == null ? Output.empty() : this.facilityNames;
    }

    /**
     * The log levels to collect.
     * 
     */
    @Import(name="logLevels")
      private final @Nullable Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels;

    public Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> getLogLevels() {
        return this.logLevels == null ? Output.empty() : this.logLevels;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @Import(name="streams")
      private final @Nullable Output<List<Either<String,KnownSyslogDataSourceStreams>>> streams;

    public Output<List<Either<String,KnownSyslogDataSourceStreams>>> getStreams() {
        return this.streams == null ? Output.empty() : this.streams;
    }

    public SyslogDataSourceArgs(
        @Nullable Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames,
        @Nullable Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels,
        @Nullable Output<String> name,
        @Nullable Output<List<Either<String,KnownSyslogDataSourceStreams>>> streams) {
        this.facilityNames = facilityNames;
        this.logLevels = logLevels;
        this.name = name;
        this.streams = streams;
    }

    private SyslogDataSourceArgs() {
        this.facilityNames = Output.empty();
        this.logLevels = Output.empty();
        this.name = Output.empty();
        this.streams = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyslogDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames;
        private @Nullable Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels;
        private @Nullable Output<String> name;
        private @Nullable Output<List<Either<String,KnownSyslogDataSourceStreams>>> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(SyslogDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facilityNames = defaults.facilityNames;
    	      this.logLevels = defaults.logLevels;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        public Builder facilityNames(@Nullable Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames) {
            this.facilityNames = facilityNames;
            return this;
        }
        public Builder facilityNames(@Nullable List<Either<String,KnownSyslogDataSourceFacilityNames>> facilityNames) {
            this.facilityNames = Output.ofNullable(facilityNames);
            return this;
        }
        public Builder facilityNames(Either<String,KnownSyslogDataSourceFacilityNames>... facilityNames) {
            return facilityNames(List.of(facilityNames));
        }
        public Builder logLevels(@Nullable Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels) {
            this.logLevels = logLevels;
            return this;
        }
        public Builder logLevels(@Nullable List<Either<String,KnownSyslogDataSourceLogLevels>> logLevels) {
            this.logLevels = Output.ofNullable(logLevels);
            return this;
        }
        public Builder logLevels(Either<String,KnownSyslogDataSourceLogLevels>... logLevels) {
            return logLevels(List.of(logLevels));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder streams(@Nullable Output<List<Either<String,KnownSyslogDataSourceStreams>>> streams) {
            this.streams = streams;
            return this;
        }
        public Builder streams(@Nullable List<Either<String,KnownSyslogDataSourceStreams>> streams) {
            this.streams = Output.ofNullable(streams);
            return this;
        }
        public Builder streams(Either<String,KnownSyslogDataSourceStreams>... streams) {
            return streams(List.of(streams));
        }        public SyslogDataSourceArgs build() {
            return new SyslogDataSourceArgs(facilityNames, logLevels, name, streams);
        }
    }
}
