// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RedisLinkedServerResponse {
    /**
     * Linked server Id.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"id"})
    private RedisLinkedServerResponse(String id) {
        this.id = Objects.requireNonNull(id);
    }

    /**
     * Linked server Id.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisLinkedServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisLinkedServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public RedisLinkedServerResponse build() {
            return new RedisLinkedServerResponse(id);
        }
    }
}
