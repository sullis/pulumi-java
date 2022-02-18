// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.DownwardAPIVolumeFileArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 * 
 */
public final class DownwardAPIVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DownwardAPIVolumeSourceArgs Empty = new DownwardAPIVolumeSourceArgs();

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @InputImport(name="defaultMode")
    private final @Nullable Input<Integer> defaultMode;

    public Input<Integer> getDefaultMode() {
        return this.defaultMode == null ? Input.empty() : this.defaultMode;
    }

    /**
     * Items is a list of downward API volume file
     * 
     */
    @InputImport(name="items")
    private final @Nullable Input<List<DownwardAPIVolumeFileArgs>> items;

    public Input<List<DownwardAPIVolumeFileArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public DownwardAPIVolumeSourceArgs(
        @Nullable Input<Integer> defaultMode,
        @Nullable Input<List<DownwardAPIVolumeFileArgs>> items) {
        this.defaultMode = defaultMode;
        this.items = items;
    }

    private DownwardAPIVolumeSourceArgs() {
        this.defaultMode = Input.empty();
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultMode;
        private @Nullable Input<List<DownwardAPIVolumeFileArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DownwardAPIVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
        }

        public Builder setDefaultMode(@Nullable Input<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder setDefaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Input.ofNullable(defaultMode);
            return this;
        }

        public Builder setItems(@Nullable Input<List<DownwardAPIVolumeFileArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<DownwardAPIVolumeFileArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public DownwardAPIVolumeSourceArgs build() {
            return new DownwardAPIVolumeSourceArgs(defaultMode, items);
        }
    }
}
