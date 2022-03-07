// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The share mount point.
 * 
 */
public final class MountPointMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final MountPointMapArgs Empty = new MountPointMapArgs();

    /**
     * ID of the share mounted to the role VM.
     * 
     */
    @InputImport(name="shareId", required=true)
      private final Input<String> shareId;

    public Input<String> getShareId() {
        return this.shareId;
    }

    public MountPointMapArgs(Input<String> shareId) {
        this.shareId = Objects.requireNonNull(shareId, "expected parameter 'shareId' to be non-null");
    }

    private MountPointMapArgs() {
        this.shareId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountPointMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountPointMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareId = defaults.shareId;
        }

        public Builder setShareId(Input<String> shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }

        public Builder setShareId(String shareId) {
            this.shareId = Input.of(Objects.requireNonNull(shareId));
            return this;
        }
        public MountPointMapArgs build() {
            return new MountPointMapArgs(shareId);
        }
    }
}