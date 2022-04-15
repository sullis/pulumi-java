// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.PipelineActivity;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPipelineResult {
    private final @Nullable String id;
    private final @Nullable List<PipelineActivity> pipelineActivities;
    private final @Nullable List<PipelineTag> tags;

    @CustomType.Constructor
    private GetPipelineResult(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("pipelineActivities") @Nullable List<PipelineActivity> pipelineActivities,
        @CustomType.Parameter("tags") @Nullable List<PipelineTag> tags) {
        this.id = id;
        this.pipelineActivities = pipelineActivities;
        this.tags = tags;
    }

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public List<PipelineActivity> pipelineActivities() {
        return this.pipelineActivities == null ? List.of() : this.pipelineActivities;
    }
    public List<PipelineTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<PipelineActivity> pipelineActivities;
        private @Nullable List<PipelineTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.pipelineActivities = defaults.pipelineActivities;
    	      this.tags = defaults.tags;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder pipelineActivities(@Nullable List<PipelineActivity> pipelineActivities) {
            this.pipelineActivities = pipelineActivities;
            return this;
        }
        public Builder pipelineActivities(PipelineActivity... pipelineActivities) {
            return pipelineActivities(List.of(pipelineActivities));
        }
        public Builder tags(@Nullable List<PipelineTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(PipelineTag... tags) {
            return tags(List.of(tags));
        }        public GetPipelineResult build() {
            return new GetPipelineResult(id, pipelineActivities, tags);
        }
    }
}
