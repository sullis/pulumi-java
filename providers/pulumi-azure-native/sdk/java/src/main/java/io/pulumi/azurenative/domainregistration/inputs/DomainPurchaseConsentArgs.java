// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Domain purchase consent object, representing acceptance of applicable legal agreements.
 * 
 */
public final class DomainPurchaseConsentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainPurchaseConsentArgs Empty = new DomainPurchaseConsentArgs();

    /**
     * Timestamp when the agreements were accepted.
     * 
     */
    @InputImport(name="agreedAt")
    private final @Nullable Input<String> agreedAt;

    public Input<String> getAgreedAt() {
        return this.agreedAt == null ? Input.empty() : this.agreedAt;
    }

    /**
     * Client IP address.
     * 
     */
    @InputImport(name="agreedBy")
    private final @Nullable Input<String> agreedBy;

    public Input<String> getAgreedBy() {
        return this.agreedBy == null ? Input.empty() : this.agreedBy;
    }

    /**
     * List of applicable legal agreement keys. This list can be retrieved using ListLegalAgreements API under <code>TopLevelDomain</code> resource.
     * 
     */
    @InputImport(name="agreementKeys")
    private final @Nullable Input<List<String>> agreementKeys;

    public Input<List<String>> getAgreementKeys() {
        return this.agreementKeys == null ? Input.empty() : this.agreementKeys;
    }

    public DomainPurchaseConsentArgs(
        @Nullable Input<String> agreedAt,
        @Nullable Input<String> agreedBy,
        @Nullable Input<List<String>> agreementKeys) {
        this.agreedAt = agreedAt;
        this.agreedBy = agreedBy;
        this.agreementKeys = agreementKeys;
    }

    private DomainPurchaseConsentArgs() {
        this.agreedAt = Input.empty();
        this.agreedBy = Input.empty();
        this.agreementKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainPurchaseConsentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> agreedAt;
        private @Nullable Input<String> agreedBy;
        private @Nullable Input<List<String>> agreementKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainPurchaseConsentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreedAt = defaults.agreedAt;
    	      this.agreedBy = defaults.agreedBy;
    	      this.agreementKeys = defaults.agreementKeys;
        }

        public Builder setAgreedAt(@Nullable Input<String> agreedAt) {
            this.agreedAt = agreedAt;
            return this;
        }

        public Builder setAgreedAt(@Nullable String agreedAt) {
            this.agreedAt = Input.ofNullable(agreedAt);
            return this;
        }

        public Builder setAgreedBy(@Nullable Input<String> agreedBy) {
            this.agreedBy = agreedBy;
            return this;
        }

        public Builder setAgreedBy(@Nullable String agreedBy) {
            this.agreedBy = Input.ofNullable(agreedBy);
            return this;
        }

        public Builder setAgreementKeys(@Nullable Input<List<String>> agreementKeys) {
            this.agreementKeys = agreementKeys;
            return this;
        }

        public Builder setAgreementKeys(@Nullable List<String> agreementKeys) {
            this.agreementKeys = Input.ofNullable(agreementKeys);
            return this;
        }

        public DomainPurchaseConsentArgs build() {
            return new DomainPurchaseConsentArgs(agreedAt, agreedBy, agreementKeys);
        }
    }
}
