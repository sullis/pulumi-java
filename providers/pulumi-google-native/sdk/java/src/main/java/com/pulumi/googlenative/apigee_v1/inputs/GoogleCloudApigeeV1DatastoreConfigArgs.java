// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration detail for datastore
 * 
 */
public final class GoogleCloudApigeeV1DatastoreConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1DatastoreConfigArgs Empty = new GoogleCloudApigeeV1DatastoreConfigArgs();

    /**
     * Name of the Cloud Storage bucket. Required for `gcs` target_type.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return Name of the Cloud Storage bucket. Required for `gcs` target_type.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * BigQuery dataset name Required for `bigquery` target_type.
     * 
     */
    @Import(name="datasetName")
    private @Nullable Output<String> datasetName;

    /**
     * @return BigQuery dataset name Required for `bigquery` target_type.
     * 
     */
    public Optional<Output<String>> datasetName() {
        return Optional.ofNullable(this.datasetName);
    }

    /**
     * Path of Cloud Storage bucket Required for `gcs` target_type.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path of Cloud Storage bucket Required for `gcs` target_type.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * GCP project in which the datastore exists
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return GCP project in which the datastore exists
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * Prefix of BigQuery table Required for `bigquery` target_type.
     * 
     */
    @Import(name="tablePrefix")
    private @Nullable Output<String> tablePrefix;

    /**
     * @return Prefix of BigQuery table Required for `bigquery` target_type.
     * 
     */
    public Optional<Output<String>> tablePrefix() {
        return Optional.ofNullable(this.tablePrefix);
    }

    private GoogleCloudApigeeV1DatastoreConfigArgs() {}

    private GoogleCloudApigeeV1DatastoreConfigArgs(GoogleCloudApigeeV1DatastoreConfigArgs $) {
        this.bucketName = $.bucketName;
        this.datasetName = $.datasetName;
        this.path = $.path;
        this.project = $.project;
        this.tablePrefix = $.tablePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1DatastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1DatastoreConfigArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1DatastoreConfigArgs();
        }

        public Builder(GoogleCloudApigeeV1DatastoreConfigArgs defaults) {
            $ = new GoogleCloudApigeeV1DatastoreConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName Name of the Cloud Storage bucket. Required for `gcs` target_type.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName Name of the Cloud Storage bucket. Required for `gcs` target_type.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param datasetName BigQuery dataset name Required for `bigquery` target_type.
         * 
         * @return builder
         * 
         */
        public Builder datasetName(@Nullable Output<String> datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        /**
         * @param datasetName BigQuery dataset name Required for `bigquery` target_type.
         * 
         * @return builder
         * 
         */
        public Builder datasetName(String datasetName) {
            return datasetName(Output.of(datasetName));
        }

        /**
         * @param path Path of Cloud Storage bucket Required for `gcs` target_type.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path of Cloud Storage bucket Required for `gcs` target_type.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param project GCP project in which the datastore exists
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project GCP project in which the datastore exists
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param tablePrefix Prefix of BigQuery table Required for `bigquery` target_type.
         * 
         * @return builder
         * 
         */
        public Builder tablePrefix(@Nullable Output<String> tablePrefix) {
            $.tablePrefix = tablePrefix;
            return this;
        }

        /**
         * @param tablePrefix Prefix of BigQuery table Required for `bigquery` target_type.
         * 
         * @return builder
         * 
         */
        public Builder tablePrefix(String tablePrefix) {
            return tablePrefix(Output.of(tablePrefix));
        }

        public GoogleCloudApigeeV1DatastoreConfigArgs build() {
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
