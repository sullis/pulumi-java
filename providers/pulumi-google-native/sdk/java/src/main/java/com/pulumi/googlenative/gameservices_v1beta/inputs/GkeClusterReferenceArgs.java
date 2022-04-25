// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A reference to a GKE cluster.
 * 
 */
public final class GkeClusterReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GkeClusterReferenceArgs Empty = new GkeClusterReferenceArgs();

    /**
     * The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    private GkeClusterReferenceArgs() {}

    private GkeClusterReferenceArgs(GkeClusterReferenceArgs $) {
        this.cluster = $.cluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterReferenceArgs $;

        public Builder() {
            $ = new GkeClusterReferenceArgs();
        }

        public Builder(GkeClusterReferenceArgs defaults) {
            $ = new GkeClusterReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        public GkeClusterReferenceArgs build() {
            return $;
        }
    }

}
