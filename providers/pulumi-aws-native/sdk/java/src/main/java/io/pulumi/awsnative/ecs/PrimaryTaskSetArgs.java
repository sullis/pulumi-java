// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PrimaryTaskSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrimaryTaskSetArgs Empty = new PrimaryTaskSetArgs();

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    @InputImport(name="cluster", required=true)
    private final Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster;
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    @InputImport(name="service", required=true)
    private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    /**
     * The ID or full Amazon Resource Name (ARN) of the task set.
     * 
     */
    @InputImport(name="taskSetId", required=true)
    private final Input<String> taskSetId;

    public Input<String> getTaskSetId() {
        return this.taskSetId;
    }

    public PrimaryTaskSetArgs(
        Input<String> cluster,
        Input<String> service,
        Input<String> taskSetId) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.taskSetId = Objects.requireNonNull(taskSetId, "expected parameter 'taskSetId' to be non-null");
    }

    private PrimaryTaskSetArgs() {
        this.cluster = Input.empty();
        this.service = Input.empty();
        this.taskSetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrimaryTaskSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cluster;
        private Input<String> service;
        private Input<String> taskSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrimaryTaskSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.service = defaults.service;
    	      this.taskSetId = defaults.taskSetId;
        }

        public Builder setCluster(Input<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Input.of(Objects.requireNonNull(cluster));
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public Builder setTaskSetId(Input<String> taskSetId) {
            this.taskSetId = Objects.requireNonNull(taskSetId);
            return this;
        }

        public Builder setTaskSetId(String taskSetId) {
            this.taskSetId = Input.of(Objects.requireNonNull(taskSetId));
            return this;
        }

        public PrimaryTaskSetArgs build() {
            return new PrimaryTaskSetArgs(cluster, service, taskSetId);
        }
    }
}
