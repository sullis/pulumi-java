// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CrawlerCatalogTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerCatalogTargetGetArgs Empty = new CrawlerCatalogTargetGetArgs();

    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * A list of catalog tables to be synchronized.
     * 
     */
    @Import(name="tables", required=true)
      private final Output<List<String>> tables;

    public Output<List<String>> tables() {
        return this.tables;
    }

    public CrawlerCatalogTargetGetArgs(
        Output<String> databaseName,
        Output<List<String>> tables) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.tables = Objects.requireNonNull(tables, "expected parameter 'tables' to be non-null");
    }

    private CrawlerCatalogTargetGetArgs() {
        this.databaseName = Codegen.empty();
        this.tables = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerCatalogTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseName;
        private Output<List<String>> tables;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerCatalogTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.tables = defaults.tables;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder tables(Output<List<String>> tables) {
            this.tables = Objects.requireNonNull(tables);
            return this;
        }
        public Builder tables(List<String> tables) {
            this.tables = Output.of(Objects.requireNonNull(tables));
            return this;
        }
        public Builder tables(String... tables) {
            return tables(List.of(tables));
        }        public CrawlerCatalogTargetGetArgs build() {
            return new CrawlerCatalogTargetGetArgs(databaseName, tables);
        }
    }
}
