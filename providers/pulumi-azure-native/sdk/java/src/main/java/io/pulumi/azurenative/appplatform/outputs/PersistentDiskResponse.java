// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PersistentDiskResponse {
    /**
     * Mount path of the persistent disk
     * 
     */
    private final @Nullable String mountPath;
    /**
     * Size of the persistent disk in GB
     * 
     */
    private final @Nullable Integer sizeInGB;
    /**
     * Size of the used persistent disk in GB
     * 
     */
    private final Integer usedInGB;

    @OutputCustomType.Constructor({"mountPath","sizeInGB","usedInGB"})
    private PersistentDiskResponse(
        @Nullable String mountPath,
        @Nullable Integer sizeInGB,
        Integer usedInGB) {
        this.mountPath = mountPath;
        this.sizeInGB = sizeInGB;
        this.usedInGB = Objects.requireNonNull(usedInGB);
    }

    /**
     * Mount path of the persistent disk
     * 
     */
    public Optional<String> getMountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * Size of the persistent disk in GB
     * 
     */
    public Optional<Integer> getSizeInGB() {
        return Optional.ofNullable(this.sizeInGB);
    }
    /**
     * Size of the used persistent disk in GB
     * 
     */
    public Integer getUsedInGB() {
        return this.usedInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mountPath;
        private @Nullable Integer sizeInGB;
        private Integer usedInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.sizeInGB = defaults.sizeInGB;
    	      this.usedInGB = defaults.usedInGB;
        }

        public Builder setMountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder setSizeInGB(@Nullable Integer sizeInGB) {
            this.sizeInGB = sizeInGB;
            return this;
        }

        public Builder setUsedInGB(Integer usedInGB) {
            this.usedInGB = Objects.requireNonNull(usedInGB);
            return this;
        }

        public PersistentDiskResponse build() {
            return new PersistentDiskResponse(mountPath, sizeInGB, usedInGB);
        }
    }
}
