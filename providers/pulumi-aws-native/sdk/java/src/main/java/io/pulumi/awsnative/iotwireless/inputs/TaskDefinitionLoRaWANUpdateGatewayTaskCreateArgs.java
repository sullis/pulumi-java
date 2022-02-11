// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANGatewayVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs Empty = new TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs();

    @InputImport(name="currentVersion")
    private final @Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion;

    public Input<TaskDefinitionLoRaWANGatewayVersionArgs> getCurrentVersion() {
        return this.currentVersion == null ? Input.empty() : this.currentVersion;
    }

    @InputImport(name="sigKeyCrc")
    private final @Nullable Input<Integer> sigKeyCrc;

    public Input<Integer> getSigKeyCrc() {
        return this.sigKeyCrc == null ? Input.empty() : this.sigKeyCrc;
    }

    @InputImport(name="updateSignature")
    private final @Nullable Input<String> updateSignature;

    public Input<String> getUpdateSignature() {
        return this.updateSignature == null ? Input.empty() : this.updateSignature;
    }

    @InputImport(name="updateVersion")
    private final @Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion;

    public Input<TaskDefinitionLoRaWANGatewayVersionArgs> getUpdateVersion() {
        return this.updateVersion == null ? Input.empty() : this.updateVersion;
    }

    public TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs(
        @Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion,
        @Nullable Input<Integer> sigKeyCrc,
        @Nullable Input<String> updateSignature,
        @Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion) {
        this.currentVersion = currentVersion;
        this.sigKeyCrc = sigKeyCrc;
        this.updateSignature = updateSignature;
        this.updateVersion = updateVersion;
    }

    private TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs() {
        this.currentVersion = Input.empty();
        this.sigKeyCrc = Input.empty();
        this.updateSignature = Input.empty();
        this.updateVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion;
        private @Nullable Input<Integer> sigKeyCrc;
        private @Nullable Input<String> updateSignature;
        private @Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersion = defaults.currentVersion;
    	      this.sigKeyCrc = defaults.sigKeyCrc;
    	      this.updateSignature = defaults.updateSignature;
    	      this.updateVersion = defaults.updateVersion;
        }

        public Builder setCurrentVersion(@Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder setCurrentVersion(@Nullable TaskDefinitionLoRaWANGatewayVersionArgs currentVersion) {
            this.currentVersion = Input.ofNullable(currentVersion);
            return this;
        }

        public Builder setSigKeyCrc(@Nullable Input<Integer> sigKeyCrc) {
            this.sigKeyCrc = sigKeyCrc;
            return this;
        }

        public Builder setSigKeyCrc(@Nullable Integer sigKeyCrc) {
            this.sigKeyCrc = Input.ofNullable(sigKeyCrc);
            return this;
        }

        public Builder setUpdateSignature(@Nullable Input<String> updateSignature) {
            this.updateSignature = updateSignature;
            return this;
        }

        public Builder setUpdateSignature(@Nullable String updateSignature) {
            this.updateSignature = Input.ofNullable(updateSignature);
            return this;
        }

        public Builder setUpdateVersion(@Nullable Input<TaskDefinitionLoRaWANGatewayVersionArgs> updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }

        public Builder setUpdateVersion(@Nullable TaskDefinitionLoRaWANGatewayVersionArgs updateVersion) {
            this.updateVersion = Input.ofNullable(updateVersion);
            return this;
        }

        public TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs build() {
            return new TaskDefinitionLoRaWANUpdateGatewayTaskCreateArgs(currentVersion, sigKeyCrc, updateSignature, updateVersion);
        }
    }
}
