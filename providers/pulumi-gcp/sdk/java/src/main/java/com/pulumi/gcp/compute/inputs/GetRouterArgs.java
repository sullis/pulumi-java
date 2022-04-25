// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterArgs Empty = new GetRouterArgs();

    /**
     * The name of the router.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the router.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The VPC network on which this router lives.
     * 
     */
    @Import(name="network", required=true)
    private String network;

    /**
     * @return The VPC network on which this router lives.
     * 
     */
    public String network() {
        return this.network;
    }

    /**
     * The ID of the project in which the resource
     * belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource
     * belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region this router has been created in. If
     * unspecified, this defaults to the region configured in the provider.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region this router has been created in. If
     * unspecified, this defaults to the region configured in the provider.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetRouterArgs() {}

    private GetRouterArgs(GetRouterArgs $) {
        this.name = $.name;
        this.network = $.network;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouterArgs $;

        public Builder() {
            $ = new GetRouterArgs();
        }

        public Builder(GetRouterArgs defaults) {
            $ = new GetRouterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the router.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param network The VPC network on which this router lives.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            $.network = network;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource
         * belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The region this router has been created in. If
         * unspecified, this defaults to the region configured in the provider.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetRouterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
