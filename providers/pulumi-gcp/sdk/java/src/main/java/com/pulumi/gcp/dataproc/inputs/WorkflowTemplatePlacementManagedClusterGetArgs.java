// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterGetArgs Empty = new WorkflowTemplatePlacementManagedClusterGetArgs();

    /**
     * Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix. The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix. The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Required. The cluster configuration.
     * 
     */
    @Import(name="config", required=true)
    private Output<WorkflowTemplatePlacementManagedClusterConfigGetArgs> config;

    /**
     * @return Required. The cluster configuration.
     * 
     */
    public Output<WorkflowTemplatePlacementManagedClusterConfigGetArgs> config() {
        return this.config;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private WorkflowTemplatePlacementManagedClusterGetArgs() {}

    private WorkflowTemplatePlacementManagedClusterGetArgs(WorkflowTemplatePlacementManagedClusterGetArgs $) {
        this.clusterName = $.clusterName;
        this.config = $.config;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterGetArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterGetArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterGetArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix. The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix. The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param config Required. The cluster configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<WorkflowTemplatePlacementManagedClusterConfigGetArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Required. The cluster configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(WorkflowTemplatePlacementManagedClusterConfigGetArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param labels Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public WorkflowTemplatePlacementManagedClusterGetArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            return $;
        }
    }

}
