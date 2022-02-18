// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SelectVideoTrackByAttributeResponse {
    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    private final String attribute;
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    private final String filter;
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    private final @Nullable String filterValue;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"attribute","filter","filterValue","odataType"})
    private SelectVideoTrackByAttributeResponse(
        String attribute,
        String filter,
        @Nullable String filterValue,
        String odataType) {
        this.attribute = Objects.requireNonNull(attribute);
        this.filter = Objects.requireNonNull(filter);
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    public String getAttribute() {
        return this.attribute;
    }
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    public String getFilter() {
        return this.filter;
    }
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    public Optional<String> getFilterValue() {
        return Optional.ofNullable(this.filterValue);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByAttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String filter;
        private @Nullable String filterValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByAttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilterValue(@Nullable String filterValue) {
            this.filterValue = filterValue;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public SelectVideoTrackByAttributeResponse build() {
            return new SelectVideoTrackByAttributeResponse(attribute, filter, filterValue, odataType);
        }
    }
}
