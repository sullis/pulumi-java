// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnvelopeSignatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvelopeSignatureResponse Empty = new EnvelopeSignatureResponse();

    @InputImport(name="keyid", required=true)
      private final String keyid;

    public String getKeyid() {
        return this.keyid;
    }

    @InputImport(name="sig", required=true)
      private final String sig;

    public String getSig() {
        return this.sig;
    }

    public EnvelopeSignatureResponse(
        String keyid,
        String sig) {
        this.keyid = Objects.requireNonNull(keyid, "expected parameter 'keyid' to be non-null");
        this.sig = Objects.requireNonNull(sig, "expected parameter 'sig' to be non-null");
    }

    private EnvelopeSignatureResponse() {
        this.keyid = null;
        this.sig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeSignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyid;
        private String sig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeSignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyid = defaults.keyid;
    	      this.sig = defaults.sig;
        }

        public Builder setKeyid(String keyid) {
            this.keyid = Objects.requireNonNull(keyid);
            return this;
        }

        public Builder setSig(String sig) {
            this.sig = Objects.requireNonNull(sig);
            return this;
        }
        public EnvelopeSignatureResponse build() {
            return new EnvelopeSignatureResponse(keyid, sig);
        }
    }
}