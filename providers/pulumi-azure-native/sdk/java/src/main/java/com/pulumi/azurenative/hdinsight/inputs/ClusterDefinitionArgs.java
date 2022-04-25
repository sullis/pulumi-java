// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The cluster definition.
 * 
 */
public final class ClusterDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterDefinitionArgs Empty = new ClusterDefinitionArgs();

    /**
     * The link to the blueprint.
     * 
     */
    @Import(name="blueprint")
    private @Nullable Output<String> blueprint;

    /**
     * @return The link to the blueprint.
     * 
     */
    public Optional<Output<String>> blueprint() {
        return Optional.ofNullable(this.blueprint);
    }

    /**
     * The versions of different services in the cluster.
     * 
     */
    @Import(name="componentVersion")
    private @Nullable Output<Map<String,String>> componentVersion;

    /**
     * @return The versions of different services in the cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> componentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }

    /**
     * The cluster configurations.
     * 
     */
    @Import(name="configurations")
    private @Nullable Output<Object> configurations;

    /**
     * @return The cluster configurations.
     * 
     */
    public Optional<Output<Object>> configurations() {
        return Optional.ofNullable(this.configurations);
    }

    /**
     * The type of cluster.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The type of cluster.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ClusterDefinitionArgs() {}

    private ClusterDefinitionArgs(ClusterDefinitionArgs $) {
        this.blueprint = $.blueprint;
        this.componentVersion = $.componentVersion;
        this.configurations = $.configurations;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDefinitionArgs $;

        public Builder() {
            $ = new ClusterDefinitionArgs();
        }

        public Builder(ClusterDefinitionArgs defaults) {
            $ = new ClusterDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprint The link to the blueprint.
         * 
         * @return builder
         * 
         */
        public Builder blueprint(@Nullable Output<String> blueprint) {
            $.blueprint = blueprint;
            return this;
        }

        /**
         * @param blueprint The link to the blueprint.
         * 
         * @return builder
         * 
         */
        public Builder blueprint(String blueprint) {
            return blueprint(Output.of(blueprint));
        }

        /**
         * @param componentVersion The versions of different services in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(@Nullable Output<Map<String,String>> componentVersion) {
            $.componentVersion = componentVersion;
            return this;
        }

        /**
         * @param componentVersion The versions of different services in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(Map<String,String> componentVersion) {
            return componentVersion(Output.of(componentVersion));
        }

        /**
         * @param configurations The cluster configurations.
         * 
         * @return builder
         * 
         */
        public Builder configurations(@Nullable Output<Object> configurations) {
            $.configurations = configurations;
            return this;
        }

        /**
         * @param configurations The cluster configurations.
         * 
         * @return builder
         * 
         */
        public Builder configurations(Object configurations) {
            return configurations(Output.of(configurations));
        }

        /**
         * @param kind The type of cluster.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of cluster.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ClusterDefinitionArgs build() {
            return $;
        }
    }

}
