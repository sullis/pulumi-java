// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cur.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportDefinitionState extends io.pulumi.resources.ResourceArgs {

    public static final ReportDefinitionState Empty = new ReportDefinitionState();

    /**
     * A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and report_versioning must be `OVERWRITE_REPORT`.
     * 
     */
    @Import(name="additionalArtifacts")
      private final @Nullable Output<List<String>> additionalArtifacts;

    public Output<List<String>> getAdditionalArtifacts() {
        return this.additionalArtifacts == null ? Output.empty() : this.additionalArtifacts;
    }

    /**
     * A list of schema elements. Valid values are: `RESOURCES`.
     * 
     */
    @Import(name="additionalSchemaElements")
      private final @Nullable Output<List<String>> additionalSchemaElements;

    public Output<List<String>> getAdditionalSchemaElements() {
        return this.additionalSchemaElements == null ? Output.empty() : this.additionalSchemaElements;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the cur report.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
     * 
     */
    @Import(name="compression")
      private final @Nullable Output<String> compression;

    public Output<String> getCompression() {
        return this.compression == null ? Output.empty() : this.compression;
    }

    /**
     * Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<String> format;

    public Output<String> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
     * 
     */
    @Import(name="refreshClosedReports")
      private final @Nullable Output<Boolean> refreshClosedReports;

    public Output<Boolean> getRefreshClosedReports() {
        return this.refreshClosedReports == null ? Output.empty() : this.refreshClosedReports;
    }

    /**
     * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
     * 
     */
    @Import(name="reportName")
      private final @Nullable Output<String> reportName;

    public Output<String> getReportName() {
        return this.reportName == null ? Output.empty() : this.reportName;
    }

    /**
     * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
     * 
     */
    @Import(name="reportVersioning")
      private final @Nullable Output<String> reportVersioning;

    public Output<String> getReportVersioning() {
        return this.reportVersioning == null ? Output.empty() : this.reportVersioning;
    }

    /**
     * Name of the existing S3 bucket to hold generated reports.
     * 
     */
    @Import(name="s3Bucket")
      private final @Nullable Output<String> s3Bucket;

    public Output<String> getS3Bucket() {
        return this.s3Bucket == null ? Output.empty() : this.s3Bucket;
    }

    /**
     * Report path prefix. Limited to 256 characters.
     * 
     */
    @Import(name="s3Prefix")
      private final @Nullable Output<String> s3Prefix;

    public Output<String> getS3Prefix() {
        return this.s3Prefix == null ? Output.empty() : this.s3Prefix;
    }

    /**
     * Region of the existing S3 bucket to hold generated reports.
     * 
     */
    @Import(name="s3Region")
      private final @Nullable Output<String> s3Region;

    public Output<String> getS3Region() {
        return this.s3Region == null ? Output.empty() : this.s3Region;
    }

    /**
     * The frequency on which report data are measured and displayed.  Valid values are: `HOURLY`, `DAILY`.
     * 
     */
    @Import(name="timeUnit")
      private final @Nullable Output<String> timeUnit;

    public Output<String> getTimeUnit() {
        return this.timeUnit == null ? Output.empty() : this.timeUnit;
    }

    public ReportDefinitionState(
        @Nullable Output<List<String>> additionalArtifacts,
        @Nullable Output<List<String>> additionalSchemaElements,
        @Nullable Output<String> arn,
        @Nullable Output<String> compression,
        @Nullable Output<String> format,
        @Nullable Output<Boolean> refreshClosedReports,
        @Nullable Output<String> reportName,
        @Nullable Output<String> reportVersioning,
        @Nullable Output<String> s3Bucket,
        @Nullable Output<String> s3Prefix,
        @Nullable Output<String> s3Region,
        @Nullable Output<String> timeUnit) {
        this.additionalArtifacts = additionalArtifacts;
        this.additionalSchemaElements = additionalSchemaElements;
        this.arn = arn;
        this.compression = compression;
        this.format = format;
        this.refreshClosedReports = refreshClosedReports;
        this.reportName = reportName;
        this.reportVersioning = reportVersioning;
        this.s3Bucket = s3Bucket;
        this.s3Prefix = s3Prefix;
        this.s3Region = s3Region;
        this.timeUnit = timeUnit;
    }

    private ReportDefinitionState() {
        this.additionalArtifacts = Output.empty();
        this.additionalSchemaElements = Output.empty();
        this.arn = Output.empty();
        this.compression = Output.empty();
        this.format = Output.empty();
        this.refreshClosedReports = Output.empty();
        this.reportName = Output.empty();
        this.reportVersioning = Output.empty();
        this.s3Bucket = Output.empty();
        this.s3Prefix = Output.empty();
        this.s3Region = Output.empty();
        this.timeUnit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> additionalArtifacts;
        private @Nullable Output<List<String>> additionalSchemaElements;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> compression;
        private @Nullable Output<String> format;
        private @Nullable Output<Boolean> refreshClosedReports;
        private @Nullable Output<String> reportName;
        private @Nullable Output<String> reportVersioning;
        private @Nullable Output<String> s3Bucket;
        private @Nullable Output<String> s3Prefix;
        private @Nullable Output<String> s3Region;
        private @Nullable Output<String> timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDefinitionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalArtifacts = defaults.additionalArtifacts;
    	      this.additionalSchemaElements = defaults.additionalSchemaElements;
    	      this.arn = defaults.arn;
    	      this.compression = defaults.compression;
    	      this.format = defaults.format;
    	      this.refreshClosedReports = defaults.refreshClosedReports;
    	      this.reportName = defaults.reportName;
    	      this.reportVersioning = defaults.reportVersioning;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Prefix = defaults.s3Prefix;
    	      this.s3Region = defaults.s3Region;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder additionalArtifacts(@Nullable Output<List<String>> additionalArtifacts) {
            this.additionalArtifacts = additionalArtifacts;
            return this;
        }
        public Builder additionalArtifacts(@Nullable List<String> additionalArtifacts) {
            this.additionalArtifacts = Output.ofNullable(additionalArtifacts);
            return this;
        }
        public Builder additionalArtifacts(String... additionalArtifacts) {
            return additionalArtifacts(List.of(additionalArtifacts));
        }
        public Builder additionalSchemaElements(@Nullable Output<List<String>> additionalSchemaElements) {
            this.additionalSchemaElements = additionalSchemaElements;
            return this;
        }
        public Builder additionalSchemaElements(@Nullable List<String> additionalSchemaElements) {
            this.additionalSchemaElements = Output.ofNullable(additionalSchemaElements);
            return this;
        }
        public Builder additionalSchemaElements(String... additionalSchemaElements) {
            return additionalSchemaElements(List.of(additionalSchemaElements));
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder compression(@Nullable Output<String> compression) {
            this.compression = compression;
            return this;
        }
        public Builder compression(@Nullable String compression) {
            this.compression = Output.ofNullable(compression);
            return this;
        }
        public Builder format(@Nullable Output<String> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = Output.ofNullable(format);
            return this;
        }
        public Builder refreshClosedReports(@Nullable Output<Boolean> refreshClosedReports) {
            this.refreshClosedReports = refreshClosedReports;
            return this;
        }
        public Builder refreshClosedReports(@Nullable Boolean refreshClosedReports) {
            this.refreshClosedReports = Output.ofNullable(refreshClosedReports);
            return this;
        }
        public Builder reportName(@Nullable Output<String> reportName) {
            this.reportName = reportName;
            return this;
        }
        public Builder reportName(@Nullable String reportName) {
            this.reportName = Output.ofNullable(reportName);
            return this;
        }
        public Builder reportVersioning(@Nullable Output<String> reportVersioning) {
            this.reportVersioning = reportVersioning;
            return this;
        }
        public Builder reportVersioning(@Nullable String reportVersioning) {
            this.reportVersioning = Output.ofNullable(reportVersioning);
            return this;
        }
        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public Builder s3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Output.ofNullable(s3Bucket);
            return this;
        }
        public Builder s3Prefix(@Nullable Output<String> s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }
        public Builder s3Prefix(@Nullable String s3Prefix) {
            this.s3Prefix = Output.ofNullable(s3Prefix);
            return this;
        }
        public Builder s3Region(@Nullable Output<String> s3Region) {
            this.s3Region = s3Region;
            return this;
        }
        public Builder s3Region(@Nullable String s3Region) {
            this.s3Region = Output.ofNullable(s3Region);
            return this;
        }
        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Builder timeUnit(@Nullable String timeUnit) {
            this.timeUnit = Output.ofNullable(timeUnit);
            return this;
        }        public ReportDefinitionState build() {
            return new ReportDefinitionState(additionalArtifacts, additionalSchemaElements, arn, compression, format, refreshClosedReports, reportName, reportVersioning, s3Bucket, s3Prefix, s3Region, timeUnit);
        }
    }
}
