// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.detective.outputs;

import io.pulumi.awsnative.detective.outputs.GraphTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGraphResult {
    /**
     * The Detective graph ARN
     * 
     */
    private final @Nullable String arn;
    private final @Nullable List<GraphTag> tags;

    @OutputCustomType.Constructor({"arn","tags"})
    private GetGraphResult(
        @Nullable String arn,
        @Nullable List<GraphTag> tags) {
        this.arn = arn;
        this.tags = tags;
    }

    /**
     * The Detective graph ARN
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<GraphTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGraphResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<GraphTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGraphResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable List<GraphTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetGraphResult build() {
            return new GetGraphResult(arn, tags);
        }
    }
}