// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.outputs;

import io.pulumi.azurenative.billing.outputs.InvoiceSectionWithCreateSubPermissionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult {
    /**
     * The link (url) to the next page of results.
     * 
     */
    private final String nextLink;
    /**
     * The list of invoice section properties with create subscription permission.
     * 
     */
    private final @Nullable List<InvoiceSectionWithCreateSubPermissionResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult(
        String nextLink,
        @Nullable List<InvoiceSectionWithCreateSubPermissionResponse> value) {
        this.nextLink = Objects.requireNonNull(nextLink);
        this.value = value;
    }

    /**
     * The link (url) to the next page of results.
     * 
     */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * The list of invoice section properties with create subscription permission.
     * 
     */
    public List<InvoiceSectionWithCreateSubPermissionResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private @Nullable List<InvoiceSectionWithCreateSubPermissionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(@Nullable List<InvoiceSectionWithCreateSubPermissionResponse> value) {
            this.value = value;
            return this;
        }

        public ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult build() {
            return new ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult(nextLink, value);
        }
    }
}
