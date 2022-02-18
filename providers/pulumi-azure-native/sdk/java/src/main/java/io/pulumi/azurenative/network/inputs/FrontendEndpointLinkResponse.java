// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Resource ID for a Frontend Endpoint.
 * 
 */
public final class FrontendEndpointLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final FrontendEndpointLinkResponse Empty = new FrontendEndpointLinkResponse();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public FrontendEndpointLinkResponse(@Nullable String id) {
        this.id = id;
    }

    private FrontendEndpointLinkResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendEndpointLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendEndpointLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public FrontendEndpointLinkResponse build() {
            return new FrontendEndpointLinkResponse(id);
        }
    }
}
