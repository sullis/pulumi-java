// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AttachedDiskResponse {
    /**
     * The mode in which to attach this disk. If not specified, the default is READ_WRITE mode. Only applicable to data_disks.
     * 
     */
    private final String mode;
    /**
     * Specifies the full path to an existing disk. For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * 
     */
    private final String sourceDisk;

    @OutputCustomType.Constructor({"mode","sourceDisk"})
    private AttachedDiskResponse(
        String mode,
        String sourceDisk) {
        this.mode = Objects.requireNonNull(mode);
        this.sourceDisk = Objects.requireNonNull(sourceDisk);
    }

    /**
     * The mode in which to attach this disk. If not specified, the default is READ_WRITE mode. Only applicable to data_disks.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * Specifies the full path to an existing disk. For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * 
    */
    public String getSourceDisk() {
        return this.sourceDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String sourceDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.sourceDisk = defaults.sourceDisk;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public AttachedDiskResponse build() {
            return new AttachedDiskResponse(mode, sourceDisk);
        }
    }
}