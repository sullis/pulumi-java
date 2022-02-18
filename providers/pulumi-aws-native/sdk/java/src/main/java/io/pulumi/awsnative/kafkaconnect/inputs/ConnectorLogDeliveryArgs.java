// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorWorkerLogDeliveryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Details of what logs are delivered and where they are delivered.
 * 
 */
public final class ConnectorLogDeliveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorLogDeliveryArgs Empty = new ConnectorLogDeliveryArgs();

    @InputImport(name="workerLogDelivery", required=true)
    private final Input<ConnectorWorkerLogDeliveryArgs> workerLogDelivery;

    public Input<ConnectorWorkerLogDeliveryArgs> getWorkerLogDelivery() {
        return this.workerLogDelivery;
    }

    public ConnectorLogDeliveryArgs(Input<ConnectorWorkerLogDeliveryArgs> workerLogDelivery) {
        this.workerLogDelivery = Objects.requireNonNull(workerLogDelivery, "expected parameter 'workerLogDelivery' to be non-null");
    }

    private ConnectorLogDeliveryArgs() {
        this.workerLogDelivery = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorLogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectorWorkerLogDeliveryArgs> workerLogDelivery;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorLogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workerLogDelivery = defaults.workerLogDelivery;
        }

        public Builder setWorkerLogDelivery(Input<ConnectorWorkerLogDeliveryArgs> workerLogDelivery) {
            this.workerLogDelivery = Objects.requireNonNull(workerLogDelivery);
            return this;
        }

        public Builder setWorkerLogDelivery(ConnectorWorkerLogDeliveryArgs workerLogDelivery) {
            this.workerLogDelivery = Input.of(Objects.requireNonNull(workerLogDelivery));
            return this;
        }

        public ConnectorLogDeliveryArgs build() {
            return new ConnectorLogDeliveryArgs(workerLogDelivery);
        }
    }
}
