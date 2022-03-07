// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.ObjectIdResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a set of X.509 extensions that may be part of some certificate issuance controls.
 * 
 */
public final class CertificateExtensionConstraintsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateExtensionConstraintsResponse Empty = new CertificateExtensionConstraintsResponse();

    /**
     * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
     * 
     */
    @InputImport(name="additionalExtensions", required=true)
      private final List<ObjectIdResponse> additionalExtensions;

    public List<ObjectIdResponse> getAdditionalExtensions() {
        return this.additionalExtensions;
    }

    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    @InputImport(name="knownExtensions", required=true)
      private final List<String> knownExtensions;

    public List<String> getKnownExtensions() {
        return this.knownExtensions;
    }

    public CertificateExtensionConstraintsResponse(
        List<ObjectIdResponse> additionalExtensions,
        List<String> knownExtensions) {
        this.additionalExtensions = Objects.requireNonNull(additionalExtensions, "expected parameter 'additionalExtensions' to be non-null");
        this.knownExtensions = Objects.requireNonNull(knownExtensions, "expected parameter 'knownExtensions' to be non-null");
    }

    private CertificateExtensionConstraintsResponse() {
        this.additionalExtensions = List.of();
        this.knownExtensions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateExtensionConstraintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ObjectIdResponse> additionalExtensions;
        private List<String> knownExtensions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateExtensionConstraintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.knownExtensions = defaults.knownExtensions;
        }

        public Builder setAdditionalExtensions(List<ObjectIdResponse> additionalExtensions) {
            this.additionalExtensions = Objects.requireNonNull(additionalExtensions);
            return this;
        }

        public Builder setKnownExtensions(List<String> knownExtensions) {
            this.knownExtensions = Objects.requireNonNull(knownExtensions);
            return this;
        }
        public CertificateExtensionConstraintsResponse build() {
            return new CertificateExtensionConstraintsResponse(additionalExtensions, knownExtensions);
        }
    }
}