// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReplicaKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicaKeyArgs Empty = new GetReplicaKeyArgs();

    @InputImport(name="keyId", required=true)
    private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    public GetReplicaKeyArgs(String keyId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private GetReplicaKeyArgs() {
        this.keyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicaKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicaKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public GetReplicaKeyArgs build() {
            return new GetReplicaKeyArgs(keyId);
        }
    }
}
