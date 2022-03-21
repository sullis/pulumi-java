// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The ID of the ExpressRouteConnection.
 * 
 */
public final class ExpressRouteConnectionIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressRouteConnectionIdResponse Empty = new ExpressRouteConnectionIdResponse();

    /**
     * The ID of the ExpressRouteConnection.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public ExpressRouteConnectionIdResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private ExpressRouteConnectionIdResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteConnectionIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteConnectionIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public ExpressRouteConnectionIdResponse build() {
            return new ExpressRouteConnectionIdResponse(id);
        }
    }
}
