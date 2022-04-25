// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.GatewayApiRouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API route config of the Spring Cloud Gateway
 * 
 */
public final class GatewayRouteConfigPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteConfigPropertiesArgs Empty = new GatewayRouteConfigPropertiesArgs();

    /**
     * The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
     * 
     */
    @Import(name="appResourceId")
    private @Nullable Output<String> appResourceId;

    /**
     * @return The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
     * 
     */
    public Optional<Output<String>> appResourceId() {
        return Optional.ofNullable(this.appResourceId);
    }

    /**
     * Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
     * 
     */
    @Import(name="routes")
    private @Nullable Output<List<GatewayApiRouteArgs>> routes;

    /**
     * @return Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
     * 
     */
    public Optional<Output<List<GatewayApiRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    private GatewayRouteConfigPropertiesArgs() {}

    private GatewayRouteConfigPropertiesArgs(GatewayRouteConfigPropertiesArgs $) {
        this.appResourceId = $.appResourceId;
        this.routes = $.routes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteConfigPropertiesArgs $;

        public Builder() {
            $ = new GatewayRouteConfigPropertiesArgs();
        }

        public Builder(GatewayRouteConfigPropertiesArgs defaults) {
            $ = new GatewayRouteConfigPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appResourceId The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
         * 
         * @return builder
         * 
         */
        public Builder appResourceId(@Nullable Output<String> appResourceId) {
            $.appResourceId = appResourceId;
            return this;
        }

        /**
         * @param appResourceId The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
         * 
         * @return builder
         * 
         */
        public Builder appResourceId(String appResourceId) {
            return appResourceId(Output.of(appResourceId));
        }

        /**
         * @param routes Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
         * 
         * @return builder
         * 
         */
        public Builder routes(@Nullable Output<List<GatewayApiRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        /**
         * @param routes Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
         * 
         * @return builder
         * 
         */
        public Builder routes(List<GatewayApiRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        /**
         * @param routes Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
         * 
         * @return builder
         * 
         */
        public Builder routes(GatewayApiRouteArgs... routes) {
            return routes(List.of(routes));
        }

        public GatewayRouteConfigPropertiesArgs build() {
            return $;
        }
    }

}
