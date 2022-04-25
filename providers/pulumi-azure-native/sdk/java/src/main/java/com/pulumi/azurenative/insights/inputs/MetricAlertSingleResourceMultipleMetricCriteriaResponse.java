// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.MetricCriteriaResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for a single resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertSingleResourceMultipleMetricCriteriaResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetricAlertSingleResourceMultipleMetricCriteriaResponse Empty = new MetricAlertSingleResourceMultipleMetricCriteriaResponse();

    /**
     * The list of metric criteria for this &#39;all of&#39; operation.
     * 
     */
    @Import(name="allOf")
    private @Nullable List<MetricCriteriaResponse> allOf;

    /**
     * @return The list of metric criteria for this &#39;all of&#39; operation.
     * 
     */
    public Optional<List<MetricCriteriaResponse>> allOf() {
        return Optional.ofNullable(this.allOf);
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    private MetricAlertSingleResourceMultipleMetricCriteriaResponse() {}

    private MetricAlertSingleResourceMultipleMetricCriteriaResponse(MetricAlertSingleResourceMultipleMetricCriteriaResponse $) {
        this.allOf = $.allOf;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlertSingleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlertSingleResourceMultipleMetricCriteriaResponse $;

        public Builder() {
            $ = new MetricAlertSingleResourceMultipleMetricCriteriaResponse();
        }

        public Builder(MetricAlertSingleResourceMultipleMetricCriteriaResponse defaults) {
            $ = new MetricAlertSingleResourceMultipleMetricCriteriaResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allOf The list of metric criteria for this &#39;all of&#39; operation.
         * 
         * @return builder
         * 
         */
        public Builder allOf(@Nullable List<MetricCriteriaResponse> allOf) {
            $.allOf = allOf;
            return this;
        }

        /**
         * @param allOf The list of metric criteria for this &#39;all of&#39; operation.
         * 
         * @return builder
         * 
         */
        public Builder allOf(MetricCriteriaResponse... allOf) {
            return allOf(List.of(allOf));
        }

        /**
         * @param odataType specifies the type of the alert criteria.
         * Expected value is &#39;Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public MetricAlertSingleResourceMultipleMetricCriteriaResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
