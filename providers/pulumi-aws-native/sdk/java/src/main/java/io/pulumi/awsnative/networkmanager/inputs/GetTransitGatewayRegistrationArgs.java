// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayRegistrationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayRegistrationArgs Empty = new GetTransitGatewayRegistrationArgs();

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
    private final String globalNetworkId;

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The Amazon Resource Name (ARN) of the transit gateway.
     * 
     */
    @InputImport(name="transitGatewayArn", required=true)
    private final String transitGatewayArn;

    public String getTransitGatewayArn() {
        return this.transitGatewayArn;
    }

    public GetTransitGatewayRegistrationArgs(
        String globalNetworkId,
        String transitGatewayArn) {
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.transitGatewayArn = Objects.requireNonNull(transitGatewayArn, "expected parameter 'transitGatewayArn' to be non-null");
    }

    private GetTransitGatewayRegistrationArgs() {
        this.globalNetworkId = null;
        this.transitGatewayArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String globalNetworkId;
        private String transitGatewayArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.transitGatewayArn = defaults.transitGatewayArn;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder setTransitGatewayArn(String transitGatewayArn) {
            this.transitGatewayArn = Objects.requireNonNull(transitGatewayArn);
            return this;
        }

        public GetTransitGatewayRegistrationArgs build() {
            return new GetTransitGatewayRegistrationArgs(globalNetworkId, transitGatewayArn);
        }
    }
}
