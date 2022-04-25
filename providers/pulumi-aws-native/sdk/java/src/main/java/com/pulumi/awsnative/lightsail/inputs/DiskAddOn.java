// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.awsnative.lightsail.enums.DiskAddOnStatus;
import com.pulumi.awsnative.lightsail.inputs.DiskAutoSnapshotAddOn;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A addon associate with a resource.
 * 
 */
public final class DiskAddOn extends com.pulumi.resources.InvokeArgs {

    public static final DiskAddOn Empty = new DiskAddOn();

    /**
     * The add-on type
     * 
     */
    @Import(name="addOnType", required=true)
    private String addOnType;

    /**
     * @return The add-on type
     * 
     */
    public String addOnType() {
        return this.addOnType;
    }

    @Import(name="autoSnapshotAddOnRequest")
    private @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest;

    public Optional<DiskAutoSnapshotAddOn> autoSnapshotAddOnRequest() {
        return Optional.ofNullable(this.autoSnapshotAddOnRequest);
    }

    /**
     * Status of the Addon
     * 
     */
    @Import(name="status")
    private @Nullable DiskAddOnStatus status;

    /**
     * @return Status of the Addon
     * 
     */
    public Optional<DiskAddOnStatus> status() {
        return Optional.ofNullable(this.status);
    }

    private DiskAddOn() {}

    private DiskAddOn(DiskAddOn $) {
        this.addOnType = $.addOnType;
        this.autoSnapshotAddOnRequest = $.autoSnapshotAddOnRequest;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAddOn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAddOn $;

        public Builder() {
            $ = new DiskAddOn();
        }

        public Builder(DiskAddOn defaults) {
            $ = new DiskAddOn(Objects.requireNonNull(defaults));
        }

        /**
         * @param addOnType The add-on type
         * 
         * @return builder
         * 
         */
        public Builder addOnType(String addOnType) {
            $.addOnType = addOnType;
            return this;
        }

        public Builder autoSnapshotAddOnRequest(@Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest) {
            $.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
            return this;
        }

        /**
         * @param status Status of the Addon
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable DiskAddOnStatus status) {
            $.status = status;
            return this;
        }

        public DiskAddOn build() {
            $.addOnType = Objects.requireNonNull($.addOnType, "expected parameter 'addOnType' to be non-null");
            return $;
        }
    }

}
