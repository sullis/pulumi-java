// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs();

    /**
     * The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    @Import(name="mappingParameters")
      private final @Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs> mappingParameters;

    public Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs> mappingParameters() {
        return this.mappingParameters == null ? Codegen.empty() : this.mappingParameters;
    }

    /**
     * The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    @Import(name="recordFormatType")
      private final @Nullable Output<String> recordFormatType;

    public Output<String> recordFormatType() {
        return this.recordFormatType == null ? Codegen.empty() : this.recordFormatType;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs(
        @Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs> mappingParameters,
        @Nullable Output<String> recordFormatType) {
        this.mappingParameters = mappingParameters;
        this.recordFormatType = recordFormatType;
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs() {
        this.mappingParameters = Codegen.empty();
        this.recordFormatType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs> mappingParameters;
        private @Nullable Output<String> recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder mappingParameters(@Nullable Output<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs> mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }
        public Builder mappingParameters(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs mappingParameters) {
            this.mappingParameters = Codegen.ofNullable(mappingParameters);
            return this;
        }
        public Builder recordFormatType(@Nullable Output<String> recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }
        public Builder recordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = Codegen.ofNullable(recordFormatType);
            return this;
        }        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatGetArgs(mappingParameters, recordFormatType);
        }
    }
}
