// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VolumeResponse {
    /**
     * Unique name for the volume.
     * 
     */
    private final String name;
    /**
     * Volume size in gigabytes.
     * 
     */
    private final Double sizeGb;
    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    private final String volumeType;

    @OutputCustomType.Constructor({"name","sizeGb","volumeType"})
    private VolumeResponse(
        String name,
        Double sizeGb,
        String volumeType) {
        this.name = Objects.requireNonNull(name);
        this.sizeGb = Objects.requireNonNull(sizeGb);
        this.volumeType = Objects.requireNonNull(volumeType);
    }

    /**
     * Unique name for the volume.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Volume size in gigabytes.
     * 
    */
    public Double getSizeGb() {
        return this.sizeGb;
    }
    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
    */
    public String getVolumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double sizeGb;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSizeGb(Double sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public VolumeResponse build() {
            return new VolumeResponse(name, sizeGb, volumeType);
        }
    }
}