// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Domain Security Settings
 * 
 */
public final class DomainSecuritySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DomainSecuritySettingsResponse Empty = new DomainSecuritySettingsResponse();

    /**
     * A flag to determine whether or not KerberosArmoring is enabled or disabled.
     * 
     */
    @InputImport(name="kerberosArmoring")
      private final @Nullable String kerberosArmoring;

    public Optional<String> getKerberosArmoring() {
        return this.kerberosArmoring == null ? Optional.empty() : Optional.ofNullable(this.kerberosArmoring);
    }

    /**
     * A flag to determine whether or not KerberosRc4Encryption is enabled or disabled.
     * 
     */
    @InputImport(name="kerberosRc4Encryption")
      private final @Nullable String kerberosRc4Encryption;

    public Optional<String> getKerberosRc4Encryption() {
        return this.kerberosRc4Encryption == null ? Optional.empty() : Optional.ofNullable(this.kerberosRc4Encryption);
    }

    /**
     * A flag to determine whether or not NtlmV1 is enabled or disabled.
     * 
     */
    @InputImport(name="ntlmV1")
      private final @Nullable String ntlmV1;

    public Optional<String> getNtlmV1() {
        return this.ntlmV1 == null ? Optional.empty() : Optional.ofNullable(this.ntlmV1);
    }

    /**
     * A flag to determine whether or not SyncKerberosPasswords is enabled or disabled.
     * 
     */
    @InputImport(name="syncKerberosPasswords")
      private final @Nullable String syncKerberosPasswords;

    public Optional<String> getSyncKerberosPasswords() {
        return this.syncKerberosPasswords == null ? Optional.empty() : Optional.ofNullable(this.syncKerberosPasswords);
    }

    /**
     * A flag to determine whether or not SyncNtlmPasswords is enabled or disabled.
     * 
     */
    @InputImport(name="syncNtlmPasswords")
      private final @Nullable String syncNtlmPasswords;

    public Optional<String> getSyncNtlmPasswords() {
        return this.syncNtlmPasswords == null ? Optional.empty() : Optional.ofNullable(this.syncNtlmPasswords);
    }

    /**
     * A flag to determine whether or not SyncOnPremPasswords is enabled or disabled.
     * 
     */
    @InputImport(name="syncOnPremPasswords")
      private final @Nullable String syncOnPremPasswords;

    public Optional<String> getSyncOnPremPasswords() {
        return this.syncOnPremPasswords == null ? Optional.empty() : Optional.ofNullable(this.syncOnPremPasswords);
    }

    /**
     * A flag to determine whether or not TlsV1 is enabled or disabled.
     * 
     */
    @InputImport(name="tlsV1")
      private final @Nullable String tlsV1;

    public Optional<String> getTlsV1() {
        return this.tlsV1 == null ? Optional.empty() : Optional.ofNullable(this.tlsV1);
    }

    public DomainSecuritySettingsResponse(
        @Nullable String kerberosArmoring,
        @Nullable String kerberosRc4Encryption,
        @Nullable String ntlmV1,
        @Nullable String syncKerberosPasswords,
        @Nullable String syncNtlmPasswords,
        @Nullable String syncOnPremPasswords,
        @Nullable String tlsV1) {
        this.kerberosArmoring = kerberosArmoring == null ? "Disabled" : kerberosArmoring;
        this.kerberosRc4Encryption = kerberosRc4Encryption == null ? "Enabled" : kerberosRc4Encryption;
        this.ntlmV1 = ntlmV1 == null ? "Enabled" : ntlmV1;
        this.syncKerberosPasswords = syncKerberosPasswords == null ? "Enabled" : syncKerberosPasswords;
        this.syncNtlmPasswords = syncNtlmPasswords == null ? "Enabled" : syncNtlmPasswords;
        this.syncOnPremPasswords = syncOnPremPasswords == null ? "Enabled" : syncOnPremPasswords;
        this.tlsV1 = tlsV1 == null ? "Enabled" : tlsV1;
    }

    private DomainSecuritySettingsResponse() {
        this.kerberosArmoring = null;
        this.kerberosRc4Encryption = null;
        this.ntlmV1 = null;
        this.syncKerberosPasswords = null;
        this.syncNtlmPasswords = null;
        this.syncOnPremPasswords = null;
        this.tlsV1 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kerberosArmoring;
        private @Nullable String kerberosRc4Encryption;
        private @Nullable String ntlmV1;
        private @Nullable String syncKerberosPasswords;
        private @Nullable String syncNtlmPasswords;
        private @Nullable String syncOnPremPasswords;
        private @Nullable String tlsV1;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosArmoring = defaults.kerberosArmoring;
    	      this.kerberosRc4Encryption = defaults.kerberosRc4Encryption;
    	      this.ntlmV1 = defaults.ntlmV1;
    	      this.syncKerberosPasswords = defaults.syncKerberosPasswords;
    	      this.syncNtlmPasswords = defaults.syncNtlmPasswords;
    	      this.syncOnPremPasswords = defaults.syncOnPremPasswords;
    	      this.tlsV1 = defaults.tlsV1;
        }

        public Builder setKerberosArmoring(@Nullable String kerberosArmoring) {
            this.kerberosArmoring = kerberosArmoring;
            return this;
        }

        public Builder setKerberosRc4Encryption(@Nullable String kerberosRc4Encryption) {
            this.kerberosRc4Encryption = kerberosRc4Encryption;
            return this;
        }

        public Builder setNtlmV1(@Nullable String ntlmV1) {
            this.ntlmV1 = ntlmV1;
            return this;
        }

        public Builder setSyncKerberosPasswords(@Nullable String syncKerberosPasswords) {
            this.syncKerberosPasswords = syncKerberosPasswords;
            return this;
        }

        public Builder setSyncNtlmPasswords(@Nullable String syncNtlmPasswords) {
            this.syncNtlmPasswords = syncNtlmPasswords;
            return this;
        }

        public Builder setSyncOnPremPasswords(@Nullable String syncOnPremPasswords) {
            this.syncOnPremPasswords = syncOnPremPasswords;
            return this;
        }

        public Builder setTlsV1(@Nullable String tlsV1) {
            this.tlsV1 = tlsV1;
            return this;
        }
        public DomainSecuritySettingsResponse build() {
            return new DomainSecuritySettingsResponse(kerberosArmoring, kerberosRc4Encryption, ntlmV1, syncKerberosPasswords, syncNtlmPasswords, syncOnPremPasswords, tlsV1);
        }
    }
}