// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransitGatewayConnectOptions {
    /**
     * The tunnel protocol.
     * 
     */
    private final @Nullable String protocol;

    @CustomType.Constructor
    private TransitGatewayConnectOptions(@CustomType.Parameter("protocol") @Nullable String protocol) {
        this.protocol = protocol;
    }

    /**
     * The tunnel protocol.
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayConnectOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayConnectOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public TransitGatewayConnectOptions build() {
            return new TransitGatewayConnectOptions(protocol);
        }
    }
}
