// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for Oracle source partitioning.
 * 
 */
public final class OraclePartitionSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final OraclePartitionSettingsResponse Empty = new OraclePartitionSettingsResponse();

    /**
     * The name of the column in integer type that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionColumnName")
    private @Nullable Object partitionColumnName;

    /**
     * @return The name of the column in integer type that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionColumnName() {
        return Optional.ofNullable(this.partitionColumnName);
    }

    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionLowerBound")
    private @Nullable Object partitionLowerBound;

    /**
     * @return The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionLowerBound() {
        return Optional.ofNullable(this.partitionLowerBound);
    }

    /**
     * Names of the physical partitions of Oracle table.
     * 
     */
    @Import(name="partitionNames")
    private @Nullable List<Object> partitionNames;

    /**
     * @return Names of the physical partitions of Oracle table.
     * 
     */
    public Optional<List<Object>> partitionNames() {
        return Optional.ofNullable(this.partitionNames);
    }

    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionUpperBound")
    private @Nullable Object partitionUpperBound;

    /**
     * @return The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionUpperBound() {
        return Optional.ofNullable(this.partitionUpperBound);
    }

    private OraclePartitionSettingsResponse() {}

    private OraclePartitionSettingsResponse(OraclePartitionSettingsResponse $) {
        this.partitionColumnName = $.partitionColumnName;
        this.partitionLowerBound = $.partitionLowerBound;
        this.partitionNames = $.partitionNames;
        this.partitionUpperBound = $.partitionUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OraclePartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OraclePartitionSettingsResponse $;

        public Builder() {
            $ = new OraclePartitionSettingsResponse();
        }

        public Builder(OraclePartitionSettingsResponse defaults) {
            $ = new OraclePartitionSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionColumnName The name of the column in integer type that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionColumnName(@Nullable Object partitionColumnName) {
            $.partitionColumnName = partitionColumnName;
            return this;
        }

        /**
         * @param partitionLowerBound The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionLowerBound(@Nullable Object partitionLowerBound) {
            $.partitionLowerBound = partitionLowerBound;
            return this;
        }

        /**
         * @param partitionNames Names of the physical partitions of Oracle table.
         * 
         * @return builder
         * 
         */
        public Builder partitionNames(@Nullable List<Object> partitionNames) {
            $.partitionNames = partitionNames;
            return this;
        }

        /**
         * @param partitionNames Names of the physical partitions of Oracle table.
         * 
         * @return builder
         * 
         */
        public Builder partitionNames(Object... partitionNames) {
            return partitionNames(List.of(partitionNames));
        }

        /**
         * @param partitionUpperBound The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionUpperBound(@Nullable Object partitionUpperBound) {
            $.partitionUpperBound = partitionUpperBound;
            return this;
        }

        public OraclePartitionSettingsResponse build() {
            return $;
        }
    }

}
