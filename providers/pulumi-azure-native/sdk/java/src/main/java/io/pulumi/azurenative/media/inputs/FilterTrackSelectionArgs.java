// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.FilterTrackPropertyConditionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Representing a list of FilterTrackPropertyConditions to select a track.  The filters are combined using a logical AND operation.
 * 
 */
public final class FilterTrackSelectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterTrackSelectionArgs Empty = new FilterTrackSelectionArgs();

    /**
     * The track selections.
     * 
     */
    @Import(name="trackSelections", required=true)
      private final Output<List<FilterTrackPropertyConditionArgs>> trackSelections;

    public Output<List<FilterTrackPropertyConditionArgs>> getTrackSelections() {
        return this.trackSelections;
    }

    public FilterTrackSelectionArgs(Output<List<FilterTrackPropertyConditionArgs>> trackSelections) {
        this.trackSelections = Objects.requireNonNull(trackSelections, "expected parameter 'trackSelections' to be non-null");
    }

    private FilterTrackSelectionArgs() {
        this.trackSelections = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterTrackSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<FilterTrackPropertyConditionArgs>> trackSelections;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterTrackSelectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackSelections = defaults.trackSelections;
        }

        public Builder trackSelections(Output<List<FilterTrackPropertyConditionArgs>> trackSelections) {
            this.trackSelections = Objects.requireNonNull(trackSelections);
            return this;
        }
        public Builder trackSelections(List<FilterTrackPropertyConditionArgs> trackSelections) {
            this.trackSelections = Output.of(Objects.requireNonNull(trackSelections));
            return this;
        }
        public Builder trackSelections(FilterTrackPropertyConditionArgs... trackSelections) {
            return trackSelections(List.of(trackSelections));
        }        public FilterTrackSelectionArgs build() {
            return new FilterTrackSelectionArgs(trackSelections);
        }
    }
}
