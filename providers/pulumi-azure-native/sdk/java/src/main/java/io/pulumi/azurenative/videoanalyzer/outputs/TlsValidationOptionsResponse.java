// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TlsValidationOptionsResponse {
    /**
     * When set to 'true' causes the certificate subject name validation to be skipped. Default is 'false'.
     * 
     */
    private final @Nullable String ignoreHostname;
    /**
     * When set to 'true' causes the certificate chain trust validation to be skipped. Default is 'false'.
     * 
     */
    private final @Nullable String ignoreSignature;

    @OutputCustomType.Constructor({"ignoreHostname","ignoreSignature"})
    private TlsValidationOptionsResponse(
        @Nullable String ignoreHostname,
        @Nullable String ignoreSignature) {
        this.ignoreHostname = ignoreHostname;
        this.ignoreSignature = ignoreSignature;
    }

    /**
     * When set to 'true' causes the certificate subject name validation to be skipped. Default is 'false'.
     * 
     */
    public Optional<String> getIgnoreHostname() {
        return Optional.ofNullable(this.ignoreHostname);
    }
    /**
     * When set to 'true' causes the certificate chain trust validation to be skipped. Default is 'false'.
     * 
     */
    public Optional<String> getIgnoreSignature() {
        return Optional.ofNullable(this.ignoreSignature);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsValidationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ignoreHostname;
        private @Nullable String ignoreSignature;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsValidationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreHostname = defaults.ignoreHostname;
    	      this.ignoreSignature = defaults.ignoreSignature;
        }

        public Builder setIgnoreHostname(@Nullable String ignoreHostname) {
            this.ignoreHostname = ignoreHostname;
            return this;
        }

        public Builder setIgnoreSignature(@Nullable String ignoreSignature) {
            this.ignoreSignature = ignoreSignature;
            return this;
        }

        public TlsValidationOptionsResponse build() {
            return new TlsValidationOptionsResponse(ignoreHostname, ignoreSignature);
        }
    }
}
