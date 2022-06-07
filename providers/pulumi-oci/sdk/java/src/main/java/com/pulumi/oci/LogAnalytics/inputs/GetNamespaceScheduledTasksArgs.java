// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.LogAnalytics.inputs.GetNamespaceScheduledTasksFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceScheduledTasksArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceScheduledTasksArgs Empty = new GetNamespaceScheduledTasksArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetNamespaceScheduledTasksFilterArgs>> filters;

    public Optional<Output<List<GetNamespaceScheduledTasksFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * Required parameter to specify schedule task type.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Required parameter to specify schedule task type.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private GetNamespaceScheduledTasksArgs() {}

    private GetNamespaceScheduledTasksArgs(GetNamespaceScheduledTasksArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.namespace = $.namespace;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceScheduledTasksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceScheduledTasksArgs $;

        public Builder() {
            $ = new GetNamespaceScheduledTasksArgs();
        }

        public Builder(GetNamespaceScheduledTasksArgs defaults) {
            $ = new GetNamespaceScheduledTasksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetNamespaceScheduledTasksFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetNamespaceScheduledTasksFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetNamespaceScheduledTasksFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param taskType Required parameter to specify schedule task type.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Required parameter to specify schedule task type.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public GetNamespaceScheduledTasksArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            return $;
        }
    }

}
