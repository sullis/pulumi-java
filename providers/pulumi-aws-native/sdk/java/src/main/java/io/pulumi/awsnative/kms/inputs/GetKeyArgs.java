// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKeyArgs Empty = new GetKeyArgs();

    @InputImport(name="keyId", required=true)
    private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    public GetKeyArgs(String keyId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private GetKeyArgs() {
        this.keyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public GetKeyArgs build() {
            return new GetKeyArgs(keyId);
        }
    }
}
