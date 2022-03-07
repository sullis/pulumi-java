// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANUpdateGatewayTaskCreate;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionUpdateWirelessGatewayTaskCreate extends io.pulumi.resources.InvokeArgs {

    public static final TaskDefinitionUpdateWirelessGatewayTaskCreate Empty = new TaskDefinitionUpdateWirelessGatewayTaskCreate();

    @InputImport(name="loRaWAN")
      private final @Nullable TaskDefinitionLoRaWANUpdateGatewayTaskCreate loRaWAN;

    public Optional<TaskDefinitionLoRaWANUpdateGatewayTaskCreate> getLoRaWAN() {
        return this.loRaWAN == null ? Optional.empty() : Optional.ofNullable(this.loRaWAN);
    }

    @InputImport(name="updateDataRole")
      private final @Nullable String updateDataRole;

    public Optional<String> getUpdateDataRole() {
        return this.updateDataRole == null ? Optional.empty() : Optional.ofNullable(this.updateDataRole);
    }

    @InputImport(name="updateDataSource")
      private final @Nullable String updateDataSource;

    public Optional<String> getUpdateDataSource() {
        return this.updateDataSource == null ? Optional.empty() : Optional.ofNullable(this.updateDataSource);
    }

    public TaskDefinitionUpdateWirelessGatewayTaskCreate(
        @Nullable TaskDefinitionLoRaWANUpdateGatewayTaskCreate loRaWAN,
        @Nullable String updateDataRole,
        @Nullable String updateDataSource) {
        this.loRaWAN = loRaWAN;
        this.updateDataRole = updateDataRole;
        this.updateDataSource = updateDataSource;
    }

    private TaskDefinitionUpdateWirelessGatewayTaskCreate() {
        this.loRaWAN = null;
        this.updateDataRole = null;
        this.updateDataSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionUpdateWirelessGatewayTaskCreate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionLoRaWANUpdateGatewayTaskCreate loRaWAN;
        private @Nullable String updateDataRole;
        private @Nullable String updateDataSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionUpdateWirelessGatewayTaskCreate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.updateDataRole = defaults.updateDataRole;
    	      this.updateDataSource = defaults.updateDataSource;
        }

        public Builder setLoRaWAN(@Nullable TaskDefinitionLoRaWANUpdateGatewayTaskCreate loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }

        public Builder setUpdateDataRole(@Nullable String updateDataRole) {
            this.updateDataRole = updateDataRole;
            return this;
        }

        public Builder setUpdateDataSource(@Nullable String updateDataSource) {
            this.updateDataSource = updateDataSource;
            return this;
        }
        public TaskDefinitionUpdateWirelessGatewayTaskCreate build() {
            return new TaskDefinitionUpdateWirelessGatewayTaskCreate(loRaWAN, updateDataRole, updateDataSource);
        }
    }
}