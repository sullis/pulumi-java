// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInternetGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInternetGatewayArgs Empty = new GetInternetGatewayArgs();

    /**
     * ID of internet gateway.
     * 
     */
    @Import(name="internetGatewayId", required=true)
      private final String internetGatewayId;

    public String internetGatewayId() {
        return this.internetGatewayId;
    }

    public GetInternetGatewayArgs(String internetGatewayId) {
        this.internetGatewayId = Objects.requireNonNull(internetGatewayId, "expected parameter 'internetGatewayId' to be non-null");
    }

    private GetInternetGatewayArgs() {
        this.internetGatewayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String internetGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInternetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internetGatewayId = defaults.internetGatewayId;
        }

        public Builder internetGatewayId(String internetGatewayId) {
            this.internetGatewayId = Objects.requireNonNull(internetGatewayId);
            return this;
        }        public GetInternetGatewayArgs build() {
            return new GetInternetGatewayArgs(internetGatewayId);
        }
    }
}
