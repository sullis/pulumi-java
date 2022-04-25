// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tables that will be included and excluded in the follower database
 * 
 */
public final class TableLevelSharingPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableLevelSharingPropertiesArgs Empty = new TableLevelSharingPropertiesArgs();

    /**
     * List of external tables exclude from the follower database
     * 
     */
    @Import(name="externalTablesToExclude")
    private @Nullable Output<List<String>> externalTablesToExclude;

    /**
     * @return List of external tables exclude from the follower database
     * 
     */
    public Optional<Output<List<String>>> externalTablesToExclude() {
        return Optional.ofNullable(this.externalTablesToExclude);
    }

    /**
     * List of external tables to include in the follower database
     * 
     */
    @Import(name="externalTablesToInclude")
    private @Nullable Output<List<String>> externalTablesToInclude;

    /**
     * @return List of external tables to include in the follower database
     * 
     */
    public Optional<Output<List<String>>> externalTablesToInclude() {
        return Optional.ofNullable(this.externalTablesToInclude);
    }

    /**
     * List of materialized views exclude from the follower database
     * 
     */
    @Import(name="materializedViewsToExclude")
    private @Nullable Output<List<String>> materializedViewsToExclude;

    /**
     * @return List of materialized views exclude from the follower database
     * 
     */
    public Optional<Output<List<String>>> materializedViewsToExclude() {
        return Optional.ofNullable(this.materializedViewsToExclude);
    }

    /**
     * List of materialized views to include in the follower database
     * 
     */
    @Import(name="materializedViewsToInclude")
    private @Nullable Output<List<String>> materializedViewsToInclude;

    /**
     * @return List of materialized views to include in the follower database
     * 
     */
    public Optional<Output<List<String>>> materializedViewsToInclude() {
        return Optional.ofNullable(this.materializedViewsToInclude);
    }

    /**
     * List of tables to exclude from the follower database
     * 
     */
    @Import(name="tablesToExclude")
    private @Nullable Output<List<String>> tablesToExclude;

    /**
     * @return List of tables to exclude from the follower database
     * 
     */
    public Optional<Output<List<String>>> tablesToExclude() {
        return Optional.ofNullable(this.tablesToExclude);
    }

    /**
     * List of tables to include in the follower database
     * 
     */
    @Import(name="tablesToInclude")
    private @Nullable Output<List<String>> tablesToInclude;

    /**
     * @return List of tables to include in the follower database
     * 
     */
    public Optional<Output<List<String>>> tablesToInclude() {
        return Optional.ofNullable(this.tablesToInclude);
    }

    private TableLevelSharingPropertiesArgs() {}

    private TableLevelSharingPropertiesArgs(TableLevelSharingPropertiesArgs $) {
        this.externalTablesToExclude = $.externalTablesToExclude;
        this.externalTablesToInclude = $.externalTablesToInclude;
        this.materializedViewsToExclude = $.materializedViewsToExclude;
        this.materializedViewsToInclude = $.materializedViewsToInclude;
        this.tablesToExclude = $.tablesToExclude;
        this.tablesToInclude = $.tablesToInclude;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableLevelSharingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableLevelSharingPropertiesArgs $;

        public Builder() {
            $ = new TableLevelSharingPropertiesArgs();
        }

        public Builder(TableLevelSharingPropertiesArgs defaults) {
            $ = new TableLevelSharingPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalTablesToExclude List of external tables exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder externalTablesToExclude(@Nullable Output<List<String>> externalTablesToExclude) {
            $.externalTablesToExclude = externalTablesToExclude;
            return this;
        }

        /**
         * @param externalTablesToExclude List of external tables exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder externalTablesToExclude(List<String> externalTablesToExclude) {
            return externalTablesToExclude(Output.of(externalTablesToExclude));
        }

        /**
         * @param externalTablesToExclude List of external tables exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder externalTablesToExclude(String... externalTablesToExclude) {
            return externalTablesToExclude(List.of(externalTablesToExclude));
        }

        /**
         * @param externalTablesToInclude List of external tables to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder externalTablesToInclude(@Nullable Output<List<String>> externalTablesToInclude) {
            $.externalTablesToInclude = externalTablesToInclude;
            return this;
        }

        /**
         * @param externalTablesToInclude List of external tables to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder externalTablesToInclude(List<String> externalTablesToInclude) {
            return externalTablesToInclude(Output.of(externalTablesToInclude));
        }

        /**
         * @param externalTablesToInclude List of external tables to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder externalTablesToInclude(String... externalTablesToInclude) {
            return externalTablesToInclude(List.of(externalTablesToInclude));
        }

        /**
         * @param materializedViewsToExclude List of materialized views exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder materializedViewsToExclude(@Nullable Output<List<String>> materializedViewsToExclude) {
            $.materializedViewsToExclude = materializedViewsToExclude;
            return this;
        }

        /**
         * @param materializedViewsToExclude List of materialized views exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder materializedViewsToExclude(List<String> materializedViewsToExclude) {
            return materializedViewsToExclude(Output.of(materializedViewsToExclude));
        }

        /**
         * @param materializedViewsToExclude List of materialized views exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder materializedViewsToExclude(String... materializedViewsToExclude) {
            return materializedViewsToExclude(List.of(materializedViewsToExclude));
        }

        /**
         * @param materializedViewsToInclude List of materialized views to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder materializedViewsToInclude(@Nullable Output<List<String>> materializedViewsToInclude) {
            $.materializedViewsToInclude = materializedViewsToInclude;
            return this;
        }

        /**
         * @param materializedViewsToInclude List of materialized views to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder materializedViewsToInclude(List<String> materializedViewsToInclude) {
            return materializedViewsToInclude(Output.of(materializedViewsToInclude));
        }

        /**
         * @param materializedViewsToInclude List of materialized views to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder materializedViewsToInclude(String... materializedViewsToInclude) {
            return materializedViewsToInclude(List.of(materializedViewsToInclude));
        }

        /**
         * @param tablesToExclude List of tables to exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder tablesToExclude(@Nullable Output<List<String>> tablesToExclude) {
            $.tablesToExclude = tablesToExclude;
            return this;
        }

        /**
         * @param tablesToExclude List of tables to exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder tablesToExclude(List<String> tablesToExclude) {
            return tablesToExclude(Output.of(tablesToExclude));
        }

        /**
         * @param tablesToExclude List of tables to exclude from the follower database
         * 
         * @return builder
         * 
         */
        public Builder tablesToExclude(String... tablesToExclude) {
            return tablesToExclude(List.of(tablesToExclude));
        }

        /**
         * @param tablesToInclude List of tables to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder tablesToInclude(@Nullable Output<List<String>> tablesToInclude) {
            $.tablesToInclude = tablesToInclude;
            return this;
        }

        /**
         * @param tablesToInclude List of tables to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder tablesToInclude(List<String> tablesToInclude) {
            return tablesToInclude(Output.of(tablesToInclude));
        }

        /**
         * @param tablesToInclude List of tables to include in the follower database
         * 
         * @return builder
         * 
         */
        public Builder tablesToInclude(String... tablesToInclude) {
            return tablesToInclude(List.of(tablesToInclude));
        }

        public TableLevelSharingPropertiesArgs build() {
            return $;
        }
    }

}
