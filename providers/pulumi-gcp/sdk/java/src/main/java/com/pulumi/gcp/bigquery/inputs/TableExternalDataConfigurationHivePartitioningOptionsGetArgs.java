// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationHivePartitioningOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationHivePartitioningOptionsGetArgs Empty = new TableExternalDataConfigurationHivePartitioningOptionsGetArgs();

    /**
     * When set, what mode of hive partitioning to use when
     * reading data. The following modes are supported.
     * * AUTO: automatically infer partition key name(s) and type(s).
     * * STRINGS: automatically infer partition key name(s). All types are
     *   Not all storage formats support hive partitioning. Requesting hive
     *   partitioning on an unsupported format will lead to an error.
     *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
     * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return When set, what mode of hive partitioning to use when
     * reading data. The following modes are supported.
     * * AUTO: automatically infer partition key name(s) and type(s).
     * * STRINGS: automatically infer partition key name(s). All types are
     *   Not all storage formats support hive partitioning. Requesting hive
     *   partitioning on an unsupported format will lead to an error.
     *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
     * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    @Import(name="requirePartitionFilter")
    private @Nullable Output<Boolean> requirePartitionFilter;

    /**
     * @return If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    public Optional<Output<Boolean>> requirePartitionFilter() {
        return Optional.ofNullable(this.requirePartitionFilter);
    }

    /**
     * When hive partition detection is requested,
     * a common for all source uris must be required. The prefix must end immediately
     * before the partition key encoding begins. For example, consider files following
     * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
     * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
     * partitioning is requested with either AUTO or STRINGS detection, the common prefix
     * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
     * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    @Import(name="sourceUriPrefix")
    private @Nullable Output<String> sourceUriPrefix;

    /**
     * @return When hive partition detection is requested,
     * a common for all source uris must be required. The prefix must end immediately
     * before the partition key encoding begins. For example, consider files following
     * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
     * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
     * partitioning is requested with either AUTO or STRINGS detection, the common prefix
     * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
     * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    public Optional<Output<String>> sourceUriPrefix() {
        return Optional.ofNullable(this.sourceUriPrefix);
    }

    private TableExternalDataConfigurationHivePartitioningOptionsGetArgs() {}

    private TableExternalDataConfigurationHivePartitioningOptionsGetArgs(TableExternalDataConfigurationHivePartitioningOptionsGetArgs $) {
        this.mode = $.mode;
        this.requirePartitionFilter = $.requirePartitionFilter;
        this.sourceUriPrefix = $.sourceUriPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableExternalDataConfigurationHivePartitioningOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableExternalDataConfigurationHivePartitioningOptionsGetArgs $;

        public Builder() {
            $ = new TableExternalDataConfigurationHivePartitioningOptionsGetArgs();
        }

        public Builder(TableExternalDataConfigurationHivePartitioningOptionsGetArgs defaults) {
            $ = new TableExternalDataConfigurationHivePartitioningOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode When set, what mode of hive partitioning to use when
         * reading data. The following modes are supported.
         * * AUTO: automatically infer partition key name(s) and type(s).
         * * STRINGS: automatically infer partition key name(s). All types are
         *   Not all storage formats support hive partitioning. Requesting hive
         *   partitioning on an unsupported format will lead to an error.
         *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
         * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode When set, what mode of hive partitioning to use when
         * reading data. The following modes are supported.
         * * AUTO: automatically infer partition key name(s) and type(s).
         * * STRINGS: automatically infer partition key name(s). All types are
         *   Not all storage formats support hive partitioning. Requesting hive
         *   partitioning on an unsupported format will lead to an error.
         *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
         * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param requirePartitionFilter If set to true, queries over this table
         * require a partition filter that can be used for partition elimination to be
         * specified.
         * 
         * @return builder
         * 
         */
        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            $.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        /**
         * @param requirePartitionFilter If set to true, queries over this table
         * require a partition filter that can be used for partition elimination to be
         * specified.
         * 
         * @return builder
         * 
         */
        public Builder requirePartitionFilter(Boolean requirePartitionFilter) {
            return requirePartitionFilter(Output.of(requirePartitionFilter));
        }

        /**
         * @param sourceUriPrefix When hive partition detection is requested,
         * a common for all source uris must be required. The prefix must end immediately
         * before the partition key encoding begins. For example, consider files following
         * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
         * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
         * partitioning is requested with either AUTO or STRINGS detection, the common prefix
         * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
         * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
         * 
         * @return builder
         * 
         */
        public Builder sourceUriPrefix(@Nullable Output<String> sourceUriPrefix) {
            $.sourceUriPrefix = sourceUriPrefix;
            return this;
        }

        /**
         * @param sourceUriPrefix When hive partition detection is requested,
         * a common for all source uris must be required. The prefix must end immediately
         * before the partition key encoding begins. For example, consider files following
         * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
         * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
         * partitioning is requested with either AUTO or STRINGS detection, the common prefix
         * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
         * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
         * 
         * @return builder
         * 
         */
        public Builder sourceUriPrefix(String sourceUriPrefix) {
            return sourceUriPrefix(Output.of(sourceUriPrefix));
        }

        public TableExternalDataConfigurationHivePartitioningOptionsGetArgs build() {
            return $;
        }
    }

}
