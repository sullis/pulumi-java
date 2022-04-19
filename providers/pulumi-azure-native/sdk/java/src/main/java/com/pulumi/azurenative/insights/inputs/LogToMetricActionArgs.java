// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.CriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specify action need to be taken when rule type is converting log to metric
 * 
 */
public final class LogToMetricActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogToMetricActionArgs Empty = new LogToMetricActionArgs();

    /**
     * Criteria of Metric
     * 
     */
    @Import(name="criteria", required=true)
      private final Output<List<CriteriaArgs>> criteria;

    public Output<List<CriteriaArgs>> criteria() {
        return this.criteria;
    }

    /**
     * Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is 'Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public LogToMetricActionArgs(
        Output<List<CriteriaArgs>> criteria,
        Output<String> odataType) {
        this.criteria = Objects.requireNonNull(criteria, "expected parameter 'criteria' to be non-null");
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
    }

    private LogToMetricActionArgs() {
        this.criteria = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogToMetricActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<CriteriaArgs>> criteria;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(LogToMetricActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.odataType = defaults.odataType;
        }

        public Builder criteria(Output<List<CriteriaArgs>> criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }
        public Builder criteria(List<CriteriaArgs> criteria) {
            this.criteria = Output.of(Objects.requireNonNull(criteria));
            return this;
        }
        public Builder criteria(CriteriaArgs... criteria) {
            return criteria(List.of(criteria));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public LogToMetricActionArgs build() {
            return new LogToMetricActionArgs(criteria, odataType);
        }
    }
}
