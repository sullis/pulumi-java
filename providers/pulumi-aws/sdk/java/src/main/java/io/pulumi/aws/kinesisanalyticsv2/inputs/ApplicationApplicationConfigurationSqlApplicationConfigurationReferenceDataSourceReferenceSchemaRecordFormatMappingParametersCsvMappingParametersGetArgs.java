// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs();

    /**
     * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
     * 
     */
    @Import(name="recordColumnDelimiter", required=true)
      private final Output<String> recordColumnDelimiter;

    public Output<String> recordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }

    /**
     * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
     * 
     */
    @Import(name="recordRowDelimiter", required=true)
      private final Output<String> recordRowDelimiter;

    public Output<String> recordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs(
        Output<String> recordColumnDelimiter,
        Output<String> recordRowDelimiter) {
        this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter, "expected parameter 'recordColumnDelimiter' to be non-null");
        this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter, "expected parameter 'recordRowDelimiter' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs() {
        this.recordColumnDelimiter = Codegen.empty();
        this.recordRowDelimiter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> recordColumnDelimiter;
        private Output<String> recordRowDelimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumnDelimiter = defaults.recordColumnDelimiter;
    	      this.recordRowDelimiter = defaults.recordRowDelimiter;
        }

        public Builder recordColumnDelimiter(Output<String> recordColumnDelimiter) {
            this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
            return this;
        }
        public Builder recordColumnDelimiter(String recordColumnDelimiter) {
            this.recordColumnDelimiter = Output.of(Objects.requireNonNull(recordColumnDelimiter));
            return this;
        }
        public Builder recordRowDelimiter(Output<String> recordRowDelimiter) {
            this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
            return this;
        }
        public Builder recordRowDelimiter(String recordRowDelimiter) {
            this.recordRowDelimiter = Output.of(Objects.requireNonNull(recordRowDelimiter));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs(recordColumnDelimiter, recordRowDelimiter);
        }
    }
}
