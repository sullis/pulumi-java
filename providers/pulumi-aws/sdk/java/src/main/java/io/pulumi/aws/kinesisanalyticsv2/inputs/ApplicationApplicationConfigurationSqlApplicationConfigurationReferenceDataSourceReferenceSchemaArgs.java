// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs();

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
     */
    @Import(name="recordColumns", required=true)
      private final Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs>> recordColumns;

    public Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs>> recordColumns() {
        return this.recordColumns;
    }

    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
     */
    @Import(name="recordEncoding")
      private final @Nullable Output<String> recordEncoding;

    public Output<String> recordEncoding() {
        return this.recordEncoding == null ? Codegen.empty() : this.recordEncoding;
    }

    /**
     * Specifies the format of the records on the streaming source.
     * 
     */
    @Import(name="recordFormat", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs> recordFormat;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs> recordFormat() {
        return this.recordFormat;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs(
        Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs>> recordColumns,
        @Nullable Output<String> recordEncoding,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs> recordFormat) {
        this.recordColumns = Objects.requireNonNull(recordColumns, "expected parameter 'recordColumns' to be non-null");
        this.recordEncoding = recordEncoding;
        this.recordFormat = Objects.requireNonNull(recordFormat, "expected parameter 'recordFormat' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs() {
        this.recordColumns = Codegen.empty();
        this.recordEncoding = Codegen.empty();
        this.recordFormat = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs>> recordColumns;
        private @Nullable Output<String> recordEncoding;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs> recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder recordColumns(Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs>> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }
        public Builder recordColumns(List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs> recordColumns) {
            this.recordColumns = Output.of(Objects.requireNonNull(recordColumns));
            return this;
        }
        public Builder recordColumns(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs... recordColumns) {
            return recordColumns(List.of(recordColumns));
        }
        public Builder recordEncoding(@Nullable Output<String> recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }
        public Builder recordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = Codegen.ofNullable(recordEncoding);
            return this;
        }
        public Builder recordFormat(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs> recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public Builder recordFormat(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs recordFormat) {
            this.recordFormat = Output.of(Objects.requireNonNull(recordFormat));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs(recordColumns, recordEncoding, recordFormat);
        }
    }
}
