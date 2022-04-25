// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.outputs.AnalysisDateTimeParameter;
import com.pulumi.awsnative.quicksight.outputs.AnalysisDecimalParameter;
import com.pulumi.awsnative.quicksight.outputs.AnalysisIntegerParameter;
import com.pulumi.awsnative.quicksight.outputs.AnalysisStringParameter;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AnalysisParameters {
    /**
     * @return &lt;p&gt;Date-time parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<AnalysisDateTimeParameter> dateTimeParameters;
    /**
     * @return &lt;p&gt;Decimal parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<AnalysisDecimalParameter> decimalParameters;
    /**
     * @return &lt;p&gt;Integer parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<AnalysisIntegerParameter> integerParameters;
    /**
     * @return &lt;p&gt;String parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<AnalysisStringParameter> stringParameters;

    @CustomType.Constructor
    private AnalysisParameters(
        @CustomType.Parameter("dateTimeParameters") @Nullable List<AnalysisDateTimeParameter> dateTimeParameters,
        @CustomType.Parameter("decimalParameters") @Nullable List<AnalysisDecimalParameter> decimalParameters,
        @CustomType.Parameter("integerParameters") @Nullable List<AnalysisIntegerParameter> integerParameters,
        @CustomType.Parameter("stringParameters") @Nullable List<AnalysisStringParameter> stringParameters) {
        this.dateTimeParameters = dateTimeParameters;
        this.decimalParameters = decimalParameters;
        this.integerParameters = integerParameters;
        this.stringParameters = stringParameters;
    }

    /**
     * @return &lt;p&gt;Date-time parameters.&lt;/p&gt;
     * 
     */
    public List<AnalysisDateTimeParameter> dateTimeParameters() {
        return this.dateTimeParameters == null ? List.of() : this.dateTimeParameters;
    }
    /**
     * @return &lt;p&gt;Decimal parameters.&lt;/p&gt;
     * 
     */
    public List<AnalysisDecimalParameter> decimalParameters() {
        return this.decimalParameters == null ? List.of() : this.decimalParameters;
    }
    /**
     * @return &lt;p&gt;Integer parameters.&lt;/p&gt;
     * 
     */
    public List<AnalysisIntegerParameter> integerParameters() {
        return this.integerParameters == null ? List.of() : this.integerParameters;
    }
    /**
     * @return &lt;p&gt;String parameters.&lt;/p&gt;
     * 
     */
    public List<AnalysisStringParameter> stringParameters() {
        return this.stringParameters == null ? List.of() : this.stringParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AnalysisDateTimeParameter> dateTimeParameters;
        private @Nullable List<AnalysisDecimalParameter> decimalParameters;
        private @Nullable List<AnalysisIntegerParameter> integerParameters;
        private @Nullable List<AnalysisStringParameter> stringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateTimeParameters = defaults.dateTimeParameters;
    	      this.decimalParameters = defaults.decimalParameters;
    	      this.integerParameters = defaults.integerParameters;
    	      this.stringParameters = defaults.stringParameters;
        }

        public Builder dateTimeParameters(@Nullable List<AnalysisDateTimeParameter> dateTimeParameters) {
            this.dateTimeParameters = dateTimeParameters;
            return this;
        }
        public Builder dateTimeParameters(AnalysisDateTimeParameter... dateTimeParameters) {
            return dateTimeParameters(List.of(dateTimeParameters));
        }
        public Builder decimalParameters(@Nullable List<AnalysisDecimalParameter> decimalParameters) {
            this.decimalParameters = decimalParameters;
            return this;
        }
        public Builder decimalParameters(AnalysisDecimalParameter... decimalParameters) {
            return decimalParameters(List.of(decimalParameters));
        }
        public Builder integerParameters(@Nullable List<AnalysisIntegerParameter> integerParameters) {
            this.integerParameters = integerParameters;
            return this;
        }
        public Builder integerParameters(AnalysisIntegerParameter... integerParameters) {
            return integerParameters(List.of(integerParameters));
        }
        public Builder stringParameters(@Nullable List<AnalysisStringParameter> stringParameters) {
            this.stringParameters = stringParameters;
            return this;
        }
        public Builder stringParameters(AnalysisStringParameter... stringParameters) {
            return stringParameters(List.of(stringParameters));
        }        public AnalysisParameters build() {
            return new AnalysisParameters(dateTimeParameters, decimalParameters, integerParameters, stringParameters);
        }
    }
}
