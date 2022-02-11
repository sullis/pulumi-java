// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TableProvisionedThroughputArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableProvisionedThroughputArgs Empty = new TableProvisionedThroughputArgs();

    @InputImport(name="readCapacityUnits", required=true)
    private final Input<Integer> readCapacityUnits;

    public Input<Integer> getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    @InputImport(name="writeCapacityUnits", required=true)
    private final Input<Integer> writeCapacityUnits;

    public Input<Integer> getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    public TableProvisionedThroughputArgs(
        Input<Integer> readCapacityUnits,
        Input<Integer> writeCapacityUnits) {
        this.readCapacityUnits = Objects.requireNonNull(readCapacityUnits, "expected parameter 'readCapacityUnits' to be non-null");
        this.writeCapacityUnits = Objects.requireNonNull(writeCapacityUnits, "expected parameter 'writeCapacityUnits' to be non-null");
    }

    private TableProvisionedThroughputArgs() {
        this.readCapacityUnits = Input.empty();
        this.writeCapacityUnits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableProvisionedThroughputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> readCapacityUnits;
        private Input<Integer> writeCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(TableProvisionedThroughputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readCapacityUnits = defaults.readCapacityUnits;
    	      this.writeCapacityUnits = defaults.writeCapacityUnits;
        }

        public Builder setReadCapacityUnits(Input<Integer> readCapacityUnits) {
            this.readCapacityUnits = Objects.requireNonNull(readCapacityUnits);
            return this;
        }

        public Builder setReadCapacityUnits(Integer readCapacityUnits) {
            this.readCapacityUnits = Input.of(Objects.requireNonNull(readCapacityUnits));
            return this;
        }

        public Builder setWriteCapacityUnits(Input<Integer> writeCapacityUnits) {
            this.writeCapacityUnits = Objects.requireNonNull(writeCapacityUnits);
            return this;
        }

        public Builder setWriteCapacityUnits(Integer writeCapacityUnits) {
            this.writeCapacityUnits = Input.of(Objects.requireNonNull(writeCapacityUnits));
            return this;
        }

        public TableProvisionedThroughputArgs build() {
            return new TableProvisionedThroughputArgs(readCapacityUnits, writeCapacityUnits);
        }
    }
}
