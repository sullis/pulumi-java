// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionDeviceArgs Empty = new TaskDefinitionDeviceArgs();

    @InputImport(name="containerPath")
    private final @Nullable Input<String> containerPath;

    public Input<String> getContainerPath() {
        return this.containerPath == null ? Input.empty() : this.containerPath;
    }

    @InputImport(name="hostPath")
    private final @Nullable Input<String> hostPath;

    public Input<String> getHostPath() {
        return this.hostPath == null ? Input.empty() : this.hostPath;
    }

    @InputImport(name="permissions")
    private final @Nullable Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    public TaskDefinitionDeviceArgs(
        @Nullable Input<String> containerPath,
        @Nullable Input<String> hostPath,
        @Nullable Input<List<String>> permissions) {
        this.containerPath = containerPath;
        this.hostPath = hostPath;
        this.permissions = permissions;
    }

    private TaskDefinitionDeviceArgs() {
        this.containerPath = Input.empty();
        this.hostPath = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerPath;
        private @Nullable Input<String> hostPath;
        private @Nullable Input<List<String>> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.hostPath = defaults.hostPath;
    	      this.permissions = defaults.permissions;
        }

        public Builder setContainerPath(@Nullable Input<String> containerPath) {
            this.containerPath = containerPath;
            return this;
        }

        public Builder setContainerPath(@Nullable String containerPath) {
            this.containerPath = Input.ofNullable(containerPath);
            return this;
        }

        public Builder setHostPath(@Nullable Input<String> hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder setHostPath(@Nullable String hostPath) {
            this.hostPath = Input.ofNullable(hostPath);
            return this;
        }

        public Builder setPermissions(@Nullable Input<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable List<String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public TaskDefinitionDeviceArgs build() {
            return new TaskDefinitionDeviceArgs(containerPath, hostPath, permissions);
        }
    }
}
