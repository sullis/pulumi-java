// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.detective;

import io.pulumi.awsnative.detective.inputs.GraphTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphArgs Empty = new GraphArgs();

    @Import(name="tags")
      private final @Nullable Output<List<GraphTagArgs>> tags;

    public Output<List<GraphTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public GraphArgs(@Nullable Output<List<GraphTagArgs>> tags) {
        this.tags = tags;
    }

    private GraphArgs() {
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GraphTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder tags(@Nullable Output<List<GraphTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<GraphTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(GraphTagArgs... tags) {
            return tags(List.of(tags));
        }        public GraphArgs build() {
            return new GraphArgs(tags);
        }
    }
}
