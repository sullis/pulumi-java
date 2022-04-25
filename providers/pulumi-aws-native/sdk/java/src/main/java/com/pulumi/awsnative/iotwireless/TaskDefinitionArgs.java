// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.iotwireless.enums.TaskDefinitionType;
import com.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs;
import com.pulumi.awsnative.iotwireless.inputs.TaskDefinitionTagArgs;
import com.pulumi.awsnative.iotwireless.inputs.TaskDefinitionUpdateWirelessGatewayTaskCreateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionArgs Empty = new TaskDefinitionArgs();

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
     * 
     */
    @Import(name="autoCreateTasks", required=true)
    private Output<Boolean> autoCreateTasks;

    /**
     * @return Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
     * 
     */
    public Output<Boolean> autoCreateTasks() {
        return this.autoCreateTasks;
    }

    /**
     * The list of task definitions.
     * 
     */
    @Import(name="loRaWANUpdateGatewayTaskEntry")
    private @Nullable Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry;

    /**
     * @return The list of task definitions.
     * 
     */
    public Optional<Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs>> loRaWANUpdateGatewayTaskEntry() {
        return Optional.ofNullable(this.loRaWANUpdateGatewayTaskEntry);
    }

    /**
     * The name of the new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<TaskDefinitionTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the destination.
     * 
     */
    public Optional<Output<List<TaskDefinitionTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A filter to list only the wireless gateway task definitions that use this task definition type
     * 
     */
    @Import(name="taskDefinitionType")
    private @Nullable Output<TaskDefinitionType> taskDefinitionType;

    /**
     * @return A filter to list only the wireless gateway task definitions that use this task definition type
     * 
     */
    public Optional<Output<TaskDefinitionType>> taskDefinitionType() {
        return Optional.ofNullable(this.taskDefinitionType);
    }

    /**
     * Information about the gateways to update.
     * 
     */
    @Import(name="update")
    private @Nullable Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update;

    /**
     * @return Information about the gateways to update.
     * 
     */
    public Optional<Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs>> update() {
        return Optional.ofNullable(this.update);
    }

    private TaskDefinitionArgs() {}

    private TaskDefinitionArgs(TaskDefinitionArgs $) {
        this.autoCreateTasks = $.autoCreateTasks;
        this.loRaWANUpdateGatewayTaskEntry = $.loRaWANUpdateGatewayTaskEntry;
        this.name = $.name;
        this.tags = $.tags;
        this.taskDefinitionType = $.taskDefinitionType;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionArgs $;

        public Builder() {
            $ = new TaskDefinitionArgs();
        }

        public Builder(TaskDefinitionArgs defaults) {
            $ = new TaskDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCreateTasks Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateTasks(Output<Boolean> autoCreateTasks) {
            $.autoCreateTasks = autoCreateTasks;
            return this;
        }

        /**
         * @param autoCreateTasks Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateTasks(Boolean autoCreateTasks) {
            return autoCreateTasks(Output.of(autoCreateTasks));
        }

        /**
         * @param loRaWANUpdateGatewayTaskEntry The list of task definitions.
         * 
         * @return builder
         * 
         */
        public Builder loRaWANUpdateGatewayTaskEntry(@Nullable Output<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry) {
            $.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
            return this;
        }

        /**
         * @param loRaWANUpdateGatewayTaskEntry The list of task definitions.
         * 
         * @return builder
         * 
         */
        public Builder loRaWANUpdateGatewayTaskEntry(TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs loRaWANUpdateGatewayTaskEntry) {
            return loRaWANUpdateGatewayTaskEntry(Output.of(loRaWANUpdateGatewayTaskEntry));
        }

        /**
         * @param name The name of the new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the destination.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<TaskDefinitionTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the destination.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<TaskDefinitionTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the destination.
         * 
         * @return builder
         * 
         */
        public Builder tags(TaskDefinitionTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param taskDefinitionType A filter to list only the wireless gateway task definitions that use this task definition type
         * 
         * @return builder
         * 
         */
        public Builder taskDefinitionType(@Nullable Output<TaskDefinitionType> taskDefinitionType) {
            $.taskDefinitionType = taskDefinitionType;
            return this;
        }

        /**
         * @param taskDefinitionType A filter to list only the wireless gateway task definitions that use this task definition type
         * 
         * @return builder
         * 
         */
        public Builder taskDefinitionType(TaskDefinitionType taskDefinitionType) {
            return taskDefinitionType(Output.of(taskDefinitionType));
        }

        /**
         * @param update Information about the gateways to update.
         * 
         * @return builder
         * 
         */
        public Builder update(@Nullable Output<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update) {
            $.update = update;
            return this;
        }

        /**
         * @param update Information about the gateways to update.
         * 
         * @return builder
         * 
         */
        public Builder update(TaskDefinitionUpdateWirelessGatewayTaskCreateArgs update) {
            return update(Output.of(update));
        }

        public TaskDefinitionArgs build() {
            $.autoCreateTasks = Objects.requireNonNull($.autoCreateTasks, "expected parameter 'autoCreateTasks' to be non-null");
            return $;
        }
    }

}
