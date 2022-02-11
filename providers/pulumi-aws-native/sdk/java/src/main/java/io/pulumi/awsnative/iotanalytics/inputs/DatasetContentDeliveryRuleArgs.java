// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetContentDeliveryRuleDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetContentDeliveryRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetContentDeliveryRuleArgs Empty = new DatasetContentDeliveryRuleArgs();

    @InputImport(name="destination", required=true)
    private final Input<DatasetContentDeliveryRuleDestinationArgs> destination;

    public Input<DatasetContentDeliveryRuleDestinationArgs> getDestination() {
        return this.destination;
    }

    @InputImport(name="entryName")
    private final @Nullable Input<String> entryName;

    public Input<String> getEntryName() {
        return this.entryName == null ? Input.empty() : this.entryName;
    }

    public DatasetContentDeliveryRuleArgs(
        Input<DatasetContentDeliveryRuleDestinationArgs> destination,
        @Nullable Input<String> entryName) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.entryName = entryName;
    }

    private DatasetContentDeliveryRuleArgs() {
        this.destination = Input.empty();
        this.entryName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetContentDeliveryRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DatasetContentDeliveryRuleDestinationArgs> destination;
        private @Nullable Input<String> entryName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetContentDeliveryRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.entryName = defaults.entryName;
        }

        public Builder setDestination(Input<DatasetContentDeliveryRuleDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(DatasetContentDeliveryRuleDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setEntryName(@Nullable Input<String> entryName) {
            this.entryName = entryName;
            return this;
        }

        public Builder setEntryName(@Nullable String entryName) {
            this.entryName = Input.ofNullable(entryName);
            return this;
        }

        public DatasetContentDeliveryRuleArgs build() {
            return new DatasetContentDeliveryRuleArgs(destination, entryName);
        }
    }
}
