// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.enums.TaskDefinitionType;
import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs;
import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionTagArgs;
import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionUpdateWirelessGatewayTaskCreateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionArgs Empty = new TaskDefinitionArgs();

    @InputImport(name="autoCreateTasks", required=true)
    private final Input<Boolean> autoCreateTasks;

    public Input<Boolean> getAutoCreateTasks() {
        return this.autoCreateTasks;
    }

    @InputImport(name="loRaWANUpdateGatewayTaskEntry")
    private final @Nullable Input<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry;

    public Input<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> getLoRaWANUpdateGatewayTaskEntry() {
        return this.loRaWANUpdateGatewayTaskEntry == null ? Input.empty() : this.loRaWANUpdateGatewayTaskEntry;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<TaskDefinitionTagArgs>> tags;

    public Input<List<TaskDefinitionTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="taskDefinitionType")
    private final @Nullable Input<TaskDefinitionType> taskDefinitionType;

    public Input<TaskDefinitionType> getTaskDefinitionType() {
        return this.taskDefinitionType == null ? Input.empty() : this.taskDefinitionType;
    }

    @InputImport(name="update")
    private final @Nullable Input<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update;

    public Input<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> getUpdate() {
        return this.update == null ? Input.empty() : this.update;
    }

    public TaskDefinitionArgs(
        Input<Boolean> autoCreateTasks,
        @Nullable Input<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry,
        @Nullable Input<String> name,
        @Nullable Input<List<TaskDefinitionTagArgs>> tags,
        @Nullable Input<TaskDefinitionType> taskDefinitionType,
        @Nullable Input<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update) {
        this.autoCreateTasks = Objects.requireNonNull(autoCreateTasks, "expected parameter 'autoCreateTasks' to be non-null");
        this.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
        this.name = name;
        this.tags = tags;
        this.taskDefinitionType = taskDefinitionType;
        this.update = update;
    }

    private TaskDefinitionArgs() {
        this.autoCreateTasks = Input.empty();
        this.loRaWANUpdateGatewayTaskEntry = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.taskDefinitionType = Input.empty();
        this.update = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> autoCreateTasks;
        private @Nullable Input<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry;
        private @Nullable Input<String> name;
        private @Nullable Input<List<TaskDefinitionTagArgs>> tags;
        private @Nullable Input<TaskDefinitionType> taskDefinitionType;
        private @Nullable Input<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateTasks = defaults.autoCreateTasks;
    	      this.loRaWANUpdateGatewayTaskEntry = defaults.loRaWANUpdateGatewayTaskEntry;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.taskDefinitionType = defaults.taskDefinitionType;
    	      this.update = defaults.update;
        }

        public Builder setAutoCreateTasks(Input<Boolean> autoCreateTasks) {
            this.autoCreateTasks = Objects.requireNonNull(autoCreateTasks);
            return this;
        }

        public Builder setAutoCreateTasks(Boolean autoCreateTasks) {
            this.autoCreateTasks = Input.of(Objects.requireNonNull(autoCreateTasks));
            return this;
        }

        public Builder setLoRaWANUpdateGatewayTaskEntry(@Nullable Input<TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs> loRaWANUpdateGatewayTaskEntry) {
            this.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
            return this;
        }

        public Builder setLoRaWANUpdateGatewayTaskEntry(@Nullable TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs loRaWANUpdateGatewayTaskEntry) {
            this.loRaWANUpdateGatewayTaskEntry = Input.ofNullable(loRaWANUpdateGatewayTaskEntry);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TaskDefinitionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TaskDefinitionTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTaskDefinitionType(@Nullable Input<TaskDefinitionType> taskDefinitionType) {
            this.taskDefinitionType = taskDefinitionType;
            return this;
        }

        public Builder setTaskDefinitionType(@Nullable TaskDefinitionType taskDefinitionType) {
            this.taskDefinitionType = Input.ofNullable(taskDefinitionType);
            return this;
        }

        public Builder setUpdate(@Nullable Input<TaskDefinitionUpdateWirelessGatewayTaskCreateArgs> update) {
            this.update = update;
            return this;
        }

        public Builder setUpdate(@Nullable TaskDefinitionUpdateWirelessGatewayTaskCreateArgs update) {
            this.update = Input.ofNullable(update);
            return this;
        }

        public TaskDefinitionArgs build() {
            return new TaskDefinitionArgs(autoCreateTasks, loRaWANUpdateGatewayTaskEntry, name, tags, taskDefinitionType, update);
        }
    }
}
