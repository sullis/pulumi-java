// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volume Snapshot Properties
 * 
 */
public final class VolumeSnapshotPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeSnapshotPropertiesArgs Empty = new VolumeSnapshotPropertiesArgs();

    /**
     * Snapshot Policy ResourceId
     * 
     */
    @InputImport(name="snapshotPolicyId")
    private final @Nullable Input<String> snapshotPolicyId;

    public Input<String> getSnapshotPolicyId() {
        return this.snapshotPolicyId == null ? Input.empty() : this.snapshotPolicyId;
    }

    public VolumeSnapshotPropertiesArgs(@Nullable Input<String> snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
    }

    private VolumeSnapshotPropertiesArgs() {
        this.snapshotPolicyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeSnapshotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> snapshotPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeSnapshotPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotPolicyId = defaults.snapshotPolicyId;
        }

        public Builder setSnapshotPolicyId(@Nullable Input<String> snapshotPolicyId) {
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        public Builder setSnapshotPolicyId(@Nullable String snapshotPolicyId) {
            this.snapshotPolicyId = Input.ofNullable(snapshotPolicyId);
            return this;
        }

        public VolumeSnapshotPropertiesArgs build() {
            return new VolumeSnapshotPropertiesArgs(snapshotPolicyId);
        }
    }
}
