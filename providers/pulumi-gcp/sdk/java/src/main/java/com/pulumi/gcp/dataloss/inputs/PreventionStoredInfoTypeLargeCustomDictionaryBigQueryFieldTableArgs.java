// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs();

    /**
     * The dataset ID of the table.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    /**
     * @return The dataset ID of the table.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    /**
     * @return The name of the table.
     * 
     */
    public Output<String> tableId() {
        return this.tableId;
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs() {}

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs $;

        public Builder() {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs();
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs defaults) {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId The dataset ID of the table.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The dataset ID of the table.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param projectId The Google Cloud Platform project ID of the project containing the table.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Google Cloud Platform project ID of the project containing the table.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tableId The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        /**
         * @param tableId The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
