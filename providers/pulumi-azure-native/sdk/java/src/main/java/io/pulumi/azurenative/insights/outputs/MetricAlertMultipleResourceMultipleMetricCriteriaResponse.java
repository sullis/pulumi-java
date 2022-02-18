// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.DynamicMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.MetricCriteriaResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricAlertMultipleResourceMultipleMetricCriteriaResponse {
    /**
     * the list of multiple metric criteria for this 'all of' operation.
     * 
     */
    private final @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;
    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"allOf","odataType"})
    private MetricAlertMultipleResourceMultipleMetricCriteriaResponse(
        @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf,
        String odataType) {
        this.allOf = allOf;
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * the list of multiple metric criteria for this 'all of' operation.
     * 
     */
    public List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> getAllOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }
    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAllOf(@Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf) {
            this.allOf = allOf;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public MetricAlertMultipleResourceMultipleMetricCriteriaResponse build() {
            return new MetricAlertMultipleResourceMultipleMetricCriteriaResponse(allOf, odataType);
        }
    }
}
