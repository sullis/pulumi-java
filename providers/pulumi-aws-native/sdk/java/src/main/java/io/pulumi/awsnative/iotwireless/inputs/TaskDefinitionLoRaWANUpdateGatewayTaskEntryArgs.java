// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANGatewayVersionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs Empty = new TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs();

    @Import(name="currentVersion")
      private final @Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion;

    public Output<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion() {
        return this.currentVersion == null ? Codegen.empty() : this.currentVersion;
    }

    @Import(name="updateVersion")
      private final @Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion;

    public Output<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion() {
        return this.updateVersion == null ? Codegen.empty() : this.updateVersion;
    }

    public TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs(
        @Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion,
        @Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion) {
        this.currentVersion = currentVersion;
        this.updateVersion = updateVersion;
    }

    private TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs() {
        this.currentVersion = Codegen.empty();
        this.updateVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion;
        private @Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersion = defaults.currentVersion;
    	      this.updateVersion = defaults.updateVersion;
        }

        public Builder currentVersion(@Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Builder currentVersion(@Nullable TaskDefinitionLoRaWANGatewayVersionArgs currentVersion) {
            this.currentVersion = Codegen.ofNullable(currentVersion);
            return this;
        }
        public Builder updateVersion(@Nullable Output<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public Builder updateVersion(@Nullable TaskDefinitionLoRaWANGatewayVersionArgs updateVersion) {
            this.updateVersion = Codegen.ofNullable(updateVersion);
            return this;
        }        public TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs build() {
            return new TaskDefinitionLoRaWANUpdateGatewayTaskEntryArgs(currentVersion, updateVersion);
        }
    }
}
