// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderableClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrderableClusterArgs Empty = new GetOrderableClusterArgs();

    /**
     * Reshift Cluster typeE.g., `multi-node` or `single-node`
     * 
     */
    @Import(name="clusterType")
    private @Nullable Output<String> clusterType;

    /**
     * @return Reshift Cluster typeE.g., `multi-node` or `single-node`
     * 
     */
    public Optional<Output<String>> clusterType() {
        return Optional.ofNullable(this.clusterType);
    }

    /**
     * Redshift Cluster versionE.g., `1.0`
     * 
     */
    @Import(name="clusterVersion")
    private @Nullable Output<String> clusterVersion;

    /**
     * @return Redshift Cluster versionE.g., `1.0`
     * 
     */
    public Optional<Output<String>> clusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }

    /**
     * Redshift Cluster node typeE.g., `dc2.8xlarge`
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return Redshift Cluster node typeE.g., `dc2.8xlarge`
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    @Import(name="preferredNodeTypes")
    private @Nullable Output<List<String>> preferredNodeTypes;

    /**
     * @return Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    public Optional<Output<List<String>>> preferredNodeTypes() {
        return Optional.ofNullable(this.preferredNodeTypes);
    }

    private GetOrderableClusterArgs() {}

    private GetOrderableClusterArgs(GetOrderableClusterArgs $) {
        this.clusterType = $.clusterType;
        this.clusterVersion = $.clusterVersion;
        this.nodeType = $.nodeType;
        this.preferredNodeTypes = $.preferredNodeTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrderableClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrderableClusterArgs $;

        public Builder() {
            $ = new GetOrderableClusterArgs();
        }

        public Builder(GetOrderableClusterArgs defaults) {
            $ = new GetOrderableClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterType Reshift Cluster typeE.g., `multi-node` or `single-node`
         * 
         * @return builder
         * 
         */
        public Builder clusterType(@Nullable Output<String> clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        /**
         * @param clusterType Reshift Cluster typeE.g., `multi-node` or `single-node`
         * 
         * @return builder
         * 
         */
        public Builder clusterType(String clusterType) {
            return clusterType(Output.of(clusterType));
        }

        /**
         * @param clusterVersion Redshift Cluster versionE.g., `1.0`
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            $.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * @param clusterVersion Redshift Cluster versionE.g., `1.0`
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(String clusterVersion) {
            return clusterVersion(Output.of(clusterVersion));
        }

        /**
         * @param nodeType Redshift Cluster node typeE.g., `dc2.8xlarge`
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType Redshift Cluster node typeE.g., `dc2.8xlarge`
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param preferredNodeTypes Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredNodeTypes(@Nullable Output<List<String>> preferredNodeTypes) {
            $.preferredNodeTypes = preferredNodeTypes;
            return this;
        }

        /**
         * @param preferredNodeTypes Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredNodeTypes(List<String> preferredNodeTypes) {
            return preferredNodeTypes(Output.of(preferredNodeTypes));
        }

        /**
         * @param preferredNodeTypes Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredNodeTypes(String... preferredNodeTypes) {
            return preferredNodeTypes(List.of(preferredNodeTypes));
        }

        public GetOrderableClusterArgs build() {
            return $;
        }
    }

}
