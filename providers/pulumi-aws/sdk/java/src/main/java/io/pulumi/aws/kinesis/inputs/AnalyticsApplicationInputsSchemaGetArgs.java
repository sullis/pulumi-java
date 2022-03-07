// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordColumnGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaGetArgs Empty = new AnalyticsApplicationInputsSchemaGetArgs();

    /**
     * The Record Column mapping for the streaming source data element.
     * See Record Columns below for more details.
     * 
     */
    @InputImport(name="recordColumns", required=true)
      private final Input<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns;

    public Input<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> getRecordColumns() {
        return this.recordColumns;
    }

    /**
     * The Encoding of the record in the streaming source.
     * 
     */
    @InputImport(name="recordEncoding")
      private final @Nullable Input<String> recordEncoding;

    public Input<String> getRecordEncoding() {
        return this.recordEncoding == null ? Input.empty() : this.recordEncoding;
    }

    /**
     * The Record Format and mapping information to schematize a record.
     * See Record Format below for more details.
     * 
     */
    @InputImport(name="recordFormat", required=true)
      private final Input<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat;

    public Input<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> getRecordFormat() {
        return this.recordFormat;
    }

    public AnalyticsApplicationInputsSchemaGetArgs(
        Input<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns,
        @Nullable Input<String> recordEncoding,
        Input<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat) {
        this.recordColumns = Objects.requireNonNull(recordColumns, "expected parameter 'recordColumns' to be non-null");
        this.recordEncoding = recordEncoding;
        this.recordFormat = Objects.requireNonNull(recordFormat, "expected parameter 'recordFormat' to be non-null");
    }

    private AnalyticsApplicationInputsSchemaGetArgs() {
        this.recordColumns = Input.empty();
        this.recordEncoding = Input.empty();
        this.recordFormat = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns;
        private @Nullable Input<String> recordEncoding;
        private Input<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder setRecordColumns(Input<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }

        public Builder setRecordColumns(List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs> recordColumns) {
            this.recordColumns = Input.of(Objects.requireNonNull(recordColumns));
            return this;
        }

        public Builder setRecordEncoding(@Nullable Input<String> recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }

        public Builder setRecordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = Input.ofNullable(recordEncoding);
            return this;
        }

        public Builder setRecordFormat(Input<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }

        public Builder setRecordFormat(AnalyticsApplicationInputsSchemaRecordFormatGetArgs recordFormat) {
            this.recordFormat = Input.of(Objects.requireNonNull(recordFormat));
            return this;
        }
        public AnalyticsApplicationInputsSchemaGetArgs build() {
            return new AnalyticsApplicationInputsSchemaGetArgs(recordColumns, recordEncoding, recordFormat);
        }
    }
}