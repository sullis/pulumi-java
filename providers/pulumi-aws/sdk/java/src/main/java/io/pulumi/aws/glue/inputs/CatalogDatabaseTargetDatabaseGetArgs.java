// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CatalogDatabaseTargetDatabaseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogDatabaseTargetDatabaseGetArgs Empty = new CatalogDatabaseTargetDatabaseGetArgs();

    /**
     * ID of the Data Catalog in which the database resides.
     * 
     */
    @Import(name="catalogId", required=true)
      private final Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId;
    }

    /**
     * Name of the catalog database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    public CatalogDatabaseTargetDatabaseGetArgs(
        Output<String> catalogId,
        Output<String> databaseName) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
    }

    private CatalogDatabaseTargetDatabaseGetArgs() {
        this.catalogId = Output.empty();
        this.databaseName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogDatabaseTargetDatabaseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogId;
        private Output<String> databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogDatabaseTargetDatabaseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
        }

        public Builder catalogId(Output<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder catalogId(String catalogId) {
            this.catalogId = Output.of(Objects.requireNonNull(catalogId));
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }        public CatalogDatabaseTargetDatabaseGetArgs build() {
            return new CatalogDatabaseTargetDatabaseGetArgs(catalogId, databaseName);
        }
    }
}
