// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.qldb.outputs;

import io.pulumi.awsnative.qldb.outputs.StreamTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamResult {
    private final @Nullable String arn;
    private final @Nullable String id;
    private final @Nullable List<StreamTag> tags;

    @OutputCustomType.Constructor({"arn","id","tags"})
    private GetStreamResult(
        @Nullable String arn,
        @Nullable String id,
        @Nullable List<StreamTag> tags) {
        this.arn = arn;
        this.id = id;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<StreamTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private @Nullable List<StreamTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setTags(@Nullable List<StreamTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetStreamResult build() {
            return new GetStreamResult(arn, id, tags);
        }
    }
}
