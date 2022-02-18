// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.inputs.FileSourceInfoArgs;
import io.pulumi.azurenative.databoxedge.inputs.RoleSinkInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileEventTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileEventTriggerArgs Empty = new FileEventTriggerArgs();

    /**
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     * 
     */
    @InputImport(name="customContextTag")
    private final @Nullable Input<String> customContextTag;

    public Input<String> getCustomContextTag() {
        return this.customContextTag == null ? Input.empty() : this.customContextTag;
    }

    /**
     * Creates or updates a trigger
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Trigger Kind.
     * Expected value is 'FileEvent'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The trigger name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role sink info.
     * 
     */
    @InputImport(name="sinkInfo", required=true)
    private final Input<RoleSinkInfoArgs> sinkInfo;

    public Input<RoleSinkInfoArgs> getSinkInfo() {
        return this.sinkInfo;
    }

    /**
     * File event source details.
     * 
     */
    @InputImport(name="sourceInfo", required=true)
    private final Input<FileSourceInfoArgs> sourceInfo;

    public Input<FileSourceInfoArgs> getSourceInfo() {
        return this.sourceInfo;
    }

    public FileEventTriggerArgs(
        @Nullable Input<String> customContextTag,
        Input<String> deviceName,
        Input<String> kind,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<RoleSinkInfoArgs> sinkInfo,
        Input<FileSourceInfoArgs> sourceInfo) {
        this.customContextTag = customContextTag;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sinkInfo = Objects.requireNonNull(sinkInfo, "expected parameter 'sinkInfo' to be non-null");
        this.sourceInfo = Objects.requireNonNull(sourceInfo, "expected parameter 'sourceInfo' to be non-null");
    }

    private FileEventTriggerArgs() {
        this.customContextTag = Input.empty();
        this.deviceName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sinkInfo = Input.empty();
        this.sourceInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileEventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customContextTag;
        private Input<String> deviceName;
        private Input<String> kind;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<RoleSinkInfoArgs> sinkInfo;
        private Input<FileSourceInfoArgs> sourceInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(FileEventTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customContextTag = defaults.customContextTag;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sinkInfo = defaults.sinkInfo;
    	      this.sourceInfo = defaults.sourceInfo;
        }

        public Builder setCustomContextTag(@Nullable Input<String> customContextTag) {
            this.customContextTag = customContextTag;
            return this;
        }

        public Builder setCustomContextTag(@Nullable String customContextTag) {
            this.customContextTag = Input.ofNullable(customContextTag);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSinkInfo(Input<RoleSinkInfoArgs> sinkInfo) {
            this.sinkInfo = Objects.requireNonNull(sinkInfo);
            return this;
        }

        public Builder setSinkInfo(RoleSinkInfoArgs sinkInfo) {
            this.sinkInfo = Input.of(Objects.requireNonNull(sinkInfo));
            return this;
        }

        public Builder setSourceInfo(Input<FileSourceInfoArgs> sourceInfo) {
            this.sourceInfo = Objects.requireNonNull(sourceInfo);
            return this;
        }

        public Builder setSourceInfo(FileSourceInfoArgs sourceInfo) {
            this.sourceInfo = Input.of(Objects.requireNonNull(sourceInfo));
            return this;
        }

        public FileEventTriggerArgs build() {
            return new FileEventTriggerArgs(customContextTag, deviceName, kind, name, resourceGroupName, sinkInfo, sourceInfo);
        }
    }
}
