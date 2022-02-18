// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Linked server Id
 * 
 */
public final class RedisLinkedServerResponse extends io.pulumi.resources.InvokeArgs {

    public static final RedisLinkedServerResponse Empty = new RedisLinkedServerResponse();

    /**
     * Linked server Id.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    public RedisLinkedServerResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private RedisLinkedServerResponse() {
        this.id = null;
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
