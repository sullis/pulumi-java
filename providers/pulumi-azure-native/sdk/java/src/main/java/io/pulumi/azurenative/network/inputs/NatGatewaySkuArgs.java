// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.NatGatewaySkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of nat gateway.
 * 
 */
public final class NatGatewaySkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatGatewaySkuArgs Empty = new NatGatewaySkuArgs();

    /**
     * Name of Nat Gateway SKU.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<Either<String,NatGatewaySkuName>> name;

    public Input<Either<String,NatGatewaySkuName>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public NatGatewaySkuArgs(@Nullable Input<Either<String,NatGatewaySkuName>> name) {
        this.name = name;
    }

    private NatGatewaySkuArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewaySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,NatGatewaySkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewaySkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<Either<String,NatGatewaySkuName>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,NatGatewaySkuName> name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public NatGatewaySkuArgs build() {
            return new NatGatewaySkuArgs(name);
        }
    }
}
