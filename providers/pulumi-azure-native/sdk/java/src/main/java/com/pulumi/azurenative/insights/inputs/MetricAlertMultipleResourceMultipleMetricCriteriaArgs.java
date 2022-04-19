// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.DynamicMetricCriteriaArgs;
import com.pulumi.azurenative.insights.inputs.MetricCriteriaArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for multiple resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertMultipleResourceMultipleMetricCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlertMultipleResourceMultipleMetricCriteriaArgs Empty = new MetricAlertMultipleResourceMultipleMetricCriteriaArgs();

    /**
     * the list of multiple metric criteria for this 'all of' operation.
     * 
     */
    @Import(name="allOf")
      private final @Nullable Output<List<Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>>> allOf;

    public Output<List<Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>>> allOf() {
        return this.allOf == null ? Codegen.empty() : this.allOf;
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public MetricAlertMultipleResourceMultipleMetricCriteriaArgs(
        @Nullable Output<List<Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>>> allOf,
        Output<String> odataType) {
        this.allOf = allOf;
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
    }

    private MetricAlertMultipleResourceMultipleMetricCriteriaArgs() {
        this.allOf = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertMultipleResourceMultipleMetricCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>>> allOf;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertMultipleResourceMultipleMetricCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder allOf(@Nullable Output<List<Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>>> allOf) {
            this.allOf = allOf;
            return this;
        }
        public Builder allOf(@Nullable List<Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>> allOf) {
            this.allOf = Codegen.ofNullable(allOf);
            return this;
        }
        public Builder allOf(Either<DynamicMetricCriteriaArgs,MetricCriteriaArgs>... allOf) {
            return allOf(List.of(allOf));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public MetricAlertMultipleResourceMultipleMetricCriteriaArgs build() {
            return new MetricAlertMultipleResourceMultipleMetricCriteriaArgs(allOf, odataType);
        }
    }
}
