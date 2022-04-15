// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class CatalogTableTargetTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableTargetTableArgs Empty = new CatalogTableTargetTableArgs();

    /**
     * ID of the Data Catalog in which the table resides.
     * 
     */
    @Import(name="catalogId", required=true)
      private final Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    /**
     * Name of the catalog database that contains the target table.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Name of the target table.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public CatalogTableTargetTableArgs(
        Output<String> catalogId,
        Output<String> databaseName,
        Output<String> name) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private CatalogTableTargetTableArgs() {
        this.catalogId = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableTargetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogId;
        private Output<String> databaseName;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableTargetTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
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
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public CatalogTableTargetTableArgs build() {
            return new CatalogTableTargetTableArgs(catalogId, databaseName, name);
        }
    }
}
