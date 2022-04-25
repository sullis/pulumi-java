// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs();

    /**
     * If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs() {}

    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs $) {
        this.namespaceId = $.namespaceId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs();
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs defaults) {
            $ = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceId If not empty, the ID of the namespace to which the entities belong.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId If not empty, the ID of the namespace to which the entities belong.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param projectId The Google Cloud Platform project ID of the project containing the table.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Google Cloud Platform project ID of the project containing the table.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
