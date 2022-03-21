// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.bigquery.outputs.TableRangePartitioningRange;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TableRangePartitioning {
    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
     */
    private final String field;
    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    private final TableRangePartitioningRange range;

    @CustomType.Constructor
    private TableRangePartitioning(
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("range") TableRangePartitioningRange range) {
        this.field = field;
        this.range = range;
    }

    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
    */
    public String getField() {
        return this.field;
    }
    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
    */
    public TableRangePartitioningRange getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableRangePartitioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String field;
        private TableRangePartitioningRange range;

        public Builder() {
    	      // Empty
        }

        public Builder(TableRangePartitioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.range = defaults.range;
        }

        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder range(TableRangePartitioningRange range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }        public TableRangePartitioning build() {
            return new TableRangePartitioning(field, range);
        }
    }
}
