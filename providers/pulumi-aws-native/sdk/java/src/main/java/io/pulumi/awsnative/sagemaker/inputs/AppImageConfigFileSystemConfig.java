// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppImageConfigFileSystemConfig extends io.pulumi.resources.InvokeArgs {

    public static final AppImageConfigFileSystemConfig Empty = new AppImageConfigFileSystemConfig();

    @InputImport(name="defaultGid")
    private final @Nullable Integer defaultGid;

    public Optional<Integer> getDefaultGid() {
        return this.defaultGid == null ? Optional.empty() : Optional.ofNullable(this.defaultGid);
    }

    @InputImport(name="defaultUid")
    private final @Nullable Integer defaultUid;

    public Optional<Integer> getDefaultUid() {
        return this.defaultUid == null ? Optional.empty() : Optional.ofNullable(this.defaultUid);
    }

    @InputImport(name="mountPath")
    private final @Nullable String mountPath;

    public Optional<String> getMountPath() {
        return this.mountPath == null ? Optional.empty() : Optional.ofNullable(this.mountPath);
    }

    public AppImageConfigFileSystemConfig(
        @Nullable Integer defaultGid,
        @Nullable Integer defaultUid,
        @Nullable String mountPath) {
        this.defaultGid = defaultGid;
        this.defaultUid = defaultUid;
        this.mountPath = mountPath;
    }

    private AppImageConfigFileSystemConfig() {
        this.defaultGid = null;
        this.defaultUid = null;
        this.mountPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigFileSystemConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultGid;
        private @Nullable Integer defaultUid;
        private @Nullable String mountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigFileSystemConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGid = defaults.defaultGid;
    	      this.defaultUid = defaults.defaultUid;
    	      this.mountPath = defaults.mountPath;
        }

        public Builder setDefaultGid(@Nullable Integer defaultGid) {
            this.defaultGid = defaultGid;
            return this;
        }

        public Builder setDefaultUid(@Nullable Integer defaultUid) {
            this.defaultUid = defaultUid;
            return this;
        }

        public Builder setMountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public AppImageConfigFileSystemConfig build() {
            return new AppImageConfigFileSystemConfig(defaultGid, defaultUid, mountPath);
        }
    }
}
