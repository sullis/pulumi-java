// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionsTableWithColumnsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsTableWithColumnsGetArgs Empty = new PermissionsTableWithColumnsGetArgs();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Set of column names for the table.
     * 
     */
    @Import(name="columnNames")
    private @Nullable Output<List<String>> columnNames;

    /**
     * @return Set of column names for the table.
     * 
     */
    public Optional<Output<List<String>>> columnNames() {
        return Optional.ofNullable(this.columnNames);
    }

    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    @Import(name="excludedColumnNames")
    private @Nullable Output<List<String>> excludedColumnNames;

    public Optional<Output<List<String>>> excludedColumnNames() {
        return Optional.ofNullable(this.excludedColumnNames);
    }

    /**
     * Name of the table resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the table resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="wildcard")
    private @Nullable Output<Boolean> wildcard;

    public Optional<Output<Boolean>> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    private PermissionsTableWithColumnsGetArgs() {}

    private PermissionsTableWithColumnsGetArgs(PermissionsTableWithColumnsGetArgs $) {
        this.catalogId = $.catalogId;
        this.columnNames = $.columnNames;
        this.databaseName = $.databaseName;
        this.excludedColumnNames = $.excludedColumnNames;
        this.name = $.name;
        this.wildcard = $.wildcard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsTableWithColumnsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsTableWithColumnsGetArgs $;

        public Builder() {
            $ = new PermissionsTableWithColumnsGetArgs();
        }

        public Builder(PermissionsTableWithColumnsGetArgs defaults) {
            $ = new PermissionsTableWithColumnsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param columnNames Set of column names for the table.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(@Nullable Output<List<String>> columnNames) {
            $.columnNames = columnNames;
            return this;
        }

        /**
         * @param columnNames Set of column names for the table.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(List<String> columnNames) {
            return columnNames(Output.of(columnNames));
        }

        /**
         * @param columnNames Set of column names for the table.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }

        /**
         * @param databaseName Name of the database for the table with columns resource. Unique to the Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Name of the database for the table with columns resource. Unique to the Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder excludedColumnNames(@Nullable Output<List<String>> excludedColumnNames) {
            $.excludedColumnNames = excludedColumnNames;
            return this;
        }

        public Builder excludedColumnNames(List<String> excludedColumnNames) {
            return excludedColumnNames(Output.of(excludedColumnNames));
        }

        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }

        /**
         * @param name Name of the table resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the table resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder wildcard(@Nullable Output<Boolean> wildcard) {
            $.wildcard = wildcard;
            return this;
        }

        public Builder wildcard(Boolean wildcard) {
            return wildcard(Output.of(wildcard));
        }

        public PermissionsTableWithColumnsGetArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
