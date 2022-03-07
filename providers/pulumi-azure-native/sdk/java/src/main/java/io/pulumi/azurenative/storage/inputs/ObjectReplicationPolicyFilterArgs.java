// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filters limit replication to a subset of blobs within the storage account. A logical OR is performed on values in the filter. If multiple filters are defined, a logical AND is performed on all filters.
 * 
 */
public final class ObjectReplicationPolicyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectReplicationPolicyFilterArgs Empty = new ObjectReplicationPolicyFilterArgs();

    /**
     * Blobs created after the time will be replicated to the destination. It must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z
     * 
     */
    @InputImport(name="minCreationTime")
      private final @Nullable Input<String> minCreationTime;

    public Input<String> getMinCreationTime() {
        return this.minCreationTime == null ? Input.empty() : this.minCreationTime;
    }

    /**
     * Optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     * 
     */
    @InputImport(name="prefixMatch")
      private final @Nullable Input<List<String>> prefixMatch;

    public Input<List<String>> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    public ObjectReplicationPolicyFilterArgs(
        @Nullable Input<String> minCreationTime,
        @Nullable Input<List<String>> prefixMatch) {
        this.minCreationTime = minCreationTime;
        this.prefixMatch = prefixMatch;
    }

    private ObjectReplicationPolicyFilterArgs() {
        this.minCreationTime = Input.empty();
        this.prefixMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> minCreationTime;
        private @Nullable Input<List<String>> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReplicationPolicyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minCreationTime = defaults.minCreationTime;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder setMinCreationTime(@Nullable Input<String> minCreationTime) {
            this.minCreationTime = minCreationTime;
            return this;
        }

        public Builder setMinCreationTime(@Nullable String minCreationTime) {
            this.minCreationTime = Input.ofNullable(minCreationTime);
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<List<String>> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }
        public ObjectReplicationPolicyFilterArgs build() {
            return new ObjectReplicationPolicyFilterArgs(minCreationTime, prefixMatch);
        }
    }
}