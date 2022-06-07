// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetTargetDatabasesTablesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetDatabasesTablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetDatabasesTablesArgs Empty = new GetTargetDatabasesTablesArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetTargetDatabasesTablesFilterArgs>> filters;

    public Optional<Output<List<GetTargetDatabasesTablesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only items if schema name contains a specific string.
     * 
     */
    @Import(name="schemaNameContains")
    private @Nullable Output<String> schemaNameContains;

    /**
     * @return A filter to return only items if schema name contains a specific string.
     * 
     */
    public Optional<Output<String>> schemaNameContains() {
        return Optional.ofNullable(this.schemaNameContains);
    }

    /**
     * A filter to return only items related to specific schema name.
     * 
     */
    @Import(name="schemaNames")
    private @Nullable Output<List<String>> schemaNames;

    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    public Optional<Output<List<String>>> schemaNames() {
        return Optional.ofNullable(this.schemaNames);
    }

    /**
     * A filter to return only items if table name contains a specific string.
     * 
     */
    @Import(name="tableNameContains")
    private @Nullable Output<String> tableNameContains;

    /**
     * @return A filter to return only items if table name contains a specific string.
     * 
     */
    public Optional<Output<String>> tableNameContains() {
        return Optional.ofNullable(this.tableNameContains);
    }

    /**
     * A filter to return only items related to specific table name.
     * 
     */
    @Import(name="tableNames")
    private @Nullable Output<List<String>> tableNames;

    /**
     * @return A filter to return only items related to specific table name.
     * 
     */
    public Optional<Output<List<String>>> tableNames() {
        return Optional.ofNullable(this.tableNames);
    }

    /**
     * The OCID of the Data Safe target database.
     * 
     */
    @Import(name="targetDatabaseId", required=true)
    private Output<String> targetDatabaseId;

    /**
     * @return The OCID of the Data Safe target database.
     * 
     */
    public Output<String> targetDatabaseId() {
        return this.targetDatabaseId;
    }

    private GetTargetDatabasesTablesArgs() {}

    private GetTargetDatabasesTablesArgs(GetTargetDatabasesTablesArgs $) {
        this.filters = $.filters;
        this.schemaNameContains = $.schemaNameContains;
        this.schemaNames = $.schemaNames;
        this.tableNameContains = $.tableNameContains;
        this.tableNames = $.tableNames;
        this.targetDatabaseId = $.targetDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetDatabasesTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetDatabasesTablesArgs $;

        public Builder() {
            $ = new GetTargetDatabasesTablesArgs();
        }

        public Builder(GetTargetDatabasesTablesArgs defaults) {
            $ = new GetTargetDatabasesTablesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetTargetDatabasesTablesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetTargetDatabasesTablesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetTargetDatabasesTablesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param schemaNameContains A filter to return only items if schema name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder schemaNameContains(@Nullable Output<String> schemaNameContains) {
            $.schemaNameContains = schemaNameContains;
            return this;
        }

        /**
         * @param schemaNameContains A filter to return only items if schema name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder schemaNameContains(String schemaNameContains) {
            return schemaNameContains(Output.of(schemaNameContains));
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(@Nullable Output<List<String>> schemaNames) {
            $.schemaNames = schemaNames;
            return this;
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(List<String> schemaNames) {
            return schemaNames(Output.of(schemaNames));
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(String... schemaNames) {
            return schemaNames(List.of(schemaNames));
        }

        /**
         * @param tableNameContains A filter to return only items if table name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder tableNameContains(@Nullable Output<String> tableNameContains) {
            $.tableNameContains = tableNameContains;
            return this;
        }

        /**
         * @param tableNameContains A filter to return only items if table name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder tableNameContains(String tableNameContains) {
            return tableNameContains(Output.of(tableNameContains));
        }

        /**
         * @param tableNames A filter to return only items related to specific table name.
         * 
         * @return builder
         * 
         */
        public Builder tableNames(@Nullable Output<List<String>> tableNames) {
            $.tableNames = tableNames;
            return this;
        }

        /**
         * @param tableNames A filter to return only items related to specific table name.
         * 
         * @return builder
         * 
         */
        public Builder tableNames(List<String> tableNames) {
            return tableNames(Output.of(tableNames));
        }

        /**
         * @param tableNames A filter to return only items related to specific table name.
         * 
         * @return builder
         * 
         */
        public Builder tableNames(String... tableNames) {
            return tableNames(List.of(tableNames));
        }

        /**
         * @param targetDatabaseId The OCID of the Data Safe target database.
         * 
         * @return builder
         * 
         */
        public Builder targetDatabaseId(Output<String> targetDatabaseId) {
            $.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /**
         * @param targetDatabaseId The OCID of the Data Safe target database.
         * 
         * @return builder
         * 
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            return targetDatabaseId(Output.of(targetDatabaseId));
        }

        public GetTargetDatabasesTablesArgs build() {
            $.targetDatabaseId = Objects.requireNonNull($.targetDatabaseId, "expected parameter 'targetDatabaseId' to be non-null");
            return $;
        }
    }

}
