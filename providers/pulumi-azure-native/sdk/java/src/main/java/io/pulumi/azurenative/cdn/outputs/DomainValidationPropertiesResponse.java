// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DomainValidationPropertiesResponse {
    /**
     * The date time that the token expires
     * 
     */
    private final String expirationDate;
    /**
     * Challenge used for DNS TXT record or file based validation
     * 
     */
    private final String validationToken;

    @OutputCustomType.Constructor({"expirationDate","validationToken"})
    private DomainValidationPropertiesResponse(
        String expirationDate,
        String validationToken) {
        this.expirationDate = Objects.requireNonNull(expirationDate);
        this.validationToken = Objects.requireNonNull(validationToken);
    }

    /**
     * The date time that the token expires
     * 
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * Challenge used for DNS TXT record or file based validation
     * 
     */
    public String getValidationToken() {
        return this.validationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainValidationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String validationToken;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainValidationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.validationToken = defaults.validationToken;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setValidationToken(String validationToken) {
            this.validationToken = Objects.requireNonNull(validationToken);
            return this;
        }

        public DomainValidationPropertiesResponse build() {
            return new DomainValidationPropertiesResponse(expirationDate, validationToken);
        }
    }
}
