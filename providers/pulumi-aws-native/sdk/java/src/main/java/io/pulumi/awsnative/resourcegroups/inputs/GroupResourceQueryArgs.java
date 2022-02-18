// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.inputs;

import io.pulumi.awsnative.resourcegroups.enums.GroupResourceQueryType;
import io.pulumi.awsnative.resourcegroups.inputs.GroupQueryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupResourceQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupResourceQueryArgs Empty = new GroupResourceQueryArgs();

    @InputImport(name="query")
    private final @Nullable Input<GroupQueryArgs> query;

    public Input<GroupQueryArgs> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    @InputImport(name="type")
    private final @Nullable Input<GroupResourceQueryType> type;

    public Input<GroupResourceQueryType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public GroupResourceQueryArgs(
        @Nullable Input<GroupQueryArgs> query,
        @Nullable Input<GroupResourceQueryType> type) {
        this.query = query;
        this.type = type;
    }

    private GroupResourceQueryArgs() {
        this.query = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupResourceQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GroupQueryArgs> query;
        private @Nullable Input<GroupResourceQueryType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupResourceQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.type = defaults.type;
        }

        public Builder setQuery(@Nullable Input<GroupQueryArgs> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable GroupQueryArgs query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setType(@Nullable Input<GroupResourceQueryType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable GroupResourceQueryType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public GroupResourceQueryArgs build() {
            return new GroupResourceQueryArgs(query, type);
        }
    }
}
