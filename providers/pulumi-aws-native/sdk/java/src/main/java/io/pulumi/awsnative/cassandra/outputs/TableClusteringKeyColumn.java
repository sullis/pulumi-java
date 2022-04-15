// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.outputs;

import io.pulumi.awsnative.cassandra.enums.TableClusteringKeyColumnOrderBy;
import io.pulumi.awsnative.cassandra.outputs.TableColumn;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableClusteringKeyColumn {
    private final TableColumn column;
    private final @Nullable TableClusteringKeyColumnOrderBy orderBy;

    @CustomType.Constructor
    private TableClusteringKeyColumn(
        @CustomType.Parameter("column") TableColumn column,
        @CustomType.Parameter("orderBy") @Nullable TableClusteringKeyColumnOrderBy orderBy) {
        this.column = column;
        this.orderBy = orderBy;
    }

    public TableColumn column() {
        return this.column;
    }
    public Optional<TableClusteringKeyColumnOrderBy> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableClusteringKeyColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableColumn column;
        private @Nullable TableClusteringKeyColumnOrderBy orderBy;

        public Builder() {
    	      // Empty
        }

        public Builder(TableClusteringKeyColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.orderBy = defaults.orderBy;
        }

        public Builder column(TableColumn column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        public Builder orderBy(@Nullable TableClusteringKeyColumnOrderBy orderBy) {
            this.orderBy = orderBy;
            return this;
        }        public TableClusteringKeyColumn build() {
            return new TableClusteringKeyColumn(column, orderBy);
        }
    }
}
