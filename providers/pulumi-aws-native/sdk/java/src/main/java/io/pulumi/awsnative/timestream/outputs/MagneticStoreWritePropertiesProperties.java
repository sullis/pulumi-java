// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MagneticStoreWritePropertiesProperties {
    /**
     * Boolean flag indicating whether magnetic store writes are enabled.
     * 
     */
    private final Boolean enableMagneticStoreWrites;
    /**
     * Location to store information about records that were asynchronously rejected during magnetic store writes.
     * 
     */
    private final @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation;

    @OutputCustomType.Constructor
    private MagneticStoreWritePropertiesProperties(
        @OutputCustomType.Parameter("enableMagneticStoreWrites") Boolean enableMagneticStoreWrites,
        @OutputCustomType.Parameter("magneticStoreRejectedDataLocation") @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    /**
     * Boolean flag indicating whether magnetic store writes are enabled.
     * 
    */
    public Boolean getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }
    /**
     * Location to store information about records that were asynchronously rejected during magnetic store writes.
     * 
    */
    public Optional<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties> getMagneticStoreRejectedDataLocation() {
        return Optional.ofNullable(this.magneticStoreRejectedDataLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableMagneticStoreWrites;
        private @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMagneticStoreWrites = defaults.enableMagneticStoreWrites;
    	      this.magneticStoreRejectedDataLocation = defaults.magneticStoreRejectedDataLocation;
        }

        public Builder setEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = Objects.requireNonNull(enableMagneticStoreWrites);
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }
        public MagneticStoreWritePropertiesProperties build() {
            return new MagneticStoreWritePropertiesProperties(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}
