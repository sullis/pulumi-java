// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OccurenceAttestationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurenceAttestationGetArgs Empty = new OccurenceAttestationGetArgs();

    /**
     * The serialized payload that is verified by one or
     * more signatures. A base64-encoded string.
     * 
     */
    @InputImport(name="serializedPayload", required=true)
    private final Input<String> serializedPayload;

    public Input<String> getSerializedPayload() {
        return this.serializedPayload;
    }

    /**
     * One or more signatures over serializedPayload.
     * Verifier implementations should consider this attestation
     * message verified if at least one signature verifies
     * serializedPayload. See Signature in common.proto for more
     * details on signature structure and verification.
     * Structure is documented below.
     * 
     */
    @InputImport(name="signatures", required=true)
    private final Input<List<OccurenceAttestationSignatureGetArgs>> signatures;

    public Input<List<OccurenceAttestationSignatureGetArgs>> getSignatures() {
        return this.signatures;
    }

    public OccurenceAttestationGetArgs(
        Input<String> serializedPayload,
        Input<List<OccurenceAttestationSignatureGetArgs>> signatures) {
        this.serializedPayload = Objects.requireNonNull(serializedPayload, "expected parameter 'serializedPayload' to be non-null");
        this.signatures = Objects.requireNonNull(signatures, "expected parameter 'signatures' to be non-null");
    }

    private OccurenceAttestationGetArgs() {
        this.serializedPayload = Input.empty();
        this.signatures = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceAttestationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> serializedPayload;
        private Input<List<OccurenceAttestationSignatureGetArgs>> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceAttestationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serializedPayload = defaults.serializedPayload;
    	      this.signatures = defaults.signatures;
        }

        public Builder setSerializedPayload(Input<String> serializedPayload) {
            this.serializedPayload = Objects.requireNonNull(serializedPayload);
            return this;
        }

        public Builder setSerializedPayload(String serializedPayload) {
            this.serializedPayload = Input.of(Objects.requireNonNull(serializedPayload));
            return this;
        }

        public Builder setSignatures(Input<List<OccurenceAttestationSignatureGetArgs>> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }

        public Builder setSignatures(List<OccurenceAttestationSignatureGetArgs> signatures) {
            this.signatures = Input.of(Objects.requireNonNull(signatures));
            return this;
        }

        public OccurenceAttestationGetArgs build() {
            return new OccurenceAttestationGetArgs(serializedPayload, signatures);
        }
    }
}
