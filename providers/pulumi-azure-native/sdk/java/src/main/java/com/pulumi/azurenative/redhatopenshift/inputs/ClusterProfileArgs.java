// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ClusterProfile represents a cluster profile.
 * 
 */
public final class ClusterProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterProfileArgs Empty = new ClusterProfileArgs();

    /**
     * The domain for the cluster (immutable).
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain for the cluster (immutable).
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The pull secret for the cluster (immutable).
     * 
     */
    @Import(name="pullSecret")
    private @Nullable Output<String> pullSecret;

    /**
     * @return The pull secret for the cluster (immutable).
     * 
     */
    public Optional<Output<String>> pullSecret() {
        return Optional.ofNullable(this.pullSecret);
    }

    /**
     * The ID of the cluster resource group (immutable).
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the cluster resource group (immutable).
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The version of the cluster (immutable).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the cluster (immutable).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ClusterProfileArgs() {}

    private ClusterProfileArgs(ClusterProfileArgs $) {
        this.domain = $.domain;
        this.pullSecret = $.pullSecret;
        this.resourceGroupId = $.resourceGroupId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterProfileArgs $;

        public Builder() {
            $ = new ClusterProfileArgs();
        }

        public Builder(ClusterProfileArgs defaults) {
            $ = new ClusterProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain for the cluster (immutable).
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain for the cluster (immutable).
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param pullSecret The pull secret for the cluster (immutable).
         * 
         * @return builder
         * 
         */
        public Builder pullSecret(@Nullable Output<String> pullSecret) {
            $.pullSecret = pullSecret;
            return this;
        }

        /**
         * @param pullSecret The pull secret for the cluster (immutable).
         * 
         * @return builder
         * 
         */
        public Builder pullSecret(String pullSecret) {
            return pullSecret(Output.of(pullSecret));
        }

        /**
         * @param resourceGroupId The ID of the cluster resource group (immutable).
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the cluster resource group (immutable).
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param version The version of the cluster (immutable).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the cluster (immutable).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterProfileArgs build() {
            return $;
        }
    }

}
