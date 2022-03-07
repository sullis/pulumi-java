// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A filter for a budget, limiting the scope of the cost to calculate.
 * 
 */
public final class GoogleCloudBillingBudgetsV1beta1FilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1beta1FilterResponse Empty = new GoogleCloudBillingBudgetsV1beta1FilterResponse();

    /**
     * Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget will track usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it will track usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
     * 
     */
    @InputImport(name="calendarPeriod", required=true)
      private final String calendarPeriod;

    public String getCalendarPeriod() {
        return this.calendarPeriod;
    }

    /**
     * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
     * 
     */
    @InputImport(name="creditTypes", required=true)
      private final List<String> creditTypes;

    public List<String> getCreditTypes() {
        return this.creditTypes;
    }

    /**
     * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
     * 
     */
    @InputImport(name="creditTypesTreatment", required=true)
      private final String creditTypesTreatment;

    public String getCreditTypesTreatment() {
        return this.creditTypesTreatment;
    }

    /**
     * Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
     * 
     */
    @InputImport(name="customPeriod", required=true)
      private final GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod;

    public GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse getCustomPeriod() {
        return this.customPeriod;
    }

    /**
     * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report will include all labeled and unlabeled usage. An object containing a single `"key": value` pair. Example: `{ "name": "wrench" }`. _Currently, multiple entries or multiple values per entry are not allowed._
     * 
     */
    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report will include all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
     * 
     */
    @InputImport(name="projects", required=true)
      private final List<String> projects;

    public List<String> getProjects() {
        return this.projects;
    }

    /**
     * Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report will include usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    @InputImport(name="services", required=true)
      private final List<String> services;

    public List<String> getServices() {
        return this.services;
    }

    /**
     * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account will be included. If omitted, the report will include usage from the parent account and all subaccounts, if they exist.
     * 
     */
    @InputImport(name="subaccounts", required=true)
      private final List<String> subaccounts;

    public List<String> getSubaccounts() {
        return this.subaccounts;
    }

    public GoogleCloudBillingBudgetsV1beta1FilterResponse(
        String calendarPeriod,
        List<String> creditTypes,
        String creditTypesTreatment,
        GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod,
        Map<String,String> labels,
        List<String> projects,
        List<String> services,
        List<String> subaccounts) {
        this.calendarPeriod = Objects.requireNonNull(calendarPeriod, "expected parameter 'calendarPeriod' to be non-null");
        this.creditTypes = Objects.requireNonNull(creditTypes, "expected parameter 'creditTypes' to be non-null");
        this.creditTypesTreatment = Objects.requireNonNull(creditTypesTreatment, "expected parameter 'creditTypesTreatment' to be non-null");
        this.customPeriod = Objects.requireNonNull(customPeriod, "expected parameter 'customPeriod' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.projects = Objects.requireNonNull(projects, "expected parameter 'projects' to be non-null");
        this.services = Objects.requireNonNull(services, "expected parameter 'services' to be non-null");
        this.subaccounts = Objects.requireNonNull(subaccounts, "expected parameter 'subaccounts' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1beta1FilterResponse() {
        this.calendarPeriod = null;
        this.creditTypes = List.of();
        this.creditTypesTreatment = null;
        this.customPeriod = null;
        this.labels = Map.of();
        this.projects = List.of();
        this.services = List.of();
        this.subaccounts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1FilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String calendarPeriod;
        private List<String> creditTypes;
        private String creditTypesTreatment;
        private GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod;
        private Map<String,String> labels;
        private List<String> projects;
        private List<String> services;
        private List<String> subaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1FilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calendarPeriod = defaults.calendarPeriod;
    	      this.creditTypes = defaults.creditTypes;
    	      this.creditTypesTreatment = defaults.creditTypesTreatment;
    	      this.customPeriod = defaults.customPeriod;
    	      this.labels = defaults.labels;
    	      this.projects = defaults.projects;
    	      this.services = defaults.services;
    	      this.subaccounts = defaults.subaccounts;
        }

        public Builder setCalendarPeriod(String calendarPeriod) {
            this.calendarPeriod = Objects.requireNonNull(calendarPeriod);
            return this;
        }

        public Builder setCreditTypes(List<String> creditTypes) {
            this.creditTypes = Objects.requireNonNull(creditTypes);
            return this;
        }

        public Builder setCreditTypesTreatment(String creditTypesTreatment) {
            this.creditTypesTreatment = Objects.requireNonNull(creditTypesTreatment);
            return this;
        }

        public Builder setCustomPeriod(GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod) {
            this.customPeriod = Objects.requireNonNull(customPeriod);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setProjects(List<String> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }

        public Builder setServices(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }

        public Builder setSubaccounts(List<String> subaccounts) {
            this.subaccounts = Objects.requireNonNull(subaccounts);
            return this;
        }
        public GoogleCloudBillingBudgetsV1beta1FilterResponse build() {
            return new GoogleCloudBillingBudgetsV1beta1FilterResponse(calendarPeriod, creditTypes, creditTypesTreatment, customPeriod, labels, projects, services, subaccounts);
        }
    }
}