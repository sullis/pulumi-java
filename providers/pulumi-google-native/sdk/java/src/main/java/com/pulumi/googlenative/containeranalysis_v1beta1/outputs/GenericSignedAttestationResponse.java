// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GenericSignedAttestationResponse {
    /**
     * @return Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    private final String contentType;
    /**
     * @return The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
     * 
     */
    private final String serializedPayload;
    /**
     * @return One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    private final List<SignatureResponse> signatures;

    @CustomType.Constructor
    private GenericSignedAttestationResponse(
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("serializedPayload") String serializedPayload,
        @CustomType.Parameter("signatures") List<SignatureResponse> signatures) {
        this.contentType = contentType;
        this.serializedPayload = serializedPayload;
        this.signatures = signatures;
    }

    /**
     * @return Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
     * 
     */
    public String serializedPayload() {
        return this.serializedPayload;
    }
    /**
     * @return One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    public List<SignatureResponse> signatures() {
        return this.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericSignedAttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String serializedPayload;
        private List<SignatureResponse> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericSignedAttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.serializedPayload = defaults.serializedPayload;
    	      this.signatures = defaults.signatures;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder serializedPayload(String serializedPayload) {
            this.serializedPayload = Objects.requireNonNull(serializedPayload);
            return this;
        }
        public Builder signatures(List<SignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }
        public Builder signatures(SignatureResponse... signatures) {
            return signatures(List.of(signatures));
        }        public GenericSignedAttestationResponse build() {
            return new GenericSignedAttestationResponse(contentType, serializedPayload, signatures);
        }
    }
}
