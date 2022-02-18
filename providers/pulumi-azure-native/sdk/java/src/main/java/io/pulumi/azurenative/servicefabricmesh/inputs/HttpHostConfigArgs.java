// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the hostname properties for http routing.
 * 
 */
public final class HttpHostConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHostConfigArgs Empty = new HttpHostConfigArgs();

    /**
     * http hostname config name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     * 
     */
    @InputImport(name="routes", required=true)
    private final Input<List<HttpRouteConfigArgs>> routes;

    public Input<List<HttpRouteConfigArgs>> getRoutes() {
        return this.routes;
    }

    public HttpHostConfigArgs(
        Input<String> name,
        Input<List<HttpRouteConfigArgs>> routes) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routes = Objects.requireNonNull(routes, "expected parameter 'routes' to be non-null");
    }

    private HttpHostConfigArgs() {
        this.name = Input.empty();
        this.routes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHostConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<List<HttpRouteConfigArgs>> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHostConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRoutes(Input<List<HttpRouteConfigArgs>> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }

        public Builder setRoutes(List<HttpRouteConfigArgs> routes) {
            this.routes = Input.of(Objects.requireNonNull(routes));
            return this;
        }

        public HttpHostConfigArgs build() {
            return new HttpHostConfigArgs(name, routes);
        }
    }
}
