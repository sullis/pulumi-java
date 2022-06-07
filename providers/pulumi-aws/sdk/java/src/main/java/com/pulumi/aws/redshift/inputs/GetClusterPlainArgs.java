// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterPlainArgs Empty = new GetClusterPlainArgs();

    /**
     * The cluster identifier
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private String clusterIdentifier;

    /**
     * @return The cluster identifier
     * 
     */
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The tags associated to the cluster
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return The tags associated to the cluster
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetClusterPlainArgs() {}

    private GetClusterPlainArgs(GetClusterPlainArgs $) {
        this.clusterIdentifier = $.clusterIdentifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterPlainArgs $;

        public Builder() {
            $ = new GetClusterPlainArgs();
        }

        public Builder(GetClusterPlainArgs defaults) {
            $ = new GetClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIdentifier The cluster identifier
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param tags The tags associated to the cluster
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetClusterPlainArgs build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            return $;
        }
    }

}
