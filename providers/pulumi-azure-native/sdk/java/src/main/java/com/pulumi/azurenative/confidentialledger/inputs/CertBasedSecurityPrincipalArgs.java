// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confidentialledger.inputs;

import com.pulumi.azurenative.confidentialledger.enums.LedgerRoleName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cert based security principal with Ledger RoleName
 * 
 */
public final class CertBasedSecurityPrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertBasedSecurityPrincipalArgs Empty = new CertBasedSecurityPrincipalArgs();

    /**
     * Base64 encoded public key of the user cert (.pem or .cer)
     * 
     */
    @Import(name="cert")
    private @Nullable Output<String> cert;

    /**
     * @return Base64 encoded public key of the user cert (.pem or .cer)
     * 
     */
    public Optional<Output<String>> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    @Import(name="ledgerRoleName")
    private @Nullable Output<Either<String,LedgerRoleName>> ledgerRoleName;

    /**
     * @return LedgerRole associated with the Security Principal of Ledger
     * 
     */
    public Optional<Output<Either<String,LedgerRoleName>>> ledgerRoleName() {
        return Optional.ofNullable(this.ledgerRoleName);
    }

    private CertBasedSecurityPrincipalArgs() {}

    private CertBasedSecurityPrincipalArgs(CertBasedSecurityPrincipalArgs $) {
        this.cert = $.cert;
        this.ledgerRoleName = $.ledgerRoleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertBasedSecurityPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertBasedSecurityPrincipalArgs $;

        public Builder() {
            $ = new CertBasedSecurityPrincipalArgs();
        }

        public Builder(CertBasedSecurityPrincipalArgs defaults) {
            $ = new CertBasedSecurityPrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cert Base64 encoded public key of the user cert (.pem or .cer)
         * 
         * @return builder
         * 
         */
        public Builder cert(@Nullable Output<String> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert Base64 encoded public key of the user cert (.pem or .cer)
         * 
         * @return builder
         * 
         */
        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(@Nullable Output<Either<String,LedgerRoleName>> ledgerRoleName) {
            $.ledgerRoleName = ledgerRoleName;
            return this;
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(Either<String,LedgerRoleName> ledgerRoleName) {
            return ledgerRoleName(Output.of(ledgerRoleName));
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(String ledgerRoleName) {
            return ledgerRoleName(Either.ofLeft(ledgerRoleName));
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(LedgerRoleName ledgerRoleName) {
            return ledgerRoleName(Either.ofRight(ledgerRoleName));
        }

        public CertBasedSecurityPrincipalArgs build() {
            return $;
        }
    }

}
