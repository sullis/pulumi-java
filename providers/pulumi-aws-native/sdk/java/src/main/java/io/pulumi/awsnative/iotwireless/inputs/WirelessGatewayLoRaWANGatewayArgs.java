// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WirelessGatewayLoRaWANGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessGatewayLoRaWANGatewayArgs Empty = new WirelessGatewayLoRaWANGatewayArgs();

    @Import(name="gatewayEui", required=true)
      private final Output<String> gatewayEui;

    public Output<String> gatewayEui() {
        return this.gatewayEui;
    }

    @Import(name="rfRegion", required=true)
      private final Output<String> rfRegion;

    public Output<String> rfRegion() {
        return this.rfRegion;
    }

    public WirelessGatewayLoRaWANGatewayArgs(
        Output<String> gatewayEui,
        Output<String> rfRegion) {
        this.gatewayEui = Objects.requireNonNull(gatewayEui, "expected parameter 'gatewayEui' to be non-null");
        this.rfRegion = Objects.requireNonNull(rfRegion, "expected parameter 'rfRegion' to be non-null");
    }

    private WirelessGatewayLoRaWANGatewayArgs() {
        this.gatewayEui = Codegen.empty();
        this.rfRegion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessGatewayLoRaWANGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> gatewayEui;
        private Output<String> rfRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessGatewayLoRaWANGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayEui = defaults.gatewayEui;
    	      this.rfRegion = defaults.rfRegion;
        }

        public Builder gatewayEui(Output<String> gatewayEui) {
            this.gatewayEui = Objects.requireNonNull(gatewayEui);
            return this;
        }
        public Builder gatewayEui(String gatewayEui) {
            this.gatewayEui = Output.of(Objects.requireNonNull(gatewayEui));
            return this;
        }
        public Builder rfRegion(Output<String> rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }
        public Builder rfRegion(String rfRegion) {
            this.rfRegion = Output.of(Objects.requireNonNull(rfRegion));
            return this;
        }        public WirelessGatewayLoRaWANGatewayArgs build() {
            return new WirelessGatewayLoRaWANGatewayArgs(gatewayEui, rfRegion);
        }
    }
}
