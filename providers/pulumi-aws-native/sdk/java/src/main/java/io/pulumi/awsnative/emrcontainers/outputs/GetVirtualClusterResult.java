// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers.outputs;

import io.pulumi.awsnative.emrcontainers.outputs.VirtualClusterTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualClusterResult {
    private final @Nullable String arn;
    /**
     * Id of the virtual cluster.
     * 
     */
    private final @Nullable String id;
    /**
     * An array of key-value pairs to apply to this virtual cluster.
     * 
     */
    private final @Nullable List<VirtualClusterTag> tags;

    @OutputCustomType.Constructor({"arn","id","tags"})
    private GetVirtualClusterResult(
        @Nullable String arn,
        @Nullable String id,
        @Nullable List<VirtualClusterTag> tags) {
        this.arn = arn;
        this.id = id;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Id of the virtual cluster.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * An array of key-value pairs to apply to this virtual cluster.
     * 
     */
    public List<VirtualClusterTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private @Nullable List<VirtualClusterTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualClusterResult defaults) {
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

        public Builder setTags(@Nullable List<VirtualClusterTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetVirtualClusterResult build() {
            return new GetVirtualClusterResult(arn, id, tags);
        }
    }
}
