// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2OutputStorageConfigOutputSchema;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cloud repository for storing output.
 * 
 */
public final class GooglePrivacyDlpV2OutputStorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2OutputStorageConfigArgs Empty = new GooglePrivacyDlpV2OutputStorageConfigArgs();

    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
     * 
     */
    @Import(name="outputSchema")
    private @Nullable Output<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> outputSchema;

    /**
     * @return Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2OutputStorageConfigOutputSchema>> outputSchema() {
        return Optional.ofNullable(this.outputSchema);
    }

    /**
     * Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
     * 
     */
    @Import(name="table")
    private @Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> table;

    /**
     * @return Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2BigQueryTableArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    private GooglePrivacyDlpV2OutputStorageConfigArgs() {}

    private GooglePrivacyDlpV2OutputStorageConfigArgs(GooglePrivacyDlpV2OutputStorageConfigArgs $) {
        this.outputSchema = $.outputSchema;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2OutputStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2OutputStorageConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2OutputStorageConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2OutputStorageConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2OutputStorageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param outputSchema Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
         * 
         * @return builder
         * 
         */
        public Builder outputSchema(@Nullable Output<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> outputSchema) {
            $.outputSchema = outputSchema;
            return this;
        }

        /**
         * @param outputSchema Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
         * 
         * @return builder
         * 
         */
        public Builder outputSchema(GooglePrivacyDlpV2OutputStorageConfigOutputSchema outputSchema) {
            return outputSchema(Output.of(outputSchema));
        }

        /**
         * @param table Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
         * 
         * @return builder
         * 
         */
        public Builder table(GooglePrivacyDlpV2BigQueryTableArgs table) {
            return table(Output.of(table));
        }

        public GooglePrivacyDlpV2OutputStorageConfigArgs build() {
            return $;
        }
    }

}
