// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AttributeFilter;
import io.pulumi.azurenative.media.enums.TrackAttribute;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Select video tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectVideoTrackByAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectVideoTrackByAttributeArgs Empty = new SelectVideoTrackByAttributeArgs();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @InputImport(name="attribute", required=true)
    private final Input<Either<String,TrackAttribute>> attribute;

    public Input<Either<String,TrackAttribute>> getAttribute() {
        return this.attribute;
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @InputImport(name="filter", required=true)
    private final Input<Either<String,AttributeFilter>> filter;

    public Input<Either<String,AttributeFilter>> getFilter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    @InputImport(name="filterValue")
    private final @Nullable Input<String> filterValue;

    public Input<String> getFilterValue() {
        return this.filterValue == null ? Input.empty() : this.filterValue;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public SelectVideoTrackByAttributeArgs(
        Input<Either<String,TrackAttribute>> attribute,
        Input<Either<String,AttributeFilter>> filter,
        @Nullable Input<String> filterValue,
        Input<String> odataType) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private SelectVideoTrackByAttributeArgs() {
        this.attribute = Input.empty();
        this.filter = Input.empty();
        this.filterValue = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,TrackAttribute>> attribute;
        private Input<Either<String,AttributeFilter>> filter;
        private @Nullable Input<String> filterValue;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAttribute(Input<Either<String,TrackAttribute>> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setAttribute(Either<String,TrackAttribute> attribute) {
            this.attribute = Input.of(Objects.requireNonNull(attribute));
            return this;
        }

        public Builder setFilter(Input<Either<String,AttributeFilter>> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(Either<String,AttributeFilter> filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setFilterValue(@Nullable Input<String> filterValue) {
            this.filterValue = filterValue;
            return this;
        }

        public Builder setFilterValue(@Nullable String filterValue) {
            this.filterValue = Input.ofNullable(filterValue);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public SelectVideoTrackByAttributeArgs build() {
            return new SelectVideoTrackByAttributeArgs(attribute, filter, filterValue, odataType);
        }
    }
}
