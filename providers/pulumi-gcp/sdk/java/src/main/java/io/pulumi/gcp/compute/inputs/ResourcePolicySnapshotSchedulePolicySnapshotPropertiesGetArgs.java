// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs Empty = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs();

    /**
     * Whether to perform a 'guest aware' snapshot.
     * 
     */
    @InputImport(name="guestFlush")
    private final @Nullable Input<Boolean> guestFlush;

    public Input<Boolean> getGuestFlush() {
        return this.guestFlush == null ? Input.empty() : this.guestFlush;
    }

    /**
     * A set of key-value pairs.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Cloud Storage bucket location to store the auto snapshot
     * (regional or multi-regional)
     * 
     */
    @InputImport(name="storageLocations")
    private final @Nullable Input<String> storageLocations;

    public Input<String> getStorageLocations() {
        return this.storageLocations == null ? Input.empty() : this.storageLocations;
    }

    public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs(
        @Nullable Input<Boolean> guestFlush,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> storageLocations) {
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.storageLocations = storageLocations;
    }

    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs() {
        this.guestFlush = Input.empty();
        this.labels = Input.empty();
        this.storageLocations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> guestFlush;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder setGuestFlush(@Nullable Input<Boolean> guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }

        public Builder setGuestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = Input.ofNullable(guestFlush);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setStorageLocations(@Nullable Input<String> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder setStorageLocations(@Nullable String storageLocations) {
            this.storageLocations = Input.ofNullable(storageLocations);
            return this;
        }

        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs(guestFlush, labels, storageLocations);
        }
    }
}
