// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.ManagementEventAggregationConditionResponse;
import com.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceResponse;
import com.pulumi.azurenative.insights.inputs.RuleMetricDataSourceResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A management event rule condition.
 * 
 */
public final class ManagementEventRuleConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementEventRuleConditionResponse Empty = new ManagementEventRuleConditionResponse();

    /**
     * How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    @Import(name="aggregation")
    private @Nullable ManagementEventAggregationConditionResponse aggregation;

    /**
     * @return How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    public Optional<ManagementEventAggregationConditionResponse> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
    private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;

    /**
     * @return the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    public Optional<Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    private ManagementEventRuleConditionResponse() {}

    private ManagementEventRuleConditionResponse(ManagementEventRuleConditionResponse $) {
        this.aggregation = $.aggregation;
        this.dataSource = $.dataSource;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementEventRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementEventRuleConditionResponse $;

        public Builder() {
            $ = new ManagementEventRuleConditionResponse();
        }

        public Builder(ManagementEventRuleConditionResponse defaults) {
            $ = new ManagementEventRuleConditionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(@Nullable ManagementEventAggregationConditionResponse aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(RuleManagementEventDataSourceResponse dataSource) {
            return dataSource(Either.ofLeft(dataSource));
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(RuleMetricDataSourceResponse dataSource) {
            return dataSource(Either.ofRight(dataSource));
        }

        /**
         * @param odataType specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public ManagementEventRuleConditionResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
