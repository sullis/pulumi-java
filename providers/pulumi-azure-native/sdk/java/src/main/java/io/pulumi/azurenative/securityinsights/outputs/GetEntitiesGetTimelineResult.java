// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.ActivityTimelineItemResponse;
import io.pulumi.azurenative.securityinsights.outputs.BookmarkTimelineItemResponse;
import io.pulumi.azurenative.securityinsights.outputs.SecurityAlertTimelineItemResponse;
import io.pulumi.azurenative.securityinsights.outputs.TimelineResultsMetadataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEntitiesGetTimelineResult {
    /**
     * The metadata from the timeline operation results.
     * 
     */
    private final @Nullable TimelineResultsMetadataResponse metaData;
    /**
     * The timeline result values.
     * 
     */
    private final @Nullable List<Object> value;

    @OutputCustomType.Constructor({"metaData","value"})
    private GetEntitiesGetTimelineResult(
        @Nullable TimelineResultsMetadataResponse metaData,
        @Nullable List<Object> value) {
        this.metaData = metaData;
        this.value = value;
    }

    /**
     * The metadata from the timeline operation results.
     * 
    */
    public Optional<TimelineResultsMetadataResponse> getMetaData() {
        return Optional.ofNullable(this.metaData);
    }
    /**
     * The timeline result values.
     * 
    */
    public List<Object> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntitiesGetTimelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TimelineResultsMetadataResponse metaData;
        private @Nullable List<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntitiesGetTimelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metaData = defaults.metaData;
    	      this.value = defaults.value;
        }

        public Builder setMetaData(@Nullable TimelineResultsMetadataResponse metaData) {
            this.metaData = metaData;
            return this;
        }

        public Builder setValue(@Nullable List<Object> value) {
            this.value = value;
            return this;
        }
        public GetEntitiesGetTimelineResult build() {
            return new GetEntitiesGetTimelineResult(metaData, value);
        }
    }
}