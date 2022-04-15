// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Throughput for the specified table, which consists of values for ReadCapacityUnits and WriteCapacityUnits
 * 
 */
public final class TableProvisionedThroughput extends io.pulumi.resources.InvokeArgs {

    public static final TableProvisionedThroughput Empty = new TableProvisionedThroughput();

    @Import(name="readCapacityUnits", required=true)
      private final Integer readCapacityUnits;

    public Integer readCapacityUnits() {
        return this.readCapacityUnits;
    }

    @Import(name="writeCapacityUnits", required=true)
      private final Integer writeCapacityUnits;

    public Integer writeCapacityUnits() {
        return this.writeCapacityUnits;
    }

    public TableProvisionedThroughput(
        Integer readCapacityUnits,
        Integer writeCapacityUnits) {
        this.readCapacityUnits = Objects.requireNonNull(readCapacityUnits, "expected parameter 'readCapacityUnits' to be non-null");
        this.writeCapacityUnits = Objects.requireNonNull(writeCapacityUnits, "expected parameter 'writeCapacityUnits' to be non-null");
    }

    private TableProvisionedThroughput() {
        this.readCapacityUnits = null;
        this.writeCapacityUnits = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableProvisionedThroughput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer readCapacityUnits;
        private Integer writeCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(TableProvisionedThroughput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readCapacityUnits = defaults.readCapacityUnits;
    	      this.writeCapacityUnits = defaults.writeCapacityUnits;
        }

        public Builder readCapacityUnits(Integer readCapacityUnits) {
            this.readCapacityUnits = Objects.requireNonNull(readCapacityUnits);
            return this;
        }
        public Builder writeCapacityUnits(Integer writeCapacityUnits) {
            this.writeCapacityUnits = Objects.requireNonNull(writeCapacityUnits);
            return this;
        }        public TableProvisionedThroughput build() {
            return new TableProvisionedThroughput(readCapacityUnits, writeCapacityUnits);
        }
    }
}
