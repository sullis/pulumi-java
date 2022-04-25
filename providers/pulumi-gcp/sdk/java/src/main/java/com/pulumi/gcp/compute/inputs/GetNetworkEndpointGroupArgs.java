// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkEndpointGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkEndpointGroupArgs Empty = new GetNetworkEndpointGroupArgs();

    /**
     * The Network Endpoint Group name.
     * Provide either this or a `self_link`.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The Network Endpoint Group name.
     * Provide either this or a `self_link`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project to list versions in.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project to list versions in.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Network Endpoint Group self\_link.
     * 
     */
    @Import(name="selfLink")
    private @Nullable String selfLink;

    /**
     * @return The Network Endpoint Group self\_link.
     * 
     */
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The Network Endpoint Group availability zone.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return The Network Endpoint Group availability zone.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetNetworkEndpointGroupArgs() {}

    private GetNetworkEndpointGroupArgs(GetNetworkEndpointGroupArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkEndpointGroupArgs $;

        public Builder() {
            $ = new GetNetworkEndpointGroupArgs();
        }

        public Builder(GetNetworkEndpointGroupArgs defaults) {
            $ = new GetNetworkEndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Network Endpoint Group name.
         * Provide either this or a `self_link`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project to list versions in.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param selfLink The Network Endpoint Group self\_link.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable String selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param zone The Network Endpoint Group availability zone.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetNetworkEndpointGroupArgs build() {
            return $;
        }
    }

}
