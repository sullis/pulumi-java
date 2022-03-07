// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableReplicaSSESpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableReplicaSSESpecificationArgs Empty = new GlobalTableReplicaSSESpecificationArgs();

    @InputImport(name="kMSMasterKeyId", required=true)
      private final Input<String> kMSMasterKeyId;

    public Input<String> getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    public GlobalTableReplicaSSESpecificationArgs(Input<String> kMSMasterKeyId) {
        this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId, "expected parameter 'kMSMasterKeyId' to be non-null");
    }

    private GlobalTableReplicaSSESpecificationArgs() {
        this.kMSMasterKeyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaSSESpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kMSMasterKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaSSESpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSMasterKeyId = defaults.kMSMasterKeyId;
        }

        public Builder setKMSMasterKeyId(Input<String> kMSMasterKeyId) {
            this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId);
            return this;
        }

        public Builder setKMSMasterKeyId(String kMSMasterKeyId) {
            this.kMSMasterKeyId = Input.of(Objects.requireNonNull(kMSMasterKeyId));
            return this;
        }
        public GlobalTableReplicaSSESpecificationArgs build() {
            return new GlobalTableReplicaSSESpecificationArgs(kMSMasterKeyId);
        }
    }
}