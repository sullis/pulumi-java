// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.FilterTrackPropertyConditionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Representing a list of FilterTrackPropertyConditions to select a track.  The filters are combined using a logical AND operation.
 * 
 */
public final class FilterTrackSelectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FilterTrackSelectionResponse Empty = new FilterTrackSelectionResponse();

    /**
     * The track selections.
     * 
     */
    @InputImport(name="trackSelections", required=true)
    private final List<FilterTrackPropertyConditionResponse> trackSelections;

    public List<FilterTrackPropertyConditionResponse> getTrackSelections() {
        return this.trackSelections;
    }

    public FilterTrackSelectionResponse(List<FilterTrackPropertyConditionResponse> trackSelections) {
        this.trackSelections = Objects.requireNonNull(trackSelections, "expected parameter 'trackSelections' to be non-null");
    }

    private FilterTrackSelectionResponse() {
        this.trackSelections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterTrackSelectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FilterTrackPropertyConditionResponse> trackSelections;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterTrackSelectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackSelections = defaults.trackSelections;
        }

        public Builder setTrackSelections(List<FilterTrackPropertyConditionResponse> trackSelections) {
            this.trackSelections = Objects.requireNonNull(trackSelections);
            return this;
        }

        public FilterTrackSelectionResponse build() {
            return new FilterTrackSelectionResponse(trackSelections);
        }
    }
}
