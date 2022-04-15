// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPermissionsTableWithColumns {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final String catalogId;
    /**
     * Set of column names for the table. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    private final @Nullable List<String> columnNames;
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private final String databaseName;
    /**
     * Set of column names for the table to exclude. At least one of `column_names` or `excluded_column_names` is required.
     * 
     */
    private final @Nullable List<String> excludedColumnNames;
    /**
     * Name of the table resource.
     * 
     */
    private final String name;
    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean wildcard;

    @CustomType.Constructor
    private GetPermissionsTableWithColumns(
        @CustomType.Parameter("catalogId") String catalogId,
        @CustomType.Parameter("columnNames") @Nullable List<String> columnNames,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("excludedColumnNames") @Nullable List<String> excludedColumnNames,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("wildcard") @Nullable Boolean wildcard) {
        this.catalogId = catalogId;
        this.columnNames = columnNames;
        this.databaseName = databaseName;
        this.excludedColumnNames = excludedColumnNames;
        this.name = name;
        this.wildcard = wildcard;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
    */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * Set of column names for the table. At least one of `column_names` or `excluded_column_names` is required.
     * 
    */
    public List<String> columnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
    */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * Set of column names for the table to exclude. At least one of `column_names` or `excluded_column_names` is required.
     * 
    */
    public List<String> excludedColumnNames() {
        return this.excludedColumnNames == null ? List.of() : this.excludedColumnNames;
    }
    /**
     * Name of the table resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
    */
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsTableWithColumns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private @Nullable List<String> columnNames;
        private String databaseName;
        private @Nullable List<String> excludedColumnNames;
        private String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsTableWithColumns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.columnNames = defaults.columnNames;
    	      this.databaseName = defaults.databaseName;
    	      this.excludedColumnNames = defaults.excludedColumnNames;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder columnNames(@Nullable List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder excludedColumnNames(@Nullable List<String> excludedColumnNames) {
            this.excludedColumnNames = excludedColumnNames;
            return this;
        }
        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder wildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }        public GetPermissionsTableWithColumns build() {
            return new GetPermissionsTableWithColumns(catalogId, columnNames, databaseName, excludedColumnNames, name, wildcard);
        }
    }
}
