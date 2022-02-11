// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.enums.DiskAddOnStatus;
import io.pulumi.awsnative.lightsail.inputs.DiskAutoSnapshotAddOn;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskAddOn extends io.pulumi.resources.InvokeArgs {

    public static final DiskAddOn Empty = new DiskAddOn();

    @InputImport(name="addOnType", required=true)
    private final String addOnType;

    public String getAddOnType() {
        return this.addOnType;
    }

    @InputImport(name="autoSnapshotAddOnRequest")
    private final @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest;

    public Optional<DiskAutoSnapshotAddOn> getAutoSnapshotAddOnRequest() {
        return this.autoSnapshotAddOnRequest == null ? Optional.empty() : Optional.ofNullable(this.autoSnapshotAddOnRequest);
    }

    @InputImport(name="status")
    private final @Nullable DiskAddOnStatus status;

    public Optional<DiskAddOnStatus> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public DiskAddOn(
        String addOnType,
        @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest,
        @Nullable DiskAddOnStatus status) {
        this.addOnType = Objects.requireNonNull(addOnType, "expected parameter 'addOnType' to be non-null");
        this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
        this.status = status;
    }

    private DiskAddOn() {
        this.addOnType = null;
        this.autoSnapshotAddOnRequest = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskAddOn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addOnType;
        private @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest;
        private @Nullable DiskAddOnStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskAddOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnType = defaults.addOnType;
    	      this.autoSnapshotAddOnRequest = defaults.autoSnapshotAddOnRequest;
    	      this.status = defaults.status;
        }

        public Builder setAddOnType(String addOnType) {
            this.addOnType = Objects.requireNonNull(addOnType);
            return this;
        }

        public Builder setAutoSnapshotAddOnRequest(@Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest) {
            this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
            return this;
        }

        public Builder setStatus(@Nullable DiskAddOnStatus status) {
            this.status = status;
            return this;
        }

        public DiskAddOn build() {
            return new DiskAddOn(addOnType, autoSnapshotAddOnRequest, status);
        }
    }
}
