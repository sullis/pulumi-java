// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs();

    /**
     * The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    @Import(name="mappingParameters")
      private final @Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs> mappingParameters;

    public Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs> getMappingParameters() {
        return this.mappingParameters == null ? Output.empty() : this.mappingParameters;
    }

    /**
     * The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    @Import(name="recordFormatType")
      private final @Nullable Output<String> recordFormatType;

    public Output<String> getRecordFormatType() {
        return this.recordFormatType == null ? Output.empty() : this.recordFormatType;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs(
        @Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs> mappingParameters,
        @Nullable Output<String> recordFormatType) {
        this.mappingParameters = mappingParameters;
        this.recordFormatType = recordFormatType;
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs() {
        this.mappingParameters = Output.empty();
        this.recordFormatType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs> mappingParameters;
        private @Nullable Output<String> recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder mappingParameters(@Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs> mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }
        public Builder mappingParameters(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs mappingParameters) {
            this.mappingParameters = Output.ofNullable(mappingParameters);
            return this;
        }
        public Builder recordFormatType(@Nullable Output<String> recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }
        public Builder recordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = Output.ofNullable(recordFormatType);
            return this;
        }        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs(mappingParameters, recordFormatType);
        }
    }
}
