// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.AnalysisDateTimeParameterArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisDecimalParameterArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisIntegerParameterArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisStringParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>A list of QuickSight parameters and the list's override values.</p>
 * 
 */
public final class AnalysisParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisParametersArgs Empty = new AnalysisParametersArgs();

    /**
     * <p>Date-time parameters.</p>
     * 
     */
    @InputImport(name="dateTimeParameters")
    private final @Nullable Input<List<AnalysisDateTimeParameterArgs>> dateTimeParameters;

    public Input<List<AnalysisDateTimeParameterArgs>> getDateTimeParameters() {
        return this.dateTimeParameters == null ? Input.empty() : this.dateTimeParameters;
    }

    /**
     * <p>Decimal parameters.</p>
     * 
     */
    @InputImport(name="decimalParameters")
    private final @Nullable Input<List<AnalysisDecimalParameterArgs>> decimalParameters;

    public Input<List<AnalysisDecimalParameterArgs>> getDecimalParameters() {
        return this.decimalParameters == null ? Input.empty() : this.decimalParameters;
    }

    /**
     * <p>Integer parameters.</p>
     * 
     */
    @InputImport(name="integerParameters")
    private final @Nullable Input<List<AnalysisIntegerParameterArgs>> integerParameters;

    public Input<List<AnalysisIntegerParameterArgs>> getIntegerParameters() {
        return this.integerParameters == null ? Input.empty() : this.integerParameters;
    }

    /**
     * <p>String parameters.</p>
     * 
     */
    @InputImport(name="stringParameters")
    private final @Nullable Input<List<AnalysisStringParameterArgs>> stringParameters;

    public Input<List<AnalysisStringParameterArgs>> getStringParameters() {
        return this.stringParameters == null ? Input.empty() : this.stringParameters;
    }

    public AnalysisParametersArgs(
        @Nullable Input<List<AnalysisDateTimeParameterArgs>> dateTimeParameters,
        @Nullable Input<List<AnalysisDecimalParameterArgs>> decimalParameters,
        @Nullable Input<List<AnalysisIntegerParameterArgs>> integerParameters,
        @Nullable Input<List<AnalysisStringParameterArgs>> stringParameters) {
        this.dateTimeParameters = dateTimeParameters;
        this.decimalParameters = decimalParameters;
        this.integerParameters = integerParameters;
        this.stringParameters = stringParameters;
    }

    private AnalysisParametersArgs() {
        this.dateTimeParameters = Input.empty();
        this.decimalParameters = Input.empty();
        this.integerParameters = Input.empty();
        this.stringParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AnalysisDateTimeParameterArgs>> dateTimeParameters;
        private @Nullable Input<List<AnalysisDecimalParameterArgs>> decimalParameters;
        private @Nullable Input<List<AnalysisIntegerParameterArgs>> integerParameters;
        private @Nullable Input<List<AnalysisStringParameterArgs>> stringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateTimeParameters = defaults.dateTimeParameters;
    	      this.decimalParameters = defaults.decimalParameters;
    	      this.integerParameters = defaults.integerParameters;
    	      this.stringParameters = defaults.stringParameters;
        }

        public Builder setDateTimeParameters(@Nullable Input<List<AnalysisDateTimeParameterArgs>> dateTimeParameters) {
            this.dateTimeParameters = dateTimeParameters;
            return this;
        }

        public Builder setDateTimeParameters(@Nullable List<AnalysisDateTimeParameterArgs> dateTimeParameters) {
            this.dateTimeParameters = Input.ofNullable(dateTimeParameters);
            return this;
        }

        public Builder setDecimalParameters(@Nullable Input<List<AnalysisDecimalParameterArgs>> decimalParameters) {
            this.decimalParameters = decimalParameters;
            return this;
        }

        public Builder setDecimalParameters(@Nullable List<AnalysisDecimalParameterArgs> decimalParameters) {
            this.decimalParameters = Input.ofNullable(decimalParameters);
            return this;
        }

        public Builder setIntegerParameters(@Nullable Input<List<AnalysisIntegerParameterArgs>> integerParameters) {
            this.integerParameters = integerParameters;
            return this;
        }

        public Builder setIntegerParameters(@Nullable List<AnalysisIntegerParameterArgs> integerParameters) {
            this.integerParameters = Input.ofNullable(integerParameters);
            return this;
        }

        public Builder setStringParameters(@Nullable Input<List<AnalysisStringParameterArgs>> stringParameters) {
            this.stringParameters = stringParameters;
            return this;
        }

        public Builder setStringParameters(@Nullable List<AnalysisStringParameterArgs> stringParameters) {
            this.stringParameters = Input.ofNullable(stringParameters);
            return this;
        }

        public AnalysisParametersArgs build() {
            return new AnalysisParametersArgs(dateTimeParameters, decimalParameters, integerParameters, stringParameters);
        }
    }
}
