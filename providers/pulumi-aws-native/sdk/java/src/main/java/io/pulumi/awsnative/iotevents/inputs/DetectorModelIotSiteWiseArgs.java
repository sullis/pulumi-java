// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelAssetPropertyValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sends information about the detector model instance and the event that triggered the action to a specified asset property in AWS IoT SiteWise.
 * 
 */
public final class DetectorModelIotSiteWiseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelIotSiteWiseArgs Empty = new DetectorModelIotSiteWiseArgs();

    /**
     * The ID of the asset that has the specified property. You can specify an expression.
     * 
     */
    @InputImport(name="assetId")
    private final @Nullable Input<String> assetId;

    public Input<String> getAssetId() {
        return this.assetId == null ? Input.empty() : this.assetId;
    }

    /**
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of failure. The default is a new unique identifier. You can also specify an expression.
     * 
     */
    @InputImport(name="entryId")
    private final @Nullable Input<String> entryId;

    public Input<String> getEntryId() {
        return this.entryId == null ? Input.empty() : this.entryId;
    }

    /**
     * The alias of the asset property. You can also specify an expression.
     * 
     */
    @InputImport(name="propertyAlias")
    private final @Nullable Input<String> propertyAlias;

    public Input<String> getPropertyAlias() {
        return this.propertyAlias == null ? Input.empty() : this.propertyAlias;
    }

    /**
     * The ID of the asset property. You can specify an expression.
     * 
     */
    @InputImport(name="propertyId")
    private final @Nullable Input<String> propertyId;

    public Input<String> getPropertyId() {
        return this.propertyId == null ? Input.empty() : this.propertyId;
    }

    @InputImport(name="propertyValue", required=true)
    private final Input<DetectorModelAssetPropertyValueArgs> propertyValue;

    public Input<DetectorModelAssetPropertyValueArgs> getPropertyValue() {
        return this.propertyValue;
    }

    public DetectorModelIotSiteWiseArgs(
        @Nullable Input<String> assetId,
        @Nullable Input<String> entryId,
        @Nullable Input<String> propertyAlias,
        @Nullable Input<String> propertyId,
        Input<DetectorModelAssetPropertyValueArgs> propertyValue) {
        this.assetId = assetId;
        this.entryId = entryId;
        this.propertyAlias = propertyAlias;
        this.propertyId = propertyId;
        this.propertyValue = Objects.requireNonNull(propertyValue, "expected parameter 'propertyValue' to be non-null");
    }

    private DetectorModelIotSiteWiseArgs() {
        this.assetId = Input.empty();
        this.entryId = Input.empty();
        this.propertyAlias = Input.empty();
        this.propertyId = Input.empty();
        this.propertyValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotSiteWiseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assetId;
        private @Nullable Input<String> entryId;
        private @Nullable Input<String> propertyAlias;
        private @Nullable Input<String> propertyId;
        private Input<DetectorModelAssetPropertyValueArgs> propertyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotSiteWiseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.entryId = defaults.entryId;
    	      this.propertyAlias = defaults.propertyAlias;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyValue = defaults.propertyValue;
        }

        public Builder setAssetId(@Nullable Input<String> assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder setAssetId(@Nullable String assetId) {
            this.assetId = Input.ofNullable(assetId);
            return this;
        }

        public Builder setEntryId(@Nullable Input<String> entryId) {
            this.entryId = entryId;
            return this;
        }

        public Builder setEntryId(@Nullable String entryId) {
            this.entryId = Input.ofNullable(entryId);
            return this;
        }

        public Builder setPropertyAlias(@Nullable Input<String> propertyAlias) {
            this.propertyAlias = propertyAlias;
            return this;
        }

        public Builder setPropertyAlias(@Nullable String propertyAlias) {
            this.propertyAlias = Input.ofNullable(propertyAlias);
            return this;
        }

        public Builder setPropertyId(@Nullable Input<String> propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public Builder setPropertyId(@Nullable String propertyId) {
            this.propertyId = Input.ofNullable(propertyId);
            return this;
        }

        public Builder setPropertyValue(Input<DetectorModelAssetPropertyValueArgs> propertyValue) {
            this.propertyValue = Objects.requireNonNull(propertyValue);
            return this;
        }

        public Builder setPropertyValue(DetectorModelAssetPropertyValueArgs propertyValue) {
            this.propertyValue = Input.of(Objects.requireNonNull(propertyValue));
            return this;
        }

        public DetectorModelIotSiteWiseArgs build() {
            return new DetectorModelIotSiteWiseArgs(assetId, entryId, propertyAlias, propertyId, propertyValue);
        }
    }
}
