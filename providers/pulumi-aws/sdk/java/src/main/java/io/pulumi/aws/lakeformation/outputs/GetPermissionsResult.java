// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.aws.lakeformation.outputs.GetPermissionsDataLocation;
import io.pulumi.aws.lakeformation.outputs.GetPermissionsDatabase;
import io.pulumi.aws.lakeformation.outputs.GetPermissionsTable;
import io.pulumi.aws.lakeformation.outputs.GetPermissionsTableWithColumns;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPermissionsResult {
    private final @Nullable String catalogId;
    private final @Nullable Boolean catalogResource;
    private final GetPermissionsDataLocation dataLocation;
    private final GetPermissionsDatabase database;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of permissions granted to the principal. For details on permissions, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    private final List<String> permissions;
    /**
     * Subset of `permissions` which the principal can pass.
     * 
     */
    private final List<String> permissionsWithGrantOptions;
    private final String principal;
    private final GetPermissionsTable table;
    private final GetPermissionsTableWithColumns tableWithColumns;

    @OutputCustomType.Constructor({"catalogId","catalogResource","dataLocation","database","id","permissions","permissionsWithGrantOptions","principal","table","tableWithColumns"})
    private GetPermissionsResult(
        @Nullable String catalogId,
        @Nullable Boolean catalogResource,
        GetPermissionsDataLocation dataLocation,
        GetPermissionsDatabase database,
        String id,
        List<String> permissions,
        List<String> permissionsWithGrantOptions,
        String principal,
        GetPermissionsTable table,
        GetPermissionsTableWithColumns tableWithColumns) {
        this.catalogId = catalogId;
        this.catalogResource = catalogResource;
        this.dataLocation = Objects.requireNonNull(dataLocation);
        this.database = Objects.requireNonNull(database);
        this.id = Objects.requireNonNull(id);
        this.permissions = Objects.requireNonNull(permissions);
        this.permissionsWithGrantOptions = Objects.requireNonNull(permissionsWithGrantOptions);
        this.principal = Objects.requireNonNull(principal);
        this.table = Objects.requireNonNull(table);
        this.tableWithColumns = Objects.requireNonNull(tableWithColumns);
    }

    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    public Optional<Boolean> getCatalogResource() {
        return Optional.ofNullable(this.catalogResource);
    }
    public GetPermissionsDataLocation getDataLocation() {
        return this.dataLocation;
    }
    public GetPermissionsDatabase getDatabase() {
        return this.database;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of permissions granted to the principal. For details on permissions, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
    */
    public List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Subset of `permissions` which the principal can pass.
     * 
    */
    public List<String> getPermissionsWithGrantOptions() {
        return this.permissionsWithGrantOptions;
    }
    public String getPrincipal() {
        return this.principal;
    }
    public GetPermissionsTable getTable() {
        return this.table;
    }
    public GetPermissionsTableWithColumns getTableWithColumns() {
        return this.tableWithColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable Boolean catalogResource;
        private GetPermissionsDataLocation dataLocation;
        private GetPermissionsDatabase database;
        private String id;
        private List<String> permissions;
        private List<String> permissionsWithGrantOptions;
        private String principal;
        private GetPermissionsTable table;
        private GetPermissionsTableWithColumns tableWithColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.catalogResource = defaults.catalogResource;
    	      this.dataLocation = defaults.dataLocation;
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.permissionsWithGrantOptions = defaults.permissionsWithGrantOptions;
    	      this.principal = defaults.principal;
    	      this.table = defaults.table;
    	      this.tableWithColumns = defaults.tableWithColumns;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setCatalogResource(@Nullable Boolean catalogResource) {
            this.catalogResource = catalogResource;
            return this;
        }

        public Builder setDataLocation(GetPermissionsDataLocation dataLocation) {
            this.dataLocation = Objects.requireNonNull(dataLocation);
            return this;
        }

        public Builder setDatabase(GetPermissionsDatabase database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPermissionsWithGrantOptions(List<String> permissionsWithGrantOptions) {
            this.permissionsWithGrantOptions = Objects.requireNonNull(permissionsWithGrantOptions);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public Builder setTable(GetPermissionsTable table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setTableWithColumns(GetPermissionsTableWithColumns tableWithColumns) {
            this.tableWithColumns = Objects.requireNonNull(tableWithColumns);
            return this;
        }
        public GetPermissionsResult build() {
            return new GetPermissionsResult(catalogId, catalogResource, dataLocation, database, id, permissions, permissionsWithGrantOptions, principal, table, tableWithColumns);
        }
    }
}