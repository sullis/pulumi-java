// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExposureControlFeatureValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExposureControlFeatureValueArgs Empty = new GetExposureControlFeatureValueArgs();

    /**
     * The feature name.
     * 
     */
    @InputImport(name="featureName")
    private final @Nullable String featureName;

    public Optional<String> getFeatureName() {
        return this.featureName == null ? Optional.empty() : Optional.ofNullable(this.featureName);
    }

    /**
     * The feature type.
     * 
     */
    @InputImport(name="featureType")
    private final @Nullable String featureType;

    public Optional<String> getFeatureType() {
        return this.featureType == null ? Optional.empty() : Optional.ofNullable(this.featureType);
    }

    /**
     * The location identifier.
     * 
     */
    @InputImport(name="locationId", required=true)
    private final String locationId;

    public String getLocationId() {
        return this.locationId;
    }

    public GetExposureControlFeatureValueArgs(
        @Nullable String featureName,
        @Nullable String featureType,
        String locationId) {
        this.featureName = featureName;
        this.featureType = featureType;
        this.locationId = Objects.requireNonNull(locationId, "expected parameter 'locationId' to be non-null");
    }

    private GetExposureControlFeatureValueArgs() {
        this.featureName = null;
        this.featureType = null;
        this.locationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExposureControlFeatureValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String featureName;
        private @Nullable String featureType;
        private String locationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExposureControlFeatureValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.featureType = defaults.featureType;
    	      this.locationId = defaults.locationId;
        }

        public Builder setFeatureName(@Nullable String featureName) {
            this.featureName = featureName;
            return this;
        }

        public Builder setFeatureType(@Nullable String featureType) {
            this.featureType = featureType;
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = Objects.requireNonNull(locationId);
            return this;
        }

        public GetExposureControlFeatureValueArgs build() {
            return new GetExposureControlFeatureValueArgs(featureName, featureType, locationId);
        }
    }
}
