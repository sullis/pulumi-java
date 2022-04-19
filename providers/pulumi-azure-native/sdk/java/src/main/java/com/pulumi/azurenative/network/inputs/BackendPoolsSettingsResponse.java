// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings that apply to all backend pools.
 * 
 */
public final class BackendPoolsSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendPoolsSettingsResponse Empty = new BackendPoolsSettingsResponse();

    /**
     * Whether to enforce certificate name check on HTTPS requests to all backend pools. No effect on non-HTTPS requests.
     * 
     */
    @Import(name="enforceCertificateNameCheck")
      private final @Nullable String enforceCertificateNameCheck;

    public Optional<String> enforceCertificateNameCheck() {
        return this.enforceCertificateNameCheck == null ? Optional.empty() : Optional.ofNullable(this.enforceCertificateNameCheck);
    }

    /**
     * Send and receive timeout on forwarding request to the backend. When timeout is reached, the request fails and returns.
     * 
     */
    @Import(name="sendRecvTimeoutSeconds")
      private final @Nullable Integer sendRecvTimeoutSeconds;

    public Optional<Integer> sendRecvTimeoutSeconds() {
        return this.sendRecvTimeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.sendRecvTimeoutSeconds);
    }

    public BackendPoolsSettingsResponse(
        @Nullable String enforceCertificateNameCheck,
        @Nullable Integer sendRecvTimeoutSeconds) {
        this.enforceCertificateNameCheck = Codegen.stringProp("enforceCertificateNameCheck").arg(enforceCertificateNameCheck).def("Enabled").getNullable();
        this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
    }

    private BackendPoolsSettingsResponse() {
        this.enforceCertificateNameCheck = null;
        this.sendRecvTimeoutSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPoolsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enforceCertificateNameCheck;
        private @Nullable Integer sendRecvTimeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPoolsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceCertificateNameCheck = defaults.enforceCertificateNameCheck;
    	      this.sendRecvTimeoutSeconds = defaults.sendRecvTimeoutSeconds;
        }

        public Builder enforceCertificateNameCheck(@Nullable String enforceCertificateNameCheck) {
            this.enforceCertificateNameCheck = enforceCertificateNameCheck;
            return this;
        }
        public Builder sendRecvTimeoutSeconds(@Nullable Integer sendRecvTimeoutSeconds) {
            this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
            return this;
        }        public BackendPoolsSettingsResponse build() {
            return new BackendPoolsSettingsResponse(enforceCertificateNameCheck, sendRecvTimeoutSeconds);
        }
    }
}
