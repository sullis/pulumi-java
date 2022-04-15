// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.outputs;

import io.pulumi.awsnative.cassandra.outputs.KeyspaceTag;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyspaceResult {
    private final @Nullable List<KeyspaceTag> tags;

    @CustomType.Constructor
    private GetKeyspaceResult(@CustomType.Parameter("tags") @Nullable List<KeyspaceTag> tags) {
        this.tags = tags;
    }

    public List<KeyspaceTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KeyspaceTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder tags(@Nullable List<KeyspaceTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(KeyspaceTag... tags) {
            return tags(List.of(tags));
        }        public GetKeyspaceResult build() {
            return new GetKeyspaceResult(tags);
        }
    }
}
