// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorWorkerLogDeliveryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Details of what logs are delivered and where they are delivered.
 * 
 */
public final class ConnectorLogDeliveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorLogDeliveryArgs Empty = new ConnectorLogDeliveryArgs();

    @Import(name="workerLogDelivery", required=true)
      private final Output<ConnectorWorkerLogDeliveryArgs> workerLogDelivery;

    public Output<ConnectorWorkerLogDeliveryArgs> workerLogDelivery() {
        return this.workerLogDelivery;
    }

    public ConnectorLogDeliveryArgs(Output<ConnectorWorkerLogDeliveryArgs> workerLogDelivery) {
        this.workerLogDelivery = Objects.requireNonNull(workerLogDelivery, "expected parameter 'workerLogDelivery' to be non-null");
    }

    private ConnectorLogDeliveryArgs() {
        this.workerLogDelivery = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorLogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ConnectorWorkerLogDeliveryArgs> workerLogDelivery;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorLogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workerLogDelivery = defaults.workerLogDelivery;
        }

        public Builder workerLogDelivery(Output<ConnectorWorkerLogDeliveryArgs> workerLogDelivery) {
            this.workerLogDelivery = Objects.requireNonNull(workerLogDelivery);
            return this;
        }
        public Builder workerLogDelivery(ConnectorWorkerLogDeliveryArgs workerLogDelivery) {
            this.workerLogDelivery = Output.of(Objects.requireNonNull(workerLogDelivery));
            return this;
        }        public ConnectorLogDeliveryArgs build() {
            return new ConnectorLogDeliveryArgs(workerLogDelivery);
        }
    }
}
