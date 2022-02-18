// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The blob service properties for Last access time based tracking policy.
 * 
 */
public final class LastAccessTimeTrackingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final LastAccessTimeTrackingPolicyResponse Empty = new LastAccessTimeTrackingPolicyResponse();

    /**
     * An array of predefined supported blob types. Only blockBlob is the supported value. This field is currently read only
     * 
     */
    @InputImport(name="blobType")
    private final @Nullable List<String> blobType;

    public List<String> getBlobType() {
        return this.blobType == null ? List.of() : this.blobType;
    }

    /**
     * When set to true last access time based tracking is enabled.
     * 
     */
    @InputImport(name="enable", required=true)
    private final Boolean enable;

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The field specifies blob object tracking granularity in days, typically how often the blob object should be tracked.This field is currently read only with value as 1
     * 
     */
    @InputImport(name="trackingGranularityInDays")
    private final @Nullable Integer trackingGranularityInDays;

    public Optional<Integer> getTrackingGranularityInDays() {
        return this.trackingGranularityInDays == null ? Optional.empty() : Optional.ofNullable(this.trackingGranularityInDays);
    }

    public LastAccessTimeTrackingPolicyResponse(
        @Nullable List<String> blobType,
        Boolean enable,
        @Nullable String name,
        @Nullable Integer trackingGranularityInDays) {
        this.blobType = blobType;
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.name = name;
        this.trackingGranularityInDays = trackingGranularityInDays;
    }

    private LastAccessTimeTrackingPolicyResponse() {
        this.blobType = List.of();
        this.enable = null;
        this.name = null;
        this.trackingGranularityInDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LastAccessTimeTrackingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> blobType;
        private Boolean enable;
        private @Nullable String name;
        private @Nullable Integer trackingGranularityInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(LastAccessTimeTrackingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobType = defaults.blobType;
    	      this.enable = defaults.enable;
    	      this.name = defaults.name;
    	      this.trackingGranularityInDays = defaults.trackingGranularityInDays;
        }

        public Builder setBlobType(@Nullable List<String> blobType) {
            this.blobType = blobType;
            return this;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTrackingGranularityInDays(@Nullable Integer trackingGranularityInDays) {
            this.trackingGranularityInDays = trackingGranularityInDays;
            return this;
        }

        public LastAccessTimeTrackingPolicyResponse build() {
            return new LastAccessTimeTrackingPolicyResponse(blobType, enable, name, trackingGranularityInDays);
        }
    }
}
