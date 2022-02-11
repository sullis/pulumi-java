// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.inputs;

import io.pulumi.awsnative.cassandra.enums.TableMode;
import io.pulumi.awsnative.cassandra.inputs.TableProvisionedThroughputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableBillingModeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableBillingModeArgs Empty = new TableBillingModeArgs();

    @InputImport(name="mode", required=true)
    private final Input<TableMode> mode;

    public Input<TableMode> getMode() {
        return this.mode;
    }

    @InputImport(name="provisionedThroughput")
    private final @Nullable Input<TableProvisionedThroughputArgs> provisionedThroughput;

    public Input<TableProvisionedThroughputArgs> getProvisionedThroughput() {
        return this.provisionedThroughput == null ? Input.empty() : this.provisionedThroughput;
    }

    public TableBillingModeArgs(
        Input<TableMode> mode,
        @Nullable Input<TableProvisionedThroughputArgs> provisionedThroughput) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.provisionedThroughput = provisionedThroughput;
    }

    private TableBillingModeArgs() {
        this.mode = Input.empty();
        this.provisionedThroughput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableBillingModeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<TableMode> mode;
        private @Nullable Input<TableProvisionedThroughputArgs> provisionedThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(TableBillingModeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.provisionedThroughput = defaults.provisionedThroughput;
        }

        public Builder setMode(Input<TableMode> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(TableMode mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }

        public Builder setProvisionedThroughput(@Nullable Input<TableProvisionedThroughputArgs> provisionedThroughput) {
            this.provisionedThroughput = provisionedThroughput;
            return this;
        }

        public Builder setProvisionedThroughput(@Nullable TableProvisionedThroughputArgs provisionedThroughput) {
            this.provisionedThroughput = Input.ofNullable(provisionedThroughput);
            return this;
        }

        public TableBillingModeArgs build() {
            return new TableBillingModeArgs(mode, provisionedThroughput);
        }
    }
}
