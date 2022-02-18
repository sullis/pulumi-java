// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual Hub identifier.
 * 
 */
public final class VirtualHubIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualHubIdResponse Empty = new VirtualHubIdResponse();

    /**
     * The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public VirtualHubIdResponse(@Nullable String id) {
        this.id = id;
    }

    private VirtualHubIdResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public VirtualHubIdResponse build() {
            return new VirtualHubIdResponse(id);
        }
    }
}
