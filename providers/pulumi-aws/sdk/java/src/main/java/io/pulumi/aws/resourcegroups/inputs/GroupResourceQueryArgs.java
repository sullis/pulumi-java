// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroups.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupResourceQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupResourceQueryArgs Empty = new GroupResourceQueryArgs();

    /**
     * The resource query as a JSON string.
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public GroupResourceQueryArgs(
        Output<String> query,
        @Nullable Output<String> type) {
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.type = type;
    }

    private GroupResourceQueryArgs() {
        this.query = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupResourceQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> query;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupResourceQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.type = defaults.type;
        }

        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public GroupResourceQueryArgs build() {
            return new GroupResourceQueryArgs(query, type);
        }
    }
}
