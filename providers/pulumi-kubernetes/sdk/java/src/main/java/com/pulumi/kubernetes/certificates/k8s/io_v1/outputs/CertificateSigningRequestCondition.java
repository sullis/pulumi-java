// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateSigningRequestCondition {
    /**
     * @return lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
     * 
     */
    private final @Nullable String lastTransitionTime;
    /**
     * @return lastUpdateTime is the time of the last update to this condition
     * 
     */
    private final @Nullable String lastUpdateTime;
    /**
     * @return message contains a human readable message with details about the request state
     * 
     */
    private final @Nullable String message;
    /**
     * @return reason indicates a brief reason for the request state
     * 
     */
    private final @Nullable String reason;
    /**
     * @return status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
     * 
     */
    private final String status;
    /**
     * @return type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
     * 
     * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
     * 
     * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
     * 
     * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
     * 
     * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
     * 
     * Only one condition of a given type is allowed.
     * 
     * Possible enum values:
     *  - `&#34;Approved&#34;` Approved indicates the request was approved and should be issued by the signer.
     *  - `&#34;Denied&#34;` Denied indicates the request was denied and should not be issued by the signer.
     *  - `&#34;Failed&#34;` Failed indicates the signer failed to issue the certificate.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private CertificateSigningRequestCondition(
        @CustomType.Parameter("lastTransitionTime") @Nullable String lastTransitionTime,
        @CustomType.Parameter("lastUpdateTime") @Nullable String lastUpdateTime,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.lastUpdateTime = lastUpdateTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    /**
     * @return lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
     * 
     */
    public Optional<String> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * @return lastUpdateTime is the time of the last update to this condition
     * 
     */
    public Optional<String> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }
    /**
     * @return message contains a human readable message with details about the request state
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return reason indicates a brief reason for the request state
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * @return status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
     * 
     * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
     * 
     * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
     * 
     * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
     * 
     * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
     * 
     * Only one condition of a given type is allowed.
     * 
     * Possible enum values:
     *  - `&#34;Approved&#34;` Approved indicates the request was approved and should be issued by the signer.
     *  - `&#34;Denied&#34;` Denied indicates the request was denied and should not be issued by the signer.
     *  - `&#34;Failed&#34;` Failed indicates the signer failed to issue the certificate.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String lastUpdateTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder lastUpdateTime(@Nullable String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public CertificateSigningRequestCondition build() {
            return new CertificateSigningRequestCondition(lastTransitionTime, lastUpdateTime, message, reason, status, type);
        }
    }
}
