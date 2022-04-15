// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayConnectOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayConnectOptionsArgs Empty = new TransitGatewayConnectOptionsArgs();

    /**
     * The tunnel protocol.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    public TransitGatewayConnectOptionsArgs(@Nullable Output<String> protocol) {
        this.protocol = protocol;
    }

    private TransitGatewayConnectOptionsArgs() {
        this.protocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayConnectOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayConnectOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }        public TransitGatewayConnectOptionsArgs build() {
            return new TransitGatewayConnectOptionsArgs(protocol);
        }
    }
}
