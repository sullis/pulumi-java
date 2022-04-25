// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * The path for the route.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path for the route.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The port for the route.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port for the route.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.path = $.path;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The path for the route.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path for the route.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port for the route.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port for the route.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public RouteArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
