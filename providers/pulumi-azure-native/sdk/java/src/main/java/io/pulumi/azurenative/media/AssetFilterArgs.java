// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.media.inputs.FilterTrackSelectionArgs;
import io.pulumi.azurenative.media.inputs.FirstQualityArgs;
import io.pulumi.azurenative.media.inputs.PresentationTimeRangeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetFilterArgs Empty = new AssetFilterArgs();

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The Asset name.
     * 
     */
    @InputImport(name="assetName", required=true)
    private final Input<String> assetName;

    public Input<String> getAssetName() {
        return this.assetName;
    }

    /**
     * The Asset Filter name
     * 
     */
    @InputImport(name="filterName")
    private final @Nullable Input<String> filterName;

    public Input<String> getFilterName() {
        return this.filterName == null ? Input.empty() : this.filterName;
    }

    /**
     * The first quality.
     * 
     */
    @InputImport(name="firstQuality")
    private final @Nullable Input<FirstQualityArgs> firstQuality;

    public Input<FirstQualityArgs> getFirstQuality() {
        return this.firstQuality == null ? Input.empty() : this.firstQuality;
    }

    /**
     * The presentation time range.
     * 
     */
    @InputImport(name="presentationTimeRange")
    private final @Nullable Input<PresentationTimeRangeArgs> presentationTimeRange;

    public Input<PresentationTimeRangeArgs> getPresentationTimeRange() {
        return this.presentationTimeRange == null ? Input.empty() : this.presentationTimeRange;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tracks selection conditions.
     * 
     */
    @InputImport(name="tracks")
    private final @Nullable Input<List<FilterTrackSelectionArgs>> tracks;

    public Input<List<FilterTrackSelectionArgs>> getTracks() {
        return this.tracks == null ? Input.empty() : this.tracks;
    }

    public AssetFilterArgs(
        Input<String> accountName,
        Input<String> assetName,
        @Nullable Input<String> filterName,
        @Nullable Input<FirstQualityArgs> firstQuality,
        @Nullable Input<PresentationTimeRangeArgs> presentationTimeRange,
        Input<String> resourceGroupName,
        @Nullable Input<List<FilterTrackSelectionArgs>> tracks) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.filterName = filterName;
        this.firstQuality = firstQuality;
        this.presentationTimeRange = presentationTimeRange;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tracks = tracks;
    }

    private AssetFilterArgs() {
        this.accountName = Input.empty();
        this.assetName = Input.empty();
        this.filterName = Input.empty();
        this.firstQuality = Input.empty();
        this.presentationTimeRange = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tracks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> assetName;
        private @Nullable Input<String> filterName;
        private @Nullable Input<FirstQualityArgs> firstQuality;
        private @Nullable Input<PresentationTimeRangeArgs> presentationTimeRange;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<FilterTrackSelectionArgs>> tracks;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.assetName = defaults.assetName;
    	      this.filterName = defaults.filterName;
    	      this.firstQuality = defaults.firstQuality;
    	      this.presentationTimeRange = defaults.presentationTimeRange;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tracks = defaults.tracks;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setAssetName(Input<String> assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Input.of(Objects.requireNonNull(assetName));
            return this;
        }

        public Builder setFilterName(@Nullable Input<String> filterName) {
            this.filterName = filterName;
            return this;
        }

        public Builder setFilterName(@Nullable String filterName) {
            this.filterName = Input.ofNullable(filterName);
            return this;
        }

        public Builder setFirstQuality(@Nullable Input<FirstQualityArgs> firstQuality) {
            this.firstQuality = firstQuality;
            return this;
        }

        public Builder setFirstQuality(@Nullable FirstQualityArgs firstQuality) {
            this.firstQuality = Input.ofNullable(firstQuality);
            return this;
        }

        public Builder setPresentationTimeRange(@Nullable Input<PresentationTimeRangeArgs> presentationTimeRange) {
            this.presentationTimeRange = presentationTimeRange;
            return this;
        }

        public Builder setPresentationTimeRange(@Nullable PresentationTimeRangeArgs presentationTimeRange) {
            this.presentationTimeRange = Input.ofNullable(presentationTimeRange);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTracks(@Nullable Input<List<FilterTrackSelectionArgs>> tracks) {
            this.tracks = tracks;
            return this;
        }

        public Builder setTracks(@Nullable List<FilterTrackSelectionArgs> tracks) {
            this.tracks = Input.ofNullable(tracks);
            return this;
        }

        public AssetFilterArgs build() {
            return new AssetFilterArgs(accountName, assetName, filterName, firstQuality, presentationTimeRange, resourceGroupName, tracks);
        }
    }
}
