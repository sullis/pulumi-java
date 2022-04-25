// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeSnapshotPropertiesResponse {
    /**
     * @return Snapshot Policy ResourceId
     * 
     */
    private final @Nullable String snapshotPolicyId;

    @CustomType.Constructor
    private VolumeSnapshotPropertiesResponse(@CustomType.Parameter("snapshotPolicyId") @Nullable String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
    }

    /**
     * @return Snapshot Policy ResourceId
     * 
     */
    public Optional<String> snapshotPolicyId() {
        return Optional.ofNullable(this.snapshotPolicyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeSnapshotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String snapshotPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeSnapshotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotPolicyId = defaults.snapshotPolicyId;
        }

        public Builder snapshotPolicyId(@Nullable String snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }        public VolumeSnapshotPropertiesResponse build() {
            return new VolumeSnapshotPropertiesResponse(snapshotPolicyId);
        }
    }
}
