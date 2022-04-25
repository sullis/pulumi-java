// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutIdleGetArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutPerRequestGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteTimeoutGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteTimeoutGetArgs Empty = new RouteSpecHttp2RouteTimeoutGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
    private @Nullable Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> idle;

    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<Output<RouteSpecHttp2RouteTimeoutIdleGetArgs>> idle() {
        return Optional.ofNullable(this.idle);
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
    private @Nullable Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> perRequest;

    /**
     * @return The per request timeout.
     * 
     */
    public Optional<Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs>> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    private RouteSpecHttp2RouteTimeoutGetArgs() {}

    private RouteSpecHttp2RouteTimeoutGetArgs(RouteSpecHttp2RouteTimeoutGetArgs $) {
        this.idle = $.idle;
        this.perRequest = $.perRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttp2RouteTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttp2RouteTimeoutGetArgs $;

        public Builder() {
            $ = new RouteSpecHttp2RouteTimeoutGetArgs();
        }

        public Builder(RouteSpecHttp2RouteTimeoutGetArgs defaults) {
            $ = new RouteSpecHttp2RouteTimeoutGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idle The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
         * 
         * @return builder
         * 
         */
        public Builder idle(@Nullable Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> idle) {
            $.idle = idle;
            return this;
        }

        /**
         * @param idle The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
         * 
         * @return builder
         * 
         */
        public Builder idle(RouteSpecHttp2RouteTimeoutIdleGetArgs idle) {
            return idle(Output.of(idle));
        }

        /**
         * @param perRequest The per request timeout.
         * 
         * @return builder
         * 
         */
        public Builder perRequest(@Nullable Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> perRequest) {
            $.perRequest = perRequest;
            return this;
        }

        /**
         * @param perRequest The per request timeout.
         * 
         * @return builder
         * 
         */
        public Builder perRequest(RouteSpecHttp2RouteTimeoutPerRequestGetArgs perRequest) {
            return perRequest(Output.of(perRequest));
        }

        public RouteSpecHttp2RouteTimeoutGetArgs build() {
            return $;
        }
    }

}
