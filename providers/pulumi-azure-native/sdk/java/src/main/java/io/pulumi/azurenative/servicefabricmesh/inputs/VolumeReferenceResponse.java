// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a reference to a volume resource.
 * 
 */
public final class VolumeReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeReferenceResponse Empty = new VolumeReferenceResponse();

    /**
     * The path within the container at which the volume should be mounted. Only valid path characters are allowed.
     * 
     */
    @InputImport(name="destinationPath", required=true)
    private final String destinationPath;

    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * Name of the volume being referenced.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The flag indicating whether the volume is read only. Default is 'false'.
     * 
     */
    @InputImport(name="readOnly")
    private final @Nullable Boolean readOnly;

    public Optional<Boolean> getReadOnly() {
        return this.readOnly == null ? Optional.empty() : Optional.ofNullable(this.readOnly);
    }

    public VolumeReferenceResponse(
        String destinationPath,
        String name,
        @Nullable Boolean readOnly) {
        this.destinationPath = Objects.requireNonNull(destinationPath, "expected parameter 'destinationPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
    }

    private VolumeReferenceResponse() {
        this.destinationPath = null;
        this.name = null;
        this.readOnly = null;
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
