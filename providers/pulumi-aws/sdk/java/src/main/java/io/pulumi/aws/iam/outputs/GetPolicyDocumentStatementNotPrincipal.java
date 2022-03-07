// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetPolicyDocumentStatementNotPrincipal {
    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     * 
     */
    private final List<String> identifiers;
    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"identifiers","type"})
    private GetPolicyDocumentStatementNotPrincipal(
        List<String> identifiers,
        String type) {
        this.identifiers = Objects.requireNonNull(identifiers);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     * 
    */
    public List<String> getIdentifiers() {
        return this.identifiers;
    }
    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementNotPrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> identifiers;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDocumentStatementNotPrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifiers = defaults.identifiers;
    	      this.type = defaults.type;
        }

        public Builder setIdentifiers(List<String> identifiers) {
            this.identifiers = Objects.requireNonNull(identifiers);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPolicyDocumentStatementNotPrincipal build() {
            return new GetPolicyDocumentStatementNotPrincipal(identifiers, type);
        }
    }
}