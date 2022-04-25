// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeGroupArgs Empty = new GetNodeGroupArgs();

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the node group.
     * 
     */
    @Import(name="nodeGroupName", required=true)
    private String nodeGroupName;

    /**
     * @return The name of the node group.
     * 
     */
    public String nodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetNodeGroupArgs() {}

    private GetNodeGroupArgs(GetNodeGroupArgs $) {
        this.clusterName = $.clusterName;
        this.nodeGroupName = $.nodeGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeGroupArgs $;

        public Builder() {
            $ = new GetNodeGroupArgs();
        }

        public Builder(GetNodeGroupArgs defaults) {
            $ = new GetNodeGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param nodeGroupName The name of the node group.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupName(String nodeGroupName) {
            $.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetNodeGroupArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.nodeGroupName = Objects.requireNonNull($.nodeGroupName, "expected parameter 'nodeGroupName' to be non-null");
            return $;
        }
    }

}
