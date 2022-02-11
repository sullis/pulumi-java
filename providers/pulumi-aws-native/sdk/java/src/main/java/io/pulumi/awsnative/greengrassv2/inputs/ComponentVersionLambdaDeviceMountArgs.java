// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaFilesystemPermission;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaDeviceMountArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaDeviceMountArgs Empty = new ComponentVersionLambdaDeviceMountArgs();

    @InputImport(name="addGroupOwner")
    private final @Nullable Input<Boolean> addGroupOwner;

    public Input<Boolean> getAddGroupOwner() {
        return this.addGroupOwner == null ? Input.empty() : this.addGroupOwner;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="permission")
    private final @Nullable Input<ComponentVersionLambdaFilesystemPermission> permission;

    public Input<ComponentVersionLambdaFilesystemPermission> getPermission() {
        return this.permission == null ? Input.empty() : this.permission;
    }

    public ComponentVersionLambdaDeviceMountArgs(
        @Nullable Input<Boolean> addGroupOwner,
        @Nullable Input<String> path,
        @Nullable Input<ComponentVersionLambdaFilesystemPermission> permission) {
        this.addGroupOwner = addGroupOwner;
        this.path = path;
        this.permission = permission;
    }

    private ComponentVersionLambdaDeviceMountArgs() {
        this.addGroupOwner = Input.empty();
        this.path = Input.empty();
        this.permission = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaDeviceMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> addGroupOwner;
        private @Nullable Input<String> path;
        private @Nullable Input<ComponentVersionLambdaFilesystemPermission> permission;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaDeviceMountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addGroupOwner = defaults.addGroupOwner;
    	      this.path = defaults.path;
    	      this.permission = defaults.permission;
        }

        public Builder setAddGroupOwner(@Nullable Input<Boolean> addGroupOwner) {
            this.addGroupOwner = addGroupOwner;
            return this;
        }

        public Builder setAddGroupOwner(@Nullable Boolean addGroupOwner) {
            this.addGroupOwner = Input.ofNullable(addGroupOwner);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPermission(@Nullable Input<ComponentVersionLambdaFilesystemPermission> permission) {
            this.permission = permission;
            return this;
        }

        public Builder setPermission(@Nullable ComponentVersionLambdaFilesystemPermission permission) {
            this.permission = Input.ofNullable(permission);
            return this;
        }

        public ComponentVersionLambdaDeviceMountArgs build() {
            return new ComponentVersionLambdaDeviceMountArgs(addGroupOwner, path, permission);
        }
    }
}
