// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The SKU that defines the type of the peering service.
 * 
 */
public final class PeeringServiceSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final PeeringServiceSkuResponse Empty = new PeeringServiceSkuResponse();

    /**
     * The name of the peering service SKU.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public PeeringServiceSkuResponse(@Nullable String name) {
        this.name = name;
    }

    private PeeringServiceSkuResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringServiceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringServiceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public PeeringServiceSkuResponse build() {
            return new PeeringServiceSkuResponse(name);
        }
    }
}
