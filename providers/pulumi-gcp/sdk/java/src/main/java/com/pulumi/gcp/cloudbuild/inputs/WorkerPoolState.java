// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.WorkerPoolNetworkConfigGetArgs;
import com.pulumi.gcp.cloudbuild.inputs.WorkerPoolWorkerConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerPoolState extends com.pulumi.resources.ResourceArgs {

    public static final WorkerPoolState Empty = new WorkerPoolState();

    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
     * limitations.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
     * limitations.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Output only. Time at which the request to create the `WorkerPool` was received.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. Time at which the request to create the `WorkerPool` was received.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Output only. Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    @Import(name="deleteTime")
    private @Nullable Output<String> deleteTime;

    /**
     * @return Output only. Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    public Optional<Output<String>> deleteTime() {
        return Optional.ofNullable(this.deleteTime);
    }

    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * User-defined name of the `WorkerPool`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User-defined name of the `WorkerPool`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Network configuration for the `WorkerPool`. Structure is documented below.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<WorkerPoolNetworkConfigGetArgs> networkConfig;

    /**
     * @return Network configuration for the `WorkerPool`. Structure is documented below.
     * 
     */
    public Optional<Output<WorkerPoolNetworkConfigGetArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Output only. `WorkerPool` state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Output only. `WorkerPool` state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Output only. A unique identifier for the `WorkerPool`.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Output only. A unique identifier for the `WorkerPool`.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * Output only. Time at which the request to update the `WorkerPool` was received.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. Time at which the request to update the `WorkerPool` was received.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * 
     */
    @Import(name="workerConfig")
    private @Nullable Output<WorkerPoolWorkerConfigGetArgs> workerConfig;

    /**
     * @return Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * 
     */
    public Optional<Output<WorkerPoolWorkerConfigGetArgs>> workerConfig() {
        return Optional.ofNullable(this.workerConfig);
    }

    private WorkerPoolState() {}

    private WorkerPoolState(WorkerPoolState $) {
        this.annotations = $.annotations;
        this.createTime = $.createTime;
        this.deleteTime = $.deleteTime;
        this.displayName = $.displayName;
        this.location = $.location;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.project = $.project;
        this.state = $.state;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
        this.workerConfig = $.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolState $;

        public Builder() {
            $ = new WorkerPoolState();
        }

        public Builder(WorkerPoolState defaults) {
            $ = new WorkerPoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
         * limitations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
         * limitations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param createTime Output only. Time at which the request to create the `WorkerPool` was received.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. Time at which the request to create the `WorkerPool` was received.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deleteTime Output only. Time at which the request to delete the `WorkerPool` was received.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(@Nullable Output<String> deleteTime) {
            $.deleteTime = deleteTime;
            return this;
        }

        /**
         * @param deleteTime Output only. Time at which the request to delete the `WorkerPool` was received.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(String deleteTime) {
            return deleteTime(Output.of(deleteTime));
        }

        /**
         * @param displayName A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name User-defined name of the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User-defined name of the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig Network configuration for the `WorkerPool`. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<WorkerPoolNetworkConfigGetArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Network configuration for the `WorkerPool`. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(WorkerPoolNetworkConfigGetArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state Output only. `WorkerPool` state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Output only. `WorkerPool` state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param uid Output only. A unique identifier for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Output only. A unique identifier for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime Output only. Time at which the request to update the `WorkerPool` was received.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. Time at which the request to update the `WorkerPool` was received.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param workerConfig Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(@Nullable Output<WorkerPoolWorkerConfigGetArgs> workerConfig) {
            $.workerConfig = workerConfig;
            return this;
        }

        /**
         * @param workerConfig Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(WorkerPoolWorkerConfigGetArgs workerConfig) {
            return workerConfig(Output.of(workerConfig));
        }

        public WorkerPoolState build() {
            return $;
        }
    }

}
