// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The route definition for a resource implemented by the custom resource provider.
 * 
 */
public final class CustomRPResourceTypeRouteDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomRPResourceTypeRouteDefinitionResponse Empty = new CustomRPResourceTypeRouteDefinitionResponse();

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a path (e.g. 'https://testendpoint/{requestPath}')
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}')
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The routing types that are supported for resource requests.
     * 
     */
    @InputImport(name="routingType")
    private final @Nullable String routingType;

    public Optional<String> getRoutingType() {
        return this.routingType == null ? Optional.empty() : Optional.ofNullable(this.routingType);
    }

    public CustomRPResourceTypeRouteDefinitionResponse(
        String endpoint,
        String name,
        @Nullable String routingType) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routingType = routingType;
    }

    private CustomRPResourceTypeRouteDefinitionResponse() {
        this.endpoint = null;
        this.name = null;
        this.routingType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPResourceTypeRouteDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String name;
        private @Nullable String routingType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPResourceTypeRouteDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
    	      this.routingType = defaults.routingType;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRoutingType(@Nullable String routingType) {
            this.routingType = routingType;
            return this;
        }

        public CustomRPResourceTypeRouteDefinitionResponse build() {
            return new CustomRPResourceTypeRouteDefinitionResponse(endpoint, name, routingType);
        }
    }
}
