// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PhotonPersistentDiskVolumeSource {
    /**
     * @return Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    private final @Nullable String fsType;
    /**
     * @return ID that identifies Photon Controller persistent disk
     * 
     */
    private final String pdID;

    @CustomType.Constructor
    private PhotonPersistentDiskVolumeSource(
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("pdID") String pdID) {
        this.fsType = fsType;
        this.pdID = pdID;
    }

    /**
     * @return Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return ID that identifies Photon Controller persistent disk
     * 
     */
    public String pdID() {
        return this.pdID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhotonPersistentDiskVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private String pdID;

        public Builder() {
    	      // Empty
        }

        public Builder(PhotonPersistentDiskVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.pdID = defaults.pdID;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder pdID(String pdID) {
            this.pdID = Objects.requireNonNull(pdID);
            return this;
        }        public PhotonPersistentDiskVolumeSource build() {
            return new PhotonPersistentDiskVolumeSource(fsType, pdID);
        }
    }
}
