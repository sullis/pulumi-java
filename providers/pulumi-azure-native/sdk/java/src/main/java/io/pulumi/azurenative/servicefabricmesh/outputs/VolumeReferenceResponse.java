// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeReferenceResponse {
    /**
     * The path within the container at which the volume should be mounted. Only valid path characters are allowed.
     * 
     */
    private final String destinationPath;
    /**
     * Name of the volume being referenced.
     * 
     */
    private final String name;
    /**
     * The flag indicating whether the volume is read only. Default is 'false'.
     * 
     */
    private final @Nullable Boolean readOnly;

    @OutputCustomType.Constructor({"destinationPath","name","readOnly"})
    private VolumeReferenceResponse(
        String destinationPath,
        String name,
        @Nullable Boolean readOnly) {
        this.destinationPath = Objects.requireNonNull(destinationPath);
        this.name = Objects.requireNonNull(name);
        this.readOnly = readOnly;
    }

    /**
     * The path within the container at which the volume should be mounted. Only valid path characters are allowed.
     * 
     */
    public String getDestinationPath() {
        return this.destinationPath;
    }
    /**
     * Name of the volume being referenced.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The flag indicating whether the volume is read only. Default is 'false'.
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationPath;
        private String name;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPath = defaults.destinationPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setDestinationPath(String destinationPath) {
            this.destinationPath = Objects.requireNonNull(destinationPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public VolumeReferenceResponse build() {
            return new VolumeReferenceResponse(destinationPath, name, readOnly);
        }
    }
}
