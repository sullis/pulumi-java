// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublicKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPublicKeyArgs Empty = new GetPublicKeyArgs();

    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    public GetPublicKeyArgs(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetPublicKeyArgs() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetPublicKeyArgs build() {
            return new GetPublicKeyArgs(id);
        }
    }
}
