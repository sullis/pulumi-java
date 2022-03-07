// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExportArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExportArgs Empty = new GetExportArgs();

    /**
     * May be used to expand the properties within an export. Currently only 'runHistory' is supported and will return information for the last 10 executions of the export.
     * 
     */
    @InputImport(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * Export Name.
     * 
     */
    @InputImport(name="exportName", required=true)
      private final String exportName;

    public String getExportName() {
        return this.exportName;
    }

    /**
     * The scope associated with export operations. This includes '/subscriptions/{subscriptionId}/' for subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for Management Group scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for billingProfile scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}' for invoiceSection scope, and '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * 
     */
    @InputImport(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetExportArgs(
        @Nullable String expand,
        String exportName,
        String scope) {
        this.expand = expand;
        this.exportName = Objects.requireNonNull(exportName, "expected parameter 'exportName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetExportArgs() {
        this.expand = null;
        this.exportName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String exportName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.exportName = defaults.exportName;
    	      this.scope = defaults.scope;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setExportName(String exportName) {
            this.exportName = Objects.requireNonNull(exportName);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetExportArgs build() {
            return new GetExportArgs(expand, exportName, scope);
        }
    }
}